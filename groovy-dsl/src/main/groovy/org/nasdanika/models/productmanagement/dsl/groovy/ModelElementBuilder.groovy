package org.nasdanika.models.productmanagement.dsl.groovy

import org.nasdanika.models.productmanagement.ModelElement

/**
 * Base builder carrying the vocabulary common to every {@link ModelElement}: id, icon,
 * documentation, doc reference/format and alias URIs. Setter-style methods so the DSL reads as
 * {@code id 'kyc-latency'} inside a closure whose delegate is this builder.
 */
abstract class ModelElementBuilder<T extends ModelElement> {

    protected final ProductManagementGroovyDsl dsl
    protected final T element

    ModelElementBuilder(ProductManagementGroovyDsl dsl, T element) {
        this.dsl = dsl
        this.element = element
    }

    void id(String id) {
        element.id = id
        dsl.index(id, element)
    }

    void icon(String icon) {
        element.icon = icon
    }

    void documentation(String documentation) {
        element.documentation = documentation
    }

    void docRef(String docRef) {
        element.docRef = docRef
    }

    void docFormat(String docFormat) {
        element.docFormat = docFormat
    }

    void uri(String uri) {
        element.uris.add(uri)
    }

    T getElement() {
        return element
    }

}
