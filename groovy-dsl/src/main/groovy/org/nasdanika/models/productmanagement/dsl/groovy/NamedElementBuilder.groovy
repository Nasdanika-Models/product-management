package org.nasdanika.models.productmanagement.dsl.groovy

import org.nasdanika.models.productmanagement.NamedElement

/**
 * Builder for {@link NamedElement}s, adding {@code name} to the {@link ModelElementBuilder} vocabulary.
 */
abstract class NamedElementBuilder<T extends NamedElement> extends ModelElementBuilder<T> {

    NamedElementBuilder(ProductManagementGroovyDsl dsl, T element) {
        super(dsl, element)
    }

    void name(String name) {
        element.name = name
    }

}
