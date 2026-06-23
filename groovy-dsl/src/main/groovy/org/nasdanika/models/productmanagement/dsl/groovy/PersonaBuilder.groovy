package org.nasdanika.models.productmanagement.dsl.groovy

import org.nasdanika.models.productmanagement.Persona

/**
 * Builder for a {@link Persona}. Carries the common named-element vocabulary; extend as the persona
 * authoring surface grows (needs, pain points, goals).
 */
class PersonaBuilder extends NamedElementBuilder<Persona> {

    PersonaBuilder(ProductManagementGroovyDsl dsl, Persona persona) {
        super(dsl, persona)
    }

}
