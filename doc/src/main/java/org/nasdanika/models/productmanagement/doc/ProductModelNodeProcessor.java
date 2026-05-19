package org.nasdanika.models.productmanagement.doc;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.productmanagement.ProductModel;

public class ProductModelNodeProcessor extends NamedPeriodNodeProcessor<ProductModel> implements 
	PersonaDomainMixIn<ProductModel>,
	CapabilityDomainMixIn<ProductModel> { // TODO - CapabilityProviderDomain, ActorDomain.

	public ProductModelNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}
	
	
//	@Override
//	protected Collection<Entry<String, Collection<EObject>>> getProperties(ProgressMonitor progressMonitor) {
//		Collection<Entry<String, Collection<EObject>>> properties = super.getProperties(progressMonitor);
//		String fileName = getTarget().getFileName();
//		if (!Util.isBlank(fileName)) {
//			properties.add(
//					Map.entry(
//							"File name", 
//							List.of(createText(fileName))));
//		}
//		String projectPath = getTarget().getProjectPath();
//		if (!Util.isBlank(projectPath)) {
//			properties.add(
//					Map.entry(
//							"Project path", 
//							List.of(createText(projectPath))));
//		}
//		return properties;
//	}	
	
}
