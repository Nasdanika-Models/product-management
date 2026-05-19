package org.nasdanika.models.productmanagement.doc;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.models.productmanagement.ConcernReference;

public class ConcernReferenceNodeProcessor extends EObjectNodeProcessor<ConcernReference> { 

	public ConcernReferenceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}		
	
}
