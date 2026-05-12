package org.nasdanika.models.bw5.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.ProcessDefinition;

public class GroupNodeProcessor extends ActivityNodeProcessor<Group> {
	
	private ContainerNodeProcessor<ProcessDefinition> containerNodeProcessor;

	public GroupNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
		this.containerNodeProcessor = new ContainerNodeProcessor<>(config, context, prototypeProvider, documentationFactories);
	}		
	
	@OutgoingReferenceBuilder(
			nsURI = Bw5Package.eNS_URI,
			classID = Bw5Package.CONTAINER,
			referenceID = Bw5Package.CONTAINER__ACTIVITIES)
	public void buildActivitiesOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {
		
		containerNodeProcessor.buildActivitiesOutgoingReference(eReference, referenceOutgoingEndpoints, labels, outgoingLabels, progressMonitor);
	}
			
	@OutgoingReferenceBuilder(
			nsURI = Bw5Package.eNS_URI,
			classID = Bw5Package.CONTAINER,
			referenceID = Bw5Package.CONTAINER__GROUPS)
	public void buildGroupsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {
		
		containerNodeProcessor.buildGroupsOutgoingReference(eReference, referenceOutgoingEndpoints, labels, outgoingLabels, progressMonitor);
	}
	
	/**
	 * 
	 * @param eReference
	 * @return true if lables suppliers shall be called to create labels/actions. 
	 * This implementation returns true for containment references, i.e. actions for child objects shall be created. 
	 */
	protected boolean isCallOutgoingReferenceLabelsSuppliers(EReference eReference) {
		return containerNodeProcessor.isCallOutgoingReferenceLabelsSuppliers(eReference);
	}		
	
	// generate container
	
}
