package org.nasdanika.models.productmanagement.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.gen.DynamicTableBuilder;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.Icon;
import org.nasdanika.models.productmanagement.NamedElement;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

public interface ConcernDomainMixIn<T extends ConcernDomain> extends NodeProcessorMixIn<T> {
	
	/**
	 * If true concern(s) actions are created as section(s) on the same page, otherwise as a child page.
	 * @return
	 */
	default boolean isConcernSection() {
		return false;
	}
	
	/**
	 * If true, concerns are grouped by type, otherwise all concerns are listed together. 
	 * @return
	 */
	default boolean isConcernsByType() {
		return false;
	}
	
	@OutgoingReferenceBuilder(
			nsURI = ProductmanagementPackage.eNS_URI,
			classID = ProductmanagementPackage.CONCERN_DOMAIN,
			referenceID = ProductmanagementPackage.CONCERN_DOMAIN__RESOLVED_CONCERNS)
	default void buildConcernsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {
		
		if (isConcernSection()) {
			if (isConcernsByType()) {
				buildConcernTypeSections(eReference, referenceOutgoingEndpoints, labels, outgoingLabels, progressMonitor);								
			} else {
				buildConcernsSection(eReference, referenceOutgoingEndpoints, labels, outgoingLabels, progressMonitor);				
			}
		} else {
			if (isConcernsByType()) {
				buildConcernTypeChildActions(eReference, referenceOutgoingEndpoints, labels, outgoingLabels, progressMonitor);				
			} else {
				buildConcernsChildAction(eReference, referenceOutgoingEndpoints, labels, outgoingLabels, progressMonitor);
			}			
		}		
	}	
	
	@SuppressWarnings("unchecked")
	private void buildConcernsSection(
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
			Action concernsAction = self().getRoleActionByName(
					((Action) label).getSections(), 
					"concerns", 
					"Concerns", 
					Icon.CONCERN_DOMAIN.getUrl());
						
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				((Action) label).getAnonymous().addAll((Collection<? extends Action>) re.getValue());
			}
			
			buildConcernsTable(referenceOutgoingEndpoints, progressMonitor, concernsAction, "concerns", "concerns-table");
		}		
	}
		
	@SuppressWarnings("unchecked")
	private void buildConcernTypeSections(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {
		
		List<Entry<EClass, List<Entry<EReferenceConnection, Collection<Label>>>>> byTypeSorted = Util.groupBy(outgoingLabels.entrySet(), e -> e.getKey().getTarget().get().eClass())
			.entrySet()
			.stream()
			.sorted((a,b) -> a.getKey().getName().compareTo(b.getKey().getName()))
			.toList();
		
		for (Entry<EClass, List<Entry<EReferenceConnection, Collection<Label>>>> typeEntry: byTypeSorted) {
			List<Entry<EReferenceConnection, Collection<Label>>> sorted = typeEntry.getValue().stream()
					.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
					.toList();		

			for (Label label: labels) {
				EClass type = typeEntry.getKey();
				Action concernsAction = self().getRoleActionByName(
						((Action) label).getSections(), 
						"concerns." + type.getName(), 
						Util.nameToLabel(type.getName() + "s"),
						Icon.getTypeIcon(type));
							
				for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
					((Action) label).getAnonymous().addAll((Collection<? extends Action>) re.getValue());
				}
				
				buildConcernsTable(
						referenceOutgoingEndpoints.stream().filter(e -> e.getKey().getTarget().get().eClass() == type).toList(), 
						progressMonitor, 
						concernsAction, 
						type.getName() + ".concerns", 
						type.getName() + "-concerns-table");
			}			
		}
		
	}
		
	private void buildConcernsChildAction(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {
		
		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
				.toList();		

		for (Label label: labels) {
			Action concernsAction = self().getRoleActionByLocation(
					((Action) label).getChildren(), 
					"concerns.html", 
					"Concerns", 
					Icon.CONCERN_DOMAIN.getUrl());
			
			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
				concernsAction.getChildren().addAll(re.getValue());
			}
			
			buildConcernsTable(referenceOutgoingEndpoints, progressMonitor, concernsAction, "concerns", "concerns-table");
		}
		
	}

	private void buildConcernsTable(
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints,
			ProgressMonitor progressMonitor, 
			Action concernsAction,
			String configKey,
			String appId) {
		
		DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> concernsTableBuilder = new DynamicTableBuilder<>("nsd-table");
		self().buildNamedElementColumns(concernsTableBuilder, progressMonitor);
		
		org.nasdanika.models.html.Tag concernsTable = concernsTableBuilder.build(
				referenceOutgoingEndpoints.stream().sorted((a,b) -> {
					NamedElement ane = (NamedElement) a.getKey().getTarget().get();
					NamedElement bne = (NamedElement) b.getKey().getTarget().get();
					return ane.getName().compareTo(bne.getName());
				}).toList(),  
				configKey, 
				appId, 
				progressMonitor);
		
		concernsAction.getContent().add(concernsTable);
	}	
	
	private void buildConcernTypeChildActions(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {
		
		List<Entry<EClass, List<Entry<EReferenceConnection, Collection<Label>>>>> byTypeSorted = Util.groupBy(outgoingLabels.entrySet(), e -> e.getKey().getTarget().get().eClass())
			.entrySet()
			.stream()
			.sorted((a,b) -> a.getKey().getName().compareTo(b.getKey().getName()))
			.toList();
		
		for (Entry<EClass, List<Entry<EReferenceConnection, Collection<Label>>>> typeEntry: byTypeSorted) {
			List<Entry<EReferenceConnection, Collection<Label>>> sorted = typeEntry.getValue().stream()
					.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
					.toList();		

			for (Label label: labels) {
				EClass type = typeEntry.getKey();
				Action concernsAction = self().getRoleActionByLocation(
						((Action) label).getChildren(), 
						type.getName() +  ".html", 
						Util.nameToLabel(type.getName() + "s"),
						Icon.getTypeIcon(type));
							
				for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
					concernsAction.getChildren().addAll(re.getValue());
				}
				
				buildConcernsTable(
						referenceOutgoingEndpoints.stream().filter(e -> e.getKey().getTarget().get().eClass() == type).toList(), 
						progressMonitor, 
						concernsAction, 
						type.getName() + ".concerns", 
						type.getName() + "-concerns-table");
			}			
		}
	}
	
}
