package org.nasdanika.models.productmanagement.dsl.groovy

import org.nasdanika.models.productmanagement.Capability
import org.nasdanika.models.productmanagement.Persona
import org.nasdanika.models.productmanagement.ProductModel

/**
 * Builder for the top-level {@link ProductModel}. A ProductModel is a capability, persona,
 * capability-provider and actor domain, so it can hold {@code capability { }} and {@code persona { }}
 * children. See groovy-kotlin-dsl-design.md &sect;5.4.
 */
class ProductModelBuilder extends NamedElementBuilder<ProductModel> {

    ProductModelBuilder(ProductManagementGroovyDsl dsl, ProductModel product) {
        super(dsl, product)
    }

    /** {@code capability { ... }} - returns the built element so it can be captured by variable (tier 1). */
    Capability capability(@DelegatesTo(CapabilityBuilder) Closure cl) {
        Capability capability = dsl.factory.createCapability()
        ProductManagementGroovyDsl.run(cl, new CapabilityBuilder(dsl, capability))
        element.capabilities.add(capability)
        dsl.index(capability.id, capability)
        return capability
    }

    /** {@code persona { ... }} - returns the built element so it can be captured by variable (tier 1). */
    Persona persona(@DelegatesTo(PersonaBuilder) Closure cl) {
        Persona persona = dsl.factory.createPersona()
        ProductManagementGroovyDsl.run(cl, new PersonaBuilder(dsl, persona))
        element.personas.add(persona)
        dsl.index(persona.id, persona)
        return persona
    }

}
