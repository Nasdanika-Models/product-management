package org.nasdanika.models.productmanagement.dsl.groovy

import org.nasdanika.models.productmanagement.AbstractConcern
import org.nasdanika.models.productmanagement.Capability
import org.nasdanika.models.productmanagement.Concern
import org.nasdanika.models.productmanagement.Lifecycle

/**
 * Builder for a {@link Capability}. A Capability is a concern domain, so it can hold inline
 * {@code concern { }} children, address concerns (by variable, by id, or by cross-file reference)
 * and declare inline {@code dependency { }} capabilities. The three reference tiers (&sect;5.2) fall
 * out of Groovy's runtime overload selection on {@code addresses}.
 */
class CapabilityBuilder extends NamedElementBuilder<Capability> {

    CapabilityBuilder(ProductManagementGroovyDsl dsl, Capability capability) {
        super(dsl, capability)
    }

    void lifecycle(Object lifecycle) {
        if (lifecycle instanceof Lifecycle) {
            element.lifecycle = (Lifecycle) lifecycle
            return
        }
        String literal = lifecycle.toString()
        // Accept either the enum literal ("In Progress") or the enum name ("IN_PROGRESS" / "AVAILABLE").
        Lifecycle resolved = Lifecycle.get(literal)
        if (resolved == null) {
            resolved = Lifecycle.getByName(literal)
        }
        if (resolved == null) {
            throw new IllegalArgumentException("Unknown lifecycle: '" + literal + "'")
        }
        element.lifecycle = resolved
    }

    /** Inline {@code concern { ... }} contained by this capability; also indexed by id (tier 2). */
    Concern concern(@DelegatesTo(ConcernBuilder) Closure cl) {
        Concern concern = dsl.factory.createConcern()
        ProductManagementGroovyDsl.run(cl, new ConcernBuilder(dsl, concern))
        element.concerns.add(concern)
        dsl.index(concern.id, concern)
        return concern
    }

    /** Tier 1, by variable: {@code addresses kyc} where kyc is the element returned by {@code concern { }}.
        Tier 3, cross-file: {@code addresses ref('concerns.pm.groovy#kyc-latency')} binds here too. */
    void addresses(AbstractConcern concern) {
        element.addresses.add(concern)
    }

    /** Tier 2, by id: {@code addresses 'kyc-latency'} - deferred until every id has been indexed. */
    void addresses(String id) {
        dsl.defer {
            AbstractConcern concern = (AbstractConcern) dsl.byId(id)
            if (concern == null) {
                throw new IllegalStateException("Unresolved concern reference: '" + id + "'")
            }
            element.addresses.add(concern)
        }
    }

    /** Inline {@code dependency { ... }} capability contained by this capability. */
    Capability dependency(@DelegatesTo(CapabilityBuilder) Closure cl) {
        Capability dependency = dsl.factory.createCapability()
        ProductManagementGroovyDsl.run(cl, new CapabilityBuilder(dsl, dependency))
        element.dependencies.add(dependency)
        dsl.index(dependency.id, dependency)
        return dependency
    }

}
