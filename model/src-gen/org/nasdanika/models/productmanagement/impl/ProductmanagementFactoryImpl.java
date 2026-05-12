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
			case ProductmanagementPackage.LIFECYCLE_STATUS_PERIOD: return createLifecycleStatusPeriod();
			case ProductmanagementPackage.PRODUCT_MODEL: return createProductModel();
			case ProductmanagementPackage.ROLE: return createRole();
			case ProductmanagementPackage.ACTOR: return createActor();
			case ProductmanagementPackage.PERSONA: return createPersona();
			case ProductmanagementPackage.CONCERN: return createConcern();
			case ProductmanagementPackage.VERSION: return createVersion();
			case ProductmanagementPackage.CAPABILITY: return createCapability();
			case ProductmanagementPackage.CAPABILITY_VERSION: return createCapabilityVersion();
			case ProductmanagementPackage.CAPABILITY_PROVIDER: return createCapabilityProvider();
			case ProductmanagementPackage.CAPABILITY_PROVIDER_VERSION: return createCapabilityProviderVersion();
			case ProductmanagementPackage.OFFERING: return createOffering();
			case ProductmanagementPackage.WORK_PACKAGE: return createWorkPackage();
			case ProductmanagementPackage.JIRA_WORK_PACKAGE: return createJiraWorkPackage();
			case ProductmanagementPackage.PROPOSAL: return createProposal();
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
			case ProductmanagementPackage.LIFECYCLE_STATUS:
				return createLifecycleStatusFromString(eDataType, initialValue);
			case ProductmanagementPackage.CONCERN_TYPE:
				return createConcernTypeFromString(eDataType, initialValue);
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
			case ProductmanagementPackage.LIFECYCLE_STATUS:
				return convertLifecycleStatusToString(eDataType, instanceValue);
			case ProductmanagementPackage.CONCERN_TYPE:
				return convertConcernTypeToString(eDataType, instanceValue);
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
	public LifecycleStatusPeriod createLifecycleStatusPeriod() {
		LifecycleStatusPeriodImpl lifecycleStatusPeriod = new LifecycleStatusPeriodImpl();
		return lifecycleStatusPeriod;
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
	public CapabilityVersion createCapabilityVersion() {
		CapabilityVersionImpl capabilityVersion = new CapabilityVersionImpl();
		return capabilityVersion;
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
	public CapabilityProviderVersion createCapabilityProviderVersion() {
		CapabilityProviderVersionImpl capabilityProviderVersion = new CapabilityProviderVersionImpl();
		return capabilityProviderVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offering createOffering() {
		OfferingImpl offering = new OfferingImpl();
		return offering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPackage createWorkPackage() {
		WorkPackageImpl workPackage = new WorkPackageImpl();
		return workPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JiraWorkPackage createJiraWorkPackage() {
		JiraWorkPackageImpl jiraWorkPackage = new JiraWorkPackageImpl();
		return jiraWorkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proposal createProposal() {
		ProposalImpl proposal = new ProposalImpl();
		return proposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleStatus createLifecycleStatusFromString(EDataType eDataType, String initialValue) {
		LifecycleStatus result = LifecycleStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecycleStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernType createConcernTypeFromString(EDataType eDataType, String initialValue) {
		ConcernType result = ConcernType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcernTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
