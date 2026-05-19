package org.nasdanika.models.productmanagement.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.productmanagement.Icon;
import org.nasdanika.models.productmanagement.NamedElement;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

public interface PersonaDomainMixIn<T extends PersonaDomain> extends NodeProcessorMixIn<T> {
	
	@OutgoingReferenceBuilder(
			nsURI = ProductmanagementPackage.eNS_URI,
			classID = ProductmanagementPackage.PERSONA_DOMAIN,
			referenceID = ProductmanagementPackage.PERSONA_DOMAIN__RESOLVED_PERSONAS)
	default void buildPersonasOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		// A page with a dynamic agents table and links to agent pages.
		for (Label label: labels) {
			Action personasAction = self().getRoleActionByLocation(
					((Action) label).getChildren(), 
					"personas.html", 
					"Personas", 
					Icon.PERSONA_DOMAIN.getUrl());
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				personasAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> personasTableBuilder = new DynamicTableBuilder<>("nsd-table");
				self().buildNamedElementColumns(personasTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag personasTable = personasTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"product-model-personas", 
						"personas-table", 
						progressMonitor);
				
				personasAction.getContent().add(personasTable);
			}
		}
	}	
	
}
