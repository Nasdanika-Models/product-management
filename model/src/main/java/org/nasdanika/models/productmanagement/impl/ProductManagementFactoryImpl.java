/**
 */
package org.nasdanika.models.productmanagement.impl;

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
public class ProductManagementFactoryImpl extends EFactoryImpl implements ProductManagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductManagementFactory init() {
		try {
			ProductManagementFactory theProductManagementFactory = (ProductManagementFactory)EPackage.Registry.INSTANCE.getEFactory(ProductManagementPackage.eNS_URI);
			if (theProductManagementFactory != null) {
				return theProductManagementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductManagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductManagementFactoryImpl() {
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
			case ProductManagementPackage.PERSONA: return createPersona();
			case ProductManagementPackage.BEHAVIOR: return createBehavior();
			case ProductManagementPackage.ACTION: return createAction();
			case ProductManagementPackage.NEED: return createNeed();
			case ProductManagementPackage.GOAL: return createGoal();
			case ProductManagementPackage.PAIN_POINT: return createPainPoint();
			case ProductManagementPackage.PRODUCT_PORTFOLIO: return createProductPortfolio();
			case ProductManagementPackage.PRODUCT: return createProduct();
			case ProductManagementPackage.EDITION: return createEdition();
			case ProductManagementPackage.FEATURE: return createFeature();
			case ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION: return createFeaturePersonaAssociation();
			case ProductManagementPackage.CAPABILITY: return createCapability();
			case ProductManagementPackage.CAPABILITY_PROVIDER: return createCapabilityProvider();
			case ProductManagementPackage.VERSION: return createVersion();
			case ProductManagementPackage.RELEASE: return createRelease();
			case ProductManagementPackage.SUBSCRIPTION: return createSubscription();
			case ProductManagementPackage.SERVICE_LEVEL: return createServiceLevel();
			case ProductManagementPackage.VALUE_PROPOSITION: return createValueProposition();
			case ProductManagementPackage.EVIDENCE: return createEvidence();
			case ProductManagementPackage.OUTCOME_METRIC: return createOutcomeMetric();
			case ProductManagementPackage.ALTERNATIVE: return createAlternative();
			case ProductManagementPackage.MARKET_SEGMENT: return createMarketSegment();
			case ProductManagementPackage.INDUSTRY: return createIndustry();
			case ProductManagementPackage.GEOGRAPHY: return createGeography();
			case ProductManagementPackage.COMPANY_SIZE: return createCompanySize();
			case ProductManagementPackage.CHANNEL: return createChannel();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE: return createIdealCustomerProfile();
			case ProductManagementPackage.REGULATORY_CONSTRAINT: return createRegulatoryConstraint();
			case ProductManagementPackage.HYPOTHESIS: return createHypothesis();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL: return createProductManagementModel();
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
			case ProductManagementPackage.GOAL_TYPE:
				return createGoalTypeFromString(eDataType, initialValue);
			case ProductManagementPackage.RELEASE_STATUS:
				return createReleaseStatusFromString(eDataType, initialValue);
			case ProductManagementPackage.HYPOTHESIS_STATUS:
				return createHypothesisStatusFromString(eDataType, initialValue);
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
			case ProductManagementPackage.GOAL_TYPE:
				return convertGoalTypeToString(eDataType, instanceValue);
			case ProductManagementPackage.RELEASE_STATUS:
				return convertReleaseStatusToString(eDataType, instanceValue);
			case ProductManagementPackage.HYPOTHESIS_STATUS:
				return convertHypothesisStatusToString(eDataType, instanceValue);
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
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
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
	public ProductPortfolio createProductPortfolio() {
		ProductPortfolioImpl productPortfolio = new ProductPortfolioImpl();
		return productPortfolio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edition createEdition() {
		EditionImpl edition = new EditionImpl();
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePersonaAssociation createFeaturePersonaAssociation() {
		FeaturePersonaAssociationImpl featurePersonaAssociation = new FeaturePersonaAssociationImpl();
		return featurePersonaAssociation;
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
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLevel createServiceLevel() {
		ServiceLevelImpl serviceLevel = new ServiceLevelImpl();
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueProposition createValueProposition() {
		ValuePropositionImpl valueProposition = new ValuePropositionImpl();
		return valueProposition;
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
	public OutcomeMetric createOutcomeMetric() {
		OutcomeMetricImpl outcomeMetric = new OutcomeMetricImpl();
		return outcomeMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketSegment createMarketSegment() {
		MarketSegmentImpl marketSegment = new MarketSegmentImpl();
		return marketSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Industry createIndustry() {
		IndustryImpl industry = new IndustryImpl();
		return industry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geography createGeography() {
		GeographyImpl geography = new GeographyImpl();
		return geography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompanySize createCompanySize() {
		CompanySizeImpl companySize = new CompanySizeImpl();
		return companySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdealCustomerProfile createIdealCustomerProfile() {
		IdealCustomerProfileImpl idealCustomerProfile = new IdealCustomerProfileImpl();
		return idealCustomerProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegulatoryConstraint createRegulatoryConstraint() {
		RegulatoryConstraintImpl regulatoryConstraint = new RegulatoryConstraintImpl();
		return regulatoryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hypothesis createHypothesis() {
		HypothesisImpl hypothesis = new HypothesisImpl();
		return hypothesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductManagementModel createProductManagementModel() {
		ProductManagementModelImpl productManagementModel = new ProductManagementModelImpl();
		return productManagementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalType createGoalTypeFromString(EDataType eDataType, String initialValue) {
		GoalType result = GoalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseStatus createReleaseStatusFromString(EDataType eDataType, String initialValue) {
		ReleaseStatus result = ReleaseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReleaseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypothesisStatus createHypothesisStatusFromString(EDataType eDataType, String initialValue) {
		HypothesisStatus result = HypothesisStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHypothesisStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductManagementPackage getProductManagementPackage() {
		return (ProductManagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductManagementPackage getPackage() {
		return ProductManagementPackage.eINSTANCE;
	}

} //ProductManagementFactoryImpl
