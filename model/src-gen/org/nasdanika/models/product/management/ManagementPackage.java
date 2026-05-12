/**
 */
package org.nasdanika.models.product.management;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Product Management Metamodel — a pragmatic, just-enough model for
 * product management as code. Enables formal binding of decisions about resource allocation
 * toward addressing persona concerns. Composes with ncore (ecore://nasdanika.org/core/ncore),
 * architecture (ecore://nasdanika.org/models/architecture), capability
 * (ecore://nasdanika.org/models/capability), mcda (ecore://nasdanika.org/models/mcda),
 * enterprise (ecore://nasdanika.org/models/enterprise), and party
 * (ecore://nasdanika.org/models/party).
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.product.management.ManagementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models.product'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface ManagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "management";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://product-management.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.product-management";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManagementPackage eINSTANCE = org.nasdanika.models.product.management.impl.ManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.ModelElementImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__D = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__START = 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__END = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__WEIGHT = 6;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.LifecycleStatusPeriodImpl <em>Lifecycle Status Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.LifecycleStatusPeriodImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getLifecycleStatusPeriod()
	 * @generated
	 */
	int LIFECYCLE_STATUS_PERIOD = 1;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD__STATUS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lifecycle Status Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lifecycle Status Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_STATUS_PERIOD_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.ProductModelImpl <em>Product Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.ProductModelImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getProductModel()
	 * @generated
	 */
	int PRODUCT_MODEL = 2;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITY_PROVIDERS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__WORK_PACKAGES = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Offerings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__OFFERINGS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ACTORS = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__PROPOSALS = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ROLES = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.RoleImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACTORS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.ActorImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_ROLES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUB_ACTORS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PARTY_ID = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.PersonaImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 5;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__CONCERNS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__SUB_PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__SUPER_PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__POPULATION = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ROLES = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.ConcernImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 6;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__SUB_CONCERNS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__RELATED_CONCERNS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referring Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__REFERRING_CONCERNS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.VersionImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 7;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_STRING = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__LABEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Periods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__STATUS_PERIODS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.CapabilityImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 8;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__VERSIONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SUB_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCLUDES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Included In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCLUDED_IN = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ROLES = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.CapabilityVersionImpl <em>Capability Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.CapabilityVersionImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapabilityVersion()
	 * @generated
	 */
	int CAPABILITY_VERSION = 9;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__D = CAPABILITY__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__DOCUMENTATION = CAPABILITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__START = CAPABILITY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__END = CAPABILITY__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__DURATION = CAPABILITY__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__WEIGHT = CAPABILITY__WEIGHT;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__VERSIONS = CAPABILITY__VERSIONS;

	/**
	 * The feature id for the '<em><b>Sub Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__SUB_CAPABILITIES = CAPABILITY__SUB_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__INCLUDES = CAPABILITY__INCLUDES;

	/**
	 * The feature id for the '<em><b>Included In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__INCLUDED_IN = CAPABILITY__INCLUDED_IN;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__ROLES = CAPABILITY__ROLES;

	/**
	 * The feature id for the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__VERSION_STRING = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__LABEL = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Periods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION__STATUS_PERIODS = CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Capability Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_VERSION_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.CapabilityProviderImpl <em>Capability Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.CapabilityProviderImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapabilityProvider()
	 * @generated
	 */
	int CAPABILITY_PROVIDER = 10;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__VERSIONS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__ROLES = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.CapabilityProviderVersionImpl <em>Capability Provider Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.CapabilityProviderVersionImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapabilityProviderVersion()
	 * @generated
	 */
	int CAPABILITY_PROVIDER_VERSION = 11;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__D = CAPABILITY_PROVIDER__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__NAME = CAPABILITY_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__DOCUMENTATION = CAPABILITY_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__START = CAPABILITY_PROVIDER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__END = CAPABILITY_PROVIDER__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__DURATION = CAPABILITY_PROVIDER__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__WEIGHT = CAPABILITY_PROVIDER__WEIGHT;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__PROVIDED_CAPABILITIES = CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__REQUIRED_CAPABILITIES = CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__VERSIONS = CAPABILITY_PROVIDER__VERSIONS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__ROLES = CAPABILITY_PROVIDER__ROLES;

	/**
	 * The feature id for the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__VERSION_STRING = CAPABILITY_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__LABEL = CAPABILITY_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Periods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION__STATUS_PERIODS = CAPABILITY_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability Provider Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION_FEATURE_COUNT = CAPABILITY_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Capability Provider Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_VERSION_OPERATION_COUNT = CAPABILITY_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.OfferingImpl <em>Offering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.OfferingImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getOffering()
	 * @generated
	 */
	int OFFERING = 12;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__D = CAPABILITY_PROVIDER__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__NAME = CAPABILITY_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__DOCUMENTATION = CAPABILITY_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__START = CAPABILITY_PROVIDER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__END = CAPABILITY_PROVIDER__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__DURATION = CAPABILITY_PROVIDER__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__WEIGHT = CAPABILITY_PROVIDER__WEIGHT;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__PROVIDED_CAPABILITIES = CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__REQUIRED_CAPABILITIES = CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__VERSIONS = CAPABILITY_PROVIDER__VERSIONS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__ROLES = CAPABILITY_PROVIDER__ROLES;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__COORDINATE = CAPABILITY_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING_FEATURE_COUNT = CAPABILITY_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING_OPERATION_COUNT = CAPABILITY_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.WorkPackageImpl <em>Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.WorkPackageImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getWorkPackage()
	 * @generated
	 */
	int WORK_PACKAGE = 13;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Sub Work Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__SUB_WORK_PACKAGES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__IMPACTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__CONTRIBUTES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tracker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__TRACKER = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ROLES = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.JiraWorkPackageImpl <em>Jira Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.JiraWorkPackageImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getJiraWorkPackage()
	 * @generated
	 */
	int JIRA_WORK_PACKAGE = 14;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__D = WORK_PACKAGE__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__NAME = WORK_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__DOCUMENTATION = WORK_PACKAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__START = WORK_PACKAGE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__END = WORK_PACKAGE__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__DURATION = WORK_PACKAGE__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__WEIGHT = WORK_PACKAGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Sub Work Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__SUB_WORK_PACKAGES = WORK_PACKAGE__SUB_WORK_PACKAGES;

	/**
	 * The feature id for the '<em><b>Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__IMPACTS = WORK_PACKAGE__IMPACTS;

	/**
	 * The feature id for the '<em><b>Contributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__CONTRIBUTES = WORK_PACKAGE__CONTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tracker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__TRACKER = WORK_PACKAGE__TRACKER;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__ROLES = WORK_PACKAGE__ROLES;

	/**
	 * The feature id for the '<em><b>Project Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__PROJECT_KEY = WORK_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issue Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__ISSUE_KEY = WORK_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE__ISSUE_TYPE = WORK_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Jira Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE_FEATURE_COUNT = WORK_PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Jira Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_WORK_PACKAGE_OPERATION_COUNT = WORK_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.impl.ProposalImpl <em>Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.impl.ProposalImpl
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getProposal()
	 * @generated
	 */
	int PROPOSAL = 15;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__D = MODEL_ELEMENT__D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__START = MODEL_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__END = MODEL_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__DURATION = MODEL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__WEIGHT = MODEL_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__COST = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__CURRENCY = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__WORK_PACKAGE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__CAPABILITY = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__AUTHOR = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.LifecycleStatus <em>Lifecycle Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.LifecycleStatus
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getLifecycleStatus()
	 * @generated
	 */
	int LIFECYCLE_STATUS = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.product.management.ConcernType <em>Concern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.product.management.ConcernType
	 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getConcernType()
	 * @generated
	 */
	int CONCERN_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.ModelElement#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement#getD()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_D();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.ModelElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement#getDocumentation()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.ModelElement#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement#getStart()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.ModelElement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement#getEnd()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_End();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.ModelElement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement#getDuration()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.ModelElement#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.models.product.management.ModelElement#getWeight()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Weight();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.LifecycleStatusPeriod <em>Lifecycle Status Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Status Period</em>'.
	 * @see org.nasdanika.models.product.management.LifecycleStatusPeriod
	 * @generated
	 */
	EClass getLifecycleStatusPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.LifecycleStatusPeriod#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.product.management.LifecycleStatusPeriod#getStatus()
	 * @see #getLifecycleStatusPeriod()
	 * @generated
	 */
	EAttribute getLifecycleStatusPeriod_Status();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.ProductModel <em>Product Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Model</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel
	 * @generated
	 */
	EClass getProductModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personas</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getPersonas()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Personas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getCapabilities()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getCapabilityProviders <em>Capability Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Providers</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getCapabilityProviders()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_CapabilityProviders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getWorkPackages <em>Work Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Packages</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getWorkPackages()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_WorkPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getOfferings <em>Offerings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offerings</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getOfferings()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Offerings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getActors()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getProposals()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Proposals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.ProductModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.product.management.ProductModel#getRoles()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.nasdanika.models.product.management.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.Role#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see org.nasdanika.models.product.management.Role#getActors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Actors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.nasdanika.models.product.management.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.product.management.Actor#getRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Actor#getOwnedRoles <em>Owned Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Roles</em>'.
	 * @see org.nasdanika.models.product.management.Actor#getOwnedRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_OwnedRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Actor#getSubActors <em>Sub Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Actors</em>'.
	 * @see org.nasdanika.models.product.management.Actor#getSubActors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_SubActors();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Actor#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.nasdanika.models.product.management.Actor#getPartyId()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_PartyId();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see org.nasdanika.models.product.management.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Persona#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.nasdanika.models.product.management.Persona#getConcerns()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Concerns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Persona#getSubPersonas <em>Sub Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Personas</em>'.
	 * @see org.nasdanika.models.product.management.Persona#getSubPersonas()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_SubPersonas();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.Persona#getSuperPersonas <em>Super Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Personas</em>'.
	 * @see org.nasdanika.models.product.management.Persona#getSuperPersonas()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_SuperPersonas();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Persona#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see org.nasdanika.models.product.management.Persona#getPopulation()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Population();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Persona#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.product.management.Persona#getRoles()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see org.nasdanika.models.product.management.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Concern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.product.management.Concern#getType()
	 * @see #getConcern()
	 * @generated
	 */
	EAttribute getConcern_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Concern#getSubConcerns <em>Sub Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Concerns</em>'.
	 * @see org.nasdanika.models.product.management.Concern#getSubConcerns()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_SubConcerns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.Concern#getRelatedConcerns <em>Related Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Concerns</em>'.
	 * @see org.nasdanika.models.product.management.Concern#getRelatedConcerns()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_RelatedConcerns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.Concern#getReferringConcerns <em>Referring Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referring Concerns</em>'.
	 * @see org.nasdanika.models.product.management.Concern#getReferringConcerns()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_ReferringConcerns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.nasdanika.models.product.management.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Version#getVersionString <em>Version String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version String</em>'.
	 * @see org.nasdanika.models.product.management.Version#getVersionString()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionString();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Version#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.models.product.management.Version#getLabel()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Version#getStatusPeriods <em>Status Periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status Periods</em>'.
	 * @see org.nasdanika.models.product.management.Version#getStatusPeriods()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_StatusPeriods();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.nasdanika.models.product.management.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Capability#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.nasdanika.models.product.management.Capability#getVersions()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Capability#getSubCapabilities <em>Sub Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Capabilities</em>'.
	 * @see org.nasdanika.models.product.management.Capability#getSubCapabilities()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_SubCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see org.nasdanika.models.product.management.Capability#getIncludes()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Includes();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.Capability#getIncludedIn <em>Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included In</em>'.
	 * @see org.nasdanika.models.product.management.Capability#getIncludedIn()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IncludedIn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.Capability#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.product.management.Capability#getRoles()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.CapabilityVersion <em>Capability Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Version</em>'.
	 * @see org.nasdanika.models.product.management.CapabilityVersion
	 * @generated
	 */
	EClass getCapabilityVersion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.CapabilityProvider <em>Capability Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Provider</em>'.
	 * @see org.nasdanika.models.product.management.CapabilityProvider
	 * @generated
	 */
	EClass getCapabilityProvider();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.CapabilityProvider#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Capabilities</em>'.
	 * @see org.nasdanika.models.product.management.CapabilityProvider#getProvidedCapabilities()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_ProvidedCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.CapabilityProvider#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Capabilities</em>'.
	 * @see org.nasdanika.models.product.management.CapabilityProvider#getRequiredCapabilities()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_RequiredCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.CapabilityProvider#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.nasdanika.models.product.management.CapabilityProvider#getVersions()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.CapabilityProvider#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.product.management.CapabilityProvider#getRoles()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.CapabilityProviderVersion <em>Capability Provider Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Provider Version</em>'.
	 * @see org.nasdanika.models.product.management.CapabilityProviderVersion
	 * @generated
	 */
	EClass getCapabilityProviderVersion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Offering <em>Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offering</em>'.
	 * @see org.nasdanika.models.product.management.Offering
	 * @generated
	 */
	EClass getOffering();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Offering#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see org.nasdanika.models.product.management.Offering#getCoordinate()
	 * @see #getOffering()
	 * @generated
	 */
	EAttribute getOffering_Coordinate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see org.nasdanika.models.product.management.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.WorkPackage#getSubWorkPackages <em>Sub Work Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Work Packages</em>'.
	 * @see org.nasdanika.models.product.management.WorkPackage#getSubWorkPackages()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_SubWorkPackages();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.WorkPackage#getImpacts <em>Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impacts</em>'.
	 * @see org.nasdanika.models.product.management.WorkPackage#getImpacts()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Impacts();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.product.management.WorkPackage#getContributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes</em>'.
	 * @see org.nasdanika.models.product.management.WorkPackage#getContributes()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Contributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.WorkPackage#getTracker <em>Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracker</em>'.
	 * @see org.nasdanika.models.product.management.WorkPackage#getTracker()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_Tracker();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.product.management.WorkPackage#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.product.management.WorkPackage#getRoles()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.JiraWorkPackage <em>Jira Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jira Work Package</em>'.
	 * @see org.nasdanika.models.product.management.JiraWorkPackage
	 * @generated
	 */
	EClass getJiraWorkPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.JiraWorkPackage#getProjectKey <em>Project Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Key</em>'.
	 * @see org.nasdanika.models.product.management.JiraWorkPackage#getProjectKey()
	 * @see #getJiraWorkPackage()
	 * @generated
	 */
	EAttribute getJiraWorkPackage_ProjectKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.JiraWorkPackage#getIssueKey <em>Issue Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Key</em>'.
	 * @see org.nasdanika.models.product.management.JiraWorkPackage#getIssueKey()
	 * @see #getJiraWorkPackage()
	 * @generated
	 */
	EAttribute getJiraWorkPackage_IssueKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.JiraWorkPackage#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Type</em>'.
	 * @see org.nasdanika.models.product.management.JiraWorkPackage#getIssueType()
	 * @see #getJiraWorkPackage()
	 * @generated
	 */
	EAttribute getJiraWorkPackage_IssueType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.product.management.Proposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see org.nasdanika.models.product.management.Proposal
	 * @generated
	 */
	EClass getProposal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Proposal#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.nasdanika.models.product.management.Proposal#getCost()
	 * @see #getProposal()
	 * @generated
	 */
	EAttribute getProposal_Cost();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.product.management.Proposal#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.nasdanika.models.product.management.Proposal#getCurrency()
	 * @see #getProposal()
	 * @generated
	 */
	EAttribute getProposal_Currency();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.product.management.Proposal#getWorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Package</em>'.
	 * @see org.nasdanika.models.product.management.Proposal#getWorkPackage()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_WorkPackage();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.product.management.Proposal#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see org.nasdanika.models.product.management.Proposal#getCapability()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Capability();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.product.management.Proposal#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.product.management.Proposal#getAuthor()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Author();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.product.management.LifecycleStatus <em>Lifecycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle Status</em>'.
	 * @see org.nasdanika.models.product.management.LifecycleStatus
	 * @generated
	 */
	EEnum getLifecycleStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.product.management.ConcernType <em>Concern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concern Type</em>'.
	 * @see org.nasdanika.models.product.management.ConcernType
	 * @generated
	 */
	EEnum getConcernType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManagementFactory getManagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.ModelElementImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__D = eINSTANCE.getModelElement_D();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DOCUMENTATION = eINSTANCE.getModelElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__START = eINSTANCE.getModelElement_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__END = eINSTANCE.getModelElement_End();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DURATION = eINSTANCE.getModelElement_Duration();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__WEIGHT = eINSTANCE.getModelElement_Weight();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.LifecycleStatusPeriodImpl <em>Lifecycle Status Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.LifecycleStatusPeriodImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getLifecycleStatusPeriod()
		 * @generated
		 */
		EClass LIFECYCLE_STATUS_PERIOD = eINSTANCE.getLifecycleStatusPeriod();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE_STATUS_PERIOD__STATUS = eINSTANCE.getLifecycleStatusPeriod_Status();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.ProductModelImpl <em>Product Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.ProductModelImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getProductModel()
		 * @generated
		 */
		EClass PRODUCT_MODEL = eINSTANCE.getProductModel();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__PERSONAS = eINSTANCE.getProductModel_Personas();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__CAPABILITIES = eINSTANCE.getProductModel_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Capability Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__CAPABILITY_PROVIDERS = eINSTANCE.getProductModel_CapabilityProviders();

		/**
		 * The meta object literal for the '<em><b>Work Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__WORK_PACKAGES = eINSTANCE.getProductModel_WorkPackages();

		/**
		 * The meta object literal for the '<em><b>Offerings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__OFFERINGS = eINSTANCE.getProductModel_Offerings();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__ACTORS = eINSTANCE.getProductModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Proposals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__PROPOSALS = eINSTANCE.getProductModel_Proposals();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MODEL__ROLES = eINSTANCE.getProductModel_Roles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.RoleImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ACTORS = eINSTANCE.getRole_Actors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.ActorImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ROLES = eINSTANCE.getActor_Roles();

		/**
		 * The meta object literal for the '<em><b>Owned Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__OWNED_ROLES = eINSTANCE.getActor_OwnedRoles();

		/**
		 * The meta object literal for the '<em><b>Sub Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SUB_ACTORS = eINSTANCE.getActor_SubActors();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__PARTY_ID = eINSTANCE.getActor_PartyId();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.PersonaImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__CONCERNS = eINSTANCE.getPersona_Concerns();

		/**
		 * The meta object literal for the '<em><b>Sub Personas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__SUB_PERSONAS = eINSTANCE.getPersona_SubPersonas();

		/**
		 * The meta object literal for the '<em><b>Super Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__SUPER_PERSONAS = eINSTANCE.getPersona_SuperPersonas();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__POPULATION = eINSTANCE.getPersona_Population();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__ROLES = eINSTANCE.getPersona_Roles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.ConcernImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getConcern()
		 * @generated
		 */
		EClass CONCERN = eINSTANCE.getConcern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN__TYPE = eINSTANCE.getConcern_Type();

		/**
		 * The meta object literal for the '<em><b>Sub Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__SUB_CONCERNS = eINSTANCE.getConcern_SubConcerns();

		/**
		 * The meta object literal for the '<em><b>Related Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__RELATED_CONCERNS = eINSTANCE.getConcern_RelatedConcerns();

		/**
		 * The meta object literal for the '<em><b>Referring Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__REFERRING_CONCERNS = eINSTANCE.getConcern_ReferringConcerns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.VersionImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Version String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_STRING = eINSTANCE.getVersion_VersionString();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__LABEL = eINSTANCE.getVersion_Label();

		/**
		 * The meta object literal for the '<em><b>Status Periods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__STATUS_PERIODS = eINSTANCE.getVersion_StatusPeriods();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.CapabilityImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__VERSIONS = eINSTANCE.getCapability_Versions();

		/**
		 * The meta object literal for the '<em><b>Sub Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__SUB_CAPABILITIES = eINSTANCE.getCapability_SubCapabilities();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INCLUDES = eINSTANCE.getCapability_Includes();

		/**
		 * The meta object literal for the '<em><b>Included In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INCLUDED_IN = eINSTANCE.getCapability_IncludedIn();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__ROLES = eINSTANCE.getCapability_Roles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.CapabilityVersionImpl <em>Capability Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.CapabilityVersionImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapabilityVersion()
		 * @generated
		 */
		EClass CAPABILITY_VERSION = eINSTANCE.getCapabilityVersion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.CapabilityProviderImpl <em>Capability Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.CapabilityProviderImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapabilityProvider()
		 * @generated
		 */
		EClass CAPABILITY_PROVIDER = eINSTANCE.getCapabilityProvider();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES = eINSTANCE.getCapabilityProvider_ProvidedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Required Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES = eINSTANCE.getCapabilityProvider_RequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER__VERSIONS = eINSTANCE.getCapabilityProvider_Versions();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER__ROLES = eINSTANCE.getCapabilityProvider_Roles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.CapabilityProviderVersionImpl <em>Capability Provider Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.CapabilityProviderVersionImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getCapabilityProviderVersion()
		 * @generated
		 */
		EClass CAPABILITY_PROVIDER_VERSION = eINSTANCE.getCapabilityProviderVersion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.OfferingImpl <em>Offering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.OfferingImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getOffering()
		 * @generated
		 */
		EClass OFFERING = eINSTANCE.getOffering();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFERING__COORDINATE = eINSTANCE.getOffering_Coordinate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.WorkPackageImpl <em>Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.WorkPackageImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getWorkPackage()
		 * @generated
		 */
		EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

		/**
		 * The meta object literal for the '<em><b>Sub Work Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__SUB_WORK_PACKAGES = eINSTANCE.getWorkPackage_SubWorkPackages();

		/**
		 * The meta object literal for the '<em><b>Impacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__IMPACTS = eINSTANCE.getWorkPackage_Impacts();

		/**
		 * The meta object literal for the '<em><b>Contributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__CONTRIBUTES = eINSTANCE.getWorkPackage_Contributes();

		/**
		 * The meta object literal for the '<em><b>Tracker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__TRACKER = eINSTANCE.getWorkPackage_Tracker();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__ROLES = eINSTANCE.getWorkPackage_Roles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.JiraWorkPackageImpl <em>Jira Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.JiraWorkPackageImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getJiraWorkPackage()
		 * @generated
		 */
		EClass JIRA_WORK_PACKAGE = eINSTANCE.getJiraWorkPackage();

		/**
		 * The meta object literal for the '<em><b>Project Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_WORK_PACKAGE__PROJECT_KEY = eINSTANCE.getJiraWorkPackage_ProjectKey();

		/**
		 * The meta object literal for the '<em><b>Issue Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_WORK_PACKAGE__ISSUE_KEY = eINSTANCE.getJiraWorkPackage_IssueKey();

		/**
		 * The meta object literal for the '<em><b>Issue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_WORK_PACKAGE__ISSUE_TYPE = eINSTANCE.getJiraWorkPackage_IssueType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.impl.ProposalImpl <em>Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.impl.ProposalImpl
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getProposal()
		 * @generated
		 */
		EClass PROPOSAL = eINSTANCE.getProposal();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSAL__COST = eINSTANCE.getProposal_Cost();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSAL__CURRENCY = eINSTANCE.getProposal_Currency();

		/**
		 * The meta object literal for the '<em><b>Work Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSAL__WORK_PACKAGE = eINSTANCE.getProposal_WorkPackage();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSAL__CAPABILITY = eINSTANCE.getProposal_Capability();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSAL__AUTHOR = eINSTANCE.getProposal_Author();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.LifecycleStatus <em>Lifecycle Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.LifecycleStatus
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getLifecycleStatus()
		 * @generated
		 */
		EEnum LIFECYCLE_STATUS = eINSTANCE.getLifecycleStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.product.management.ConcernType <em>Concern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.product.management.ConcernType
		 * @see org.nasdanika.models.product.management.impl.ManagementPackageImpl#getConcernType()
		 * @generated
		 */
		EEnum CONCERN_TYPE = eINSTANCE.getConcernType();

	}

} //ManagementPackage
