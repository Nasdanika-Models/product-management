/**
 */
package org.nasdanika.models.product.management.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.product.management.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagementFactoryImpl extends EFactoryImpl implements ManagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManagementFactory init() {
		try {
			ManagementFactory theManagementFactory = (ManagementFactory)EPackage.Registry.INSTANCE.getEFactory(ManagementPackage.eNS_URI);
			if (theManagementFactory != null) {
				return theManagementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ManagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementFactoryImpl() {
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
			case ManagementPackage.LIFECYCLE_STATUS_PERIOD: return createLifecycleStatusPeriod();
			case ManagementPackage.PRODUCT_MODEL: return createProductModel();
			case ManagementPackage.ROLE: return createRole();
			case ManagementPackage.ACTOR: return createActor();
			case ManagementPackage.PERSONA: return createPersona();
			case ManagementPackage.CONCERN: return createConcern();
			case ManagementPackage.VERSION: return createVersion();
			case ManagementPackage.CAPABILITY: return createCapability();
			case ManagementPackage.CAPABILITY_VERSION: return createCapabilityVersion();
			case ManagementPackage.CAPABILITY_PROVIDER: return createCapabilityProvider();
			case ManagementPackage.CAPABILITY_PROVIDER_VERSION: return createCapabilityProviderVersion();
			case ManagementPackage.OFFERING: return createOffering();
			case ManagementPackage.WORK_PACKAGE: return createWorkPackage();
			case ManagementPackage.JIRA_WORK_PACKAGE: return createJiraWorkPackage();
			case ManagementPackage.PROPOSAL: return createProposal();
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
			case ManagementPackage.LIFECYCLE_STATUS:
				return createLifecycleStatusFromString(eDataType, initialValue);
			case ManagementPackage.CONCERN_TYPE:
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
			case ManagementPackage.LIFECYCLE_STATUS:
				return convertLifecycleStatusToString(eDataType, instanceValue);
			case ManagementPackage.CONCERN_TYPE:
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
	public ManagementPackage getManagementPackage() {
		return (ManagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ManagementPackage getPackage() {
		return ManagementPackage.eINSTANCE;
	}

} //ManagementFactoryImpl
