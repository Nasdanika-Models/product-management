package org.nasdanika.models.productmanagement.dsl.groovy

import org.nasdanika.models.productmanagement.AbstractCapability
import org.nasdanika.models.productmanagement.Concern

/**
 * Builder for a {@link Concern}. Supports the {@code addressedBy} reference in the same three tiers
 * as {@link CapabilityBuilder#addresses}: by variable / cross-file reference, or by id (deferred).
 */
class ConcernBuilder extends NamedElementBuilder<Concern> {

    ConcernBuilder(ProductManagementGroovyDsl dsl, Concern concern) {
        super(dsl, concern)
    }

    /** Tier 1 (by variable) / tier 3 (cross-file ref). */
    void addressedBy(AbstractCapability capability) {
        element.addressedBy.add(capability)
    }

    /** Tier 2 (by id) - deferred until every id has been indexed. */
    void addressedBy(String id) {
        dsl.defer {
            AbstractCapability capability = (AbstractCapability) dsl.byId(id)
            if (capability == null) {
                throw new IllegalStateException("Unresolved capability reference: '" + id + "'")
            }
            element.addressedBy.add(capability)
        }
    }

}
