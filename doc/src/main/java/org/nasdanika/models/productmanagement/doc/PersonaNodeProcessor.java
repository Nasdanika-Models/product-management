package org.nasdanika.models.productmanagement.doc;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.productmanagement.Persona;

public class PersonaNodeProcessor extends NamedPeriodNodeProcessor<Persona> implements ConcernDomainMixIn<Persona> { 

	public PersonaNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}	
	
	@Override
	public boolean isConcernSection() {
		return true;
	}
	
	@Override
	public boolean isConcernsByType() {
		return true;
	}
	
}
