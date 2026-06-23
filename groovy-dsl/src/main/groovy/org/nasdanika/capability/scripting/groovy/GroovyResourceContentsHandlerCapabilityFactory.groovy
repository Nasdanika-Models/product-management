package org.nasdanika.capability.scripting.groovy

import java.util.concurrent.CompletionStage

import org.nasdanika.capability.CapabilityFactory
import org.nasdanika.capability.CapabilityProvider
import org.nasdanika.capability.ServiceCapabilityFactory
import org.nasdanika.capability.emf.ResourceContentsHandler
import org.nasdanika.capability.scripting.CompiledSource
import org.nasdanika.common.ProgressMonitor

/**
 * Capability factory for the generic {@code .groovy} source-format handler. It accepts a
 * {@link ResourceContentsHandler.Requirement} whose contents type is {@link CompiledSource} and
 * whose qualifier at the requirement index is {@code groovy}, and provides a
 * {@link GroovyResourceContentsHandler}. Model-agnostic: all Product Management knowledge lives in
 * the downstream {@code .pm} transform handler.
 */
class GroovyResourceContentsHandlerCapabilityFactory
        extends ServiceCapabilityFactory<ResourceContentsHandler.Requirement, ResourceContentsHandler<CompiledSource>> {

    @Override
    boolean isFor(Class<?> type, Object serviceRequirement) {
        return ResourceContentsHandler.class.equals(type) &&
                serviceRequirement instanceof ResourceContentsHandler.Requirement &&
                CompiledSource.class.equals(((ResourceContentsHandler.Requirement) serviceRequirement).getContentsType()) &&
                isGroovy((ResourceContentsHandler.Requirement) serviceRequirement)
    }

    private static boolean isGroovy(ResourceContentsHandler.Requirement requirement) {
        String[] qualifiers = requirement.getQualifiers()
        int index = requirement.getQualifierIndex()
        return qualifiers != null && index >= 0 && index < qualifiers.length &&
                "groovy".equalsIgnoreCase(qualifiers[index])
    }

    @Override
    protected CompletionStage<Iterable<CapabilityProvider<ResourceContentsHandler<CompiledSource>>>> createService(
            Class<ResourceContentsHandler<CompiledSource>> serviceType,
            ResourceContentsHandler.Requirement serviceRequirement,
            CapabilityFactory.Loader loader,
            ProgressMonitor progressMonitor) {

        return wrap(new GroovyResourceContentsHandler(serviceRequirement))
    }

}
