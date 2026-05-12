package org.nasdanika.models.bw5.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Folder;


public class FolderNodeProcessor<T extends Folder> extends ResourceNodeProcessor<T> {

	public FolderNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		
	
	@Override
	protected Collection<Entry<String, Collection<EObject>>> getProperties(ProgressMonitor progressMonitor) {
		Collection<Entry<String, Collection<EObject>>> properties = super.getProperties(progressMonitor);
		String resourceType = getTarget().getResourceType();
		if (!Util.isBlank(resourceType)) {
			properties.add(
					Map.entry(
							"Resoure type", 
							List.of(createText(resourceType))));
		}
		return properties;
	}
		
	@OutgoingReferenceBuilder(
			nsURI = Bw5Package.eNS_URI,
			classID = Bw5Package.FOLDER,
			referenceID = Bw5Package.FOLDER__RESOURCES)
	public void buildResourcesOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> a.getKey().getIndex() - b.getKey().getIndex())
				.toList();		

		// A page with a dynamic agents table and links to agent pages.
		for (Label label: labels) {
			if (label instanceof Action action) {										
				EList<EObject> childActions = action.getChildren(); 
				
				for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
					childActions.addAll(re.getValue());
				}				
			}
		}
	}
	
	/**
	 * 
	 * @param eReference
	 * @return true if lables suppliers shall be called to create labels/actions. 
	 * This implementation returns true for containment references, i.e. actions for child objects shall be created. 
	 */
	protected boolean isCallOutgoingReferenceLabelsSuppliers(EReference eReference) {
		return Bw5Package.Literals.FOLDER__RESOURCES.equals(eReference) || super.isCallOutgoingReferenceLabelsSuppliers(eReference);
	}
	
}
