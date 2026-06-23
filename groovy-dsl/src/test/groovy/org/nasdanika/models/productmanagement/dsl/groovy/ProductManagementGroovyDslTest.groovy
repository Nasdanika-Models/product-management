package org.nasdanika.models.productmanagement.dsl.groovy

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertFalse
import static org.junit.jupiter.api.Assertions.assertInstanceOf

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.jupiter.api.Test

import org.nasdanika.capability.emf.ResourceContentsHandler
import org.nasdanika.capability.scripting.CompiledSource
import org.nasdanika.capability.scripting.groovy.GroovyResourceContentsHandler
import org.nasdanika.models.productmanagement.Capability
import org.nasdanika.models.productmanagement.Lifecycle
import org.nasdanika.models.productmanagement.ProductModel
import org.nasdanika.models.productmanagement.ProductmanagementFactory

/**
 * Exercises the full source -> transform pipeline in isolation: the .groovy source handler compiles
 * the script to a CompiledSource, then the same steps the .pm transform handler performs (build the
 * DSL, install entry points, eval, resolve deferred references) are run here, validating both
 * reference tiers. This lives in the groovy-dsl module so the Groovy runtime is on the classpath.
 */
class ProductManagementGroovyDslTest {

    @Test
    void testNasdanikaProductManagementGroovyResource() {
        File groovyFile = new File("src/test/resources/nasdanika.pm.groovy").getCanonicalFile()
        URI uri = URI.createFileURI(groovyFile.getAbsolutePath())

        ResourceSet resourceSet = new ResourceSetImpl()
        Resource resource = new ResourceImpl(uri)
        resourceSet.getResources().add(resource)

        // Right-to-left qualifiers: nasdanika . pm . groovy -> source ("groovy") at index 2.
        String[] qualifiers = ["nasdanika", "pm", "groovy"] as String[]
        ResourceContentsHandler.Requirement sourceRequirement = ResourceContentsHandler.createRequirement(
                resource, CompiledSource.class, qualifiers, 2)

        // 1. Source handler: read + compile (does not evaluate).
        GroovyResourceContentsHandler sourceHandler = new GroovyResourceContentsHandler(sourceRequirement)
        CompiledSource compiledSource
        groovyFile.withInputStream { input ->
            compiledSource = sourceHandler.load(input, [:])
        }

        // 2. Transform: build DSL, install entry points, evaluate, resolve deferred references.
        ProductManagementGroovyDsl dsl = new ProductManagementGroovyDsl(ProductmanagementFactory.eINSTANCE, resource)
        Map<String, Object> bindings = [:]
        dsl.installInto(bindings)
        compiledSource.eval(bindings)
        dsl.resolveDeferred()

        List roots = dsl.getRoots()
        assertEquals(1, roots.size())
        ProductModel product = assertInstanceOf(ProductModel.class, roots.get(0))
        assertEquals("Business Banking Platform", product.getName())
        assertEquals(2, product.getCapabilities().size())

        Capability automatedKyc = (Capability) product.getCapabilities().get(0)
        assertEquals("Automated KYC", automatedKyc.getName())
        assertEquals(Lifecycle.AVAILABLE, automatedKyc.getLifecycle())
        // Tier 1 (by variable).
        assertFalse(automatedKyc.getAddresses().isEmpty())
        assertEquals("kyc-latency", automatedKyc.getAddresses().get(0).getId())

        Capability fraudDetection = (Capability) product.getCapabilities().get(1)
        assertEquals(Lifecycle.IN_PROGRESS, fraudDetection.getLifecycle())
        // Tier 2 (by id), resolved by resolveDeferred().
        assertFalse(fraudDetection.getAddresses().isEmpty())
        assertEquals("fraud-risk", fraudDetection.getAddresses().get(0).getId())
    }

}
