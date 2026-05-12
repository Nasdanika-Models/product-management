package org.nasdanika.models.bw5.doc;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.Project;

public class NodeNodeProcessor<T extends Node> extends NamedElementNodeProcessor<T> {

	public NodeNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}	
	
	// X,Y, node styling - generation of a Draw.io diagram node for the diagram - see how it is done in Ecore
	
	// Incoming transitions, outgoing transitions - sections with tables.
	
	
	
	
}
