package org.nasdanika.models.productmanagement.handlers.groovy;

import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import org.apache.commons.lang3.stream.Streams;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsHandler;
import org.nasdanika.capability.scripting.CompiledSource;
import org.nasdanika.common.ProgressMonitor;

/**
 * Transform handler factory for the {@code .pm} qualifier sitting to the left of a {@code .groovy}
 * source qualifier (e.g. {@code personas.pm.groovy}). It mirrors the Markdown
 * {@code MarkdownToProductManagementResourceContentsHandlerCapabilityFactory}, but requests a
 * {@link CompiledSource} from the downstream (source) handler instead of a Markdown {@code Document}.
 */
public class GroovyToProductManagementResourceContentsHandlerCapabilityFactory extends ServiceCapabilityFactory<org.nasdanika.capability.emf.ResourceContentsHandler.Requirement, ResourceContentsHandler<EObject[]>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type)
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& EObject[].class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifiers().length > 0
				&& "pm".equalsIgnoreCase(handlerRequirement.getQualifiers()[handlerRequirement.getQualifierIndex()]);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<ResourceContentsHandler<EObject[]>>>> createService(
			Class<ResourceContentsHandler<EObject[]>> serviceType,
			org.nasdanika.capability.emf.ResourceContentsHandler.Requirement serviceRequirement,
			final Loader loader,
			ProgressMonitor progressMonitor) {

		ResourceContentsHandler.Requirement handlerRequirement = ResourceContentsHandler.createRequirement(
				serviceRequirement.getResource(),
				CompiledSource.class,
				serviceRequirement.getQualifiers(),
				serviceRequirement.getQualifierIndex() - 1);

		@SuppressWarnings("rawtypes")
		ServiceCapabilityFactory.Requirement<org.nasdanika.capability.emf.ResourceContentsHandler.Requirement, ResourceContentsHandler> sourceServiceRequirement = ServiceCapabilityFactory.createRequirement(ResourceContentsHandler.class, null, handlerRequirement);
		CompletionStage<Iterable<CapabilityProvider<ResourceContentsHandler<CompiledSource>>>> sourceHandlerCS = loader.load(sourceServiceRequirement, progressMonitor);

		return sourceHandlerCS.thenApply(providers -> createHandler(providers, serviceRequirement.getResource()));
	}

	private Iterable<CapabilityProvider<ResourceContentsHandler<EObject[]>>> createHandler(
			Iterable<CapabilityProvider<ResourceContentsHandler<CompiledSource>>> providers,
			Resource resource) {

		Function<CapabilityProvider<ResourceContentsHandler<CompiledSource>>, CapabilityProvider<ResourceContentsHandler<EObject[]>>> mapper = provider -> provider.map(sourceHandler -> createHandler(resource, sourceHandler));
		return Streams.of(providers).map(mapper).toList();
	}


	protected GroovyToProductManagementResourceContentsHandler createHandler(Resource resource, ResourceContentsHandler<CompiledSource> sh) {
		return new GroovyToProductManagementResourceContentsHandler(resource, sh);
	}

}
