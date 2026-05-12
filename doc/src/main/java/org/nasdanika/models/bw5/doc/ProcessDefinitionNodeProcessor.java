package org.nasdanika.models.bw5.doc;


import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.Document;
import org.nasdanika.drawio.Layer;
import org.nasdanika.drawio.Model;
import org.nasdanika.drawio.Node;
import org.nasdanika.drawio.Page;
import org.nasdanika.drawio.Rectangle;
import org.nasdanika.drawio.Root;
import org.nasdanika.exec.content.ContentFactory;
import org.nasdanika.exec.content.Text;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.OutgoingEndpoint;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.Link;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.bw5.Activity;
import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Container;
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.ProcessDefinition;
import org.nasdanika.models.bw5.Transition;


public class ProcessDefinitionNodeProcessor extends ResourceNodeProcessor<ProcessDefinition> {
	
	private ContainerNodeProcessor<ProcessDefinition> containerNodeProcessor;

	public ProcessDefinitionNodeProcessor(
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

	@Override
	protected Label createAction(ProgressMonitor progressMonitor) {
		Label label = super.createAction(progressMonitor);
		if (label instanceof Action action) {
			Text representationText = ContentFactory.eINSTANCE.createText(); // Interpolate with element properties?
			try {
				Document representation = createRepresentation(progressMonitor);
				representationText.setContent(representation.toHtml(true, getViewer()));
			} catch (TransformerException | IOException | ParserConfigurationException e) {
				representationText.setContent("<div class=\"nsd-error\">Error creating representation: " + e + "</div>");
			}
			action.getContent().add(representationText);
		}
		return label;
	}
		
	private Map<Activity, WidgetFactory> activityWidgetFactories = Collections.synchronizedMap(new HashMap<>());
	
	public Map<Activity, WidgetFactory> getActivityWidgetFactories() {
		return activityWidgetFactories;
	}
	
	@OutgoingEndpoint("reference.name == 'activities'")
	public final void setActivityEndpoint(EReferenceConnection connection, WidgetFactory activityWidgetFactory) {
		activityWidgetFactories.put(((Activity) connection.getTarget().get()), activityWidgetFactory);
	}
	
	private Map<Group, WidgetFactory> groupWidgetFactories = Collections.synchronizedMap(new HashMap<>());
	
	public Map<Group, WidgetFactory> getGroupWidgetFactories() {
		return groupWidgetFactories;
	}
	
	@OutgoingEndpoint("reference.name == 'groups'")
	public final void setGroupEndpoint(EReferenceConnection connection, WidgetFactory groupWidgetFactory) {
		groupWidgetFactories.put(((Group) connection.getTarget().get()), groupWidgetFactory);
	}	
	
	static Map<org.nasdanika.models.bw5.Node, org.nasdanika.drawio.Node> generateContainerRepresentation(
			Layer<?> layer, 
			Container container,
			BiFunction<org.nasdanika.models.bw5.Node, ProgressMonitor, String> linkProvider,
			ProgressMonitor progressMonitor) {
		Map<org.nasdanika.models.bw5.Node, org.nasdanika.drawio.Node> nodeMap = new HashMap<>();
		
		for (Activity activity: container.getActivities()) {
			Node activityNode = layer.createNode();
			activityNode.setLabel(activity.getName());
			Rectangle geometry = activityNode.getGeometry();
			geometry.setX(activity.getX());
			geometry.setX(activity.getY());
			geometry.setWidth(50);
			geometry.setHeight(50);
			nodeMap.put(activity, activityNode);
			
			String type = activity.getType();
			if (!Util.isBlank(type)) {
				activityNode.setProperty("type", type);
			}
			String resourceType = activity.getResourceType();
			if (!Util.isBlank(resourceType)) {
				activityNode.setProperty("resourceType", type);
			}
			
			// TODO - type/resourceType based styling
			
			if (linkProvider != null) {
				String link = linkProvider.apply(activity, progressMonitor);
				if (!Util.isBlank(link)) {
					activityNode.setLink(link);
				}
			}
		}
		
		for (Group group: container.getGroups()) {
			Node groupNode = layer.createNode();
			groupNode.setLabel(group.getName());
			Rectangle geometry = groupNode.getGeometry();
			geometry.setX(group.getX());
			geometry.setX(group.getY());
			geometry.setWidth(group.getWidth());
			geometry.setHeight(group.getHeight());
			nodeMap.put(group, groupNode);
			
			String type = group.getType();
			if (!Util.isBlank(type)) {
				groupNode.setProperty("type", type);
			}
			String resourceType = group.getResourceType();
			if (!Util.isBlank(resourceType)) {
				groupNode.setProperty("resourceType", type);
			}
			
			groupNode.getStyle().container(true);
			
			// TODO - type/resourceType based styling
			
			if (linkProvider != null) {
				String link = linkProvider.apply(group, progressMonitor);
				if (!Util.isBlank(link)) {
					groupNode.setLink(link);
				}
			}
			
			generateContainerRepresentation(groupNode, group, null /* TODO - link provider for group members */, progressMonitor);
		}	
				
		for (Entry<org.nasdanika.models.bw5.Node, Node> sourceEntry: nodeMap.entrySet()) {
			for (Transition transition: sourceEntry.getKey().getOutgoingTransitions()) {
				Node targetNode = nodeMap.get(transition.getTarget());
				layer.createConnection(sourceEntry.getValue(), targetNode);
			}
		}		
		
		return nodeMap;
	}
	
	protected String getLink(org.nasdanika.models.bw5.Node node, ProgressMonitor progressMonitor) {
		if (node instanceof Activity activity) {
			WidgetFactory activityWidgetFactory = activityWidgetFactories.get(activity);
			Object link = activityWidgetFactory.createLink(progressMonitor);
			if (link instanceof Link activityLink) {
					return activityLink.getLocation();
			}
		}
		if (node instanceof Group group) {
			WidgetFactory groupWidgetFactory = activityWidgetFactories.get(group);
			Object link = groupWidgetFactory.createLink(progressMonitor);
			if (link instanceof Link groupLink) {
				return groupLink.getLocation();
			}
		}
		return null;
	}
	
	/**
	 * Creates filtered representation
	 * @param semanticModelElement
	 * @param modelPage
	 * @param registry
	 * @param progressMonitor
	 * @return
	 * @throws ParserConfigurationException 
	 */
	public Document createRepresentation(ProgressMonitor progressMonitor) throws ParserConfigurationException {		
		Document representationDocument = Document.create(true, getTarget().eResource().getURI());
		Page page = representationDocument.createPage();
		page.setName(getTarget().getName());
		
		Model model = page.getModel();
		Root root = model.getRoot();
		Layer<?> layer = root.getLayers().get(0);
		
		Map<org.nasdanika.models.bw5.Node, org.nasdanika.drawio.Node> nodeMap = generateContainerRepresentation(layer, getTarget(), this::getLink, progressMonitor);
			
		org.nasdanika.models.bw5.Node start = getTarget().getStart();
		if (start != null) {
			Node startNode = layer.createNode();
			startNode.setLabel("Start");
			Rectangle geometry = startNode.getGeometry();
			geometry.setX(start.getX());
			geometry.setY(start.getY());
			geometry.setWidth(50);
			geometry.setHeight(50);
			nodeMap.put(start, startNode);
			
			for (Transition transition: start.getOutgoingTransitions()) {
				Node targetNode = nodeMap.get(transition.getTarget());
				layer.createConnection(startNode, targetNode);
			}
		}
		
		org.nasdanika.models.bw5.Node end = getTarget().getEnd();
		if (end != null) {
			Node endNode = layer.createNode();
			endNode.setLabel("End");
			Rectangle geometry = endNode.getGeometry();
			geometry.setX(end.getX());
			geometry.setY(end.getY());
			geometry.setWidth(50);
			geometry.setHeight(50);
			nodeMap.put(end, endNode);
			
			for (Transition transition: end.getIncomingTransitions()) {
				Node sourceNode = nodeMap.get(transition.getSource());
				layer.createConnection(sourceNode, endNode);
			}
		}
				
		return representationDocument;
	}	

	protected String getViewer() {
		return DiagramGenerator.JSDELIVR_DRAWIO_VIEWER;
	}
	
	// incoming calls
	
	// Delegate to container node processor for  activities, end, start, groups, transitions
	
}
