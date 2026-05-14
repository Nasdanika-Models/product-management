/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.productmanagement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductmanagementFactoryImpl extends EFactoryImpl implements ProductmanagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductmanagementFactory init() {
		try {
			ProductmanagementFactory theProductmanagementFactory = (ProductmanagementFactory)EPackage.Registry.INSTANCE.getEFactory(ProductmanagementPackage.eNS_URI);
			if (theProductmanagementFactory != null) {
				return theProductmanagementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductmanagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductmanagementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProductmanagementPackage.TEMPORAL: return createTemporal();
			case ProductmanagementPackage.PERIOD: return createPeriod();
			case ProductmanagementPackage.PRODUCT_MODEL: return createProductModel();
			case ProductmanagementPackage.PERSONA: return createPersona();
			case ProductmanagementPackage.PERSONA_DOMAIN: return createPersonaDomain();
			case ProductmanagementPackage.PERSONA_REFERENCE: return createPersonaReference();
			case ProductmanagementPackage.CONCERN: return createConcern();
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES: return createAddressingCapabilities();
			case ProductmanagementPackage.CONCERN_REFERENCE: return createConcernReference();
			case ProductmanagementPackage.CONCERN_DOMAIN: return createConcernDomain();
			case ProductmanagementPackage.GOAL: return createGoal();
			case ProductmanagementPackage.NEED: return createNeed();
			case ProductmanagementPackage.SUPPORTED_GOALS: return createSupportedGoals();
			case ProductmanagementPackage.PAIN_POINT: return createPainPoint();
			case ProductmanagementPackage.BLOCKED_GOALS: return createBlockedGoals();
			case ProductmanagementPackage.VIOLATED_NEEDS: return createViolatedNeeds();
			case ProductmanagementPackage.CAPABILITY: return createCapability();
			case ProductmanagementPackage.CAPABILITY_REFERENCE: return createCapabilityReference();
			case ProductmanagementPackage.CAPABILITY_DOMAIN: return createCapabilityDomain();
			case ProductmanagementPackage.ADDRESSED_CONCERNS: return createAddressedConcerns();
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY: return createCapabilityDependency();
			case ProductmanagementPackage.CAPABILITY_PROVIDER: return createCapabilityProvider();
			case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN: return createCapabilityProviderDomain();
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE: return createCapabilityProviderReference();
			case ProductmanagementPackage.PROVIDED_CAPABILITY: return createProvidedCapability();
			case ProductmanagementPackage.EVIDENCE: return createEvidence();
			case ProductmanagementPackage.EVIDENCE_DOMAIN: return createEvidenceDomain();
			case ProductmanagementPackage.REQUIRED_CAPABILITY: return createRequiredCapability();
			case ProductmanagementPackage.VERSION: return createVersion();
			case ProductmanagementPackage.ROLE: return createRole();
			case ProductmanagementPackage.ROLE_ASSIGNMENT: return createRoleAssignment();
			case ProductmanagementPackage.ACTOR: return createActor();
			case ProductmanagementPackage.ACTOR_DOMAIN: return createActorDomain();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProductmanagementPackage.LIFECYCLE:
				return createLifecycleFromString(eDataType, initialValue);
			case ProductmanagementPackage.DEPENDENCY_KIND:
				return createDependencyKindFromString(eDataType, initialValue);
			case ProductmanagementPackage.INSTANT:
				return createInstantFromString(eDataType, initialValue);
			case ProductmanagementPackage.DURATION:
				return createDurationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProductmanagementPackage.LIFECYCLE:
				return convertLifecycleToString(eDataType, instanceValue);
			case ProductmanagementPackage.DEPENDENCY_KIND:
				return convertDependencyKindToString(eDataType, instanceValue);
			case ProductmanagementPackage.INSTANT:
				return convertInstantToString(eDataType, instanceValue);
			case ProductmanagementPackage.DURATION:
				return convertDurationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal createTemporal() {
		TemporalImpl temporal = new TemporalImpl();
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductModel createProductModel() {
		ProductModelImpl productModel = new ProductModelImpl();
		return productModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persona createPersona() {
		PersonaImpl persona = new PersonaImpl();
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonaDomain createPersonaDomain() {
		PersonaDomainImpl personaDomain = new PersonaDomainImpl();
		return personaDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonaReference createPersonaReference() {
		PersonaReferenceImpl personaReference = new PersonaReferenceImpl();
		return personaReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concern createConcern() {
		ConcernImpl concern = new ConcernImpl();
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressingCapabilities createAddressingCapabilities() {
		AddressingCapabilitiesImpl addressingCapabilities = new AddressingCapabilitiesImpl();
		return addressingCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernReference createConcernReference() {
		ConcernReferenceImpl concernReference = new ConcernReferenceImpl();
		return concernReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernDomain createConcernDomain() {
		ConcernDomainImpl concernDomain = new ConcernDomainImpl();
		return concernDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Need createNeed() {
		NeedImpl need = new NeedImpl();
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportedGoals createSupportedGoals() {
		SupportedGoalsImpl supportedGoals = new SupportedGoalsImpl();
		return supportedGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PainPoint createPainPoint() {
		PainPointImpl painPoint = new PainPointImpl();
		return painPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockedGoals createBlockedGoals() {
		BlockedGoalsImpl blockedGoals = new BlockedGoalsImpl();
		return blockedGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViolatedNeeds createViolatedNeeds() {
		ViolatedNeedsImpl violatedNeeds = new ViolatedNeedsImpl();
		return violatedNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityReference createCapabilityReference() {
		CapabilityReferenceImpl capabilityReference = new CapabilityReferenceImpl();
		return capabilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityDomain createCapabilityDomain() {
		CapabilityDomainImpl capabilityDomain = new CapabilityDomainImpl();
		return capabilityDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressedConcerns createAddressedConcerns() {
		AddressedConcernsImpl addressedConcerns = new AddressedConcernsImpl();
		return addressedConcerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityDependency createCapabilityDependency() {
		CapabilityDependencyImpl capabilityDependency = new CapabilityDependencyImpl();
		return capabilityDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityProvider createCapabilityProvider() {
		CapabilityProviderImpl capabilityProvider = new CapabilityProviderImpl();
		return capabilityProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityProviderDomain createCapabilityProviderDomain() {
		CapabilityProviderDomainImpl capabilityProviderDomain = new CapabilityProviderDomainImpl();
		return capabilityProviderDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityProviderReference createCapabilityProviderReference() {
		CapabilityProviderReferenceImpl capabilityProviderReference = new CapabilityProviderReferenceImpl();
		return capabilityProviderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedCapability createProvidedCapability() {
		ProvidedCapabilityImpl providedCapability = new ProvidedCapabilityImpl();
		return providedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceDomain createEvidenceDomain() {
		EvidenceDomainImpl evidenceDomain = new EvidenceDomainImpl();
		return evidenceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredCapability createRequiredCapability() {
		RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleAssignment createRoleAssignment() {
		RoleAssignmentImpl roleAssignment = new RoleAssignmentImpl();
		return roleAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActorDomain createActorDomain() {
		ActorDomainImpl actorDomain = new ActorDomainImpl();
		return actorDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle createLifecycleFromString(EDataType eDataType, String initialValue) {
		Lifecycle result = Lifecycle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecycleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyKind createDependencyKindFromString(EDataType eDataType, String initialValue) {
		DependencyKind result = DependencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstantFromString(EDataType eDataType, String initialValue) {
		return (Instant)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDurationFromString(EDataType eDataType, String initialValue) {
		return (Duration)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductmanagementPackage getProductmanagementPackage() {
		return (ProductmanagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductmanagementPackage getPackage() {
		return ProductmanagementPackage.eINSTANCE;
	}

} //ProductmanagementFactoryImpl
