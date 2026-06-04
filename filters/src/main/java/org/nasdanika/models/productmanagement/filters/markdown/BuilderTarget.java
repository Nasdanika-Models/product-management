package org.nasdanika.models.productmanagement.filters.markdown;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.markdown.Attribute;
import org.nasdanika.models.markdown.Container;
import org.nasdanika.models.markdown.FencedDiv;
import org.nasdanika.models.markdown.Node;
import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.AbstractConcern;
import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityDomain;
import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.ModelElement;
import org.nasdanika.models.productmanagement.NamedElement;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.StringIdentity;

/**
 * Builder target with handlers.
 */
public class BuilderTarget {
	
	private static final String URI_ATTR = "uri";

	private static final String ICON_ATTR = "icon";

	private static final String OWN_CONTENT_END_OFFSET = "ownContentEndOffset";

	private static final String ID_ATTR = "id";
	
	private Resource resource;
	private String markdown;
	private BiConsumer<Object, BiConsumer<Object,ProgressMonitor>> elementProvider;
	private Consumer<BiConsumer<Map<Object, EModelElement>,ProgressMonitor>> registryProvider;
	
	public BuilderTarget(
			Resource resource,
			String markdown,
			BiConsumer<Object, BiConsumer<Object,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<Object, EModelElement>,ProgressMonitor>> registryProvider) {
		this.resource = resource;
		this.markdown = markdown;
		this.elementProvider = elementProvider;
		this.registryProvider = registryProvider;
	}
	
	/**
	 * Extracts the name of the element from the heading text by removing the attributes part. 
	 * The attributes part is determined based on the offsets provided by the heading. 
	 * The remaining text is trimmed and returned as the name.
	 * @param paragraph
	 * @return
	 */
	private static String getName(Container container) {
		int attributesLength = container.getAttributesEndOffset() - container.getAttributesStartOffset();
		String name = container.getText();
		return name.substring(0, name.length() - attributesLength).trim();
	}
			
	// TODO - Temporal, Period
	
