package org.nasdanika.models.bw5.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.bw5.Activity;

public class ActivityNodeProcessor<T extends Activity> extends NodeNodeProcessor<T> {

	public ActivityNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		
	
	@Override
	protected Collection<Entry<String, Collection<EObject>>> getProperties(ProgressMonitor progressMonitor) {
		Collection<Entry<String, Collection<EObject>>> properties = super.getProperties(progressMonitor);
		String type = getTarget().getType();
		if (!Util.isBlank(type)) {
			properties.add(
					Map.entry(
							"Type", 
							List.of(createText(type))));
		}
		String resourceType = getTarget().getResourceType();
		if (!Util.isBlank(resourceType)) {
			properties.add(
					Map.entry(
							"Resoure type", 
							List.of(createText(resourceType))));
		}
		return properties;
	}
		
	// outgoing calls
	
	// Config
	
	// Input bindings
	
}
