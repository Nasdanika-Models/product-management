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
import org.nasdanika.models.productmanagement.CapabilityDomain;
import org.nasdanika.models.productmanagement.Icon;
import org.nasdanika.models.productmanagement.NamedElement;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

public interface CapabilityDomainMixIn<T extends CapabilityDomain> extends NodeProcessorMixIn<T> {
	
	@OutgoingReferenceBuilder(
			nsURI = ProductmanagementPackage.eNS_URI,
			classID = ProductmanagementPackage.CAPABILITY_DOMAIN,
			referenceID = ProductmanagementPackage.CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES)
	default void buildCapabilitiesOutgoingReference(
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
			Action capabilitiesAction = self().getRoleActionByLocation(
					((Action) label).getChildren(), 
					"capabilities.html", 
					"Capabilities", 
					Icon.CAPABILITY_DOMAIN.getUrl());
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				capabilitiesAction.getChildren().addAll(re.getValue());
			}
			if (label instanceof Action) {										
				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> capabilitiesTableBuilder = new DynamicTableBuilder<>("nsd-table");
				self().buildNamedElementColumns(capabilitiesTableBuilder, progressMonitor);
				
				org.nasdanika.models.html.Tag capabilitiesTable = capabilitiesTableBuilder.build(
						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
							return ane.getName().compareTo(bne.getName());
						}).toList(),  
						"product-model-personas", 
						"personas-table", 
						progressMonitor);
				
				capabilitiesAction.getContent().add(capabilitiesTable);
			}
		}
	}
	
	
}
