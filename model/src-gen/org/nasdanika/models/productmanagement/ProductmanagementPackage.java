/**
 */
package org.nasdanika.models.productmanagement;

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
 * *
 * Product Management Metamodel
 * 
 * A pragmatic, just-enough model for product management as code.
 * Elements are federated text-based artifacts that can be authored in version control,
 * published as Maven artifacts, and consumed across teams.
 * 
 * Conceptual frame — three intersecting perspectives on the same elements:
 * - Polity-allocation view: who has authority to bind decisions about resource allocation
 *   toward addressing persona concerns.
 * - Exchange view: concerns are asks; capabilities are bids. Resource allocations and
 *   work packages are bids on concerns.
 * - Decision-binding view: the model formalizes the incremental binding of decisions
 *   with provenance and authority.
 * 
 * Composition and federation principles:
 * - All elements extend ModelElement, which mirrors ncore.DocumentedNamedStringIdentity
 *   (ecore://nasdanika.org/core/ncore) and ncore.Period, providing id, name, documentation,
 *   start/end temporal anchoring, and duration.
 * - Undergoer/Actor machinery is modelled on architecture
 *   (ecore://nasdanika.org/models/architecture): Actors perform Roles on Undergoers.
 * - Capability and CapabilityProvider structure is inspired by the Eclipse P2 capability
 *   model (ecore://nasdanika.org/models/capability).
 * - MCDA weight derivation (ecore://nasdanika.org/models/mcda) is supported through
 *   the 'weight' attribute on ModelElement; Personas and Concerns participate as
 *   MCDA alternatives.
 * - Federation: all elements are loadable from XMI, YAML, JSON, Excel, Draw.io, or
 *   Xtext sources via logical URIs and Maven URI Handler integration, following the
 *   same federated-artifact pattern as the Maven model
 *   (https://maven.models.nasdanika.org/).
 * - The root ProductModel is itself a Period, enabling template product models where
 *   relative dates resolve to concrete dates when start/end is set on the root.
 * 
 * Reference models:
 * - ncore:        ecore://nasdanika.org/core/ncore
 * - architecture: ecore://nasdanika.org/models/architecture
 * - capability:   ecore://nasdanika.org/models/capability
 * - mcda:         ecore://nasdanika.org/models/mcda
 * - enterprise:   ecore://nasdanika.org/models/enterprise
 * - party:        ecore://nasdanika.org/models/party
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.productmanagement.ProductmanagementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface ProductmanagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "productmanagement";

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
	ProductmanagementPackage eINSTANCE = org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ModelElementImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getModelElement()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.LifecycleStatusPeriodImpl <em>Lifecycle Status Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.LifecycleStatusPeriodImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getLifecycleStatusPeriod()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl <em>Product Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProductModelImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProductModel()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.RoleImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getRole()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ActorImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getActor()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersona()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ConcernImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcern()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.VersionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getVersion()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapability()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityVersionImpl <em>Capability Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityVersionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityVersion()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl <em>Capability Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProvider()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderVersionImpl <em>Capability Provider Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderVersionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProviderVersion()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.OfferingImpl <em>Offering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.OfferingImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getOffering()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.WorkPackageImpl <em>Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.WorkPackageImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getWorkPackage()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.JiraWorkPackageImpl <em>Jira Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.JiraWorkPackageImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getJiraWorkPackage()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProposalImpl <em>Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProposalImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProposal()
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.LifecycleStatus <em>Lifecycle Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.LifecycleStatus
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getLifecycleStatus()
	 * @generated
	 */
	int LIFECYCLE_STATUS = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.ConcernType <em>Concern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.ConcernType
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcernType()
	 * @generated
	 */
	int CONCERN_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getD()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_D();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getDocumentation()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getStart()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getEnd()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_End();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getDuration()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getWeight()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Weight();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.LifecycleStatusPeriod <em>Lifecycle Status Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Status Period</em>'.
	 * @see org.nasdanika.models.productmanagement.LifecycleStatusPeriod
	 * @generated
	 */
	EClass getLifecycleStatusPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.LifecycleStatusPeriod#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.productmanagement.LifecycleStatusPeriod#getStatus()
	 * @see #getLifecycleStatusPeriod()
	 * @generated
	 */
	EAttribute getLifecycleStatusPeriod_Status();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ProductModel <em>Product Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Model</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel
	 * @generated
	 */
	EClass getProductModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getPersonas()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Personas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getCapabilities()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getCapabilityProviders <em>Capability Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Providers</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getCapabilityProviders()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_CapabilityProviders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getWorkPackages <em>Work Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Packages</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getWorkPackages()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_WorkPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getOfferings <em>Offerings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offerings</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getOfferings()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Offerings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getActors()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getProposals()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Proposals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductModel#getRoles()
	 * @see #getProductModel()
	 * @generated
	 */
	EReference getProductModel_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.nasdanika.models.productmanagement.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Role#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see org.nasdanika.models.productmanagement.Role#getActors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Actors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.nasdanika.models.productmanagement.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.Actor#getRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Actor#getOwnedRoles <em>Owned Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.Actor#getOwnedRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_OwnedRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Actor#getSubActors <em>Sub Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Actors</em>'.
	 * @see org.nasdanika.models.productmanagement.Actor#getSubActors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_SubActors();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Actor#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.nasdanika.models.productmanagement.Actor#getPartyId()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_PartyId();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getConcerns()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Concerns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getSubPersonas <em>Sub Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getSubPersonas()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_SubPersonas();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Persona#getSuperPersonas <em>Super Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getSuperPersonas()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_SuperPersonas();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Persona#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getPopulation()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Population();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getRoles()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Concern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getType()
	 * @see #getConcern()
	 * @generated
	 */
	EAttribute getConcern_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Concern#getSubConcerns <em>Sub Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getSubConcerns()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_SubConcerns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Concern#getRelatedConcerns <em>Related Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getRelatedConcerns()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_RelatedConcerns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Concern#getReferringConcerns <em>Referring Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referring Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getReferringConcerns()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_ReferringConcerns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.nasdanika.models.productmanagement.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Version#getVersionString <em>Version String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version String</em>'.
	 * @see org.nasdanika.models.productmanagement.Version#getVersionString()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionString();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Version#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.models.productmanagement.Version#getLabel()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Version#getStatusPeriods <em>Status Periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status Periods</em>'.
	 * @see org.nasdanika.models.productmanagement.Version#getStatusPeriods()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_StatusPeriods();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Capability#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getVersions()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Capability#getSubCapabilities <em>Sub Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getSubCapabilities()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_SubCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getIncludes()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Includes();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Capability#getIncludedIn <em>Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included In</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getIncludedIn()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IncludedIn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Capability#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getRoles()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityVersion <em>Capability Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Version</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityVersion
	 * @generated
	 */
	EClass getCapabilityVersion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityProvider <em>Capability Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Provider</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider
	 * @generated
	 */
	EClass getCapabilityProvider();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getProvidedCapabilities()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_ProvidedCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getRequiredCapabilities()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_RequiredCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getVersions()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getRoles()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityProviderVersion <em>Capability Provider Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Provider Version</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProviderVersion
	 * @generated
	 */
	EClass getCapabilityProviderVersion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Offering <em>Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offering</em>'.
	 * @see org.nasdanika.models.productmanagement.Offering
	 * @generated
	 */
	EClass getOffering();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Offering#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see org.nasdanika.models.productmanagement.Offering#getCoordinate()
	 * @see #getOffering()
	 * @generated
	 */
	EAttribute getOffering_Coordinate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see org.nasdanika.models.productmanagement.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.WorkPackage#getSubWorkPackages <em>Sub Work Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Work Packages</em>'.
	 * @see org.nasdanika.models.productmanagement.WorkPackage#getSubWorkPackages()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_SubWorkPackages();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.WorkPackage#getImpacts <em>Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impacts</em>'.
	 * @see org.nasdanika.models.productmanagement.WorkPackage#getImpacts()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Impacts();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.WorkPackage#getContributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes</em>'.
	 * @see org.nasdanika.models.productmanagement.WorkPackage#getContributes()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Contributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.WorkPackage#getTracker <em>Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracker</em>'.
	 * @see org.nasdanika.models.productmanagement.WorkPackage#getTracker()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_Tracker();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.WorkPackage#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.WorkPackage#getRoles()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_Roles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.JiraWorkPackage <em>Jira Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jira Work Package</em>'.
	 * @see org.nasdanika.models.productmanagement.JiraWorkPackage
	 * @generated
	 */
	EClass getJiraWorkPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getProjectKey <em>Project Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Key</em>'.
	 * @see org.nasdanika.models.productmanagement.JiraWorkPackage#getProjectKey()
	 * @see #getJiraWorkPackage()
	 * @generated
	 */
	EAttribute getJiraWorkPackage_ProjectKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueKey <em>Issue Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Key</em>'.
	 * @see org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueKey()
	 * @see #getJiraWorkPackage()
	 * @generated
	 */
	EAttribute getJiraWorkPackage_IssueKey();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Type</em>'.
	 * @see org.nasdanika.models.productmanagement.JiraWorkPackage#getIssueType()
	 * @see #getJiraWorkPackage()
	 * @generated
	 */
	EAttribute getJiraWorkPackage_IssueType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Proposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see org.nasdanika.models.productmanagement.Proposal
	 * @generated
	 */
	EClass getProposal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Proposal#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.nasdanika.models.productmanagement.Proposal#getCost()
	 * @see #getProposal()
	 * @generated
	 */
	EAttribute getProposal_Cost();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Proposal#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.nasdanika.models.productmanagement.Proposal#getCurrency()
	 * @see #getProposal()
	 * @generated
	 */
	EAttribute getProposal_Currency();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.Proposal#getWorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Package</em>'.
	 * @see org.nasdanika.models.productmanagement.Proposal#getWorkPackage()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_WorkPackage();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.Proposal#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.Proposal#getCapability()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Capability();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.Proposal#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.productmanagement.Proposal#getAuthor()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Author();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.productmanagement.LifecycleStatus <em>Lifecycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle Status</em>'.
	 * @see org.nasdanika.models.productmanagement.LifecycleStatus
	 * @generated
	 */
	EEnum getLifecycleStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.productmanagement.ConcernType <em>Concern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concern Type</em>'.
	 * @see org.nasdanika.models.productmanagement.ConcernType
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
	ProductmanagementFactory getProductmanagementFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ModelElementImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getModelElement()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.LifecycleStatusPeriodImpl <em>Lifecycle Status Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.LifecycleStatusPeriodImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getLifecycleStatusPeriod()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl <em>Product Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ProductModelImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProductModel()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.RoleImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getRole()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ActorImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getActor()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.PersonaImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersona()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ConcernImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcern()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.VersionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getVersion()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapability()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityVersionImpl <em>Capability Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityVersionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityVersion()
		 * @generated
		 */
		EClass CAPABILITY_VERSION = eINSTANCE.getCapabilityVersion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl <em>Capability Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProvider()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderVersionImpl <em>Capability Provider Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderVersionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProviderVersion()
		 * @generated
		 */
		EClass CAPABILITY_PROVIDER_VERSION = eINSTANCE.getCapabilityProviderVersion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.OfferingImpl <em>Offering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.OfferingImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getOffering()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.WorkPackageImpl <em>Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.WorkPackageImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getWorkPackage()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.JiraWorkPackageImpl <em>Jira Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.JiraWorkPackageImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getJiraWorkPackage()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ProposalImpl <em>Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ProposalImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProposal()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.LifecycleStatus <em>Lifecycle Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.LifecycleStatus
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getLifecycleStatus()
		 * @generated
		 */
		EEnum LIFECYCLE_STATUS = eINSTANCE.getLifecycleStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.ConcernType <em>Concern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.ConcernType
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcernType()
		 * @generated
		 */
		EEnum CONCERN_TYPE = eINSTANCE.getConcernType();

	}

} //ProductmanagementPackage
