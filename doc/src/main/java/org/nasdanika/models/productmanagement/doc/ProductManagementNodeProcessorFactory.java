package org.nasdanika.models.productmanagement.doc;

import java.util.Collection;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessor;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.AppFactory;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityReference;
import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.PersonaReference;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate documentation.
 * @author Pavel
 *
 */
public class ProductManagementNodeProcessorFactory {
			
	private Context context;
	private java.util.function.BiFunction<URI, ProgressMonitor, Label> prototypeProvider;
	private Collection<DocumentationFactory> documentationFactories;

	protected java.util.function.BiFunction<EObject, ProgressMonitor, Action> getPrototypeProvider(NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config) {
		return (eObj, progressMonitor) -> {
			if (prototypeProvider != null) {
				for (URI identifier: NcoreUtil.getIdentifiers(((EObjectNode) config.getElement()).get())) {
					Label prototype = prototypeProvider.apply(identifier, progressMonitor);
					if (prototype instanceof Action) {
						return (Action) prototype;
					}				
				}			
			}
			return AppFactory.eINSTANCE.createAction();
		};		
	}
	
	/**
	 * 
	 * @param context
	 * @param reflectiveFactories Objects with annotated methods for creating processors. 
	 */
	public ProductManagementNodeProcessorFactory(
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Label> prototypeProvider,
			Collection<DocumentationFactory> documentationFactories)  {
		this.context = context;
		this.prototypeProvider = prototypeProvider;
		this.documentationFactories = documentationFactories;
	}
	
	@EObjectNodeProcessor(type = ProductModel.class)
	public Object createProductModelNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ProductModelNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
			
	@EObjectNodeProcessor(type = Persona.class)
	public Object createPersonaNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new PersonaNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
			
	@EObjectNodeProcessor(type = Concern.class)
	public Object createConcernNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ConcernNodeProcessor<Concern>(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
			
	@EObjectNodeProcessor(type = Goal.class)
	public Object createGoalNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new GoalNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
	
			
	@EObjectNodeProcessor(type = Need.class)
	public Object createNeedNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new NeedNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
			
	@EObjectNodeProcessor(type = PainPoint.class)
	public Object createPainPointNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new PainPointNodeProcessor(
				config, 
				context, 
				getPrototypeProvider(config), 
				documentationFactories);
	}
		
	@EObjectNodeProcessor(type = Capability.class)
	public Object createCapabilityNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
		ProgressMonitor progressMonitor) {
	
	return new CapabilityNodeProcessor(
			config, 
			context, 
			getPrototypeProvider(config), 
			documentationFactories);
	}
			
	@EObjectNodeProcessor(type = PersonaReference.class)
	public Object createPersonaReferenceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
		ProgressMonitor progressMonitor) {
	
	return new PersonaReferenceNodeProcessor(
			config, 
			context, 
			getPrototypeProvider(config));
	}
		
	@EObjectNodeProcessor(type = ConcernReference.class)
	public Object createConcernReferenceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
		ProgressMonitor progressMonitor) {
	
	return new ConcernReferenceNodeProcessor(
			config, 
			context, 
			getPrototypeProvider(config));
	}
		
	@EObjectNodeProcessor(type = CapabilityReference.class)
	public Object createCapabilityReferemceNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		boolean parallel, 
		BiConsumer<Element,BiConsumer<ProcessorInfo<WidgetFactory, WidgetFactory, Object, Object>,ProgressMonitor>> infoProvider,
		ProgressMonitor progressMonitor) {
	
	return new CapabilityReferenceNodeProcessor(
			config, 
			context, 
			getPrototypeProvider(config));
	}
	
	
//	AbstractActor.java
//	AbstractCapability.java
//	AbstractCapabilityProvider.java
//	AbstractConcern.java
//	AbstractEvidence.java
//	AbstractPersona.java
//	Actor.java
//	ActorDomain.java
//	AddressedConcerns.java
//	BlockedGoals.java
//	Capability.java
//	CapabilityDependency.java
//	CapabilityProvider.java
//	CapabilityProviderDomain.java
//	CapabilityProviderReference.java
//	DependencyKind.java
//	Evidence.java
//	EvidenceDomain.java
//	Lifecycle.java
//	ModelElement.java
//	NamedElement.java
//	NamedPeriod.java
//	Need.java
//	PainPoint.java
//	Period.java
//	ProvidedCapability.java
//	RequiredCapability.java
//	Role.java
//	RoleAssignment.java
//	StringIdentity.java
//	SupportedGoals.java
//	Temporal.java
//	Undergoer.java
//	Version.java
//	ViolatedNeeds.java	
	
}
