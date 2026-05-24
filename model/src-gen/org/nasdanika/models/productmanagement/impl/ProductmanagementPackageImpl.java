/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.productmanagement.AbstractActor;
import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.AbstractCapabilityProvider;
import org.nasdanika.models.productmanagement.AbstractConcern;
import org.nasdanika.models.productmanagement.AbstractEvidence;
import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.Actor;
import org.nasdanika.models.productmanagement.ActorDomain;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityDependency;
import org.nasdanika.models.productmanagement.CapabilityDomain;
import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.CapabilityProviderDomain;
import org.nasdanika.models.productmanagement.CapabilityProviderReference;
import org.nasdanika.models.productmanagement.CapabilityReference;
import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.DependencyKind;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.EvidenceDomain;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Lifecycle;
import org.nasdanika.models.productmanagement.ModelElement;
import org.nasdanika.models.productmanagement.NamedElement;
import org.nasdanika.models.productmanagement.NamedPeriod;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Period;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.PersonaReference;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.ProvidedCapability;
import org.nasdanika.models.productmanagement.Referrable;
import org.nasdanika.models.productmanagement.RequiredCapability;
import org.nasdanika.models.productmanagement.Role;
import org.nasdanika.models.productmanagement.RoleAssignment;
import org.nasdanika.models.productmanagement.StringIdentity;
import org.nasdanika.models.productmanagement.Temporal;
import org.nasdanika.models.productmanagement.Undergoer;
import org.nasdanika.models.productmanagement.Version;

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
	private EClass referrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringIdentityEClass = null;

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
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedPeriodEClass = null;

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
	private EClass abstractPersonaEClass = null;

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
	private EClass personaDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConcernEClass = null;

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
	private EClass concernReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernDomainEClass = null;

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
	private EClass needEClass = null;

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
	private EClass abstractCapabilityEClass = null;

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
	private EClass capabilityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCapabilityProviderEClass = null;

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
	private EClass capabilityProviderDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityProviderReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEvidenceEClass = null;

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
	private EClass evidenceDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCapabilityEClass = null;

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
	private EClass undergoerEClass = null;

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
	private EClass roleAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActorEClass = null;

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
	private EClass actorDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecycleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependencyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instantEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationEDataType = null;

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
	public EClass getReferrable() {
		return referrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferrable__Collect__Object_EReference_EList() {
		return referrableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferrable__GetReferrers__EReference() {
		return referrableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporal() {
		return temporalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporal_Base() {
		return (EReference)temporalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporal_Instant() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporal_Duration() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporal_LowerBounds() {
		return (EReference)temporalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporal_UpperBounds() {
		return (EReference)temporalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriod() {
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeriod_Duration() {
		return (EAttribute)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_Start() {
		return (EReference)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_End() {
		return (EReference)periodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringIdentity() {
		return stringIdentityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringIdentity_Id() {
		return (EAttribute)stringIdentityEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getModelElement_Icon() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Documentation() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_DocRef() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_DocFormat() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Uris() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedPeriod() {
		return namedPeriodEClass;
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
	public EClass getAbstractPersona() {
		return abstractPersonaEClass;
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
	public EClass getPersonaDomain() {
		return personaDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonaDomain_Personas() {
		return (EReference)personaDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonaDomain_ResolvedPersonas() {
		return (EReference)personaDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPersonaDomain__ResolvePersonaReference__AbstractPersona() {
		return personaDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonaReference() {
		return personaReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonaReference_Target() {
		return (EReference)personaReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractConcern() {
		return abstractConcernEClass;
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
	public EReference getConcern_AddressedBy() {
		return (EReference)concernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_AllAddressedBy() {
		return (EReference)concernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcernReference() {
		return concernReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcernReference_Target() {
		return (EReference)concernReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcernDomain() {
		return concernDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcernDomain_Concerns() {
		return (EReference)concernDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcernDomain_ResolvedConcerns() {
		return (EReference)concernDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConcernDomain__ResolveConcernReference__AbstractConcern() {
		return concernDomainEClass.getEOperations().get(0);
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
	public EReference getGoal_SupportedBy() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoal_AllSupportedBy() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoal_BlockedBy() {
		return (EReference)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoal_AllBlockedBy() {
		return (EReference)goalEClass.getEStructuralFeatures().get(3);
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
	public EReference getNeed_Supports() {
		return (EReference)needEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeed_AllSupports() {
		return (EReference)needEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeed_ViolatedBy() {
		return (EReference)needEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeed_AllViolatedBy() {
		return (EReference)needEClass.getEStructuralFeatures().get(3);
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
	public EReference getPainPoint_Blocks() {
		return (EReference)painPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPainPoint_AllBlocks() {
		return (EReference)painPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPainPoint_Violates() {
		return (EReference)painPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPainPoint_AllViolates() {
		return (EReference)painPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractCapability() {
		return abstractCapabilityEClass;
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
	public EReference getCapability_Addresses() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_AllAddresses() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_SubCapabilities() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Dependencies() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Dependents() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Lifecycle() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityReference() {
		return capabilityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityReference_Target() {
		return (EReference)capabilityReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityDomain() {
		return capabilityDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityDomain_Capabilities() {
		return (EReference)capabilityDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityDomain_ResolvedCapabilities() {
		return (EReference)capabilityDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCapabilityDomain__ResolveCapabilityReference__AbstractCapability() {
		return capabilityDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityDependency() {
		return capabilityDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapabilityDependency_Kind() {
		return (EAttribute)capabilityDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapabilityDependency_Qualifier() {
		return (EAttribute)capabilityDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractCapabilityProvider() {
		return abstractCapabilityProviderEClass;
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
	public EReference getCapabilityProvider_Provides() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProvider_Requires() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapabilityProvider_Lifecycle() {
		return (EAttribute)capabilityProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityProviderDomain() {
		return capabilityProviderDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProviderDomain_CapabilityProviders() {
		return (EReference)capabilityProviderDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityProviderReference() {
		return capabilityProviderReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProviderReference_Target() {
		return (EReference)capabilityProviderReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedCapability() {
		return providedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedCapability_Capability() {
		return (EReference)providedCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractEvidence() {
		return abstractEvidenceEClass;
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
	public EClass getEvidenceDomain() {
		return evidenceDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidenceDomain_Evidence() {
		return (EReference)evidenceDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredCapability() {
		return requiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredCapability_Capability() {
		return (EReference)requiredCapabilityEClass.getEStructuralFeatures().get(0);
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
	public EClass getUndergoer() {
		return undergoerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUndergoer_Roles() {
		return (EReference)undergoerEClass.getEStructuralFeatures().get(0);
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
	public EReference getRole_Assignments() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleAssignment() {
		return roleAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleAssignment_Comment() {
		return (EAttribute)roleAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleAssignment_Actors() {
		return (EReference)roleAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractActor() {
		return abstractActorEClass;
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
	public EClass getActorDomain() {
		return actorDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActorDomain_Actors() {
		return (EReference)actorDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLifecycle() {
		return lifecycleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDependencyKind() {
		return dependencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstant() {
		return instantEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDuration() {
		return durationEDataType;
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
		referrableEClass = createEClass(REFERRABLE);
		createEOperation(referrableEClass, REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST);
		createEOperation(referrableEClass, REFERRABLE___GET_REFERRERS__EREFERENCE);

		temporalEClass = createEClass(TEMPORAL);
		createEReference(temporalEClass, TEMPORAL__BASE);
		createEAttribute(temporalEClass, TEMPORAL__INSTANT);
		createEAttribute(temporalEClass, TEMPORAL__DURATION);
		createEReference(temporalEClass, TEMPORAL__LOWER_BOUNDS);
		createEReference(temporalEClass, TEMPORAL__UPPER_BOUNDS);

		periodEClass = createEClass(PERIOD);
		createEAttribute(periodEClass, PERIOD__DURATION);
		createEReference(periodEClass, PERIOD__START);
		createEReference(periodEClass, PERIOD__END);

		stringIdentityEClass = createEClass(STRING_IDENTITY);
		createEAttribute(stringIdentityEClass, STRING_IDENTITY__ID);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ICON);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DOCUMENTATION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DOC_REF);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DOC_FORMAT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__URIS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		namedPeriodEClass = createEClass(NAMED_PERIOD);

		productModelEClass = createEClass(PRODUCT_MODEL);

		abstractPersonaEClass = createEClass(ABSTRACT_PERSONA);

		personaEClass = createEClass(PERSONA);

		personaDomainEClass = createEClass(PERSONA_DOMAIN);
		createEReference(personaDomainEClass, PERSONA_DOMAIN__PERSONAS);
		createEReference(personaDomainEClass, PERSONA_DOMAIN__RESOLVED_PERSONAS);
		createEOperation(personaDomainEClass, PERSONA_DOMAIN___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA);

		personaReferenceEClass = createEClass(PERSONA_REFERENCE);
		createEReference(personaReferenceEClass, PERSONA_REFERENCE__TARGET);

		abstractConcernEClass = createEClass(ABSTRACT_CONCERN);

		concernEClass = createEClass(CONCERN);
		createEReference(concernEClass, CONCERN__ADDRESSED_BY);
		createEReference(concernEClass, CONCERN__ALL_ADDRESSED_BY);

		concernReferenceEClass = createEClass(CONCERN_REFERENCE);
		createEReference(concernReferenceEClass, CONCERN_REFERENCE__TARGET);

		concernDomainEClass = createEClass(CONCERN_DOMAIN);
		createEReference(concernDomainEClass, CONCERN_DOMAIN__CONCERNS);
		createEReference(concernDomainEClass, CONCERN_DOMAIN__RESOLVED_CONCERNS);
		createEOperation(concernDomainEClass, CONCERN_DOMAIN___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__SUPPORTED_BY);
		createEReference(goalEClass, GOAL__ALL_SUPPORTED_BY);
		createEReference(goalEClass, GOAL__BLOCKED_BY);
		createEReference(goalEClass, GOAL__ALL_BLOCKED_BY);

		needEClass = createEClass(NEED);
		createEReference(needEClass, NEED__SUPPORTS);
		createEReference(needEClass, NEED__ALL_SUPPORTS);
		createEReference(needEClass, NEED__VIOLATED_BY);
		createEReference(needEClass, NEED__ALL_VIOLATED_BY);

		painPointEClass = createEClass(PAIN_POINT);
		createEReference(painPointEClass, PAIN_POINT__BLOCKS);
		createEReference(painPointEClass, PAIN_POINT__ALL_BLOCKS);
		createEReference(painPointEClass, PAIN_POINT__VIOLATES);
		createEReference(painPointEClass, PAIN_POINT__ALL_VIOLATES);

		abstractCapabilityEClass = createEClass(ABSTRACT_CAPABILITY);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__ADDRESSES);
		createEReference(capabilityEClass, CAPABILITY__ALL_ADDRESSES);
		createEReference(capabilityEClass, CAPABILITY__SUB_CAPABILITIES);
		createEReference(capabilityEClass, CAPABILITY__DEPENDENCIES);
		createEReference(capabilityEClass, CAPABILITY__DEPENDENTS);
		createEAttribute(capabilityEClass, CAPABILITY__LIFECYCLE);

		capabilityReferenceEClass = createEClass(CAPABILITY_REFERENCE);
		createEReference(capabilityReferenceEClass, CAPABILITY_REFERENCE__TARGET);

		capabilityDomainEClass = createEClass(CAPABILITY_DOMAIN);
		createEReference(capabilityDomainEClass, CAPABILITY_DOMAIN__CAPABILITIES);
		createEReference(capabilityDomainEClass, CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES);
		createEOperation(capabilityDomainEClass, CAPABILITY_DOMAIN___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY);

		capabilityDependencyEClass = createEClass(CAPABILITY_DEPENDENCY);
		createEAttribute(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__KIND);
		createEAttribute(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__QUALIFIER);

		abstractCapabilityProviderEClass = createEClass(ABSTRACT_CAPABILITY_PROVIDER);

		capabilityProviderEClass = createEClass(CAPABILITY_PROVIDER);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__PROVIDES);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__REQUIRES);
		createEAttribute(capabilityProviderEClass, CAPABILITY_PROVIDER__LIFECYCLE);

		capabilityProviderDomainEClass = createEClass(CAPABILITY_PROVIDER_DOMAIN);
		createEReference(capabilityProviderDomainEClass, CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS);

		capabilityProviderReferenceEClass = createEClass(CAPABILITY_PROVIDER_REFERENCE);
		createEReference(capabilityProviderReferenceEClass, CAPABILITY_PROVIDER_REFERENCE__TARGET);

		providedCapabilityEClass = createEClass(PROVIDED_CAPABILITY);
		createEReference(providedCapabilityEClass, PROVIDED_CAPABILITY__CAPABILITY);

		abstractEvidenceEClass = createEClass(ABSTRACT_EVIDENCE);

		evidenceEClass = createEClass(EVIDENCE);

		evidenceDomainEClass = createEClass(EVIDENCE_DOMAIN);
		createEReference(evidenceDomainEClass, EVIDENCE_DOMAIN__EVIDENCE);

		requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
		createEReference(requiredCapabilityEClass, REQUIRED_CAPABILITY__CAPABILITY);

		versionEClass = createEClass(VERSION);

		undergoerEClass = createEClass(UNDERGOER);
		createEReference(undergoerEClass, UNDERGOER__ROLES);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__ASSIGNMENTS);

		roleAssignmentEClass = createEClass(ROLE_ASSIGNMENT);
		createEAttribute(roleAssignmentEClass, ROLE_ASSIGNMENT__COMMENT);
		createEReference(roleAssignmentEClass, ROLE_ASSIGNMENT__ACTORS);

		abstractActorEClass = createEClass(ABSTRACT_ACTOR);

		actorEClass = createEClass(ACTOR);

		actorDomainEClass = createEClass(ACTOR_DOMAIN);
		createEReference(actorDomainEClass, ACTOR_DOMAIN__ACTORS);

		// Create enums
		lifecycleEEnum = createEEnum(LIFECYCLE);
		dependencyKindEEnum = createEEnum(DEPENDENCY_KIND);

		// Create data types
		instantEDataType = createEDataType(INSTANT);
		durationEDataType = createEDataType(DURATION);
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
		stringIdentityEClass.getESuperTypes().add(this.getReferrable());
		modelElementEClass.getESuperTypes().add(this.getStringIdentity());
		namedElementEClass.getESuperTypes().add(this.getModelElement());
		namedPeriodEClass.getESuperTypes().add(this.getNamedElement());
		namedPeriodEClass.getESuperTypes().add(this.getPeriod());
		productModelEClass.getESuperTypes().add(this.getNamedPeriod());
		productModelEClass.getESuperTypes().add(this.getPersonaDomain());
		productModelEClass.getESuperTypes().add(this.getCapabilityDomain());
		productModelEClass.getESuperTypes().add(this.getCapabilityProviderDomain());
		productModelEClass.getESuperTypes().add(this.getActorDomain());
		abstractPersonaEClass.getESuperTypes().add(this.getModelElement());
		personaEClass.getESuperTypes().add(this.getNamedPeriod());
		personaEClass.getESuperTypes().add(this.getAbstractPersona());
		personaEClass.getESuperTypes().add(this.getConcernDomain());
		personaDomainEClass.getESuperTypes().add(this.getNamedElement());
		personaDomainEClass.getESuperTypes().add(this.getAbstractPersona());
		personaReferenceEClass.getESuperTypes().add(this.getAbstractPersona());
		abstractConcernEClass.getESuperTypes().add(this.getModelElement());
		concernEClass.getESuperTypes().add(this.getNamedPeriod());
		concernEClass.getESuperTypes().add(this.getAbstractConcern());
		concernReferenceEClass.getESuperTypes().add(this.getAbstractConcern());
		concernDomainEClass.getESuperTypes().add(this.getNamedElement());
		concernDomainEClass.getESuperTypes().add(this.getAbstractConcern());
		goalEClass.getESuperTypes().add(this.getConcern());
		needEClass.getESuperTypes().add(this.getConcern());
		painPointEClass.getESuperTypes().add(this.getConcern());
		abstractCapabilityEClass.getESuperTypes().add(this.getModelElement());
		capabilityEClass.getESuperTypes().add(this.getNamedPeriod());
		capabilityEClass.getESuperTypes().add(this.getAbstractCapability());
		capabilityEClass.getESuperTypes().add(this.getEvidenceDomain());
		capabilityEClass.getESuperTypes().add(this.getPersonaDomain());
		capabilityEClass.getESuperTypes().add(this.getConcernDomain());
		capabilityReferenceEClass.getESuperTypes().add(this.getModelElement());
		capabilityReferenceEClass.getESuperTypes().add(this.getAbstractCapability());
		capabilityDomainEClass.getESuperTypes().add(this.getNamedElement());
		capabilityDomainEClass.getESuperTypes().add(this.getAbstractCapability());
		capabilityDependencyEClass.getESuperTypes().add(this.getCapabilityReference());
		abstractCapabilityProviderEClass.getESuperTypes().add(this.getStringIdentity());
		capabilityProviderEClass.getESuperTypes().add(this.getNamedPeriod());
		capabilityProviderEClass.getESuperTypes().add(this.getAbstractCapabilityProvider());
		capabilityProviderDomainEClass.getESuperTypes().add(this.getNamedElement());
		capabilityProviderDomainEClass.getESuperTypes().add(this.getAbstractCapabilityProvider());
		capabilityProviderReferenceEClass.getESuperTypes().add(this.getAbstractCapabilityProvider());
		providedCapabilityEClass.getESuperTypes().add(this.getNamedPeriod());
		providedCapabilityEClass.getESuperTypes().add(this.getEvidenceDomain());
		abstractEvidenceEClass.getESuperTypes().add(this.getStringIdentity());
		evidenceEClass.getESuperTypes().add(this.getNamedPeriod());
		evidenceEClass.getESuperTypes().add(this.getAbstractEvidence());
		evidenceDomainEClass.getESuperTypes().add(this.getNamedElement());
		evidenceDomainEClass.getESuperTypes().add(this.getAbstractEvidence());
		requiredCapabilityEClass.getESuperTypes().add(this.getNamedPeriod());
		versionEClass.getESuperTypes().add(this.getNamedPeriod());
		roleEClass.getESuperTypes().add(this.getNamedPeriod());
		roleAssignmentEClass.getESuperTypes().add(this.getPeriod());
		abstractActorEClass.getESuperTypes().add(this.getStringIdentity());
		actorEClass.getESuperTypes().add(this.getNamedPeriod());
		actorEClass.getESuperTypes().add(this.getAbstractActor());
		actorDomainEClass.getESuperTypes().add(this.getNamedElement());
		actorDomainEClass.getESuperTypes().add(this.getAbstractActor());

		// Initialize classes, features, and operations; add parameters
		initEClass(referrableEClass, Referrable.class, "Referrable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getReferrable__Collect__Object_EReference_EList(), null, "collect", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEReference(), "eReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "accumulator", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReferrable__GetReferrers__EReference(), theEcorePackage.getEObject(), "getReferrers", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEReference(), "eReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(temporalEClass, Temporal.class, "Temporal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporal_Base(), this.getTemporal(), null, "base", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporal_Instant(), this.getInstant(), "instant", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporal_Duration(), this.getDuration(), "duration", null, 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_LowerBounds(), this.getTemporal(), null, "lowerBounds", null, 0, -1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporal_UpperBounds(), this.getTemporal(), null, "upperBounds", null, 0, -1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriod_Duration(), this.getDuration(), "duration", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriod_Start(), this.getTemporal(), null, "start", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriod_End(), this.getTemporal(), null, "end", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringIdentityEClass, StringIdentity.class, "StringIdentity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringIdentity_Id(), theEcorePackage.getEString(), "id", null, 0, 1, StringIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_DocRef(), theEcorePackage.getEString(), "docRef", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_DocFormat(), theEcorePackage.getEString(), "docFormat", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Uris(), theEcorePackage.getEString(), "uris", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedPeriodEClass, NamedPeriod.class, "NamedPeriod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productModelEClass, ProductModel.class, "ProductModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPersonaEClass, AbstractPersona.class, "AbstractPersona", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personaDomainEClass, PersonaDomain.class, "PersonaDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonaDomain_Personas(), this.getAbstractPersona(), null, "personas", null, 0, -1, PersonaDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPersonaDomain_Personas().getEKeys().add(this.getStringIdentity_Id());
		initEReference(getPersonaDomain_ResolvedPersonas(), this.getAbstractPersona(), null, "resolvedPersonas", null, 0, -1, PersonaDomain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		getPersonaDomain_ResolvedPersonas().getEKeys().add(this.getStringIdentity_Id());

		op = initEOperation(getPersonaDomain__ResolvePersonaReference__AbstractPersona(), this.getAbstractPersona(), "resolvePersonaReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractPersona(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(personaReferenceEClass, PersonaReference.class, "PersonaReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonaReference_Target(), this.getPersona(), null, "target", null, 0, 1, PersonaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConcernEClass, AbstractConcern.class, "AbstractConcern", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcern_AddressedBy(), this.getAbstractCapability(), null, "addressedBy", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_AllAddressedBy(), this.getAbstractCapability(), null, "allAddressedBy", null, 0, -1, Concern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(concernReferenceEClass, ConcernReference.class, "ConcernReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcernReference_Target(), this.getConcern(), null, "target", null, 0, 1, ConcernReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernDomainEClass, ConcernDomain.class, "ConcernDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcernDomain_Concerns(), this.getAbstractConcern(), null, "concerns", null, 0, -1, ConcernDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConcernDomain_Concerns().getEKeys().add(this.getStringIdentity_Id());
		initEReference(getConcernDomain_ResolvedConcerns(), this.getAbstractConcern(), null, "resolvedConcerns", null, 0, -1, ConcernDomain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		getConcernDomain_ResolvedConcerns().getEKeys().add(this.getStringIdentity_Id());

		op = initEOperation(getConcernDomain__ResolveConcernReference__AbstractConcern(), this.getAbstractConcern(), "resolveConcernReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractConcern(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_SupportedBy(), this.getConcernReference(), null, "supportedBy", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_AllSupportedBy(), this.getNeed(), null, "allSupportedBy", null, 0, -1, Goal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_BlockedBy(), this.getConcernReference(), null, "blockedBy", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_AllBlockedBy(), this.getPainPoint(), null, "allBlockedBy", null, 0, -1, Goal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(needEClass, Need.class, "Need", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeed_Supports(), this.getConcernReference(), null, "supports", null, 0, -1, Need.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeed_AllSupports(), this.getGoal(), null, "allSupports", null, 0, -1, Need.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNeed_ViolatedBy(), this.getConcernReference(), null, "violatedBy", null, 0, -1, Need.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeed_AllViolatedBy(), this.getPainPoint(), null, "allViolatedBy", null, 0, -1, Need.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(painPointEClass, PainPoint.class, "PainPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPainPoint_Blocks(), this.getConcernReference(), null, "blocks", null, 0, -1, PainPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_AllBlocks(), this.getGoal(), null, "allBlocks", null, 0, -1, PainPoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_Violates(), this.getConcernReference(), null, "violates", null, 0, -1, PainPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_AllViolates(), this.getNeed(), null, "allViolates", null, 0, -1, PainPoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractCapabilityEClass, AbstractCapability.class, "AbstractCapability", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Addresses(), this.getAbstractConcern(), null, "addresses", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_AllAddresses(), this.getAbstractConcern(), null, "allAddresses", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_SubCapabilities(), this.getAbstractCapability(), null, "subCapabilities", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCapability_SubCapabilities().getEKeys().add(this.getStringIdentity_Id());
		initEReference(getCapability_Dependencies(), this.getAbstractCapability(), null, "dependencies", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Dependents(), this.getCapabilityReference(), null, "dependents", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Lifecycle(), this.getLifecycle(), "lifecycle", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityReferenceEClass, CapabilityReference.class, "CapabilityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityReference_Target(), this.getCapability(), null, "target", null, 0, 1, CapabilityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityDomainEClass, CapabilityDomain.class, "CapabilityDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityDomain_Capabilities(), this.getAbstractCapability(), null, "capabilities", null, 0, -1, CapabilityDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCapabilityDomain_Capabilities().getEKeys().add(this.getStringIdentity_Id());
		initEReference(getCapabilityDomain_ResolvedCapabilities(), this.getAbstractCapability(), null, "resolvedCapabilities", null, 0, -1, CapabilityDomain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		getCapabilityDomain_ResolvedCapabilities().getEKeys().add(this.getStringIdentity_Id());

		op = initEOperation(getCapabilityDomain__ResolveCapabilityReference__AbstractCapability(), this.getAbstractCapability(), "resolveCapabilityReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractCapability(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(capabilityDependencyEClass, CapabilityDependency.class, "CapabilityDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapabilityDependency_Kind(), this.getDependencyKind(), "kind", null, 0, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityDependency_Qualifier(), theEcorePackage.getEString(), "qualifier", null, 0, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCapabilityProviderEClass, AbstractCapabilityProvider.class, "AbstractCapabilityProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityProviderEClass, CapabilityProvider.class, "CapabilityProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProvider_Provides(), this.getProvidedCapability(), null, "provides", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProvider_Requires(), this.getRequiredCapability(), null, "requires", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityProvider_Lifecycle(), this.getLifecycle(), "lifecycle", null, 0, 1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityProviderDomainEClass, CapabilityProviderDomain.class, "CapabilityProviderDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProviderDomain_CapabilityProviders(), this.getAbstractCapabilityProvider(), null, "capabilityProviders", null, 0, -1, CapabilityProviderDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityProviderReferenceEClass, CapabilityProviderReference.class, "CapabilityProviderReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProviderReference_Target(), this.getCapabilityProvider(), null, "target", null, 0, 1, CapabilityProviderReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedCapabilityEClass, ProvidedCapability.class, "ProvidedCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedCapability_Capability(), this.getAbstractCapability(), null, "capability", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEvidenceEClass, AbstractEvidence.class, "AbstractEvidence", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evidenceDomainEClass, EvidenceDomain.class, "EvidenceDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvidenceDomain_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, EvidenceDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEvidenceDomain_Evidence().getEKeys().add(this.getStringIdentity_Id());

		initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredCapability_Capability(), this.getAbstractCapability(), null, "capability", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(undergoerEClass, Undergoer.class, "Undergoer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUndergoer_Roles(), this.getRole(), null, "roles", null, 0, -1, Undergoer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Assignments(), this.getRoleAssignment(), null, "assignments", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleAssignmentEClass, RoleAssignment.class, "RoleAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleAssignment_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleAssignment_Actors(), this.getAbstractActor(), null, "actors", null, 0, 1, RoleAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractActorEClass, AbstractActor.class, "AbstractActor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorDomainEClass, ActorDomain.class, "ActorDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorDomain_Actors(), this.getAbstractActor(), null, "actors", null, 0, -1, ActorDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lifecycleEEnum, Lifecycle.class, "Lifecycle");
		addEEnumLiteral(lifecycleEEnum, Lifecycle.DRAFT);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.PROPOSED);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.BACKLOG);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.PLANNED);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.IN_PROGRESS);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.AVAILABLE);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.DEPRECATED);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.RETIRED);

		initEEnum(dependencyKindEEnum, DependencyKind.class, "DependencyKind");
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.REQUIRES);
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.ENHANCES);
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.CONFLICTS);
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.CUSTOM);

		// Initialize data types
		initEDataType(instantEDataType, Instant.class, "Instant", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(durationEDataType, Duration.class, "Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
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
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (getReferrable__Collect__Object_EReference_EList(),
		   source,
		   new String[] {
			   "body", "boolean _isInstance = eReference.getEContainingClass().isInstance(source);\nif (_isInstance)\n{\n\tfinal <%java.lang.Object%> value = ((<%org.eclipse.emf.ecore.EObject%>) source).eGet(eReference);\n\tboolean _isMany = eReference.isMany();\n\tif (_isMany)\n\t{\n\t\tboolean _contains = ((<%java.util.Collection%><?>) value).contains(this);\n\t\tif (_contains)\n\t\t{\n\t\t\taccumulator.add(((<%org.eclipse.emf.ecore.EObject%>) source));\n\t\t}\n\t}\n\telse\n\t{\n\t\tif ((value == this))\n\t\t{\n\t\t\taccumulator.add(((<%org.eclipse.emf.ecore.EObject%>) source));\n\t\t}\n\t}\n}"
		   });
		addAnnotation
		  (getReferrable__GetReferrers__EReference(),
		   source,
		   new String[] {
			   "body", "final <%org.eclipse.emf.common.util.BasicEList%><<%org.eclipse.emf.ecore.EObject%>> ret = new <%org.eclipse.emf.common.util.BasicEList%><<%org.eclipse.emf.ecore.EObject%>>();\nfinal <%org.eclipse.emf.ecore.resource.Resource%> res = this.eResource();\n<%org.eclipse.emf.common.util.TreeIterator%><?> cit = null;\nif ((res == null))\n{\n\t<%org.eclipse.emf.ecore.EObject%> root = this;\n\t<%org.eclipse.emf.ecore.EObject%> rc = null;\n\twhile (((rc = root.eContainer()) != null))\n\t{\n\t\troot = rc;\n\t}\n\tif ((root != null))\n\t{\n\t\tthis.collect(root, eReference, ret);\n\t\tcit = root.eAllContents();\n\t}\n}\nelse\n{\n\tfinal <%org.eclipse.emf.ecore.resource.ResourceSet%> rSet = res.getResourceSet();\n\t<%org.eclipse.emf.common.util.TreeIterator%><? extends <%org.eclipse.emf.common.notify.Notifier%>> _xifexpression = null;\n\tif ((rSet == null))\n\t{\n\t\t_xifexpression = res.getAllContents();\n\t}\n\telse\n\t{\n\t\t_xifexpression = rSet.getAllContents();\n\t}\n\tcit = _xifexpression;\n}\nif ((cit != null))\n{\n\twhile (cit.hasNext())\n\t{\n\t\tthis.collect(cit.next(), eReference, ret);\n\t}\n}\nreturn ret;"
		   });
		addAnnotation
		  (getModelElement_Icon(),
		   source,
		   new String[] {
			   "documentation", "*\nCustom icon - treated as URL if contains / or as a CSS class otherwise.\nE.g. fas fa-wrench would be treated as a CSS class.\nFor URLs the recommended icon size is 20x20 pixels and the recommended format is SVG."
		   });
		addAnnotation
		  (getModelElement_DocRef(),
		   source,
		   new String[] {
			   "documentation", "*\nDocumentation resource URI resolved relative to this model element resource URI.\nDocumentation format is derived from extension if not set."
		   });
		addAnnotation
		  (getModelElement_DocFormat(),
		   source,
		   new String[] {
			   "documentation", "*\nDocumentation format. If not set, defaults to markdown for inline documentation and is\nderived from the documentation resource extension for docRef"
		   });
		addAnnotation
		  (getModelElement_Uris(),
		   source,
		   new String[] {
			   "documentation", "*\nAlias URIs resolved relative to the parent URIs - can be absolute or opaque - global references.\nFor example: actors://john-smith.\nFor domains URIs can be used as anchors to merge domains from different sources.\nFor example, several teams may maintain capability domains with URI myorg://capabilities/developer-productivity\nWhen these definitions are assembled into the organization\'s product management model to generate documentation\nall of these domains are merged into a single logical domain."
		   });
		addAnnotation
		  (getPersonaDomain__ResolvePersonaReference__AbstractPersona(),
		   source,
		   new String[] {
			   "body", "<%org.nasdanika.models.productmanagement.AbstractPersona%> current = start;\nfinal <%java.util.HashSet%><<%org.nasdanika.models.productmanagement.AbstractPersona%>> seen = new <%java.util.HashSet%><<%org.nasdanika.models.productmanagement.AbstractPersona%>>();\nwhile ((current instanceof <%org.nasdanika.models.productmanagement.PersonaReference%>))\n{\n\t{\n\t\tboolean _add = seen.add(current);\n\t\tboolean _not = (!_add);\n\t\tif (_not)\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t\tcurrent = ((<%org.nasdanika.models.productmanagement.PersonaReference%>)current).getTarget();\n\t\tif ((current == null))\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t}\n}\nreturn current;"
		   });
		addAnnotation
		  (getPersonaDomain_ResolvedPersonas(),
		   source,
		   new String[] {
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractPersona%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractPersona%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractPersona%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.AbstractPersona%>> _personas = this.getPersonas();\n\tfor (final <%org.nasdanika.models.productmanagement.AbstractPersona%> persona : _personas)\n\t{\n\t\t{\n\t\t\tfinal <%org.nasdanika.models.productmanagement.AbstractPersona%> resolved = this.resolvePersonaReference(persona);\n\t\t\tif ((resolved != null))\n\t\t\t{\n\t\t\t\tresult.add(resolved);\n\t\t\t}\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getConcern_AddressedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nAddressed by allows to explain how some external capabilities address\nconcerns.\nIt also allows to model capabilities within concerns to have a\nself-contained persona.\nIt can be used in acquisition/unification scenarios\nwhere shared capabilities are extracted (e.g. accounting or a custom script/tool)\nand unique are retained (e.g. the best clam chowder in town, report generation)"
		   });
		addAnnotation
		  (getConcern_AllAddressedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nAddressed concerns from this capability plus addressedBy from concerns",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractCapability%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractCapability%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractCapability%>>();\n\tresult.addAll(this.getAddressedBy());\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CAPABILITY__ADDRESSES);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.AbstractCapability%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.AbstractCapability%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getConcernDomain__ResolveConcernReference__AbstractConcern(),
		   source,
		   new String[] {
			   "body", "<%org.nasdanika.models.productmanagement.AbstractConcern%> current = start;\nfinal <%java.util.HashSet%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> seen = new <%java.util.HashSet%><<%org.nasdanika.models.productmanagement.AbstractConcern%>>();\nwhile ((current instanceof <%org.nasdanika.models.productmanagement.ConcernReference%>))\n{\n\t{\n\t\tboolean _add = seen.add(current);\n\t\tboolean _not = (!_add);\n\t\tif (_not)\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t\tcurrent = ((<%org.nasdanika.models.productmanagement.ConcernReference%>)current).getTarget();\n\t\tif ((current == null))\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t}\n}\nreturn current;"
		   });
		addAnnotation
		  (getConcernDomain_ResolvedConcerns(),
		   source,
		   new String[] {
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> _concerns = this.getConcerns();\n\tfor (final <%org.nasdanika.models.productmanagement.AbstractConcern%> concern : _concerns)\n\t{\n\t\t{\n\t\t\tfinal <%org.nasdanika.models.productmanagement.AbstractConcern%> resolved = this.resolveConcernReference(concern);\n\t\t\tif ((resolved != null))\n\t\t\t{\n\t\t\t\tresult.add(resolved);\n\t\t\t}\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getGoal_SupportedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nReferences to needs supporting this goal"
		   });
		addAnnotation
		  (getGoal_AllSupportedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nSupporting needs from this goal plus supports from needs",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Need%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Need%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Need%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _supportedBy = this.getSupportedBy();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _supportedBy)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tif ((target instanceof <%org.nasdanika.models.productmanagement.Need%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Need%>)target));\n\t\t\t}\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.NEED__SUPPORTS);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.Need%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Need%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getGoal_BlockedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nReferences to pain points blocking this goal"
		   });
		addAnnotation
		  (getGoal_AllBlockedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nBlockedBy from this goal plus blocks from pain points",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.PainPoint%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.PainPoint%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.PainPoint%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _blockedBy = this.getBlockedBy();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _blockedBy)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tif ((target instanceof <%org.nasdanika.models.productmanagement.PainPoint%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.PainPoint%>)target));\n\t\t\t}\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.PAIN_POINT__BLOCKS);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.PainPoint%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.PainPoint%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getNeed_Supports(),
		   source,
		   new String[] {
			   "documentation", "*\nGoals supported by this need"
		   });
		addAnnotation
		  (getNeed_AllSupports(),
		   source,
		   new String[] {
			   "documentation", "*\nSupports from this need plus supportingNeeds from goals",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Goal%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Goal%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Goal%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _supports = this.getSupports();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _supports)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tif ((target instanceof <%org.nasdanika.models.productmanagement.Goal%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Goal%>)target));\n\t\t\t}\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.GOAL__SUPPORTED_BY);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.Goal%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Goal%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getNeed_ViolatedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nReferences to pain points violating this need\nwith an optional documentation explaining\nhow the need is violated"
		   });
		addAnnotation
		  (getNeed_AllViolatedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nViolatedBy from this need plus violates from pain points",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.PainPoint%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.PainPoint%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.PainPoint%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _violatedBy = this.getViolatedBy();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _violatedBy)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tif ((target instanceof <%org.nasdanika.models.productmanagement.PainPoint%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.PainPoint%>)target));\n\t\t\t}\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.PAIN_POINT__VIOLATES);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.PainPoint%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.PainPoint%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getPainPoint_AllBlocks(),
		   source,
		   new String[] {
			   "documentation", "*\nBlocks from this pain point plus blockers from pain points",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Goal%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Goal%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Goal%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _blocks = this.getBlocks();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _blocks)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tif ((target instanceof <%org.nasdanika.models.productmanagement.Goal%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Goal%>)target));\n\t\t\t}\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.GOAL__BLOCKED_BY);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.Goal%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Goal%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getPainPoint_AllViolates(),
		   source,
		   new String[] {
			   "documentation", "*\nBlocks from this pain point plus blockers from pain points",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Need%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Need%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Need%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _violates = this.getViolates();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _violates)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tif ((target instanceof <%org.nasdanika.models.productmanagement.Need%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Need%>)target));\n\t\t\t}\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.NEED__VIOLATED_BY);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.Need%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Need%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (capabilityEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA capability extends PersonaDomain, ConcernDomain, and EvidenceDomain\nto support self-contained capability definitions. A capability may:\n - address concerns owned by external personas or other capabilities\n   (via AddressedConcerns)\n - introduce capability-specific personas (via PersonaDomain)\n - introduce concerns that exist by virtue of the capability itself,\n   not owned by any persona (via ConcernDomain)\n - carry the evidence supporting all of the above (via EvidenceDomain)\n - decompose into sub-capabilities (via subCapabilities)"
		   });
		addAnnotation
		  (getCapability_AllAddresses(),
		   source,
		   new String[] {
			   "documentation", "*\nAddressed concerns from this capability plus addressedBy from concerns",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>>();\n\tresult.addAll(this.getAddresses());\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CONCERN__ADDRESSED_BY);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.AbstractConcern%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.AbstractConcern%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getCapability_Dependencies(),
		   source,
		   new String[] {
			   "documentation", "*\nDependencies as an abstract capability allows to\nmodel self-contained capabilities with inline dependencies\nand even dependency domains.\nWhen federated, such inline capabilities can be\neither replaced with CapabilityReference or CapabilityDependency\nor use URIs to de-dup multiple definitions into one logical definition"
		   });
		addAnnotation
		  (getCapability_Dependents(),
		   source,
		   new String[] {
			   "documentation", "*\nCapabilities depending on this capability, excludes containment.\nReturns capability references, including capability dependencies, with target pointing\nto this capability and contained by the dependencies reference.",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.CapabilityReference%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.CapabilityReference%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.CapabilityReference%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CAPABILITY_REFERENCE__TARGET);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\t<%org.eclipse.emf.ecore.EReference%> _eContainmentFeature = referrer.eContainmentFeature();\n\t\tboolean _tripleEquals = (_eContainmentFeature == <%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CAPABILITY__DEPENDENCIES);\n\t\tif (_tripleEquals)\n\t\t{\n\t\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.CapabilityReference%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.CapabilityReference%>)referrer));\n\t\t\t}\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (capabilityReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "*\nCapability reference extends ModelEment to allow adding documentation\nto addressedBy"
		   });
		addAnnotation
		  (getCapabilityDomain__ResolveCapabilityReference__AbstractCapability(),
		   source,
		   new String[] {
			   "body", "<%org.nasdanika.models.productmanagement.AbstractCapability%> current = start;\nfinal <%java.util.HashSet%><<%org.nasdanika.models.productmanagement.AbstractCapability%>> seen = new <%java.util.HashSet%><<%org.nasdanika.models.productmanagement.AbstractCapability%>>();\nwhile ((current instanceof <%org.nasdanika.models.productmanagement.CapabilityReference%>))\n{\n\t{\n\t\tboolean _add = seen.add(current);\n\t\tboolean _not = (!_add);\n\t\tif (_not)\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t\tcurrent = ((<%org.nasdanika.models.productmanagement.CapabilityReference%>)current).getTarget();\n\t\tif ((current == null))\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t}\n}\nreturn current;"
		   });
		addAnnotation
		  (getCapabilityDomain_ResolvedCapabilities(),
		   source,
		   new String[] {
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractCapability%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractCapability%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractCapability%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.AbstractCapability%>> _capabilities = this.getCapabilities();\n\tfor (final <%org.nasdanika.models.productmanagement.AbstractCapability%> capability : _capabilities)\n\t{\n\t\t{\n\t\t\tfinal <%org.nasdanika.models.productmanagement.AbstractCapability%> resolved = this.resolveCapabilityReference(capability);\n\t\t\tif ((resolved != null))\n\t\t\t{\n\t\t\t\tresult.add(resolved);\n\t\t\t}\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getCapabilityDependency_Qualifier(),
		   source,
		   new String[] {
			   "documentation", "*\nQualifier for the dependency kind, e.g. CUSTOM kind"
		   });
		addAnnotation
		  (dependencyKindEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nBuilt-in dependency types"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "*\nI cannot function without this"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "*\nI work better when this is also present"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "*\nI cannot coexist with this"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "*\nCustom dependency type"
		   });
		addAnnotation
		  (evidenceEClass,
		   source,
		   new String[] {
			   "documentation", "*\nEvidence of provided capability.\nE.g. for humans it can be a diploma or a certification or a project\nFor software products it might be a demo, recorded video, ..."
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

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getPersonaDomain_Personas(),
		   source,
		   new String[] {
			   "logicalContainment", "false"
		   });
		addAnnotation
		  (getPersonaDomain_ResolvedPersonas(),
		   source,
		   new String[] {
			   "logicalContainment", "true"
		   });
		addAnnotation
		  (getConcernDomain_Concerns(),
		   source,
		   new String[] {
			   "logicalContainment", "false"
		   });
		addAnnotation
		  (getConcernDomain_ResolvedConcerns(),
		   source,
		   new String[] {
			   "logicalContainment", "true"
		   });
		addAnnotation
		  (getCapabilityDomain_Capabilities(),
		   source,
		   new String[] {
			   "logicalContainment", "false"
		   });
		addAnnotation
		  (getCapabilityDomain_ResolvedCapabilities(),
		   source,
		   new String[] {
			   "logicalContainment", "true"
		   });
	}

} //ProductmanagementPackageImpl
