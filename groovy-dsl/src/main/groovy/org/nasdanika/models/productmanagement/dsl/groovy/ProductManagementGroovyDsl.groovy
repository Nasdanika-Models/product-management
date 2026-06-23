package org.nasdanika.models.productmanagement.dsl.groovy

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet

import org.nasdanika.models.productmanagement.ProductModel
import org.nasdanika.models.productmanagement.ProductmanagementFactory

/**
 * Product Management Groovy DSL. Instantiated and installed per load by the {@code .pm} transform
 * handler. Holds the model factory, the target {@link Resource} (for cross-file references), an
 * id index for tier-2 references, and a list of deferred reference resolvers run after evaluation.
 * See groovy-kotlin-dsl-design.md &sect;5.4.
 */
class ProductManagementGroovyDsl {

    final ProductmanagementFactory factory
    final Resource resource
    final ResourceSet resourceSet
    final URI baseURI

    private final List<EObject> roots = []
    private final Map<String, EObject> byId = [:]          // index for id-based references
    private final List<Closure> deferred = []              // id references resolved after eval

    ProductManagementGroovyDsl(ProductmanagementFactory factory, Resource resource) {
        this.factory = factory
        this.resource = resource
        this.resourceSet = resource?.resourceSet
        this.baseURI = resource?.URI
    }

    /**
     * Puts the top-level entry points (and context) where {@code groovy.lang.Script.invokeMethod}
     * will find them: a bare {@code product { }} in the script resolves to the bound {@code product}
     * closure here, while nested names resolve via each builder's closure delegate.
     */
    void installInto(Map<String, Object> bindings) {
        bindings.product = this.&product       // a method reference is a Closure, callable as `product { }`
        bindings.ref = this.&ref
        bindings.factory = factory
        bindings.resource = resource
        bindings.resourceSet = resourceSet
        bindings.baseURI = baseURI
        bindings.dsl = this
    }

    /** Top-level: {@code product { ... }}. Returns the built element; the terminal stage adds it to the resource. */
    ProductModel product(@DelegatesTo(ProductModelBuilder) Closure cl) {
        ProductModel product = factory.createProductModel()
        run(cl, new ProductModelBuilder(this, product))
        index(product.id, product)
        roots.add(product)
        return product
    }

    /** Tier-3 cross-file reference: {@code ref('concerns.pm.groovy#kyc-latency')} resolved through the resourceSet. */
    EObject ref(String fragment) {
        if (resourceSet == null) {
            throw new IllegalStateException("Cannot resolve reference '" + fragment + "': no ResourceSet available")
        }
        URI uri = URI.createURI(fragment)
        if (baseURI != null) {
            uri = uri.resolve(baseURI)
        }
        return resourceSet.getEObject(uri, true)
    }

    void index(String id, EObject element) {
        if (id) {
            byId[id] = element
        }
    }

    EObject byId(String id) {
        return byId[id]
    }

    void defer(Closure resolver) {
        deferred << resolver
    }

    /** Called by the {@code .pm} handler after eval, as part of the terminal normalize stage. */
    void resolveDeferred() {
        deferred*.call()
    }

    List<EObject> getRoots() {
        return roots
    }

    /** Runs a configuration closure against a builder delegate with DELEGATE_FIRST resolution. */
    static void run(Closure cl, Object delegate) {
        Closure copy = (Closure) cl.clone()
        copy.delegate = delegate
        copy.resolveStrategy = Closure.DELEGATE_FIRST
        copy.call()
    }

}
