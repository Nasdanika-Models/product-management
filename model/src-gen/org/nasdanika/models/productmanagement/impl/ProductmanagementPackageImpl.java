/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.capability.CapabilityPackage;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.productmanagement.AbstractConcern;
import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CompositeCapability;
import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.PersonaReference;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.models.productmanagement.ProductmanagementFactory;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

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
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCapabilityEClass = null;

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
		NxcorePackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
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
	public EReference getConcern_Supports() {
		return (EReference)concernEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_AllSupports() {
		return (EReference)concernEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_SupportedBy() {
		return (EReference)concernEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcern_AllSupportedBy() {
		return (EReference)concernEClass.getEStructuralFeatures().get(5);
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
	public EReference getGoal_BlockedBy() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoal_AllBlockedBy() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
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
	public EReference getNeed_ViolatedBy() {
		return (EReference)needEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeed_AllViolatedBy() {
		return (EReference)needEClass.getEStructuralFeatures().get(1);
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
	public EClass getCompositeCapability() {
		return compositeCapabilityEClass;
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
		createEReference(concernEClass, CONCERN__SUPPORTS);
		createEReference(concernEClass, CONCERN__ALL_SUPPORTS);
		createEReference(concernEClass, CONCERN__SUPPORTED_BY);
		createEReference(concernEClass, CONCERN__ALL_SUPPORTED_BY);

		concernReferenceEClass = createEClass(CONCERN_REFERENCE);
		createEReference(concernReferenceEClass, CONCERN_REFERENCE__TARGET);

		concernDomainEClass = createEClass(CONCERN_DOMAIN);
		createEReference(concernDomainEClass, CONCERN_DOMAIN__CONCERNS);
		createEReference(concernDomainEClass, CONCERN_DOMAIN__RESOLVED_CONCERNS);
		createEOperation(concernDomainEClass, CONCERN_DOMAIN___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__BLOCKED_BY);
		createEReference(goalEClass, GOAL__ALL_BLOCKED_BY);

		needEClass = createEClass(NEED);
		createEReference(needEClass, NEED__VIOLATED_BY);
		createEReference(needEClass, NEED__ALL_VIOLATED_BY);

		painPointEClass = createEClass(PAIN_POINT);
		createEReference(painPointEClass, PAIN_POINT__BLOCKS);
		createEReference(painPointEClass, PAIN_POINT__ALL_BLOCKS);
		createEReference(painPointEClass, PAIN_POINT__VIOLATES);
		createEReference(painPointEClass, PAIN_POINT__ALL_VIOLATES);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__ADDRESSES);
		createEReference(capabilityEClass, CAPABILITY__ALL_ADDRESSES);

		compositeCapabilityEClass = createEClass(COMPOSITE_CAPABILITY);

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
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		CapabilityPackage theCapabilityPackage = (CapabilityPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI);
		RolePackage theRolePackage = (RolePackage)EPackage.Registry.INSTANCE.getEPackage(RolePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		productModelEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		productModelEClass.getESuperTypes().add(this.getPersonaDomain());
		productModelEClass.getESuperTypes().add(theCapabilityPackage.getCapabilityDomain());
		productModelEClass.getESuperTypes().add(theCapabilityPackage.getCapabilityProviderDomain());
		productModelEClass.getESuperTypes().add(theRolePackage.getActorDomain());
		abstractPersonaEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		personaEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		personaEClass.getESuperTypes().add(this.getAbstractPersona());
		personaEClass.getESuperTypes().add(this.getConcernDomain());
		personaDomainEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		personaDomainEClass.getESuperTypes().add(this.getAbstractPersona());
		personaReferenceEClass.getESuperTypes().add(this.getAbstractPersona());
		abstractConcernEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		concernEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		concernEClass.getESuperTypes().add(this.getAbstractConcern());
		concernReferenceEClass.getESuperTypes().add(this.getAbstractConcern());
		concernDomainEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		concernDomainEClass.getESuperTypes().add(this.getAbstractConcern());
		goalEClass.getESuperTypes().add(this.getConcern());
		needEClass.getESuperTypes().add(this.getConcern());
		painPointEClass.getESuperTypes().add(this.getConcern());
		capabilityEClass.getESuperTypes().add(theCapabilityPackage.getCapability());
		capabilityEClass.getESuperTypes().add(this.getPersonaDomain());
		capabilityEClass.getESuperTypes().add(this.getConcernDomain());
		compositeCapabilityEClass.getESuperTypes().add(this.getCapability());
		compositeCapabilityEClass.getESuperTypes().add(theCapabilityPackage.getCapabilityDomain());

		// Initialize classes, features, and operations; add parameters
		initEClass(productModelEClass, ProductModel.class, "ProductModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPersonaEClass, AbstractPersona.class, "AbstractPersona", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personaDomainEClass, PersonaDomain.class, "PersonaDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonaDomain_Personas(), this.getAbstractPersona(), null, "personas", null, 0, -1, PersonaDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonaDomain_ResolvedPersonas(), this.getAbstractPersona(), null, "resolvedPersonas", null, 0, -1, PersonaDomain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPersonaDomain__ResolvePersonaReference__AbstractPersona(), this.getAbstractPersona(), "resolvePersonaReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractPersona(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(personaReferenceEClass, PersonaReference.class, "PersonaReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonaReference_Target(), this.getPersona(), null, "target", null, 0, 1, PersonaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConcernEClass, AbstractConcern.class, "AbstractConcern", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcern_AddressedBy(), theCapabilityPackage.getAbstractCapability(), null, "addressedBy", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_AllAddressedBy(), theCapabilityPackage.getAbstractCapability(), null, "allAddressedBy", null, 0, -1, Concern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_Supports(), this.getConcernReference(), null, "supports", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_AllSupports(), this.getConcern(), null, "allSupports", null, 0, -1, Concern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_SupportedBy(), this.getConcernReference(), null, "supportedBy", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_AllSupportedBy(), this.getConcern(), null, "allSupportedBy", null, 0, -1, Concern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(concernReferenceEClass, ConcernReference.class, "ConcernReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcernReference_Target(), this.getConcern(), null, "target", null, 0, 1, ConcernReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernDomainEClass, ConcernDomain.class, "ConcernDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcernDomain_Concerns(), this.getAbstractConcern(), null, "concerns", null, 0, -1, ConcernDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcernDomain_ResolvedConcerns(), this.getAbstractConcern(), null, "resolvedConcerns", null, 0, -1, ConcernDomain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getConcernDomain__ResolveConcernReference__AbstractConcern(), this.getAbstractConcern(), "resolveConcernReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractConcern(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_BlockedBy(), this.getConcernReference(), null, "blockedBy", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_AllBlockedBy(), this.getPainPoint(), null, "allBlockedBy", null, 0, -1, Goal.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(needEClass, Need.class, "Need", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeed_ViolatedBy(), this.getConcernReference(), null, "violatedBy", null, 0, -1, Need.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeed_AllViolatedBy(), this.getPainPoint(), null, "allViolatedBy", null, 0, -1, Need.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(painPointEClass, PainPoint.class, "PainPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPainPoint_Blocks(), this.getConcernReference(), null, "blocks", null, 0, -1, PainPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_AllBlocks(), this.getGoal(), null, "allBlocks", null, 0, -1, PainPoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_Violates(), this.getConcernReference(), null, "violates", null, 0, -1, PainPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPainPoint_AllViolates(), this.getNeed(), null, "allViolates", null, 0, -1, PainPoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Addresses(), this.getAbstractConcern(), null, "addresses", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_AllAddresses(), this.getAbstractConcern(), null, "allAddresses", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(compositeCapabilityEClass, CompositeCapability.class, "CompositeCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.AbstractCapability%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.AbstractCapability%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.AbstractCapability%>>();\n\tresult.addAll(this.getAddressedBy());\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CAPABILITY__ADDRESSES);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.capability.AbstractCapability%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.capability.AbstractCapability%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getConcern_Supports(),
		   source,
		   new String[] {
			   "documentation", "*\nGoals supported by this need"
		   });
		addAnnotation
		  (getConcern_AllSupports(),
		   source,
		   new String[] {
			   "documentation", "*\nSupports from this need plus supportingNeeds from goals",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Concern%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Concern%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Concern%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _supports = this.getSupports();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _supports)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tresult.add(target);\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CONCERN__SUPPORTED_BY);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.Concern%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Concern%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getConcern_SupportedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nReferences to needs supporting this goal"
		   });
		addAnnotation
		  (getConcern_AllSupportedBy(),
		   source,
		   new String[] {
			   "documentation", "*\nSupporting needs from this goal plus supports from needs",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Concern%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Concern%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.Concern%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.productmanagement.ConcernReference%>> _supportedBy = this.getSupportedBy();\n\tfor (final <%org.nasdanika.models.productmanagement.ConcernReference%> ref : _supportedBy)\n\t{\n\t\t{\n\t\t\t<%org.nasdanika.models.productmanagement.Concern%> target = ref.getTarget();\n\t\t\tresult.add(target);\n\t\t}\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CONCERN__SUPPORTS);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.Concern%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.Concern%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
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
		  (getCapability_AllAddresses(),
		   source,
		   new String[] {
			   "documentation", "*\nAddressed concerns from this capability plus addressedBy from concerns",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.productmanagement.AbstractConcern%>>();\n\tresult.addAll(this.getAddresses());\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals%>.CONCERN__ADDRESSED_BY);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\tif ((referrer instanceof <%org.nasdanika.models.productmanagement.AbstractConcern%>))\n\t\t{\n\t\t\tresult.add(((<%org.nasdanika.models.productmanagement.AbstractConcern%>)referrer));\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
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
	}

} //ProductmanagementPackageImpl
