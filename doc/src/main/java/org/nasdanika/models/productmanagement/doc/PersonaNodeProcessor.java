package org.nasdanika.models.productmanagement.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.ncore.NamedElement;

public class PersonaNodeProcessor extends NamedPeriodNodeProcessor<Persona> implements ConcernDomainMixIn<Persona> { 

	public PersonaNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}	
	
	@OutgoingReferenceBuilder(
			nsURI = ProductmanagementPackage.eNS_URI,
			classID = ProductmanagementPackage.PERSONA,
			referenceID = ProductmanagementPackage.CONCERN_DOMAIN__CONCERNS)
	public void buildConcernsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

//		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
//				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
//				.toList();		
//
//		// A page with a dynamic agents table and links to agent pages.
//		for (Label label: labels) {
//			Action personasAction = getRoleActionByLocation(
//					((Action) label).getChildren(), 
//					"personas.html", 
//					"Personas", 
//					null /*	PERSONA_ICON */);
//			
//			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
//				personasAction.getChildren().addAll(re.getValue());
//			}
//			if (label instanceof Action) {										
//				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> personasTableBuilder = new DynamicTableBuilder<>("nsd-table");
//				buildNamedElementColumns(personasTableBuilder, progressMonitor);
//				
//				org.nasdanika.models.html.Tag personasTable = personasTableBuilder.build(
//						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
//							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
//							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
//							return ane.getName().compareTo(bne.getName());
//						}).toList(),  
//						"product-model-personas", 
//						"personas-table", 
//						progressMonitor);
//				
//				personasAction.getContent().add(personasTable);
//			}
//		}
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
