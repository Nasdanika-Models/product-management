/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.productmanagement.Actor;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.CapabilityProviderVersion;
import org.nasdanika.models.productmanagement.CapabilityVersion;
import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernType;
import org.nasdanika.models.productmanagement.JiraWorkPackage;
import org.nasdanika.models.productmanagement.LifecycleStatus;
import org.nasdanika.models.productmanagement.LifecycleStatusPeriod;
import org.nasdanika.models.productmanagement.ModelElement;
import org.nasdanika.models.productmanagement.Offering;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.Proposal;
import org.nasdanika.models.productmanagement.Role;
import org.nasdanika.models.productmanagement.Version;
import org.nasdanika.models.productmanagement.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductmanagementPackageImpl extends EPackageImpl implements ProductmanagementPackage {
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
	private EClass lifecycleStatusPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

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
	private EClass concernEClass = null;

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
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityVersionEClass = null;

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
	private EClass capabilityProviderVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offeringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jiraWorkPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecycleStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum concernTypeEEnum = null;

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
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductmanagementPackageImpl() {
		super(eNS_URI, ProductmanagementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProductmanagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductmanagementPackage init() {
		if (isInited) return (ProductmanagementPackage)EPackage.Registry.INSTANCE.getEPackage(ProductmanagementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProductmanagementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProductmanagementPackageImpl theProductmanagementPackage = registeredProductmanagementPackage instanceof ProductmanagementPackageImpl ? (ProductmanagementPackageImpl)registeredProductmanagementPackage : new ProductmanagementPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProductmanagementPackage.createPackageContents();

		// Initialize created meta-data
		theProductmanagementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductmanagementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductmanagementPackage.eNS_URI, theProductmanagementPackage);
		return theProductmanagementPackage;
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
	public EAttribute getModelElement_D() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Documentation() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Start() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_End() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Duration() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Weight() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifecycleStatusPeriod() {
		return lifecycleStatusPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycleStatusPeriod_Status() {
		return (EAttribute)lifecycleStatusPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductModel() {
		return productModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_Personas() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_Capabilities() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_CapabilityProviders() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_WorkPackages() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_Offerings() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_Actors() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_Proposals() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductModel_Roles() {
		return (EReference)productModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Actors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Roles() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_OwnedRoles() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_SubActors() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_PartyId() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(3);
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
	public EReference getPersona_Concerns() {
		return (EReference)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_SubPersonas() {
		return (EReference)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_SuperPersonas() {
		return (EReference)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Population() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Roles() {
		return (EReference)personaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcern_Type() {
		return (EAttribute)concernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_SubConcerns() {
		return (EReference)concernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_RelatedConcerns() {
		return (EReference)concernEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_ReferringConcerns() {
		return (EReference)concernEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getVersion_VersionString() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Label() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersion_StatusPeriods() {
		return (EReference)versionEClass.getEStructuralFeatures().get(2);
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
	public EReference getCapability_Versions() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_SubCapabilities() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Includes() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_IncludedIn() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Roles() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityVersion() {
		return capabilityVersionEClass;
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
	public EReference getCapabilityProvider_Roles() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityProviderVersion() {
		return capabilityProviderVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOffering() {
		return offeringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffering_Coordinate() {
		return (EAttribute)offeringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPackage() {
		return workPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPackage_SubWorkPackages() {
		return (EReference)workPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPackage_Impacts() {
		return (EReference)workPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPackage_Contributes() {
		return (EReference)workPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkPackage_Tracker() {
		return (EAttribute)workPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPackage_Roles() {
		return (EReference)workPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJiraWorkPackage() {
		return jiraWorkPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJiraWorkPackage_ProjectKey() {
		return (EAttribute)jiraWorkPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJiraWorkPackage_IssueKey() {
		return (EAttribute)jiraWorkPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJiraWorkPackage_IssueType() {
		return (EAttribute)jiraWorkPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProposal() {
		return proposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProposal_Cost() {
		return (EAttribute)proposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProposal_Currency() {
		return (EAttribute)proposalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProposal_WorkPackage() {
		return (EReference)proposalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProposal_Capability() {
		return (EReference)proposalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProposal_Author() {
		return (EReference)proposalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLifecycleStatus() {
		return lifecycleStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConcernType() {
		return concernTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductmanagementFactory getProductmanagementFactory() {
		return (ProductmanagementFactory)getEFactoryInstance();
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
		createEAttribute(modelElementEClass, MODEL_ELEMENT__D);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DOCUMENTATION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__START);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__END);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DURATION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__WEIGHT);

		lifecycleStatusPeriodEClass = createEClass(LIFECYCLE_STATUS_PERIOD);
		createEAttribute(lifecycleStatusPeriodEClass, LIFECYCLE_STATUS_PERIOD__STATUS);

		productModelEClass = createEClass(PRODUCT_MODEL);
		createEReference(productModelEClass, PRODUCT_MODEL__PERSONAS);
		createEReference(productModelEClass, PRODUCT_MODEL__CAPABILITIES);
		createEReference(productModelEClass, PRODUCT_MODEL__CAPABILITY_PROVIDERS);
		createEReference(productModelEClass, PRODUCT_MODEL__WORK_PACKAGES);
		createEReference(productModelEClass, PRODUCT_MODEL__OFFERINGS);
		createEReference(productModelEClass, PRODUCT_MODEL__ACTORS);
		createEReference(productModelEClass, PRODUCT_MODEL__PROPOSALS);
		createEReference(productModelEClass, PRODUCT_MODEL__ROLES);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__ACTORS);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ROLES);
		createEReference(actorEClass, ACTOR__OWNED_ROLES);
		createEReference(actorEClass, ACTOR__SUB_ACTORS);
		createEAttribute(actorEClass, ACTOR__PARTY_ID);

		personaEClass = createEClass(PERSONA);
		createEReference(personaEClass, PERSONA__CONCERNS);
		createEReference(personaEClass, PERSONA__SUB_PERSONAS);
		createEReference(personaEClass, PERSONA__SUPER_PERSONAS);
		createEAttribute(personaEClass, PERSONA__POPULATION);
		createEReference(personaEClass, PERSONA__ROLES);

		concernEClass = createEClass(CONCERN);
		createEAttribute(concernEClass, CONCERN__TYPE);
		createEReference(concernEClass, CONCERN__SUB_CONCERNS);
		createEReference(concernEClass, CONCERN__RELATED_CONCERNS);
		createEReference(concernEClass, CONCERN__REFERRING_CONCERNS);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VERSION_STRING);
		createEAttribute(versionEClass, VERSION__LABEL);
		createEReference(versionEClass, VERSION__STATUS_PERIODS);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__VERSIONS);
		createEReference(capabilityEClass, CAPABILITY__SUB_CAPABILITIES);
		createEReference(capabilityEClass, CAPABILITY__INCLUDES);
		createEReference(capabilityEClass, CAPABILITY__INCLUDED_IN);
		createEReference(capabilityEClass, CAPABILITY__ROLES);

		capabilityVersionEClass = createEClass(CAPABILITY_VERSION);

		capabilityProviderEClass = createEClass(CAPABILITY_PROVIDER);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__VERSIONS);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__ROLES);

		capabilityProviderVersionEClass = createEClass(CAPABILITY_PROVIDER_VERSION);

		offeringEClass = createEClass(OFFERING);
		createEAttribute(offeringEClass, OFFERING__COORDINATE);

		workPackageEClass = createEClass(WORK_PACKAGE);
		createEReference(workPackageEClass, WORK_PACKAGE__SUB_WORK_PACKAGES);
		createEReference(workPackageEClass, WORK_PACKAGE__IMPACTS);
		createEReference(workPackageEClass, WORK_PACKAGE__CONTRIBUTES);
		createEAttribute(workPackageEClass, WORK_PACKAGE__TRACKER);
		createEReference(workPackageEClass, WORK_PACKAGE__ROLES);

		jiraWorkPackageEClass = createEClass(JIRA_WORK_PACKAGE);
		createEAttribute(jiraWorkPackageEClass, JIRA_WORK_PACKAGE__PROJECT_KEY);
		createEAttribute(jiraWorkPackageEClass, JIRA_WORK_PACKAGE__ISSUE_KEY);
		createEAttribute(jiraWorkPackageEClass, JIRA_WORK_PACKAGE__ISSUE_TYPE);

		proposalEClass = createEClass(PROPOSAL);
		createEAttribute(proposalEClass, PROPOSAL__COST);
		createEAttribute(proposalEClass, PROPOSAL__CURRENCY);
		createEReference(proposalEClass, PROPOSAL__WORK_PACKAGE);
		createEReference(proposalEClass, PROPOSAL__CAPABILITY);
		createEReference(proposalEClass, PROPOSAL__AUTHOR);

		// Create enums
		lifecycleStatusEEnum = createEEnum(LIFECYCLE_STATUS);
		concernTypeEEnum = createEEnum(CONCERN_TYPE);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lifecycleStatusPeriodEClass.getESuperTypes().add(this.getModelElement());
		productModelEClass.getESuperTypes().add(this.getModelElement());
		roleEClass.getESuperTypes().add(this.getModelElement());
		actorEClass.getESuperTypes().add(this.getModelElement());
		personaEClass.getESuperTypes().add(this.getModelElement());
		concernEClass.getESuperTypes().add(this.getModelElement());
		versionEClass.getESuperTypes().add(this.getModelElement());
		capabilityEClass.getESuperTypes().add(this.getModelElement());
		capabilityVersionEClass.getESuperTypes().add(this.getCapability());
		capabilityVersionEClass.getESuperTypes().add(this.getVersion());
		capabilityProviderEClass.getESuperTypes().add(this.getModelElement());
		capabilityProviderVersionEClass.getESuperTypes().add(this.getCapabilityProvider());
		capabilityProviderVersionEClass.getESuperTypes().add(this.getVersion());
		offeringEClass.getESuperTypes().add(this.getCapabilityProvider());
		workPackageEClass.getESuperTypes().add(this.getModelElement());
		jiraWorkPackageEClass.getESuperTypes().add(this.getWorkPackage());
		proposalEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_D(), theEcorePackage.getEString(), "d", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Start(), theEcorePackage.getEString(), "start", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_End(), theEcorePackage.getEString(), "end", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Duration(), theEcorePackage.getEString(), "duration", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Weight(), theEcorePackage.getEDouble(), "weight", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifecycleStatusPeriodEClass, LifecycleStatusPeriod.class, "LifecycleStatusPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLifecycleStatusPeriod_Status(), this.getLifecycleStatus(), "status", "PLANNED", 0, 1, LifecycleStatusPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productModelEClass, ProductModel.class, "ProductModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductModel_Personas(), this.getPersona(), null, "personas", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductModel_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductModel_CapabilityProviders(), this.getCapabilityProvider(), null, "capabilityProviders", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductModel_WorkPackages(), this.getWorkPackage(), null, "workPackages", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductModel_Offerings(), this.getOffering(), null, "offerings", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductModel_Actors(), this.getActor(), null, "actors", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductModel_Proposals(), this.getProposal(), null, "proposals", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductModel_Roles(), this.getRole(), null, "roles", null, 0, -1, ProductModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Actors(), this.getActor(), this.getActor_Roles(), "actors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Roles(), this.getRole(), this.getRole_Actors(), "roles", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_OwnedRoles(), this.getRole(), null, "ownedRoles", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_SubActors(), this.getActor(), null, "subActors", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_PartyId(), theEcorePackage.getEString(), "partyId", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersona_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_SubPersonas(), this.getPersona(), null, "subPersonas", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_SuperPersonas(), this.getPersona(), null, "superPersonas", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Population(), theEcorePackage.getEInt(), "population", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_Roles(), this.getRole(), null, "roles", null, 0, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcern_Type(), this.getConcernType(), "type", "NEED", 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_SubConcerns(), this.getConcern(), null, "subConcerns", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_RelatedConcerns(), this.getConcern(), this.getConcern_ReferringConcerns(), "relatedConcerns", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_ReferringConcerns(), this.getConcern(), this.getConcern_RelatedConcerns(), "referringConcerns", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_VersionString(), theEcorePackage.getEString(), "versionString", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Label(), theEcorePackage.getEString(), "label", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_StatusPeriods(), this.getLifecycleStatusPeriod(), null, "statusPeriods", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Versions(), this.getCapabilityVersion(), null, "versions", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_SubCapabilities(), this.getCapability(), null, "subCapabilities", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Includes(), this.getCapability(), this.getCapability_IncludedIn(), "includes", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_IncludedIn(), this.getCapability(), this.getCapability_Includes(), "includedIn", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Roles(), this.getRole(), null, "roles", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityVersionEClass, CapabilityVersion.class, "CapabilityVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityProviderEClass, CapabilityProvider.class, "CapabilityProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProvider_ProvidedCapabilities(), this.getCapability(), null, "providedCapabilities", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProvider_RequiredCapabilities(), this.getCapability(), null, "requiredCapabilities", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProvider_Versions(), this.getCapabilityProviderVersion(), null, "versions", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProvider_Roles(), this.getRole(), null, "roles", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityProviderVersionEClass, CapabilityProviderVersion.class, "CapabilityProviderVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(offeringEClass, Offering.class, "Offering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffering_Coordinate(), theEcorePackage.getEString(), "coordinate", null, 0, 1, Offering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPackageEClass, WorkPackage.class, "WorkPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkPackage_SubWorkPackages(), this.getWorkPackage(), null, "subWorkPackages", null, 0, -1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkPackage_Impacts(), this.getCapabilityProvider(), null, "impacts", null, 0, -1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkPackage_Contributes(), this.getCapability(), null, "contributes", null, 0, -1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPackage_Tracker(), theEcorePackage.getEString(), "tracker", null, 0, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkPackage_Roles(), this.getRole(), null, "roles", null, 0, -1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jiraWorkPackageEClass, JiraWorkPackage.class, "JiraWorkPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJiraWorkPackage_ProjectKey(), theEcorePackage.getEString(), "projectKey", null, 0, 1, JiraWorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraWorkPackage_IssueKey(), theEcorePackage.getEString(), "issueKey", null, 0, 1, JiraWorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJiraWorkPackage_IssueType(), theEcorePackage.getEString(), "issueType", null, 0, 1, JiraWorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proposalEClass, Proposal.class, "Proposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProposal_Cost(), theEcorePackage.getEDouble(), "cost", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProposal_Currency(), theEcorePackage.getEString(), "currency", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProposal_WorkPackage(), this.getWorkPackage(), null, "workPackage", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProposal_Capability(), this.getCapability(), null, "capability", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProposal_Author(), this.getActor(), null, "author", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lifecycleStatusEEnum, LifecycleStatus.class, "LifecycleStatus");
		addEEnumLiteral(lifecycleStatusEEnum, LifecycleStatus.PLANNED);
		addEEnumLiteral(lifecycleStatusEEnum, LifecycleStatus.GA);
		addEEnumLiteral(lifecycleStatusEEnum, LifecycleStatus.DEPRECATED);
		addEEnumLiteral(lifecycleStatusEEnum, LifecycleStatus.RETIRED);

		initEEnum(concernTypeEEnum, ConcernType.class, "ConcernType");
		addEEnumLiteral(concernTypeEEnum, ConcernType.GOAL);
		addEEnumLiteral(concernTypeEEnum, ConcernType.NEED);
		addEEnumLiteral(concernTypeEEnum, ConcernType.PAIN_POINT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
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
			   "documentation", "*\nProduct Management Metamodel\n\nA pragmatic, just-enough model for product management as code.\nElements are federated text-based artifacts that can be authored in version control,\npublished as Maven artifacts, and consumed across teams.\n\nConceptual frame \u2014 three intersecting perspectives on the same elements:\n- Polity-allocation view: who has authority to bind decisions about resource allocation\n  toward addressing persona concerns.\n- Exchange view: concerns are asks; capabilities are bids. Resource allocations and\n  work packages are bids on concerns.\n- Decision-binding view: the model formalizes the incremental binding of decisions\n  with provenance and authority.\n\nComposition and federation principles:\n- All elements extend ModelElement, which mirrors ncore.DocumentedNamedStringIdentity\n  (ecore://nasdanika.org/core/ncore) and ncore.Period, providing id, name, documentation,\n  start/end temporal anchoring, and duration.\n- Undergoer/Actor machinery is modelled on architecture\n  (ecore://nasdanika.org/models/architecture): Actors perform Roles on Undergoers.\n- Capability and CapabilityProvider structure is inspired by the Eclipse P2 capability\n  model (ecore://nasdanika.org/models/capability).\n- MCDA weight derivation (ecore://nasdanika.org/models/mcda) is supported through\n  the \'weight\' attribute on ModelElement; Personas and Concerns participate as\n  MCDA alternatives.\n- Federation: all elements are loadable from XMI, YAML, JSON, Excel, Draw.io, or\n  Xtext sources via logical URIs and Maven URI Handler integration, following the\n  same federated-artifact pattern as the Maven model\n  (https://maven.models.nasdanika.org/).\n- The root ProductModel is itself a Period, enabling template product models where\n  relative dates resolve to concrete dates when start/end is set on the root.\n\nReference models:\n- ncore:        ecore://nasdanika.org/core/ncore\n- architecture: ecore://nasdanika.org/models/architecture\n- capability:   ecore://nasdanika.org/models/capability\n- mcda:         ecore://nasdanika.org/models/mcda\n- enterprise:   ecore://nasdanika.org/models/enterprise\n- party:        ecore://nasdanika.org/models/party",
			   "bundleManifest", "false",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (lifecycleStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Lifecycle status of a Version. Models the progression from\nplanned through general availability to eventual retirement."
		   });
		addAnnotation
		  (lifecycleStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Planned but not yet released; work is scheduled or in progress."
		   });
		addAnnotation
		  (lifecycleStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Generally available; production-ready and fully supported."
		   });
		addAnnotation
		  (lifecycleStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Deprecated; still available but scheduled for retirement."
		   });
		addAnnotation
		  (lifecycleStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Retired; no longer available or supported."
		   });
		addAnnotation
		  (concernTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Classifies the nature of a Concern."
		   });
		addAnnotation
		  (concernTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A desired outcome or objective the persona is working toward."
		   });
		addAnnotation
		  (concernTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A functional or non-functional need the persona requires."
		   });
		addAnnotation
		  (concernTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "An existing problem, friction, or obstacle the persona experiences."
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base class for all product management elements.\nProvides id, name, documentation (mirroring ncore.DocumentedNamedStringIdentity),\ntemporal anchoring via start/end/duration (mirroring ncore.Period), and a weight\nattribute for MCDA participation."
		   });
		addAnnotation
		  (getModelElement_D(),
		   source,
		   new String[] {
			   "documentation", "String key uniquely identifying this element within its\ncontainment reference. Used as eKey and as a URI segment for cross-resource references."
		   });
		addAnnotation
		  (getModelElement_Name(),
		   source,
		   new String[] {
			   "documentation", "Human-readable display name for documentation, diagrams,\nand navigation trees."
		   });
		addAnnotation
		  (getModelElement_Documentation(),
		   source,
		   new String[] {
			   "documentation", "Rich documentation (HTML or Markdown) rendered in the\ngenerated documentation site."
		   });
		addAnnotation
		  (getModelElement_Start(),
		   source,
		   new String[] {
			   "documentation", "Start of this element\'s period. ISO-8601 date/datetime\nor a relative offset from the container\'s start, e.g. \'P30D\' for 30 days in."
		   });
		addAnnotation
		  (getModelElement_End(),
		   source,
		   new String[] {
			   "documentation", "End of this element\'s period. ISO-8601 date/datetime\nor a relative offset from the container\'s start."
		   });
		addAnnotation
		  (getModelElement_Duration(),
		   source,
		   new String[] {
			   "documentation", "Positive ISO-8601 duration (e.g., \'P3M\'). May be used\ninstead of an explicit end date. Corresponds to ncore.Period.duration."
		   });
		addAnnotation
		  (getModelElement_Weight(),
		   source,
		   new String[] {
			   "documentation", "Relative importance weight for MCDA pairwise comparison.\nUsed to prioritize Personas, Concerns, and Capabilities relative to their siblings."
		   });
		addAnnotation
		  (lifecycleStatusPeriodEClass,
		   source,
		   new String[] {
			   "documentation", "A time-bounded lifecycle status record within a Version.\nEnables tracking of Planned \u2192 GA \u2192 Deprecated \u2192 Retired transitions with explicit\ndate ranges. Extends ModelElement for temporal anchoring."
		   });
		addAnnotation
		  (getLifecycleStatusPeriod_Status(),
		   source,
		   new String[] {
			   "documentation", "The lifecycle status that applies during this period."
		   });
		addAnnotation
		  (productModelEClass,
		   source,
		   new String[] {
			   "documentation", "Root container for a product management model. Is itself a\nPeriod (enabling relative-date templates) and an Undergoer (actors can be assigned\nroles on the model itself). Contains all primary elements: personas, capabilities,\ncapability providers, work packages, offerings, actors, and proposals."
		   });
		addAnnotation
		  (getProductModel_Personas(),
		   source,
		   new String[] {
			   "documentation", "Personas whose concerns drive product decisions.\nPrimary containment. Personas may reference each other via superPersonas."
		   });
		addAnnotation
		  (getProductModel_Capabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities that address persona concerns.\nOrganized hierarchically via Capability.subCapabilities."
		   });
		addAnnotation
		  (getProductModel_CapabilityProviders(),
		   source,
		   new String[] {
			   "documentation", "Entities that provide one or more capabilities at specific\nversions, e.g. Maven modules, CLI assemblies, or deployable bundles."
		   });
		addAnnotation
		  (getProductModel_WorkPackages(),
		   source,
		   new String[] {
			   "documentation", "Units of planned or in-progress work with temporal scope.\nNestable; top-level work packages are contained here."
		   });
		addAnnotation
		  (getProductModel_Offerings(),
		   source,
		   new String[] {
			   "documentation", "Consumable forms of capability providers that can be\nadopted as a unit, e.g. a Maven artifact, a CLI download, or a deployable bundle."
		   });
		addAnnotation
		  (getProductModel_Actors(),
		   source,
		   new String[] {
			   "documentation", "People or groups that perform roles on undergoers.\nOrganized hierarchically via Actor.subActors to reflect organizational structure."
		   });
		addAnnotation
		  (getProductModel_Proposals(),
		   source,
		   new String[] {
			   "documentation", "Bids to build a capability or complete a work package.\nProposals carry a cost (possibly zero) and acknowledge implicit ownership costs."
		   });
		addAnnotation
		  (getProductModel_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles defined on this product model, performed by Actors.\nModels the architecture.Undergoer.roles pattern\n(ecore://nasdanika.org/models/architecture)."
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "A role that an Actor performs on an Undergoer.\nDefines authority and responsibility with respect to an element.\nCorresponds to architecture.Role (ecore://nasdanika.org/models/architecture)."
		   });
		addAnnotation
		  (getRole_Actors(),
		   source,
		   new String[] {
			   "documentation", "Actors currently performing this role.\nBidirectional opposite of Actor.roles."
		   });
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "documentation", "A person, group, or automated agent performing roles on\nundergoers. Organized hierarchically via subActors. Is itself an undergoer.\nFor actors representing specific parties, use partyId to reference a party model\n(ecore://nasdanika.org/models/party). Corresponds to architecture.Actor /\narchitecture.PartyActor (ecore://nasdanika.org/models/architecture)."
		   });
		addAnnotation
		  (getActor_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles this actor performs. Bidirectional opposite of Role.actors."
		   });
		addAnnotation
		  (getActor_OwnedRoles(),
		   source,
		   new String[] {
			   "documentation", "Roles defined on this actor as an undergoer \u2014 roles\nthat other actors perform on this actor, e.g. a \'Manager\' role."
		   });
		addAnnotation
		  (getActor_SubActors(),
		   source,
		   new String[] {
			   "documentation", "Nested actors representing organizational sub-structure,\nsuch as sub-teams or individual members of a group actor."
		   });
		addAnnotation
		  (getActor_PartyId(),
		   source,
		   new String[] {
			   "documentation", "URI referencing a party (person or organization) in an\nexternal party model (ecore://nasdanika.org/models/party), resolved via Maven URI\nHandler for cross-resource identity."
		   });
		addAnnotation
		  (personaEClass,
		   source,
		   new String[] {
			   "documentation", "A named archetype of a product stakeholder whose concerns\ndrive product decisions. Supports multiple inheritance via subPersonas (containment)\nand superPersonas (reference). Is an Undergoer: actors perform roles on it (e.g.,\na Representative role). Participates as an MCDA alternative for prioritization.\nCorresponds to enterprise.Stakeholder (ecore://nasdanika.org/models/enterprise)."
		   });
		addAnnotation
		  (getPersona_Concerns(),
		   source,
		   new String[] {
			   "documentation", "Goals, needs, or pain points belonging to this persona.\nPrimary containment."
		   });
		addAnnotation
		  (getPersona_SubPersonas(),
		   source,
		   new String[] {
			   "documentation", "Specialized personas that inherit from this persona.\nPrimary containment. Analogous to Ecore subclasses \u2014 sub-personas inherit concerns\nand characteristics from their super-personas."
		   });
		addAnnotation
		  (getPersona_SuperPersonas(),
		   source,
		   new String[] {
			   "documentation", "Generalization references to personas this persona\nspecializes. Modeled on Ecore eSuperTypes / Java interface duality \u2014 a persona\nmay specialize multiple super-personas."
		   });
		addAnnotation
		  (getPersona_Population(),
		   source,
		   new String[] {
			   "documentation", "Estimated population size: the number of individuals or\naccounts represented by this persona archetype. Used in resource-allocation and\nbusiness-case modeling."
		   });
		addAnnotation
		  (getPersona_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles defined on this persona as an undergoer, e.g. a\n\'Representative\' role (an actor who can speak for the persona in decision-making).\nModels architecture.Undergoer.roles (ecore://nasdanika.org/models/architecture)."
		   });
		addAnnotation
		  (concernEClass,
		   source,
		   new String[] {
			   "documentation", "A goal, need, or pain point that a persona experiences.\nHas temporal scope (inherited from ModelElement). Hierarchical via subConcerns.\nLateral associations via bidirectional relatedConcerns / referringConcerns.\nParticipates as an MCDA alternative for weight derivation.\nCorresponds to enterprise.Concern (ecore://nasdanika.org/models/enterprise)."
		   });
		addAnnotation
		  (getConcern_Type(),
		   source,
		   new String[] {
			   "documentation", "The nature of this concern: Goal (desired outcome),\nNeed (functional/non-functional requirement), or Pain Point (existing problem)."
		   });
		addAnnotation
		  (getConcern_SubConcerns(),
		   source,
		   new String[] {
			   "documentation", "Sub-concerns decomposing this concern into more specific\naspects. Primary containment."
		   });
		addAnnotation
		  (getConcern_RelatedConcerns(),
		   source,
		   new String[] {
			   "documentation", "Lateral associations to related concerns. Bidirectional\nwith referringConcerns: relationships can be defined from one end and navigated\nfrom both."
		   });
		addAnnotation
		  (getConcern_ReferringConcerns(),
		   source,
		   new String[] {
			   "documentation", "Derived opposite of relatedConcerns. Contains all\nconcerns that reference this concern via their relatedConcerns. Automatically\nmaintained by EMF; no need to set explicitly."
		   });
		addAnnotation
		  (versionEClass,
		   source,
		   new String[] {
			   "documentation", "A version of a capability or capability provider.\nCarries a formal versionString (e.g. \'4.12.0\') and an optional display label\n(e.g. \'2026-03 Cerulean\'). Lifecycle transitions are tracked via statusPeriods.\nCorresponds to capability.Version (ecore://nasdanika.org/models/capability)."
		   });
		addAnnotation
		  (getVersion_VersionString(),
		   source,
		   new String[] {
			   "documentation", "Formal version identifier, e.g. \'4.12.0\' or\n\'2026.2.0\'. Should follow the versioning scheme of the capability provider\necosystem (Maven, OSGi, npm, etc.)."
		   });
		addAnnotation
		  (getVersion_Label(),
		   source,
		   new String[] {
			   "documentation", "Human-readable display label, e.g. a release name like\n\'2026-03 Cerulean\'. Distinct from versionString. Used in documentation and\nuser-facing materials."
		   });
		addAnnotation
		  (getVersion_StatusPeriods(),
		   source,
		   new String[] {
			   "documentation", "Time-bounded lifecycle status records tracking the\nPlanned \u2192 GA \u2192 Deprecated \u2192 Retired transition timeline for this version."
		   });
		addAnnotation
		  (capabilityEClass,
		   source,
		   new String[] {
			   "documentation", "An ability that addresses persona concerns, e.g. \'generate\na documentation site from an Xcore metamodel\'. Hierarchical via subCapabilities.\nBidirectional composition via includes/includedIn. Versioned via CapabilityVersion.\nIs an Undergoer: actors perform roles on it. Participates in MCDA weight derivation.\nCorresponds to capability.Capability (ecore://nasdanika.org/models/capability)."
		   });
		addAnnotation
		  (getCapability_Versions(),
		   source,
		   new String[] {
			   "documentation", "Versions of this capability. May be empty for simple\nmodels. CapabilityVersion extends both Capability and Version, enabling version-\nspecific property overrides."
		   });
		addAnnotation
		  (getCapability_SubCapabilities(),
		   source,
		   new String[] {
			   "documentation", "More specific capabilities belonging to this capability.\nUsed to build a capability hierarchy, e.g. \'Documentation\' containing \'HTML Site\nGeneration\', \'PDF Export\', and \'Diagram Generation\'."
		   });
		addAnnotation
		  (getCapability_Includes(),
		   source,
		   new String[] {
			   "documentation", "Other capabilities that this capability includes or\ndepends on. Bidirectional opposite of includedIn."
		   });
		addAnnotation
		  (getCapability_IncludedIn(),
		   source,
		   new String[] {
			   "documentation", "Capabilities that include this capability. Derived\nbidirectional opposite of includes. Automatically maintained by EMF."
		   });
		addAnnotation
		  (getCapability_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles defined on this capability as an undergoer,\ne.g. \'Owner\' or \'Contributor\' roles. Models architecture.Undergoer.roles\n(ecore://nasdanika.org/models/architecture)."
		   });
		addAnnotation
		  (capabilityVersionEClass,
		   source,
		   new String[] {
			   "documentation", "A version of a capability, combining Capability identity\nwith Version metadata. Allows version-specific overrides of capability properties.\nSimple models may omit this entirely. Corresponds to capability.CapabilityVersion\n(ecore://nasdanika.org/models/capability)."
		   });
		addAnnotation
		  (capabilityProviderEClass,
		   source,
		   new String[] {
			   "documentation", "An entity that provides one or more capabilities at\nspecific versions, e.g. a Maven module, OSGi bundle, or CLI assembly. Inspired\nby the Eclipse P2 model. Is an Undergoer: actors perform roles on it. Dual\nrole: both provider and consumer of capabilities.\nCorresponds to capability.CapabilityProvider\n(ecore://nasdanika.org/models/capability)."
		   });
		addAnnotation
		  (getCapabilityProvider_ProvidedCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities provided by this provider. References to\nCapability instances defined in the model."
		   });
		addAnnotation
		  (getCapabilityProvider_RequiredCapabilities(),
		   source,
		   new String[] {
			   "documentation", "Capabilities required by this provider to function.\nImplements the Java/OSGi consumer side: this provider depends on capabilities\nprovided by other providers."
		   });
		addAnnotation
		  (getCapabilityProvider_Versions(),
		   source,
		   new String[] {
			   "documentation", "Versions of this capability provider, each combining\nprovider identity with version-specific metadata (version string, label, lifecycle)."
		   });
		addAnnotation
		  (getCapabilityProvider_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles defined on this provider as an undergoer, e.g.\n\'Maintainer\' or \'Consumer\'. Models architecture.Undergoer.roles\n(ecore://nasdanika.org/models/architecture)."
		   });
		addAnnotation
		  (capabilityProviderVersionEClass,
		   source,
		   new String[] {
			   "documentation", "A version of a capability provider, combining provider\nidentity with Version metadata. Allows version-specific property overrides and\nlifecycle tracking."
		   });
		addAnnotation
		  (offeringEClass,
		   source,
		   new String[] {
			   "documentation", "A form of capability provider packaged for external\nconsumption as a unit, e.g. a Maven artifact, a CLI download, or a Docker image.\nExtends CapabilityProvider. The \'coordinate\' field holds the canonical external\ncoordinate (e.g., Maven GAV). Follows the federated-artifact pattern from\nhttps://maven.models.nasdanika.org/."
		   });
		addAnnotation
		  (getOffering_Coordinate(),
		   source,
		   new String[] {
			   "documentation", "Canonical external coordinate for this offering, e.g.\na Maven GAV \'org.nasdanika.models:product-management:0.1.0\', an npm package name,\nor a Docker image tag."
		   });
		addAnnotation
		  (workPackageEClass,
		   source,
		   new String[] {
			   "documentation", "A unit of planned or in-progress work with temporal scope\nand organizational accountability. Nestable via subWorkPackages. Links to offerings\nvia \'impacts\' and to capabilities via \'contributes\'. The \'tracker\' field holds a\nURI to an external tracking system (Jira, GitHub Issues, etc.)."
		   });
		addAnnotation
		  (getWorkPackage_SubWorkPackages(),
		   source,
		   new String[] {
			   "documentation", "Nested work packages decomposing this work package into\nsmaller units, e.g. epics \u2192 stories \u2192 sub-tasks."
		   });
		addAnnotation
		  (getWorkPackage_Impacts(),
		   source,
		   new String[] {
			   "documentation", "Offerings and capability providers that this work package\naffects, e.g. the Maven module or deployable bundle that will be changed."
		   });
		addAnnotation
		  (getWorkPackage_Contributes(),
		   source,
		   new String[] {
			   "documentation", "Capabilities this work package delivers or advances.\nTracks which planned capabilities are progressed by this work package."
		   });
		addAnnotation
		  (getWorkPackage_Tracker(),
		   source,
		   new String[] {
			   "documentation", "URI or identifier in an external tracking system, e.g.\na Jira issue URL or GitHub issue reference. Enables traceability between the\nproduct model and execution-layer tools."
		   });
		addAnnotation
		  (getWorkPackage_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles defined on this work package as an undergoer,\ne.g. \'Lead\', \'Assignee\', or \'Reviewer\'. Models architecture.Undergoer.roles\n(ecore://nasdanika.org/models/architecture)."
		   });
		addAnnotation
		  (jiraWorkPackageEClass,
		   source,
		   new String[] {
			   "documentation", "A WorkPackage backed by a Jira issue. Adds Jira-specific\nfields: projectKey (e.g. \'PM\'), issueKey (e.g. \'PM-123\'), and issueType\n(e.g. \'Story\', \'Epic\'). The inherited \'tracker\' field holds the full Jira URL."
		   });
		addAnnotation
		  (getJiraWorkPackage_ProjectKey(),
		   source,
		   new String[] {
			   "documentation", "Jira project key, e.g. \'PM\' or \'NSDPM\'. Used for URL\nconstruction and filtering by project."
		   });
		addAnnotation
		  (getJiraWorkPackage_IssueKey(),
		   source,
		   new String[] {
			   "documentation", "Jira issue key, e.g. \'PM-123\'. Uniquely identifies\nthe issue within the Jira instance."
		   });
		addAnnotation
		  (getJiraWorkPackage_IssueType(),
		   source,
		   new String[] {
			   "documentation", "Jira issue type, e.g. \'Epic\', \'Story\', \'Task\', \'Bug\',\nor \'Sub-task\'."
		   });
		addAnnotation
		  (proposalEClass,
		   source,
		   new String[] {
			   "documentation", "A bid to build a capability or complete a work package.\n\'I can build this by date X at cost Y.\' Cost may be zero but must acknowledge\nimplicit ownership costs. Is a Period (delivery window). The \'author\' reference\ncaptures who made the proposal."
		   });
		addAnnotation
		  (getProposal_Cost(),
		   source,
		   new String[] {
			   "documentation", "Proposed monetary cost. Zero is allowed but must\nacknowledge implicit acceptance and ongoing ownership costs."
		   });
		addAnnotation
		  (getProposal_Currency(),
		   source,
		   new String[] {
			   "documentation", "ISO 4217 currency code for the cost, e.g. \'USD\', \'EUR\'.\nIf not set, defaults to the model\'s currency context."
		   });
		addAnnotation
		  (getProposal_WorkPackage(),
		   source,
		   new String[] {
			   "documentation", "The work package this proposal addresses. At least one\nof workPackage or capability must be set."
		   });
		addAnnotation
		  (getProposal_Capability(),
		   source,
		   new String[] {
			   "documentation", "The capability this proposal proposes to build. At least\none of workPackage or capability must be set."
		   });
		addAnnotation
		  (getProposal_Author(),
		   source,
		   new String[] {
			   "documentation", "The actor who authored this proposal. Records decision\nprovenance: who made the bid. The \'when\' is captured by ModelElement.start or\ndocumented in the proposal\'s documentation."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //ProductmanagementPackageImpl
