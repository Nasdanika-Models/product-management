package org.nasdanika.models.productmanagement.filters.markdown;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.markdown.Heading;
import org.nasdanika.models.markdown.Node;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.ModelElement;
import org.nasdanika.models.productmanagement.NamedElement;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.StringIdentity;

/**
 * Builder target with handlers.
 */
public class BuilderTarget {
	
	private static final String OWN_CONTENT_END_OFFSET = "ownContentEndOffset";
	
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
	
	private static String getName(Heading heading) {
		int attributesLength = heading.getAttributesEndOffset() - heading.getAttributesStartOffset();
		String name = heading.getText();
		return name.substring(0, name.length() - attributesLength).trim();
	}
	
	// TODO - Temporal, Period
	
	@Handler
	public Map<Object,Object> buildStringIdentity(
			Heading heading, 
			StringIdentity stringIdentity, 			
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		System.out.println("Building string identity " + stringIdentity.getClass().getSimpleName() + " with the state" + buildState);
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildModelElement(
			Heading heading, 
			ModelElement modelElement, 			
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
				
		int ownContentStartOffset = Math.max(heading.getAttributesEndOffset(), heading.getAttributesEndOffset());
		int ownContentEndOffset = heading.getContentEndOffset();		
		if (buildState.get(OWN_CONTENT_END_OFFSET) instanceof Integer offset) {
			ownContentEndOffset = Math.min(ownContentEndOffset, offset);
		}
		
		String documentation = markdown.substring(ownContentStartOffset, ownContentEndOffset).trim();
		if (!Util.isBlank(documentation)) {
			modelElement.setDocumentation(documentation.trim());
		}
		
		// TODO - icon, uris

		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildNamedElement(
			Heading heading, 
			NamedElement namedElement, 			
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		namedElement.setName(getName(heading));
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildPersonaDomain(
			Heading heading, 
			PersonaDomain personaDomain, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
				
		for (Node child: heading.getChildren()) {
			if (child instanceof Heading childHeading && "Personas".equals(getName(childHeading))) {
				if (buildState.get(OWN_CONTENT_END_OFFSET) instanceof Integer offset) {
					buildState.put(OWN_CONTENT_END_OFFSET, Math.min(childHeading.getStartOffset(), offset));
				} else {
					buildState.put(OWN_CONTENT_END_OFFSET, childHeading.getStartOffset());
				}
				
				for (Node personaChild: childHeading.getChildren()) {
					if (personaChild instanceof Heading personaHeading) {
						
						
						
					}
				}
				
			}
		}
		
		
		
		// personas including references
		
		System.out.println("Building persona domain " + personaDomain.getName() + " with the state" + buildState);
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildConcern(
			Heading heading, 
			Concern concern, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// addressed by
		// supports
		// supported by
		
		System.out.println("Building concern " + concern + " the state" + buildState);
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildConcernDomain(
			Heading heading, 
			ConcernDomain concernDomain, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// concerns including references
		
		System.out.println("Building concern domain " + concernDomain + " with the state" + buildState);
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildGoal(
			Heading heading, 
			Goal goal, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// blocked by 
		System.out.println("Building goal " + goal + " with the state" + buildState);
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildNeed(
			Heading heading, 
			Need need, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		// violatedBy
		System.out.println("Building need " + need + " with the state" + buildState);
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildPainPoint(
			Heading heading, 
			PainPoint painPoint, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		// blocks
		// violates
		System.out.println("Building pain point " + painPoint + " with the state" + buildState);
		return buildState;
	}
		
	@Handler
	public Map<Object,Object> buildCapability(
			Heading heading, 
			Capability capability, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		// addresses
		// subcapabilities
		// dependencies
		System.out.println("Building capability " + capability + " with the state" + buildState);
		return buildState;
	}
	
	@Handler
	public Map<Object,Object> buildCapabilityDomain(
			Heading heading, 
			PainPoint painPoint, 
			Map<Object,Object> buildState,
			BiConsumer<Object, Object> builder,			
			ProgressMonitor progressMonitor) {
		
		// capabilities including references
		System.out.println("Building pain point " + painPoint + " with the state" + buildState);
		return buildState;
	}
	
	// TODO - capability providers
	
}
