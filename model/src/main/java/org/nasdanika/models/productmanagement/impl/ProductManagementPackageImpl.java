/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.productmanagement.Action;
import org.nasdanika.models.productmanagement.Alternative;
import org.nasdanika.models.productmanagement.Behavior;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.Channel;
import org.nasdanika.models.productmanagement.CompanySize;
import org.nasdanika.models.productmanagement.Edition;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.Feature;
import org.nasdanika.models.productmanagement.FeaturePersonaAssociation;
import org.nasdanika.models.productmanagement.Geography;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.GoalType;
import org.nasdanika.models.productmanagement.Hypothesis;
import org.nasdanika.models.productmanagement.HypothesisStatus;
import org.nasdanika.models.productmanagement.IdealCustomerProfile;
import org.nasdanika.models.productmanagement.Industry;
import org.nasdanika.models.productmanagement.MarketSegment;
import org.nasdanika.models.productmanagement.ModelElement;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.OutcomeMetric;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.Product;
import org.nasdanika.models.productmanagement.ProductManagementFactory;
import org.nasdanika.models.productmanagement.ProductManagementModel;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.ProductPortfolio;
import org.nasdanika.models.productmanagement.RegulatoryConstraint;
import org.nasdanika.models.productmanagement.Release;
import org.nasdanika.models.productmanagement.ReleaseStatus;
import org.nasdanika.models.productmanagement.ServiceLevel;
import org.nasdanika.models.productmanagement.Subscription;
import org.nasdanika.models.productmanagement.ValueProposition;
import org.nasdanika.models.productmanagement.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductManagementPackageImpl extends EPackageImpl implements ProductManagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass needEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass painPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPortfolioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePersonaAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outcomeMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass industryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass companySizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idealCustomerProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatoryConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypothesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productManagementModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum releaseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hypothesisStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductManagementPackageImpl() {
		super(eNS_URI, ProductManagementFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProductManagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductManagementPackage init() {
		if (isInited) return (ProductManagementPackage)EPackage.Registry.INSTANCE.getEPackage(ProductManagementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProductManagementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProductManagementPackageImpl theProductManagementPackage = registeredProductManagementPackage instanceof ProductManagementPackageImpl ? (ProductManagementPackageImpl)registeredProductManagementPackage : new ProductManagementPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProductManagementPackage.createPackageContents();

		// Initialize created meta-data
		theProductManagementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductManagementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductManagementPackage.eNS_URI, theProductManagementPackage);
		return theProductManagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Description() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Id() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Age() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Role() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_ExperienceLevel() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_WorkEnvironment() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_ToolsUsed() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Attitudes() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Behaviors() {
		return (EReference)personaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Actions() {
		return (EReference)personaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Needs() {
		return (EReference)personaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Goals() {
		return (EReference)personaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_PainPoints() {
		return (EReference)personaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehavior_Category() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavior_RelatedNeeds() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavior_RelatedPainPoints() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavior_RelatedGoals() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Order() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_RelatedCapabilities() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_RelatedFeatures() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeed() {
		return needEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeed_SupportedGoals() {
		return (EReference)needEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeed_RelatedNeeds() {
		return (EReference)needEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_GoalType() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoal_RelatedGoals() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPainPoint() {
		return painPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPainPoint_ViolatedNeeds() {
		return (EReference)painPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPainPoint_BlockedGoals() {
		return (EReference)painPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPainPoint_RelatedPainPoints() {
		return (EReference)painPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductPortfolio() {
		return productPortfolioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductPortfolio_Products() {
		return (EReference)productPortfolioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Editions() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Features() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_TargetPersonas() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Versions() {
		return (EReference)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Releases() {
		return (EReference)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdition() {
		return editionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_IncludedFeatures() {
		return (EReference)editionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_IncludedCapabilities() {
		return (EReference)editionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_AvailableGeographies() {
		return (EReference)editionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_AvailableChannels() {
		return (EReference)editionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_AddressedNeeds() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_SupportedGoals() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_AddressedPainPoints() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_PersonaAssociations() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_UsedCapabilities() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePersonaAssociation() {
		return featurePersonaAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePersonaAssociation_Persona() {
		return (EReference)featurePersonaAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Providers() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Versions() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityProvider() {
		return capabilityProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProvider_ProvidedCapabilities() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProvider_RequiredCapabilities() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProvider_Versions() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_VersionScheme() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_VersionString() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Date() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelease_Version() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelease_ReleaseDate() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelease_Status() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelease_IncludedFeatures() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscription() {
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_BillingCycle() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_PricingModel() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscription_AutoRenewal() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscription_Editions() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscription_ServiceLevels() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceLevel() {
		return serviceLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceLevel_Metric() {
		return (EAttribute)serviceLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceLevel_Value() {
		return (EAttribute)serviceLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueProposition() {
		return valuePropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueProposition_Statement() {
		return (EAttribute)valuePropositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_TargetPersonas() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_AddressedNeeds() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_SupportedGoals() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_MitigatedPainPoints() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_EnablingCapabilities() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_PackagedInEditions() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_DifferentiatedFromAlternatives() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_SupportingEvidence() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProposition_TargetSegments() {
		return (EReference)valuePropositionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_EvidenceType() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidence_Source() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidence_MeasuredMetrics() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidence_CollectedInSegments() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutcomeMetric() {
		return outcomeMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutcomeMetric_Unit() {
		return (EAttribute)outcomeMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutcomeMetric_TargetValue() {
		return (EAttribute)outcomeMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlternative_AlternativeType() {
		return (EAttribute)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarketSegment() {
		return marketSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketSegment_SegmentType() {
		return (EAttribute)marketSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketSegment_TargetPersonas() {
		return (EReference)marketSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketSegment_Industries() {
		return (EReference)marketSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketSegment_Geographies() {
		return (EReference)marketSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketSegment_CompanySizes() {
		return (EReference)marketSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketSegment_Channels() {
		return (EReference)marketSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketSegment_IdealCustomerProfiles() {
		return (EReference)marketSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndustry() {
		return industryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndustry_Code() {
		return (EAttribute)industryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndustry_RegulatoryConstraints() {
		return (EReference)industryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeography() {
		return geographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeography_Region() {
		return (EAttribute)geographyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeography_Country() {
		return (EAttribute)geographyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeography_StateProvince() {
		return (EAttribute)geographyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeography_DataResidencyRegion() {
		return (EAttribute)geographyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeography_RegulatoryConstraints() {
		return (EReference)geographyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompanySize() {
		return companySizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompanySize_EmployeeBand() {
		return (EAttribute)companySizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompanySize_RevenueBand() {
		return (EAttribute)companySizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_ChannelType() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdealCustomerProfile() {
		return idealCustomerProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdealCustomerProfile_TargetIndustries() {
		return (EReference)idealCustomerProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdealCustomerProfile_TargetCompanySizes() {
		return (EReference)idealCustomerProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdealCustomerProfile_TargetGeographies() {
		return (EReference)idealCustomerProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdealCustomerProfile_TechStack() {
		return (EAttribute)idealCustomerProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdealCustomerProfile_TargetPersonas() {
		return (EReference)idealCustomerProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegulatoryConstraint() {
		return regulatoryConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegulatoryConstraint_Regulation() {
		return (EAttribute)regulatoryConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegulatoryConstraint_AffectedCapabilities() {
		return (EReference)regulatoryConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHypothesis() {
		return hypothesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_Statement() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_Status() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_Assumptions() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_Risks() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_Owner() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_CreatedAt() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHypothesis_LastUpdatedAt() {
		return (EAttribute)hypothesisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_TargetPersonas() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_LinkedNeeds() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_LinkedGoals() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_LinkedPainPoints() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_EnabledByCapabilities() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_SupportsValuePropositions() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_Evidence() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHypothesis_SuccessMetrics() {
		return (EReference)hypothesisEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductManagementModel() {
		return productManagementModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Personas() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Portfolios() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Products() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Capabilities() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_CapabilityProviders() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Subscriptions() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_ValuePropositions() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Evidence() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Alternatives() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_OutcomeMetrics() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_MarketSegments() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductManagementModel_Hypotheses() {
		return (EReference)productManagementModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGoalType() {
		return goalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReleaseStatus() {
		return releaseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHypothesisStatus() {
		return hypothesisStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductManagementFactory getProductManagementFactory() {
		return (ProductManagementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ID);

		personaEClass = createEClass(PERSONA);
		createEAttribute(personaEClass, PERSONA__AGE);
		createEAttribute(personaEClass, PERSONA__ROLE);
		createEAttribute(personaEClass, PERSONA__EXPERIENCE_LEVEL);
		createEAttribute(personaEClass, PERSONA__WORK_ENVIRONMENT);
		createEAttribute(personaEClass, PERSONA__TOOLS_USED);
		createEAttribute(personaEClass, PERSONA__ATTITUDES);
		createEReference(personaEClass, PERSONA__BEHAVIORS);
		createEReference(personaEClass, PERSONA__ACTIONS);
		createEReference(personaEClass, PERSONA__NEEDS);
		createEReference(personaEClass, PERSONA__GOALS);
		createEReference(personaEClass, PERSONA__PAIN_POINTS);

		behaviorEClass = createEClass(BEHAVIOR);
		createEAttribute(behaviorEClass, BEHAVIOR__CATEGORY);
		createEReference(behaviorEClass, BEHAVIOR__RELATED_NEEDS);
		createEReference(behaviorEClass, BEHAVIOR__RELATED_PAIN_POINTS);
		createEReference(behaviorEClass, BEHAVIOR__RELATED_GOALS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__ORDER);
		createEReference(actionEClass, ACTION__RELATED_CAPABILITIES);
		createEReference(actionEClass, ACTION__RELATED_FEATURES);

		needEClass = createEClass(NEED);
		createEReference(needEClass, NEED__SUPPORTED_GOALS);
		createEReference(needEClass, NEED__RELATED_NEEDS);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__GOAL_TYPE);
		createEReference(goalEClass, GOAL__RELATED_GOALS);

		painPointEClass = createEClass(PAIN_POINT);
		createEReference(painPointEClass, PAIN_POINT__VIOLATED_NEEDS);
		createEReference(painPointEClass, PAIN_POINT__BLOCKED_GOALS);
		createEReference(painPointEClass, PAIN_POINT__RELATED_PAIN_POINTS);

		productPortfolioEClass = createEClass(PRODUCT_PORTFOLIO);
		createEReference(productPortfolioEClass, PRODUCT_PORTFOLIO__PRODUCTS);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__EDITIONS);
		createEReference(productEClass, PRODUCT__FEATURES);
		createEReference(productEClass, PRODUCT__TARGET_PERSONAS);
		createEReference(productEClass, PRODUCT__VERSIONS);
		createEReference(productEClass, PRODUCT__RELEASES);

		editionEClass = createEClass(EDITION);
		createEReference(editionEClass, EDITION__INCLUDED_FEATURES);
		createEReference(editionEClass, EDITION__INCLUDED_CAPABILITIES);
		createEReference(editionEClass, EDITION__AVAILABLE_GEOGRAPHIES);
		createEReference(editionEClass, EDITION__AVAILABLE_CHANNELS);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__ADDRESSED_NEEDS);
		createEReference(featureEClass, FEATURE__SUPPORTED_GOALS);
		createEReference(featureEClass, FEATURE__ADDRESSED_PAIN_POINTS);
		createEReference(featureEClass, FEATURE__PERSONA_ASSOCIATIONS);
		createEReference(featureEClass, FEATURE__USED_CAPABILITIES);

		featurePersonaAssociationEClass = createEClass(FEATURE_PERSONA_ASSOCIATION);
		createEReference(featurePersonaAssociationEClass, FEATURE_PERSONA_ASSOCIATION__PERSONA);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__PROVIDERS);
		createEReference(capabilityEClass, CAPABILITY__VERSIONS);

		capabilityProviderEClass = createEClass(CAPABILITY_PROVIDER);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__VERSIONS);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VERSION_SCHEME);
		createEAttribute(versionEClass, VERSION__VERSION_STRING);
		createEAttribute(versionEClass, VERSION__DATE);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__VERSION);
		createEAttribute(releaseEClass, RELEASE__RELEASE_DATE);
		createEAttribute(releaseEClass, RELEASE__STATUS);
		createEReference(releaseEClass, RELEASE__INCLUDED_FEATURES);

		subscriptionEClass = createEClass(SUBSCRIPTION);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__BILLING_CYCLE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__PRICING_MODEL);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__AUTO_RENEWAL);
		createEReference(subscriptionEClass, SUBSCRIPTION__EDITIONS);
		createEReference(subscriptionEClass, SUBSCRIPTION__SERVICE_LEVELS);

		serviceLevelEClass = createEClass(SERVICE_LEVEL);
		createEAttribute(serviceLevelEClass, SERVICE_LEVEL__METRIC);
		createEAttribute(serviceLevelEClass, SERVICE_LEVEL__VALUE);

		valuePropositionEClass = createEClass(VALUE_PROPOSITION);
		createEAttribute(valuePropositionEClass, VALUE_PROPOSITION__STATEMENT);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__TARGET_PERSONAS);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__ADDRESSED_NEEDS);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__SUPPORTED_GOALS);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__MITIGATED_PAIN_POINTS);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__ENABLING_CAPABILITIES);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__PACKAGED_IN_EDITIONS);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__SUPPORTING_EVIDENCE);
		createEReference(valuePropositionEClass, VALUE_PROPOSITION__TARGET_SEGMENTS);

		evidenceEClass = createEClass(EVIDENCE);
		createEAttribute(evidenceEClass, EVIDENCE__EVIDENCE_TYPE);
		createEAttribute(evidenceEClass, EVIDENCE__SOURCE);
		createEReference(evidenceEClass, EVIDENCE__MEASURED_METRICS);
		createEReference(evidenceEClass, EVIDENCE__COLLECTED_IN_SEGMENTS);

		outcomeMetricEClass = createEClass(OUTCOME_METRIC);
		createEAttribute(outcomeMetricEClass, OUTCOME_METRIC__UNIT);
		createEAttribute(outcomeMetricEClass, OUTCOME_METRIC__TARGET_VALUE);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEAttribute(alternativeEClass, ALTERNATIVE__ALTERNATIVE_TYPE);

		marketSegmentEClass = createEClass(MARKET_SEGMENT);
		createEAttribute(marketSegmentEClass, MARKET_SEGMENT__SEGMENT_TYPE);
		createEReference(marketSegmentEClass, MARKET_SEGMENT__TARGET_PERSONAS);
		createEReference(marketSegmentEClass, MARKET_SEGMENT__INDUSTRIES);
		createEReference(marketSegmentEClass, MARKET_SEGMENT__GEOGRAPHIES);
		createEReference(marketSegmentEClass, MARKET_SEGMENT__COMPANY_SIZES);
		createEReference(marketSegmentEClass, MARKET_SEGMENT__CHANNELS);
		createEReference(marketSegmentEClass, MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES);

		industryEClass = createEClass(INDUSTRY);
		createEAttribute(industryEClass, INDUSTRY__CODE);
		createEReference(industryEClass, INDUSTRY__REGULATORY_CONSTRAINTS);

		geographyEClass = createEClass(GEOGRAPHY);
		createEAttribute(geographyEClass, GEOGRAPHY__REGION);
		createEAttribute(geographyEClass, GEOGRAPHY__COUNTRY);
		createEAttribute(geographyEClass, GEOGRAPHY__STATE_PROVINCE);
		createEAttribute(geographyEClass, GEOGRAPHY__DATA_RESIDENCY_REGION);
		createEReference(geographyEClass, GEOGRAPHY__REGULATORY_CONSTRAINTS);

		companySizeEClass = createEClass(COMPANY_SIZE);
		createEAttribute(companySizeEClass, COMPANY_SIZE__EMPLOYEE_BAND);
		createEAttribute(companySizeEClass, COMPANY_SIZE__REVENUE_BAND);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__CHANNEL_TYPE);

		idealCustomerProfileEClass = createEClass(IDEAL_CUSTOMER_PROFILE);
		createEReference(idealCustomerProfileEClass, IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES);
		createEReference(idealCustomerProfileEClass, IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES);
		createEReference(idealCustomerProfileEClass, IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES);
		createEAttribute(idealCustomerProfileEClass, IDEAL_CUSTOMER_PROFILE__TECH_STACK);
		createEReference(idealCustomerProfileEClass, IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS);

		regulatoryConstraintEClass = createEClass(REGULATORY_CONSTRAINT);
		createEAttribute(regulatoryConstraintEClass, REGULATORY_CONSTRAINT__REGULATION);
		createEReference(regulatoryConstraintEClass, REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES);

		hypothesisEClass = createEClass(HYPOTHESIS);
		createEAttribute(hypothesisEClass, HYPOTHESIS__STATEMENT);
		createEAttribute(hypothesisEClass, HYPOTHESIS__STATUS);
		createEAttribute(hypothesisEClass, HYPOTHESIS__ASSUMPTIONS);
		createEAttribute(hypothesisEClass, HYPOTHESIS__RISKS);
		createEAttribute(hypothesisEClass, HYPOTHESIS__OWNER);
		createEAttribute(hypothesisEClass, HYPOTHESIS__CREATED_AT);
		createEAttribute(hypothesisEClass, HYPOTHESIS__LAST_UPDATED_AT);
		createEReference(hypothesisEClass, HYPOTHESIS__TARGET_PERSONAS);
		createEReference(hypothesisEClass, HYPOTHESIS__LINKED_NEEDS);
		createEReference(hypothesisEClass, HYPOTHESIS__LINKED_GOALS);
		createEReference(hypothesisEClass, HYPOTHESIS__LINKED_PAIN_POINTS);
		createEReference(hypothesisEClass, HYPOTHESIS__ENABLED_BY_CAPABILITIES);
		createEReference(hypothesisEClass, HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS);
		createEReference(hypothesisEClass, HYPOTHESIS__EVIDENCE);
		createEReference(hypothesisEClass, HYPOTHESIS__SUCCESS_METRICS);

		productManagementModelEClass = createEClass(PRODUCT_MANAGEMENT_MODEL);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__PERSONAS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__PRODUCTS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__CAPABILITIES);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__EVIDENCE);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS);
		createEReference(productManagementModelEClass, PRODUCT_MANAGEMENT_MODEL__HYPOTHESES);

		// Create enums
		goalTypeEEnum = createEEnum(GOAL_TYPE);
		releaseStatusEEnum = createEEnum(RELEASE_STATUS);
		hypothesisStatusEEnum = createEEnum(HYPOTHESIS_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personaEClass.getESuperTypes().add(this.getModelElement());
		behaviorEClass.getESuperTypes().add(this.getModelElement());
		actionEClass.getESuperTypes().add(this.getModelElement());
		needEClass.getESuperTypes().add(this.getModelElement());
		goalEClass.getESuperTypes().add(this.getModelElement());
		painPointEClass.getESuperTypes().add(this.getModelElement());
		productPortfolioEClass.getESuperTypes().add(this.getModelElement());
		productEClass.getESuperTypes().add(this.getModelElement());
		editionEClass.getESuperTypes().add(this.getModelElement());
		featureEClass.getESuperTypes().add(this.getCapability());
		featurePersonaAssociationEClass.getESuperTypes().add(this.getModelElement());
		capabilityEClass.getESuperTypes().add(this.getModelElement());
		capabilityProviderEClass.getESuperTypes().add(this.getModelElement());
		versionEClass.getESuperTypes().add(this.getModelElement());
		releaseEClass.getESuperTypes().add(this.getModelElement());
		subscriptionEClass.getESuperTypes().add(this.getModelElement());
		serviceLevelEClass.getESuperTypes().add(this.getModelElement());
		valuePropositionEClass.getESuperTypes().add(this.getModelElement());
		evidenceEClass.getESuperTypes().add(this.getModelElement());
		outcomeMetricEClass.getESuperTypes().add(this.getModelElement());
		alternativeEClass.getESuperTypes().add(this.getModelElement());
		marketSegmentEClass.getESuperTypes().add(this.getModelElement());
		industryEClass.getESuperTypes().add(this.getModelElement());
		geographyEClass.getESuperTypes().add(this.getModelElement());
		companySizeEClass.getESuperTypes().add(this.getModelElement());
		channelEClass.getESuperTypes().add(this.getModelElement());
		idealCustomerProfileEClass.getESuperTypes().add(this.getModelElement());
		regulatoryConstraintEClass.getESuperTypes().add(this.getModelElement());
		hypothesisEClass.getESuperTypes().add(this.getModelElement());
		productManagementModelEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersona_Age(), ecorePackage.getEIntegerObject(), "age", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Role(), ecorePackage.getEString(), "role", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_ExperienceLevel(), ecorePackage.getEString(), "experienceLevel", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_WorkEnvironment(), ecorePackage.getEString(), "workEnvironment", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_ToolsUsed(), ecorePackage.getEString(), "toolsUsed", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Attitudes(), ecorePackage.getEString(), "attitudes", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Behaviors(), this.getBehavior(), null, "behaviors", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Actions(), this.getAction(), null, "actions", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Needs(), this.getNeed(), null, "needs", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Goals(), this.getGoal(), null, "goals", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_PainPoints(), this.getPainPoint(), null, "painPoints", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavior_Category(), ecorePackage.getEString(), "category", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_RelatedNeeds(), this.getNeed(), null, "relatedNeeds", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_RelatedPainPoints(), this.getPainPoint(), null, "relatedPainPoints", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_RelatedGoals(), this.getGoal(), null, "relatedGoals", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Order(), ecorePackage.getEIntegerObject(), "order", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_RelatedCapabilities(), this.getCapability(), null, "relatedCapabilities", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_RelatedFeatures(), this.getFeature(), null, "relatedFeatures", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(needEClass, Need.class, "Need", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeed_SupportedGoals(), this.getGoal(), null, "supportedGoals", null, 0, -1, Need.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeed_RelatedNeeds(), this.getNeed(), null, "relatedNeeds", null, 0, -1, Need.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_GoalType(), this.getGoalType(), "goalType", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_RelatedGoals(), this.getGoal(), null, "relatedGoals", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(painPointEClass, PainPoint.class, "PainPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPainPoint_ViolatedNeeds(), this.getNeed(), null, "violatedNeeds", null, 0, -1, PainPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_BlockedGoals(), this.getGoal(), null, "blockedGoals", null, 0, -1, PainPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_RelatedPainPoints(), this.getPainPoint(), null, "relatedPainPoints", null, 0, -1, PainPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productPortfolioEClass, ProductPortfolio.class, "ProductPortfolio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductPortfolio_Products(), this.getProduct(), null, "products", null, 0, -1, ProductPortfolio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Editions(), this.getEdition(), null, "editions", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Features(), this.getFeature(), null, "features", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_TargetPersonas(), this.getPersona(), null, "targetPersonas", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Versions(), this.getVersion(), null, "versions", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Releases(), this.getRelease(), null, "releases", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editionEClass, Edition.class, "Edition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdition_IncludedFeatures(), this.getFeature(), null, "includedFeatures", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_IncludedCapabilities(), this.getCapability(), null, "includedCapabilities", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_AvailableGeographies(), this.getGeography(), null, "availableGeographies", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_AvailableChannels(), this.getChannel(), null, "availableChannels", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_AddressedNeeds(), this.getNeed(), null, "addressedNeeds", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_SupportedGoals(), this.getGoal(), null, "supportedGoals", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_AddressedPainPoints(), this.getPainPoint(), null, "addressedPainPoints", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_PersonaAssociations(), this.getFeaturePersonaAssociation(), null, "personaAssociations", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_UsedCapabilities(), this.getCapability(), null, "usedCapabilities", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featurePersonaAssociationEClass, FeaturePersonaAssociation.class, "FeaturePersonaAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturePersonaAssociation_Persona(), this.getPersona(), null, "persona", null, 1, 1, FeaturePersonaAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Providers(), this.getCapabilityProvider(), this.getCapabilityProvider_ProvidedCapabilities(), "providers", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Versions(), this.getVersion(), null, "versions", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityProviderEClass, CapabilityProvider.class, "CapabilityProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProvider_ProvidedCapabilities(), this.getCapability(), this.getCapability_Providers(), "providedCapabilities", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProvider_RequiredCapabilities(), this.getCapability(), null, "requiredCapabilities", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProvider_Versions(), this.getVersion(), null, "versions", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_VersionScheme(), ecorePackage.getEString(), "versionScheme", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_VersionString(), ecorePackage.getEString(), "versionString", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelease_Version(), this.getVersion(), null, "version", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_Status(), this.getReleaseStatus(), "status", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelease_IncludedFeatures(), this.getFeature(), null, "includedFeatures", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscription_BillingCycle(), ecorePackage.getEString(), "billingCycle", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_PricingModel(), ecorePackage.getEString(), "pricingModel", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_AutoRenewal(), ecorePackage.getEBoolean(), "autoRenewal", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscription_Editions(), this.getEdition(), null, "editions", null, 0, -1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscription_ServiceLevels(), this.getServiceLevel(), null, "serviceLevels", null, 0, -1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelEClass, ServiceLevel.class, "ServiceLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevel_Metric(), ecorePackage.getEString(), "metric", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevel_Value(), ecorePackage.getEString(), "value", null, 0, 1, ServiceLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePropositionEClass, ValueProposition.class, "ValueProposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueProposition_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_TargetPersonas(), this.getPersona(), null, "targetPersonas", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_AddressedNeeds(), this.getNeed(), null, "addressedNeeds", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_SupportedGoals(), this.getGoal(), null, "supportedGoals", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_MitigatedPainPoints(), this.getPainPoint(), null, "mitigatedPainPoints", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_EnablingCapabilities(), this.getCapability(), null, "enablingCapabilities", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_PackagedInEditions(), this.getEdition(), null, "packagedInEditions", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_DifferentiatedFromAlternatives(), this.getAlternative(), null, "differentiatedFromAlternatives", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_SupportingEvidence(), this.getEvidence(), null, "supportingEvidence", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProposition_TargetSegments(), this.getMarketSegment(), null, "targetSegments", null, 0, -1, ValueProposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvidence_EvidenceType(), ecorePackage.getEString(), "evidenceType", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvidence_Source(), ecorePackage.getEString(), "source", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvidence_MeasuredMetrics(), this.getOutcomeMetric(), null, "measuredMetrics", null, 0, -1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvidence_CollectedInSegments(), this.getMarketSegment(), null, "collectedInSegments", null, 0, -1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outcomeMetricEClass, OutcomeMetric.class, "OutcomeMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutcomeMetric_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, OutcomeMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutcomeMetric_TargetValue(), ecorePackage.getEString(), "targetValue", null, 0, 1, OutcomeMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlternative_AlternativeType(), ecorePackage.getEString(), "alternativeType", null, 0, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marketSegmentEClass, MarketSegment.class, "MarketSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarketSegment_SegmentType(), ecorePackage.getEString(), "segmentType", null, 0, 1, MarketSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketSegment_TargetPersonas(), this.getPersona(), null, "targetPersonas", null, 0, -1, MarketSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketSegment_Industries(), this.getIndustry(), null, "industries", null, 0, -1, MarketSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketSegment_Geographies(), this.getGeography(), null, "geographies", null, 0, -1, MarketSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketSegment_CompanySizes(), this.getCompanySize(), null, "companySizes", null, 0, -1, MarketSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketSegment_Channels(), this.getChannel(), null, "channels", null, 0, -1, MarketSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketSegment_IdealCustomerProfiles(), this.getIdealCustomerProfile(), null, "idealCustomerProfiles", null, 0, -1, MarketSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(industryEClass, Industry.class, "Industry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndustry_Code(), ecorePackage.getEString(), "code", null, 0, 1, Industry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndustry_RegulatoryConstraints(), this.getRegulatoryConstraint(), null, "regulatoryConstraints", null, 0, -1, Industry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geographyEClass, Geography.class, "Geography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeography_Region(), ecorePackage.getEString(), "region", null, 0, 1, Geography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeography_Country(), ecorePackage.getEString(), "country", null, 0, 1, Geography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeography_StateProvince(), ecorePackage.getEString(), "stateProvince", null, 0, 1, Geography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeography_DataResidencyRegion(), ecorePackage.getEString(), "dataResidencyRegion", null, 0, 1, Geography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeography_RegulatoryConstraints(), this.getRegulatoryConstraint(), null, "regulatoryConstraints", null, 0, -1, Geography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(companySizeEClass, CompanySize.class, "CompanySize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompanySize_EmployeeBand(), ecorePackage.getEString(), "employeeBand", null, 0, 1, CompanySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompanySize_RevenueBand(), ecorePackage.getEString(), "revenueBand", null, 0, 1, CompanySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_ChannelType(), ecorePackage.getEString(), "channelType", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idealCustomerProfileEClass, IdealCustomerProfile.class, "IdealCustomerProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdealCustomerProfile_TargetIndustries(), this.getIndustry(), null, "targetIndustries", null, 0, -1, IdealCustomerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdealCustomerProfile_TargetCompanySizes(), this.getCompanySize(), null, "targetCompanySizes", null, 0, -1, IdealCustomerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdealCustomerProfile_TargetGeographies(), this.getGeography(), null, "targetGeographies", null, 0, -1, IdealCustomerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdealCustomerProfile_TechStack(), ecorePackage.getEString(), "techStack", null, 0, -1, IdealCustomerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdealCustomerProfile_TargetPersonas(), this.getPersona(), null, "targetPersonas", null, 0, -1, IdealCustomerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regulatoryConstraintEClass, RegulatoryConstraint.class, "RegulatoryConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegulatoryConstraint_Regulation(), ecorePackage.getEString(), "regulation", null, 0, 1, RegulatoryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegulatoryConstraint_AffectedCapabilities(), this.getCapability(), null, "affectedCapabilities", null, 0, -1, RegulatoryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypothesisEClass, Hypothesis.class, "Hypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypothesis_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypothesis_Status(), this.getHypothesisStatus(), "status", null, 0, 1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypothesis_Assumptions(), ecorePackage.getEString(), "assumptions", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypothesis_Risks(), ecorePackage.getEString(), "risks", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypothesis_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypothesis_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypothesis_LastUpdatedAt(), ecorePackage.getEDate(), "lastUpdatedAt", null, 0, 1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_TargetPersonas(), this.getPersona(), null, "targetPersonas", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_LinkedNeeds(), this.getNeed(), null, "linkedNeeds", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_LinkedGoals(), this.getGoal(), null, "linkedGoals", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_LinkedPainPoints(), this.getPainPoint(), null, "linkedPainPoints", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_EnabledByCapabilities(), this.getCapability(), null, "enabledByCapabilities", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_SupportsValuePropositions(), this.getValueProposition(), null, "supportsValuePropositions", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypothesis_SuccessMetrics(), this.getOutcomeMetric(), null, "successMetrics", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productManagementModelEClass, ProductManagementModel.class, "ProductManagementModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductManagementModel_Personas(), this.getPersona(), null, "personas", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_Portfolios(), this.getProductPortfolio(), null, "portfolios", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_Products(), this.getProduct(), null, "products", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_CapabilityProviders(), this.getCapabilityProvider(), null, "capabilityProviders", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_Subscriptions(), this.getSubscription(), null, "subscriptions", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_ValuePropositions(), this.getValueProposition(), null, "valuePropositions", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_Alternatives(), this.getAlternative(), null, "alternatives", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_OutcomeMetrics(), this.getOutcomeMetric(), null, "outcomeMetrics", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_MarketSegments(), this.getMarketSegment(), null, "marketSegments", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductManagementModel_Hypotheses(), this.getHypothesis(), null, "hypotheses", null, 0, -1, ProductManagementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(goalTypeEEnum, GoalType.class, "GoalType");
		addEEnumLiteral(goalTypeEEnum, GoalType.FUNCTIONAL);
		addEEnumLiteral(goalTypeEEnum, GoalType.EMOTIONAL);
		addEEnumLiteral(goalTypeEEnum, GoalType.ASPIRATIONAL);

		initEEnum(releaseStatusEEnum, ReleaseStatus.class, "ReleaseStatus");
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.PLANNED);
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.IN_DEVELOPMENT);
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.BETA);
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.GA);
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.DEPRECATED);
		addEEnumLiteral(releaseStatusEEnum, ReleaseStatus.END_OF_LIFE);

		initEEnum(hypothesisStatusEEnum, HypothesisStatus.class, "HypothesisStatus");
		addEEnumLiteral(hypothesisStatusEEnum, HypothesisStatus.UNVALIDATED);
		addEEnumLiteral(hypothesisStatusEEnum, HypothesisStatus.VALIDATED);
		addEEnumLiteral(hypothesisStatusEEnum, HypothesisStatus.INVALIDATED);
		addEEnumLiteral(hypothesisStatusEEnum, HypothesisStatus.DEPRECATED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "An Ecore model for the product management domain covering personas, needs, goals, pain points,\nproducts, features, capabilities, editions, subscriptions, value propositions, market segments,\nhypotheses, and more.\n\nThe model supports fine-grained product management and user education, allowing both the product\nbuilder and product users to achieve maximum synergetic value. It can also be used as a runtime or\nbuild artifact to tie product usage to the model and generate reports such as popular features.\n\nKey domain areas:\n- Persona: fictional but research-based representation of target users with behaviors, actions, needs, goals, and pain points\n- Product: portfolios, products, editions, features, capabilities, and capability providers\n- Commercial: subscriptions and pricing\n- Versioning: versions and releases\n- Value: value propositions, evidence, alternatives, and outcome metrics\n- Market: segments, industries, geographies, company sizes, channels, and ideal customer profiles\n- Hypothesis: testable beliefs driving product decisions"
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base for every element in the product management model.\nProvides a common name and description."
		   });
		addAnnotation
		  (getModelElement_Name(),
		   source,
		   new String[] {
			   "documentation", "Human-readable name of this element."
		   });
		addAnnotation
		  (getModelElement_Description(),
		   source,
		   new String[] {
			   "documentation", "Detailed description of this element. May contain Markdown."
		   });
		addAnnotation
		  (getModelElement_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique identifier for this element."
		   });
		addAnnotation
		  (personaEClass,
		   source,
		   new String[] {
			   "documentation", "A fictional but research-based representation of a target user.\n\nPurpose: to help the product team visualize who they are building for.\n\nIncludes demographics, behaviors, motivations, context (work environment, tools),\nand attitudes/preferences.\n\nExample: \'Alex, a 34-year-old DevOps engineer who values automation and hates manual workflows.\'\n\nPersonas have needs, goals, and pain points. In this model they are contained by a persona\nfor simplicity. Shared needs, goals, or pain points are addressed by reference subtypes\nor \'related to\' references."
		   });
		addAnnotation
		  (getPersona_Age(),
		   source,
		   new String[] {
			   "documentation", "Representative age of the persona."
		   });
		addAnnotation
		  (getPersona_Role(),
		   source,
		   new String[] {
			   "documentation", "Job title or role of the persona, e.g. \'DevOps Engineer\', \'Hiring Manager\'."
		   });
		addAnnotation
		  (getPersona_ExperienceLevel(),
		   source,
		   new String[] {
			   "documentation", "Level of experience, e.g. \'Junior\', \'Mid-level\', \'Senior\', \'Expert\'."
		   });
		addAnnotation
		  (getPersona_WorkEnvironment(),
		   source,
		   new String[] {
			   "documentation", "Description of the persona\'s work environment, e.g. \'remote startup\', \'enterprise office\'."
		   });
		addAnnotation
		  (getPersona_ToolsUsed(),
		   source,
		   new String[] {
			   "documentation", "Tools the persona currently uses in their workflow."
		   });
		addAnnotation
		  (getPersona_Attitudes(),
		   source,
		   new String[] {
			   "documentation", "Attitudes and preferences of the persona, e.g. \'risk-averse\', \'data-driven\'."
		   });
		addAnnotation
		  (getPersona_Behaviors(),
		   source,
		   new String[] {
			   "documentation", "Behavioral patterns of this persona \u2014 habitual, preference-based, and cross-situational patterns\ndescribing how the persona typically operates."
		   });
		addAnnotation
		  (getPersona_Actions(),
		   source,
		   new String[] {
			   "documentation", "Concrete, observable steps this persona performs in workflows or scenarios."
		   });
		addAnnotation
		  (getPersona_Needs(),
		   source,
		   new String[] {
			   "documentation", "Fundamental requirements this persona has to achieve something meaningful.\nNeeds are often unstated and discovered through research."
		   });
		addAnnotation
		  (getPersona_Goals(),
		   source,
		   new String[] {
			   "documentation", "Desired outcomes this persona is trying to accomplish.\nGoals may be functional, emotional, or aspirational."
		   });
		addAnnotation
		  (getPersona_PainPoints(),
		   source,
		   new String[] {
			   "documentation", "Problems, frustrations, or barriers preventing this persona from meeting their goals."
		   });
		addAnnotation
		  (behaviorEClass,
		   source,
		   new String[] {
			   "documentation", "A consistent, characteristic pattern in how a persona operates.\nBehaviors are habitual, preference-based, and cross-situational.\n\nThey capture:\n- Attitudes (risk-averse, data-driven, collaborative)\n- Work style (async vs synchronous, detail-oriented, shortcut-taking)\n- Motivation drivers (speed, quality, confidence, accuracy)\n- Decision inclinations (consult peers, trust AI, check data first)\n- Interaction patterns (reads docs, prefers autocomplete, avoids manual steps)\n\nExamples:\n- \'Checks results multiple times before making a decision\'\n- \'Prefers automation over manual review\'\n\nBehaviors help design how the experience should feel.\nThey guide design principles."
		   });
		addAnnotation
		  (getBehavior_Category(),
		   source,
		   new String[] {
			   "documentation", "Category of behavior, e.g. \'attitude\', \'work-style\', \'motivation-driver\', \'decision-inclination\', \'interaction-pattern\'."
		   });
		addAnnotation
		  (getBehavior_RelatedNeeds(),
		   source,
		   new String[] {
			   "documentation", "Needs related to or driven by this behavior."
		   });
		addAnnotation
		  (getBehavior_RelatedPainPoints(),
		   source,
		   new String[] {
			   "documentation", "Pain points related to or caused by this behavior (behavioral friction)."
		   });
		addAnnotation
		  (getBehavior_RelatedGoals(),
		   source,
		   new String[] {
			   "documentation", "Goals motivated by this behavior."
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[] {
			   "documentation", "A concrete, observable step a persona performs in a workflow or scenario.\nActions are contextual, sequential, and task-level.\n\nThey capture:\n- Task steps in a workflow\n- Interactions with tools or systems\n- Triggered events (what they do next)\n- User journey touchpoints\n\nExamples:\n- \'Uploads a resume file\'\n- \'Filters candidates by skill score\'\n\nActions help design what the user must do to succeed.\nThey guide workflow and feature design."
		   });
		addAnnotation
		  (getAction_Order(),
		   source,
		   new String[] {
			   "documentation", "Sequence order of this action within the persona\'s workflow."
		   });
		addAnnotation
		  (getAction_RelatedCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities exercised or required by this action."
		   });
		addAnnotation
		  (getAction_RelatedFeatures(),
		   source,
		   new String[] {
			   "documentation", "Features involved in or supporting this action."
		   });
		addAnnotation
		  (needEClass,
		   source,
		   new String[] {
			   "documentation", "The fundamental requirement a user has to achieve something meaningful.\n\nThink: \'What must be true for this user to succeed?\'\n\nNeeds are often unstated, discovered through research. They are not tasks and not goals.\nThey are the underlying necessities.\n\nExamples:\n- Needs a reliable way to track deployment failures\n- Needs visibility into system performance\n- Needs a workflow that integrates with existing tools\n\nNeeds support goals."
		   });
		addAnnotation
		  (getNeed_SupportedGoals(),
		   source,
		   new String[] {
			   "documentation", "Goals that this need supports. Fulfilling the need contributes to achieving these goals."
		   });
		addAnnotation
		  (getNeed_RelatedNeeds(),
		   source,
		   new String[] {
			   "documentation", "Other needs related to this need. Supports shared needs across personas."
		   });
		addAnnotation
		  (goalEClass,
		   source,
		   new String[] {
			   "documentation", "The desired outcome the user is trying to accomplish.\n\nThink: \'What is the user trying to achieve?\'\n\nGoals may be:\n- Functional (ship releases faster)\n- Emotional (feel confident in a deployment)\n- Aspirational (reduce on-call burden over time)\n\nExamples:\n- Ship a stable release with minimal downtime\n- Reduce troubleshooting from hours to minutes\n- Automate repetitive tasks\n\nA need is a requirement; a goal is an outcome."
		   });
		addAnnotation
		  (getGoal_GoalType(),
		   source,
		   new String[] {
			   "documentation", "The type of goal \u2014 functional, emotional, or aspirational."
		   });
		addAnnotation
		  (getGoal_RelatedGoals(),
		   source,
		   new String[] {
			   "documentation", "Other goals related to this goal. Supports shared goals across personas."
		   });
		addAnnotation
		  (goalTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Classification of goal types."
		   });
		addAnnotation
		  (goalTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A concrete, task-oriented outcome, e.g. \'ship releases faster\'."
		   });
		addAnnotation
		  (goalTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A feeling-oriented outcome, e.g. \'feel confident in a deployment\'."
		   });
		addAnnotation
		  (goalTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "A long-term, strategic outcome, e.g. \'reduce on-call burden over time\'."
		   });
		addAnnotation
		  (painPointEClass,
		   source,
		   new String[] {
			   "documentation", "The problem, frustration, or barrier preventing the user from meeting their goals.\n\nThink: \'What is getting in their way?\'\n\nExamples:\n- Release notes are scattered across tools\n- Manual steps cause errors\n- Slow CI pipeline delays deployments\n- They do not trust the monitoring alerts\n\nPain points are what your product should aim to resolve.\nPain points violate needs and block goals."
		   });
		addAnnotation
		  (getPainPoint_ViolatedNeeds(),
		   source,
		   new String[] {
			   "documentation", "Needs that this pain point violates or undermines."
		   });
		addAnnotation
		  (getPainPoint_BlockedGoals(),
		   source,
		   new String[] {
			   "documentation", "Goals that this pain point blocks or hinders."
		   });
		addAnnotation
		  (getPainPoint_RelatedPainPoints(),
		   source,
		   new String[] {
			   "documentation", "Other pain points related to this one. Supports shared pain points across personas."
		   });
		addAnnotation
		  (productPortfolioEClass,
		   source,
		   new String[] {
			   "documentation", "A collection of related products managed as a group."
		   });
		addAnnotation
		  (getProductPortfolio_Products(),
		   source,
		   new String[] {
			   "documentation", "Products in this portfolio."
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "documentation", "A collection of features targeting a specific persona or a subset of personas."
		   });
		addAnnotation
		  (getProduct_Editions(),
		   source,
		   new String[] {
			   "documentation", "Different flavors/editions of this product, e.g. Community, Professional, Enterprise."
		   });
		addAnnotation
		  (getProduct_Features(),
		   source,
		   new String[] {
			   "documentation", "Features belonging to this product."
		   });
		addAnnotation
		  (getProduct_TargetPersonas(),
		   source,
		   new String[] {
			   "documentation", "Personas this product is targeting."
		   });
		addAnnotation
		  (getProduct_Versions(),
		   source,
		   new String[] {
			   "documentation", "Versions of this product."
		   });
		addAnnotation
		  (getProduct_Releases(),
		   source,
		   new String[] {
			   "documentation", "Releases of this product."
		   });
		addAnnotation
		  (editionEClass,
		   source,
		   new String[] {
			   "documentation", "A flavor of a product with a specific set of features and capabilities.\n\nExamples: Professional Edition, Community Edition, Enterprise Edition.\n\nEditions bundle features/capabilities and are sold via subscription plans."
		   });
		addAnnotation
		  (getEdition_IncludedFeatures(),
		   source,
		   new String[] {
			   "documentation", "Features included in this edition."
		   });
		addAnnotation
		  (getEdition_IncludedCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities directly included/entitled in this edition."
		   });
		addAnnotation
		  (getEdition_AvailableGeographies(),
		   source,
		   new String[] {
			   "documentation", "Geographies where this edition is available."
		   });
		addAnnotation
		  (getEdition_AvailableChannels(),
		   source,
		   new String[] {
			   "documentation", "Channels through which this edition is available, e.g. Direct, Self-serve, Marketplace."
		   });
		addAnnotation
		  (featureEClass,
		   source,
		   new String[] {
			   "documentation", "A unit of utility for one or more personas \u2014 something that helps to achieve a goal,\nsatisfies a need, or addresses a pain point.\n\nOne feature may be associated with multiple goals, needs, and pain points and vice versa.\nFeatures can be associated with personas directly for coarse-grained models.\n\nA Feature is modeled as a subtype of Capability because a feature is itself a capability\nexposed to users."
		   });
		addAnnotation
		  (getFeature_AddressedNeeds(),
		   source,
		   new String[] {
			   "documentation", "Needs that this feature addresses or satisfies."
		   });
		addAnnotation
		  (getFeature_SupportedGoals(),
		   source,
		   new String[] {
			   "documentation", "Goals that this feature supports or helps achieve."
		   });
		addAnnotation
		  (getFeature_AddressedPainPoints(),
		   source,
		   new String[] {
			   "documentation", "Pain points that this feature addresses or mitigates."
		   });
		addAnnotation
		  (getFeature_PersonaAssociations(),
		   source,
		   new String[] {
			   "documentation", "Associations between this feature and specific personas. The association class\ncarries a description and is contained by the feature \u2014 features are created to make personas happy."
		   });
		addAnnotation
		  (getFeature_UsedCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities that this feature uses or depends on."
		   });
		addAnnotation
		  (featurePersonaAssociationEClass,
		   source,
		   new String[] {
			   "documentation", "An association class between a Feature and a Persona.\nContained by the Feature. Allows describing how and why a feature is relevant to a specific persona."
		   });
		addAnnotation
		  (getFeaturePersonaAssociation_Persona(),
		   source,
		   new String[] {
			   "documentation", "The persona associated with the containing feature."
		   });
		addAnnotation
		  (capabilityEClass,
		   source,
		   new String[] {
			   "documentation", "Ability to achieve something.\n\nExamples: AI chat, embeddings generation, PDF export.\n\nCapabilities are used by features. A Feature is a type of Capability.\nCapabilities may be provided by one or more CapabilityProviders."
		   });
		addAnnotation
		  (getCapability_Providers(),
		   source,
		   new String[] {
			   "documentation", "Providers that can deliver this capability."
		   });
		addAnnotation
		  (getCapability_Versions(),
		   source,
		   new String[] {
			   "documentation", "Versions of this capability."
		   });
		addAnnotation
		  (capabilityProviderEClass,
		   source,
		   new String[] {
			   "documentation", "Something providing a capability.\n\nExample: OpenAI GPT-4o model for AI chat.\n\nCapability providers may require other capabilities \u2014 forming a directed acyclic graph.\nThere may be multiple capability providers for a single capability."
		   });
		addAnnotation
		  (getCapabilityProvider_ProvidedCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities that this provider delivers."
		   });
		addAnnotation
		  (getCapabilityProvider_RequiredCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities required by this provider (forms a directed acyclic graph)."
		   });
		addAnnotation
		  (getCapabilityProvider_Versions(),
		   source,
		   new String[] {
			   "documentation", "Versions of this capability provider."
		   });
		addAnnotation
		  (versionEClass,
		   source,
		   new String[] {
			   "documentation", "A version identifier. Products, features, capabilities, and capability providers may have versions.\nVersioning may be semantic, calendar-based, or follow other schemes."
		   });
		addAnnotation
		  (getVersion_VersionScheme(),
		   source,
		   new String[] {
			   "documentation", "The versioning scheme, e.g. \'semantic\', \'calendar\', \'incremental\'."
		   });
		addAnnotation
		  (getVersion_VersionString(),
		   source,
		   new String[] {
			   "documentation", "The version string, e.g. \'1.2.3\', \'2024.01\'."
		   });
		addAnnotation
		  (getVersion_Date(),
		   source,
		   new String[] {
			   "documentation", "Date this version was defined."
		   });
		addAnnotation
		  (releaseEClass,
		   source,
		   new String[] {
			   "documentation", "A version made available to users.\nA release references a specific version and tracks when it was published and its current status."
		   });
		addAnnotation
		  (getRelease_Version(),
		   source,
		   new String[] {
			   "documentation", "The version associated with this release."
		   });
		addAnnotation
		  (getRelease_ReleaseDate(),
		   source,
		   new String[] {
			   "documentation", "Date the release was published or made available."
		   });
		addAnnotation
		  (getRelease_Status(),
		   source,
		   new String[] {
			   "documentation", "Current status of the release."
		   });
		addAnnotation
		  (getRelease_IncludedFeatures(),
		   source,
		   new String[] {
			   "documentation", "Features included in this release."
		   });
		addAnnotation
		  (releaseStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Status of a release."
		   });
		addAnnotation
		  (releaseStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Generally Available."
		   });
		addAnnotation
		  (subscriptionEClass,
		   source,
		   new String[] {
			   "documentation", "Subscriptions define how the user pays and for how long.\n\nExamples:\n- Monthly vs yearly\n- Per-user vs per-device\n- Pay-as-you-go vs committed\n- Auto-renewal terms\n- Usage-based or hybrid pricing\n\nA subscription describes pricing and time, not features.\nHowever, a subscription may also define service levels \u2014 for example, LLM models available,\ntoken budget, response time."
		   });
		addAnnotation
		  (getSubscription_BillingCycle(),
		   source,
		   new String[] {
			   "documentation", "Billing cycle, e.g. \'monthly\', \'yearly\', \'pay-as-you-go\'."
		   });
		addAnnotation
		  (getSubscription_PricingModel(),
		   source,
		   new String[] {
			   "documentation", "Pricing model, e.g. \'per-user\', \'per-device\', \'usage-based\', \'hybrid\', \'flat-rate\'."
		   });
		addAnnotation
		  (getSubscription_AutoRenewal(),
		   source,
		   new String[] {
			   "documentation", "Whether the subscription auto-renews."
		   });
		addAnnotation
		  (getSubscription_Editions(),
		   source,
		   new String[] {
			   "documentation", "Editions sold through this subscription plan."
		   });
		addAnnotation
		  (getSubscription_ServiceLevels(),
		   source,
		   new String[] {
			   "documentation", "Service level definitions for this subscription, e.g. token budgets, response times, available models."
		   });
		addAnnotation
		  (serviceLevelEClass,
		   source,
		   new String[] {
			   "documentation", "Defines a service level within a subscription.\nExamples: LLM models available, token budget, response time guarantees."
		   });
		addAnnotation
		  (getServiceLevel_Metric(),
		   source,
		   new String[] {
			   "documentation", "The metric or dimension, e.g. \'response-time\', \'token-budget\', \'available-models\'."
		   });
		addAnnotation
		  (getServiceLevel_Value(),
		   source,
		   new String[] {
			   "documentation", "The value or threshold for the metric."
		   });
		addAnnotation
		  (valuePropositionEClass,
		   source,
		   new String[] {
			   "documentation", "A concise statement of who it is for, what it helps them achieve, and why it is better than alternatives.\n\nTreating VP as data enables:\n- Persona-specific messaging\n- Edition/plan design tied to benefits\n- Launch/experiment planning\n- Outcome measurement and iteration\n\nVP sits between user intent (needs/goals) and product packaging (editions/plans),\nwith capabilities as the bridge and evidence as validation."
		   });
		addAnnotation
		  (getValueProposition_Statement(),
		   source,
		   new String[] {
			   "documentation", "The concise value proposition statement."
		   });
		addAnnotation
		  (getValueProposition_TargetPersonas(),
		   source,
		   new String[] {
			   "documentation", "Personas this value proposition targets."
		   });
		addAnnotation
		  (getValueProposition_AddressedNeeds(),
		   source,
		   new String[] {
			   "documentation", "Needs this value proposition addresses."
		   });
		addAnnotation
		  (getValueProposition_SupportedGoals(),
		   source,
		   new String[] {
			   "documentation", "Goals this value proposition supports."
		   });
		addAnnotation
		  (getValueProposition_MitigatedPainPoints(),
		   source,
		   new String[] {
			   "documentation", "Pain points this value proposition mitigates."
		   });
		addAnnotation
		  (getValueProposition_EnablingCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities (including features) that enable this value proposition."
		   });
		addAnnotation
		  (getValueProposition_PackagedInEditions(),
		   source,
		   new String[] {
			   "documentation", "Editions in which this value proposition is packaged."
		   });
		addAnnotation
		  (getValueProposition_DifferentiatedFromAlternatives(),
		   source,
		   new String[] {
			   "documentation", "Alternatives (competitors/incumbents) from which this value proposition is differentiated."
		   });
		addAnnotation
		  (getValueProposition_SupportingEvidence(),
		   source,
		   new String[] {
			   "documentation", "Evidence supporting this value proposition."
		   });
		addAnnotation
		  (getValueProposition_TargetSegments(),
		   source,
		   new String[] {
			   "documentation", "Market segments this value proposition targets (in addition to personas)."
		   });
		addAnnotation
		  (evidenceEClass,
		   source,
		   new String[] {
			   "documentation", "Metrics, experiments, testimonials, or case studies that validate a value proposition."
		   });
		addAnnotation
		  (getEvidence_EvidenceType(),
		   source,
		   new String[] {
			   "documentation", "Type of evidence, e.g. \'metric\', \'experiment\', \'testimonial\', \'case-study\'."
		   });
		addAnnotation
		  (getEvidence_Source(),
		   source,
		   new String[] {
			   "documentation", "Source of the evidence, e.g. a study name, customer name, experiment ID."
		   });
		addAnnotation
		  (getEvidence_MeasuredMetrics(),
		   source,
		   new String[] {
			   "documentation", "Outcome metrics that this evidence measures."
		   });
		addAnnotation
		  (getEvidence_CollectedInSegments(),
		   source,
		   new String[] {
			   "documentation", "Market segments in which this evidence was collected."
		   });
		addAnnotation
		  (outcomeMetricEClass,
		   source,
		   new String[] {
			   "documentation", "A measurable metric tied to outcomes.\nUsed to validate value propositions and hypotheses.\nExamples: activation rate, NRR, win-rate, time-to-value."
		   });
		addAnnotation
		  (getOutcomeMetric_Unit(),
		   source,
		   new String[] {
			   "documentation", "Unit of measurement, e.g. \'percent\', \'seconds\', \'count\'."
		   });
		addAnnotation
		  (getOutcomeMetric_TargetValue(),
		   source,
		   new String[] {
			   "documentation", "Target value for this metric, e.g. \'>90%\', \'<5s\'."
		   });
		addAnnotation
		  (alternativeEClass,
		   source,
		   new String[] {
			   "documentation", "A competitor or incumbent solution against which a value proposition is differentiated."
		   });
		addAnnotation
		  (getAlternative_AlternativeType(),
		   source,
		   new String[] {
			   "documentation", "Type of alternative, e.g. \'competitor\', \'incumbent\', \'manual-process\', \'open-source\'."
		   });
		addAnnotation
		  (marketSegmentEClass,
		   source,
		   new String[] {
			   "documentation", "A market segment, e.g. SMB, Mid-market, Enterprise; or horizontal vs vertical segments.\n\nMarkets drive which personas you prioritize, which value props you emphasize,\nand how you package/price. Market attributes should be kept independent and composable."
		   });
		addAnnotation
		  (getMarketSegment_SegmentType(),
		   source,
		   new String[] {
			   "documentation", "Type of segment, e.g. \'SMB\', \'Mid-market\', \'Enterprise\', \'Horizontal\', \'Vertical\'."
		   });
		addAnnotation
		  (getMarketSegment_TargetPersonas(),
		   source,
		   new String[] {
			   "documentation", "Personas targeted by this market segment."
		   });
		addAnnotation
		  (getMarketSegment_Industries(),
		   source,
		   new String[] {
			   "documentation", "Industries within this market segment."
		   });
		addAnnotation
		  (getMarketSegment_Geographies(),
		   source,
		   new String[] {
			   "documentation", "Geographies within this market segment."
		   });
		addAnnotation
		  (getMarketSegment_CompanySizes(),
		   source,
		   new String[] {
			   "documentation", "Company size bands within this market segment."
		   });
		addAnnotation
		  (getMarketSegment_Channels(),
		   source,
		   new String[] {
			   "documentation", "Route-to-market channels in this segment."
		   });
		addAnnotation
		  (getMarketSegment_IdealCustomerProfiles(),
		   source,
		   new String[] {
			   "documentation", "Ideal customer profiles within this market segment."
		   });
		addAnnotation
		  (industryEClass,
		   source,
		   new String[] {
			   "documentation", "An industry classification (e.g. NAICS/SIC taxonomy).\nExamples: Financial Services, Healthcare, Manufacturing."
		   });
		addAnnotation
		  (getIndustry_Code(),
		   source,
		   new String[] {
			   "documentation", "Industry classification code, e.g. NAICS or SIC code."
		   });
		addAnnotation
		  (getIndustry_RegulatoryConstraints(),
		   source,
		   new String[] {
			   "documentation", "Regulatory constraints applicable to this industry."
		   });
		addAnnotation
		  (geographyEClass,
		   source,
		   new String[] {
			   "documentation", "A geographic definition \u2014 region, country, state/province.\nCan also include data residency region."
		   });
		addAnnotation
		  (getGeography_Region(),
		   source,
		   new String[] {
			   "documentation", "Geographic region, e.g. \'EMEA\', \'North America\', \'APAC\'."
		   });
		addAnnotation
		  (getGeography_Country(),
		   source,
		   new String[] {
			   "documentation", "Country name or ISO code."
		   });
		addAnnotation
		  (getGeography_StateProvince(),
		   source,
		   new String[] {
			   "documentation", "State or province within the country."
		   });
		addAnnotation
		  (getGeography_DataResidencyRegion(),
		   source,
		   new String[] {
			   "documentation", "Data residency region, if different from geographic region."
		   });
		addAnnotation
		  (getGeography_RegulatoryConstraints(),
		   source,
		   new String[] {
			   "documentation", "Regulatory constraints applicable to this geography."
		   });
		addAnnotation
		  (companySizeEClass,
		   source,
		   new String[] {
			   "documentation", "Employee count bands and/or revenue bands.\nExample: \'1-50 employees\', \'$1M-$10M revenue\'."
		   });
		addAnnotation
		  (getCompanySize_EmployeeBand(),
		   source,
		   new String[] {
			   "documentation", "Employee count band, e.g. \'1-50\', \'51-200\', \'201-1000\', \'1000+\'."
		   });
		addAnnotation
		  (getCompanySize_RevenueBand(),
		   source,
		   new String[] {
			   "documentation", "Revenue band, e.g. \'<$1M\', \'$1M-$10M\', \'$10M-$100M\', \'$100M+\'."
		   });
		addAnnotation
		  (channelEClass,
		   source,
		   new String[] {
			   "documentation", "A route-to-market channel.\nExamples: Direct, Self-serve, Partner/Reseller, Marketplace (e.g. Azure, AWS)."
		   });
		addAnnotation
		  (getChannel_ChannelType(),
		   source,
		   new String[] {
			   "documentation", "Type of channel, e.g. \'Direct\', \'Self-serve\', \'Partner\', \'Reseller\', \'Marketplace\'."
		   });
		addAnnotation
		  (idealCustomerProfileEClass,
		   source,
		   new String[] {
			   "documentation", "A composite that constrains Segment + Industry + Size + Tech Stack to define the ideal customer.\nICP is a composite of market primitives."
		   });
		addAnnotation
		  (getIdealCustomerProfile_TargetIndustries(),
		   source,
		   new String[] {
			   "documentation", "Target industries for this ICP."
		   });
		addAnnotation
		  (getIdealCustomerProfile_TargetCompanySizes(),
		   source,
		   new String[] {
			   "documentation", "Target company sizes for this ICP."
		   });
		addAnnotation
		  (getIdealCustomerProfile_TargetGeographies(),
		   source,
		   new String[] {
			   "documentation", "Target geographies for this ICP."
		   });
		addAnnotation
		  (getIdealCustomerProfile_TechStack(),
		   source,
		   new String[] {
			   "documentation", "Technology stack requirements, e.g. \'AWS\', \'Kubernetes\', \'Java\'."
		   });
		addAnnotation
		  (getIdealCustomerProfile_TargetPersonas(),
		   source,
		   new String[] {
			   "documentation", "Personas that characterize this ICP."
		   });
		addAnnotation
		  (regulatoryConstraintEClass,
		   source,
		   new String[] {
			   "documentation", "A regulatory constraint determined by industry and/or geography.\nGoverns which capabilities and editions are enabled in specific contexts.\nExamples: GDPR, HIPAA, SOC 2, data residency requirements."
		   });
		addAnnotation
		  (getRegulatoryConstraint_Regulation(),
		   source,
		   new String[] {
			   "documentation", "Name of the regulation, e.g. \'GDPR\', \'HIPAA\', \'SOC 2\'."
		   });
		addAnnotation
		  (getRegulatoryConstraint_AffectedCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities affected by this regulatory constraint."
		   });
		addAnnotation
		  (hypothesisEClass,
		   source,
		   new String[] {
			   "documentation", "A testable belief that drives product decisions.\n\nEvery value proposition, feature, capability, market bet, and pricing decision is ultimately\nbased on a belief that must be validated.\n\nA Hypothesis is:\n- Falsifiable\n- Linked to a persona, need, goal, pain point, or value proposition\n- Validated or invalidated by evidence\n- Driving experiments and decisions\n\nExample: \'We believe that enterprise hiring managers will reduce screening time by 50%\nif we provide Premium Skill Signals.\'\n\nHypotheses sit before Value Propositions in the order of abstraction:\nPersona \u2192 Needs/Pain Points/Goals \u2192 Hypotheses \u2192 Value Propositions \u2192 Capabilities \u2192 Editions \u2192 Subscription Plans\n\nYou test hypotheses \u2192 some become validated \u2192 those support Value Props \u2192 those define packaging."
		   });
		addAnnotation
		  (getHypothesis_Statement(),
		   source,
		   new String[] {
			   "documentation", "Structured belief statement. Example: \'We believe that [persona] will [outcome] if we [action].\'"
		   });
		addAnnotation
		  (getHypothesis_Status(),
		   source,
		   new String[] {
			   "documentation", "Current validation status of this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_Assumptions(),
		   source,
		   new String[] {
			   "documentation", "Key assumptions underlying this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_Risks(),
		   source,
		   new String[] {
			   "documentation", "Risks associated with this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_Owner(),
		   source,
		   new String[] {
			   "documentation", "Owner of this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_CreatedAt(),
		   source,
		   new String[] {
			   "documentation", "Date when this hypothesis was created."
		   });
		addAnnotation
		  (getHypothesis_LastUpdatedAt(),
		   source,
		   new String[] {
			   "documentation", "Date when this hypothesis was last updated."
		   });
		addAnnotation
		  (getHypothesis_TargetPersonas(),
		   source,
		   new String[] {
			   "documentation", "Personas this hypothesis is about."
		   });
		addAnnotation
		  (getHypothesis_LinkedNeeds(),
		   source,
		   new String[] {
			   "documentation", "Needs linked to this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_LinkedGoals(),
		   source,
		   new String[] {
			   "documentation", "Goals linked to this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_LinkedPainPoints(),
		   source,
		   new String[] {
			   "documentation", "Pain points linked to this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_EnabledByCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities that would enable validation of this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_SupportsValuePropositions(),
		   source,
		   new String[] {
			   "documentation", "Value propositions that this hypothesis supports (once validated)."
		   });
		addAnnotation
		  (getHypothesis_Evidence(),
		   source,
		   new String[] {
			   "documentation", "Evidence that validates or invalidates this hypothesis."
		   });
		addAnnotation
		  (getHypothesis_SuccessMetrics(),
		   source,
		   new String[] {
			   "documentation", "Metrics used to measure success of this hypothesis."
		   });
		addAnnotation
		  (hypothesisStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Validation status of a hypothesis."
		   });
		addAnnotation
		  (hypothesisStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The hypothesis has not yet been tested."
		   });
		addAnnotation
		  (hypothesisStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The hypothesis has been validated by evidence."
		   });
		addAnnotation
		  (hypothesisStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The hypothesis has been invalidated by evidence."
		   });
		addAnnotation
		  (hypothesisStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The hypothesis is no longer relevant."
		   });
		addAnnotation
		  (productManagementModelEClass,
		   source,
		   new String[] {
			   "documentation", "Root container for the product management model. Contains all top-level entities."
		   });
		addAnnotation
		  (getProductManagementModel_Personas(),
		   source,
		   new String[] {
			   "documentation", "All personas defined in this model."
		   });
		addAnnotation
		  (getProductManagementModel_Portfolios(),
		   source,
		   new String[] {
			   "documentation", "Product portfolios in this model."
		   });
		addAnnotation
		  (getProductManagementModel_Products(),
		   source,
		   new String[] {
			   "documentation", "Standalone products not part of a portfolio."
		   });
		addAnnotation
		  (getProductManagementModel_Capabilities(),
		   source,
		   new String[] {
			   "documentation", "Standalone capabilities not owned by a specific product."
		   });
		addAnnotation
		  (getProductManagementModel_CapabilityProviders(),
		   source,
		   new String[] {
			   "documentation", "Capability providers in this model."
		   });
		addAnnotation
		  (getProductManagementModel_Subscriptions(),
		   source,
		   new String[] {
			   "documentation", "Subscription plans in this model."
		   });
		addAnnotation
		  (getProductManagementModel_ValuePropositions(),
		   source,
		   new String[] {
			   "documentation", "Value propositions defined in this model."
		   });
		addAnnotation
		  (getProductManagementModel_Evidence(),
		   source,
		   new String[] {
			   "documentation", "Evidence items in this model."
		   });
		addAnnotation
		  (getProductManagementModel_Alternatives(),
		   source,
		   new String[] {
			   "documentation", "Competitor and alternative solutions tracked in this model."
		   });
		addAnnotation
		  (getProductManagementModel_OutcomeMetrics(),
		   source,
		   new String[] {
			   "documentation", "Outcome metrics defined in this model."
		   });
		addAnnotation
		  (getProductManagementModel_MarketSegments(),
		   source,
		   new String[] {
			   "documentation", "Market segments defined in this model."
		   });
		addAnnotation
		  (getProductManagementModel_Hypotheses(),
		   source,
		   new String[] {
			   "documentation", "Hypotheses defined in this model."
		   });
	}

} //ProductManagementPackageImpl