	@Handler
	public Map<Object,Object> buildStringIdentity(
			Container container, 
			StringIdentity stringIdentity, 			
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		for (Attribute attr: container.getAttributes()) {
			switch (attr.getKey()) {
			case ID_ATTR:
				stringIdentity.setId(attr.getValue());
				break;
			}
		}
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildModelElement(
			Container container, 
			ModelElement modelElement, 			
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
				
		int ownContentStartOffset = Math.max(container.getEndOffset(), container.getAttributesEndOffset());
		int ownContentEndOffset = container.getContentEndOffset();		
		if (buildState.get(OWN_CONTENT_END_OFFSET) instanceof Integer offset) {
			ownContentEndOffset = Math.min(ownContentEndOffset, offset);
		}
		
		String documentation = markdown.substring(ownContentStartOffset, ownContentEndOffset).trim();
		if (!Util.isBlank(documentation)) {
			modelElement.setDocumentation(documentation.trim());
		}
		
		for (Attribute attr: container.getAttributes()) {
			switch (attr.getKey()) {
			case ICON_ATTR:
				modelElement.setIcon(attr.getValue());
				break;
			case URI_ATTR:
				modelElement.getUris().add(attr.getValue());
				break;
			}
		}

		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildNamedElement(
			Container container, 
			NamedElement namedElement, 			
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		namedElement.setName(getName(container));
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildPersonaDomain(
			Container container, 
			PersonaDomain personaDomain, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// Personas section
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Personas"),
				ProductmanagementPackage.Literals.PERSONA.getName(),
				buildState, 
				builder,
				(Consumer<AbstractPersona>) personaDomain.getPersonas()::add);				
		
		return buildState;
	}
	
	protected boolean matchName(Node source, String name) {
		if (source instanceof Container container) {
			return name.equals(getName(container));
		} 
		
		return false;
	}

	/**
	 * Builds references fro two levels of headings - reference heading and element heading.
	 * The reference heading is identified by the provided predicate and is expected to contain element headings as its children.
	 * The element headings are expected to have an attribute with the key "type" that specifies the type of the element to 
	 * be created.
	 * If the attribute is not present, the provided default element type name is used.
	 * @param <T>
	 * @param heading
	 * @param subHeadingPredicate
	 * @param defaultElementTypeName
	 * @param buildState
	 * @param builder
	 * @param referenceConsumer
	 */
	protected <T> void buildReferenceFromChildContainers(
			Node source, 
			Predicate<Node> referenceNodePredicate,
			String defaultElementTypeName,
			Map<Object, Object> buildState, 
			BiConsumer<Object, Object> builder,
			Consumer<T> referenceConsumer) {
		
		for (Node child: source.getChildren()) {
			if (referenceNodePredicate.test(child)) {
				if (buildState.get(OWN_CONTENT_END_OFFSET) instanceof Integer offset) {
					buildState.put(OWN_CONTENT_END_OFFSET, Math.min(child.getStartOffset(), offset));
				} else {
					buildState.put(OWN_CONTENT_END_OFFSET, child.getStartOffset());
				}
				
				for (Node elementNode: child.getChildren()) {
					if (elementNode instanceof Container elementContainer) {
						String elementTypeName = defaultElementTypeName;
						for (Attribute attr: elementContainer.getAttributes()) {
							switch (attr.getKey()) {
							case MarkdownToProductManagementFactory.TYPE_ATTR:
								elementTypeName = attr.getValue();
								break;
							}
						}
						
						@SuppressWarnings("unchecked")
						T element = (T) ProductmanagementFactory.eINSTANCE.create((EClass) ProductmanagementPackage.eINSTANCE.getEClassifier(elementTypeName));
						builder.accept(elementContainer, element);
						referenceConsumer.accept(element);
					}
				}				
			}
		}
	}
	
//	child instanceof Heading subHeading 
		
	@Handler
	public Map<Object,Object> buildConcern(
			Container container, 
			Concern concern, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// addressed by
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Addressed by"),
				ProductmanagementPackage.Literals.CAPABILITY.getName(),
				buildState, 
				builder,
				(Consumer<AbstractCapability>) concern.getAddressedBy()::add);				
		
		// supports
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Supports"),
				ProductmanagementPackage.Literals.CONCERN_REFERENCE.getName(),
				buildState, 
				builder,
				(Consumer<ConcernReference>) concern.getSupports()::add);		
		
		// supported by
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Supported by"),
				ProductmanagementPackage.Literals.CONCERN_REFERENCE.getName(),
				buildState, 
				builder,
				(Consumer<ConcernReference>) concern.getSupportedBy()::add);		
		
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildConcernDomain(
			Container container, 
			ConcernDomain concernDomain, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Concerns"),
				ProductmanagementPackage.Literals.CONCERN.getName(),
				buildState, 
				builder,
				(Consumer<AbstractConcern>) concernDomain.getConcerns()::add);		
		
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Goals"),
				ProductmanagementPackage.Literals.GOAL.getName(),
				buildState, 
				builder,
				(Consumer<AbstractConcern>) concernDomain.getConcerns()::add);		
		
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Needs"),
				ProductmanagementPackage.Literals.NEED.getName(),
				buildState, 
				builder,
				(Consumer<AbstractConcern>) concernDomain.getConcerns()::add);		

		
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Pain points"),
				ProductmanagementPackage.Literals.PAIN_POINT.getName(),
				buildState, 
				builder,
				(Consumer<AbstractConcern>) concernDomain.getConcerns()::add);		
		
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildGoal(
			Container container, 
			Goal goal, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// blocked by 		
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Blocked by"),
				ProductmanagementPackage.Literals.CONCERN_REFERENCE.getName(),
				buildState, 
				builder,
				(Consumer<ConcernReference>) goal.getBlockedBy()::add);		
		
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildNeed(
			Container container, 
			Need need, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// violatedBy		
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Violated by"),
				ProductmanagementPackage.Literals.CONCERN_REFERENCE.getName(),
				buildState, 
				builder,
				(Consumer<ConcernReference>) need.getViolatedBy()::add);		
		
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildPainPoint(
			Container container, 
			PainPoint painPoint, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		// blocks
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Blocks"),
				ProductmanagementPackage.Literals.CONCERN_REFERENCE.getName(),
				buildState, 
				builder,
				(Consumer<ConcernReference>) painPoint.getBlocks()::add);		

		// violates
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Violates"),
				ProductmanagementPackage.Literals.CONCERN_REFERENCE.getName(),
				buildState, 
				builder,
				(Consumer<ConcernReference>) painPoint.getViolates()::add);		
		
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildCapability(
			Container container, 
			Capability capability, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		// addresses
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Addresses"),
				ProductmanagementPackage.Literals.CONCERN_REFERENCE.getName(),
				buildState, 
				builder,
				(Consumer<AbstractConcern>) capability.getAddresses()::add);		
		
		// dependencies
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Dependencies"),
				ProductmanagementPackage.Literals.CAPABILITY.getName(),
				buildState, 
				builder,
				(Consumer<AbstractCapability>) capability.getDependencies()::add);		
		
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildCapabilityDomain(
			Container container, 
			CapabilityDomain capabilityDomain, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// capabilities including references
		buildReferenceFromChildContainers(
				container, 
				c -> matchName(c, "Capabilities"),
				ProductmanagementPackage.Literals.CAPABILITY.getName(),
				buildState, 
				builder,
				(Consumer<AbstractCapability>) capabilityDomain.getCapabilities()::add);		
		
		return buildState;
	}
	
	// TODO - capability providers
	
}
