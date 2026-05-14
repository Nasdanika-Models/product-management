/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.nasdanika.models.productmanagement.ProductmanagementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.TemporalImpl <em>Temporal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.TemporalImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__BASE = 0;

	/**
	 * The feature id for the '<em><b>Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__INSTANT = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Lower Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__LOWER_BOUNDS = 3;

	/**
	 * The feature id for the '<em><b>Upper Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__UPPER_BOUNDS = 4;

	/**
	 * The number of structural features of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PeriodImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = 2;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.StringIdentity <em>String Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.StringIdentity
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getStringIdentity()
	 * @generated
	 */
	int STRING_IDENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY__ID = 0;

	/**
	 * The number of structural features of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ModelElementImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID = STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOCUMENTATION = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__URIS = STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.NamedElementImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.NamedPeriodImpl <em>Named Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.NamedPeriodImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getNamedPeriod()
	 * @generated
	 */
	int NAMED_PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__START = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__END = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Named Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl <em>Product Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProductModelImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProductModel()
	 * @generated
	 */
	int PRODUCT_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__PERSONAS = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITIES = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITY_PROVIDERS = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ACTORS = NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractPersona <em>Abstract Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractPersona
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractPersona()
	 * @generated
	 */
	int ABSTRACT_PERSONA = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__ID = STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Abstract Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__CONCERNS = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaDomainImpl <em>Persona Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaDomain()
	 * @generated
	 */
	int PERSONA_DOMAIN = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__PERSONAS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persona Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persona Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl <em>Persona Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaReference()
	 * @generated
	 */
	int PERSONA_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__ID = ABSTRACT_PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__TARGET = ABSTRACT_PERSONA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persona Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE_FEATURE_COUNT = ABSTRACT_PERSONA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persona Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE_OPERATION_COUNT = ABSTRACT_PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractConcern <em>Abstract Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractConcern
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractConcern()
	 * @generated
	 */
	int ABSTRACT_CONCERN = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__ID = STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Abstract Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ConcernImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Addressed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ADDRESSED_BY = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.AddressingCapabilitiesImpl <em>Addressing Capabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.AddressingCapabilitiesImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAddressingCapabilities()
	 * @generated
	 */
	int ADDRESSING_CAPABILITIES = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_CAPABILITIES__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_CAPABILITIES__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_CAPABILITIES__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_CAPABILITIES__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_CAPABILITIES__CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Addressing Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_CAPABILITIES_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Addressing Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSING_CAPABILITIES_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ConcernReferenceImpl <em>Concern Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ConcernReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcernReference()
	 * @generated
	 */
	int CONCERN_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__ID = ABSTRACT_CONCERN__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__TARGET = ABSTRACT_CONCERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concern Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE_FEATURE_COUNT = ABSTRACT_CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concern Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE_OPERATION_COUNT = ABSTRACT_CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ConcernDomainImpl <em>Concern Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ConcernDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcernDomain()
	 * @generated
	 */
	int CONCERN_DOMAIN = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__ID = ABSTRACT_CONCERN__ID;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__CONCERNS = ABSTRACT_CONCERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concern Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN_FEATURE_COUNT = ABSTRACT_CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concern Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN_OPERATION_COUNT = ABSTRACT_CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.GoalImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = CONCERN__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOCUMENTATION = CONCERN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__URIS = CONCERN__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = CONCERN__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DURATION = CONCERN__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__START = CONCERN__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__END = CONCERN__END;

	/**
	 * The feature id for the '<em><b>Addressed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ADDRESSED_BY = CONCERN__ADDRESSED_BY;

	/**
	 * The feature id for the '<em><b>Supporting Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUPPORTING_NEEDS = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blockers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BLOCKERS = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.NeedImpl <em>Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.NeedImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ID = CONCERN__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DOCUMENTATION = CONCERN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__URIS = CONCERN__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__NAME = CONCERN__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DURATION = CONCERN__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__START = CONCERN__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__END = CONCERN__END;

	/**
	 * The feature id for the '<em><b>Addressed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ADDRESSED_BY = CONCERN__ADDRESSED_BY;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__SUPPORTS = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Violators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__VIOLATORS = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_OPERATION_COUNT = CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.SupportedGoalsImpl <em>Supported Goals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.SupportedGoalsImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getSupportedGoals()
	 * @generated
	 */
	int SUPPORTED_GOALS = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_GOALS__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_GOALS__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_GOALS__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_GOALS__GOALS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Supported Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_GOALS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Supported Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_GOALS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PainPointImpl <em>Pain Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PainPointImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPainPoint()
	 * @generated
	 */
	int PAIN_POINT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ID = CONCERN__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DOCUMENTATION = CONCERN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__URIS = CONCERN__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__NAME = CONCERN__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DURATION = CONCERN__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__START = CONCERN__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__END = CONCERN__END;

	/**
	 * The feature id for the '<em><b>Addressed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ADDRESSED_BY = CONCERN__ADDRESSED_BY;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__BLOCKS = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Violates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__VIOLATES = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pain Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pain Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT_OPERATION_COUNT = CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.BlockedGoalsImpl <em>Blocked Goals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.BlockedGoalsImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getBlockedGoals()
	 * @generated
	 */
	int BLOCKED_GOALS = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_GOALS__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_GOALS__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_GOALS__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_GOALS__GOALS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blocked Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_GOALS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blocked Goals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_GOALS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ViolatedNeedsImpl <em>Violated Needs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ViolatedNeedsImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getViolatedNeeds()
	 * @generated
	 */
	int VIOLATED_NEEDS = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_NEEDS__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_NEEDS__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_NEEDS__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_NEEDS__NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Violated Needs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_NEEDS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Violated Needs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATED_NEEDS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractCapability <em>Abstract Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractCapability
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractCapability()
	 * @generated
	 */
	int ABSTRACT_CAPABILITY = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__ID = STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Abstract Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EVIDENCE = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ADDRESSES = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SUB_CAPABILITIES = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__LIFECYCLE = NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityReferenceImpl <em>Capability Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityReference()
	 * @generated
	 */
	int CAPABILITY_REFERENCE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__ID = ABSTRACT_CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__TARGET = ABSTRACT_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE_FEATURE_COUNT = ABSTRACT_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE_OPERATION_COUNT = ABSTRACT_CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityDomainImpl <em>Capability Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityDomain()
	 * @generated
	 */
	int CAPABILITY_DOMAIN = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__CAPABILITIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.AddressedConcernsImpl <em>Addressed Concerns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.AddressedConcernsImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAddressedConcerns()
	 * @generated
	 */
	int ADDRESSED_CONCERNS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_CONCERNS__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_CONCERNS__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_CONCERNS__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_CONCERNS__CONCERNS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Addressed Concerns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_CONCERNS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Addressed Concerns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_CONCERNS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl <em>Capability Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityDependency()
	 * @generated
	 */
	int CAPABILITY_DEPENDENCY = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__KIND = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__OPTIONAL = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Capability Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractCapabilityProvider <em>Abstract Capability Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractCapabilityProvider
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractCapabilityProvider()
	 * @generated
	 */
	int ABSTRACT_CAPABILITY_PROVIDER = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_PROVIDER__ID = STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Abstract Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_PROVIDER_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_PROVIDER_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl <em>Capability Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProvider()
	 * @generated
	 */
	int CAPABILITY_PROVIDER = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__PROVIDES = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__REQUIRES = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__LIFECYCLE = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderDomainImpl <em>Capability Provider Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProviderDomain()
	 * @generated
	 */
	int CAPABILITY_PROVIDER_DOMAIN = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Capability Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability Provider Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability Provider Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderReferenceImpl <em>Capability Provider Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProviderReference()
	 * @generated
	 */
	int CAPABILITY_PROVIDER_REFERENCE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_REFERENCE__ID = ABSTRACT_CAPABILITY_PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_REFERENCE__TARGET = ABSTRACT_CAPABILITY_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability Provider Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_REFERENCE_FEATURE_COUNT = ABSTRACT_CAPABILITY_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability Provider Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_REFERENCE_OPERATION_COUNT = ABSTRACT_CAPABILITY_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProvidedCapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProvidedCapability()
	 * @generated
	 */
	int PROVIDED_CAPABILITY = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__EVIDENCE = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__CAPABILITY = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provided Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractEvidence <em>Abstract Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractEvidence
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractEvidence()
	 * @generated
	 */
	int ABSTRACT_EVIDENCE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVIDENCE__ID = STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Abstract Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVIDENCE_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVIDENCE_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.EvidenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__END = NAMED_PERIOD__END;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.EvidenceDomainImpl <em>Evidence Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.EvidenceDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getEvidenceDomain()
	 * @generated
	 */
	int EVIDENCE_DOMAIN = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__EVIDENCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evidence Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evidence Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.RequiredCapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getRequiredCapability()
	 * @generated
	 */
	int REQUIRED_CAPABILITY = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__CAPABILITY = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.VersionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__END = NAMED_PERIOD__END;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.Undergoer <em>Undergoer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.Undergoer
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getUndergoer()
	 * @generated
	 */
	int UNDERGOER = 38;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGOER__ROLES = 0;

	/**
	 * The number of structural features of the '<em>Undergoer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGOER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Undergoer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERGOER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.RoleImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__END = NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ASSIGNMENTS = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.RoleAssignmentImpl <em>Role Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.RoleAssignmentImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getRoleAssignment()
	 * @generated
	 */
	int ROLE_ASSIGNMENT = 40;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__DURATION = PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__START = PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__END = PERIOD__END;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__COMMENT = PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__ACTORS = PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT_FEATURE_COUNT = PERIOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT_OPERATION_COUNT = PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractActor <em>Abstract Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractActor
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractActor()
	 * @generated
	 */
	int ABSTRACT_ACTOR = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR__ID = STRING_IDENTITY__ID;

	/**
	 * The number of structural features of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ActorImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__URIS = NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DURATION = NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__START = NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__END = NAMED_PERIOD__END;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ActorDomainImpl <em>Actor Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ActorDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getActorDomain()
	 * @generated
	 */
	int ACTOR_DOMAIN = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__ACTORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.Lifecycle <em>Lifecycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.Lifecycle
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getLifecycle()
	 * @generated
	 */
	int LIFECYCLE = 44;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.DependencyKind <em>Dependency Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.DependencyKind
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getDependencyKind()
	 * @generated
	 */
	int DEPENDENCY_KIND = 45;

	/**
	 * The meta object id for the '<em>Instant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 46;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Duration
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 47;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal</em>'.
	 * @see org.nasdanika.models.productmanagement.Temporal
	 * @generated
	 */
	EClass getTemporal();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.Temporal#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.nasdanika.models.productmanagement.Temporal#getBase()
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_Base();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Temporal#getInstant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instant</em>'.
	 * @see org.nasdanika.models.productmanagement.Temporal#getInstant()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Instant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Temporal#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.productmanagement.Temporal#getDuration()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Duration();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Temporal#getLowerBounds <em>Lower Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lower Bounds</em>'.
	 * @see org.nasdanika.models.productmanagement.Temporal#getLowerBounds()
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_LowerBounds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Temporal#getUpperBounds <em>Upper Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upper Bounds</em>'.
	 * @see org.nasdanika.models.productmanagement.Temporal#getUpperBounds()
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_UpperBounds();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see org.nasdanika.models.productmanagement.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Period#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.productmanagement.Period#getDuration()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.productmanagement.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.nasdanika.models.productmanagement.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.productmanagement.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.nasdanika.models.productmanagement.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_End();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.StringIdentity <em>String Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Identity</em>'.
	 * @see org.nasdanika.models.productmanagement.StringIdentity
	 * @generated
	 */
	EClass getStringIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.StringIdentity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.productmanagement.StringIdentity#getId()
	 * @see #getStringIdentity()
	 * @generated
	 */
	EAttribute getStringIdentity_Id();

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
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.productmanagement.ModelElement#getUris <em>Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uris</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getUris()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Uris();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.models.productmanagement.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.productmanagement.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.NamedPeriod <em>Named Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Period</em>'.
	 * @see org.nasdanika.models.productmanagement.NamedPeriod
	 * @generated
	 */
	EClass getNamedPeriod();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AbstractPersona <em>Abstract Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Persona</em>'.
	 * @see org.nasdanika.models.productmanagement.AbstractPersona
	 * @generated
	 */
	EClass getAbstractPersona();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.PersonaDomain <em>Persona Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona Domain</em>'.
	 * @see org.nasdanika.models.productmanagement.PersonaDomain
	 * @generated
	 */
	EClass getPersonaDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.PersonaDomain#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.PersonaDomain#getPersonas()
	 * @see #getPersonaDomain()
	 * @generated
	 */
	EReference getPersonaDomain_Personas();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.PersonaReference <em>Persona Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona Reference</em>'.
	 * @see org.nasdanika.models.productmanagement.PersonaReference
	 * @generated
	 */
	EClass getPersonaReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.PersonaReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.productmanagement.PersonaReference#getTarget()
	 * @see #getPersonaReference()
	 * @generated
	 */
	EReference getPersonaReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AbstractConcern <em>Abstract Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Concern</em>'.
	 * @see org.nasdanika.models.productmanagement.AbstractConcern
	 * @generated
	 */
	EClass getAbstractConcern();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Concern#getAddressedBy <em>Addressed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addressed By</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getAddressedBy()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_AddressedBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AddressingCapabilities <em>Addressing Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressing Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.AddressingCapabilities
	 * @generated
	 */
	EClass getAddressingCapabilities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ConcernReference <em>Concern Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Reference</em>'.
	 * @see org.nasdanika.models.productmanagement.ConcernReference
	 * @generated
	 */
	EClass getConcernReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.ConcernReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.productmanagement.ConcernReference#getTarget()
	 * @see #getConcernReference()
	 * @generated
	 */
	EReference getConcernReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ConcernDomain <em>Concern Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Domain</em>'.
	 * @see org.nasdanika.models.productmanagement.ConcernDomain
	 * @generated
	 */
	EClass getConcernDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ConcernDomain#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.ConcernDomain#getConcerns()
	 * @see #getConcernDomain()
	 * @generated
	 */
	EReference getConcernDomain_Concerns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Goal#getSupportingNeeds <em>Supporting Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getSupportingNeeds()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_SupportingNeeds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Goal#getBlockers <em>Blockers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blockers</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getBlockers()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Blockers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Need <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Need</em>'.
	 * @see org.nasdanika.models.productmanagement.Need
	 * @generated
	 */
	EClass getNeed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Need#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supports</em>'.
	 * @see org.nasdanika.models.productmanagement.Need#getSupports()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_Supports();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Need#getViolators <em>Violators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Violators</em>'.
	 * @see org.nasdanika.models.productmanagement.Need#getViolators()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_Violators();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.SupportedGoals <em>Supported Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.SupportedGoals
	 * @generated
	 */
	EClass getSupportedGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.SupportedGoals#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.SupportedGoals#getGoals()
	 * @see #getSupportedGoals()
	 * @generated
	 */
	EReference getSupportedGoals_Goals();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.PainPoint <em>Pain Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pain Point</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint
	 * @generated
	 */
	EClass getPainPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.PainPoint#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint#getBlocks()
	 * @see #getPainPoint()
	 * @generated
	 */
	EReference getPainPoint_Blocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.PainPoint#getViolates <em>Violates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Violates</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint#getViolates()
	 * @see #getPainPoint()
	 * @generated
	 */
	EReference getPainPoint_Violates();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.BlockedGoals <em>Blocked Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blocked Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.BlockedGoals
	 * @generated
	 */
	EClass getBlockedGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.BlockedGoals#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.BlockedGoals#getGoals()
	 * @see #getBlockedGoals()
	 * @generated
	 */
	EReference getBlockedGoals_Goals();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ViolatedNeeds <em>Violated Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violated Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.ViolatedNeeds
	 * @generated
	 */
	EClass getViolatedNeeds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ViolatedNeeds#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.ViolatedNeeds#getNeeds()
	 * @see #getViolatedNeeds()
	 * @generated
	 */
	EReference getViolatedNeeds_Needs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AbstractCapability <em>Abstract Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.AbstractCapability
	 * @generated
	 */
	EClass getAbstractCapability();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Capability#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getAddresses()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Addresses();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Capability#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getLifecycle()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Lifecycle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityReference <em>Capability Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Reference</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityReference
	 * @generated
	 */
	EClass getCapabilityReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.CapabilityReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityReference#getTarget()
	 * @see #getCapabilityReference()
	 * @generated
	 */
	EReference getCapabilityReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityDomain <em>Capability Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Domain</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDomain
	 * @generated
	 */
	EClass getCapabilityDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.CapabilityDomain#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDomain#getCapabilities()
	 * @see #getCapabilityDomain()
	 * @generated
	 */
	EReference getCapabilityDomain_Capabilities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AddressedConcerns <em>Addressed Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressed Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.AddressedConcerns
	 * @generated
	 */
	EClass getAddressedConcerns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.AddressedConcerns#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.AddressedConcerns#getConcerns()
	 * @see #getAddressedConcerns()
	 * @generated
	 */
	EReference getAddressedConcerns_Concerns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityDependency <em>Capability Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Dependency</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDependency
	 * @generated
	 */
	EClass getCapabilityDependency();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.CapabilityDependency#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDependency#getCapabilities()
	 * @see #getCapabilityDependency()
	 * @generated
	 */
	EReference getCapabilityDependency_Capabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.CapabilityDependency#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDependency#getKind()
	 * @see #getCapabilityDependency()
	 * @generated
	 */
	EAttribute getCapabilityDependency_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.CapabilityDependency#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDependency#isOptional()
	 * @see #getCapabilityDependency()
	 * @generated
	 */
	EAttribute getCapabilityDependency_Optional();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AbstractCapabilityProvider <em>Abstract Capability Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Capability Provider</em>'.
	 * @see org.nasdanika.models.productmanagement.AbstractCapabilityProvider
	 * @generated
	 */
	EClass getAbstractCapabilityProvider();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getProvides()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_Provides();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getRequires()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EReference getCapabilityProvider_Requires();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getLifecycle()
	 * @see #getCapabilityProvider()
	 * @generated
	 */
	EAttribute getCapabilityProvider_Lifecycle();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityProviderDomain <em>Capability Provider Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Provider Domain</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProviderDomain
	 * @generated
	 */
	EClass getCapabilityProviderDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.CapabilityProviderDomain#getCapabilityProviders <em>Capability Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Providers</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProviderDomain#getCapabilityProviders()
	 * @see #getCapabilityProviderDomain()
	 * @generated
	 */
	EReference getCapabilityProviderDomain_CapabilityProviders();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CapabilityProviderReference <em>Capability Provider Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Provider Reference</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProviderReference
	 * @generated
	 */
	EClass getCapabilityProviderReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.CapabilityProviderReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityProviderReference#getTarget()
	 * @see #getCapabilityProviderReference()
	 * @generated
	 */
	EReference getCapabilityProviderReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ProvidedCapability <em>Provided Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.ProvidedCapability
	 * @generated
	 */
	EClass getProvidedCapability();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.productmanagement.ProvidedCapability#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.ProvidedCapability#getCapability()
	 * @see #getProvidedCapability()
	 * @generated
	 */
	EReference getProvidedCapability_Capability();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AbstractEvidence <em>Abstract Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Evidence</em>'.
	 * @see org.nasdanika.models.productmanagement.AbstractEvidence
	 * @generated
	 */
	EClass getAbstractEvidence();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see org.nasdanika.models.productmanagement.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.EvidenceDomain <em>Evidence Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence Domain</em>'.
	 * @see org.nasdanika.models.productmanagement.EvidenceDomain
	 * @generated
	 */
	EClass getEvidenceDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.EvidenceDomain#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.nasdanika.models.productmanagement.EvidenceDomain#getEvidence()
	 * @see #getEvidenceDomain()
	 * @generated
	 */
	EReference getEvidenceDomain_Evidence();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.RequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.RequiredCapability
	 * @generated
	 */
	EClass getRequiredCapability();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.productmanagement.RequiredCapability#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.RequiredCapability#getCapability()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EReference getRequiredCapability_Capability();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Undergoer <em>Undergoer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undergoer</em>'.
	 * @see org.nasdanika.models.productmanagement.Undergoer
	 * @generated
	 */
	EClass getUndergoer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Undergoer#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.models.productmanagement.Undergoer#getRoles()
	 * @see #getUndergoer()
	 * @generated
	 */
	EReference getUndergoer_Roles();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Role#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see org.nasdanika.models.productmanagement.Role#getAssignments()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Assignments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.RoleAssignment <em>Role Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Assignment</em>'.
	 * @see org.nasdanika.models.productmanagement.RoleAssignment
	 * @generated
	 */
	EClass getRoleAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.RoleAssignment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.productmanagement.RoleAssignment#getComment()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EAttribute getRoleAssignment_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.productmanagement.RoleAssignment#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actors</em>'.
	 * @see org.nasdanika.models.productmanagement.RoleAssignment#getActors()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EReference getRoleAssignment_Actors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.AbstractActor <em>Abstract Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Actor</em>'.
	 * @see org.nasdanika.models.productmanagement.AbstractActor
	 * @generated
	 */
	EClass getAbstractActor();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ActorDomain <em>Actor Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Domain</em>'.
	 * @see org.nasdanika.models.productmanagement.ActorDomain
	 * @generated
	 */
	EClass getActorDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ActorDomain#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see org.nasdanika.models.productmanagement.ActorDomain#getActors()
	 * @see #getActorDomain()
	 * @generated
	 */
	EReference getActorDomain_Actors();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.productmanagement.Lifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle</em>'.
	 * @see org.nasdanika.models.productmanagement.Lifecycle
	 * @generated
	 */
	EEnum getLifecycle();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.productmanagement.DependencyKind <em>Dependency Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Kind</em>'.
	 * @see org.nasdanika.models.productmanagement.DependencyKind
	 * @generated
	 */
	EEnum getDependencyKind();

	/**
	 * Returns the meta object for data type '{@link java.time.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instant</em>'.
	 * @see java.time.Instant
	 * @model instanceClass="java.time.Instant"
	 * @generated
	 */
	EDataType getInstant();

	/**
	 * Returns the meta object for data type '{@link java.time.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration</em>'.
	 * @see java.time.Duration
	 * @model instanceClass="java.time.Duration"
	 * @generated
	 */
	EDataType getDuration();

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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.TemporalImpl <em>Temporal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.TemporalImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getTemporal()
		 * @generated
		 */
		EClass TEMPORAL = eINSTANCE.getTemporal();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL__BASE = eINSTANCE.getTemporal_Base();

		/**
		 * The meta object literal for the '<em><b>Instant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__INSTANT = eINSTANCE.getTemporal_Instant();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__DURATION = eINSTANCE.getTemporal_Duration();

		/**
		 * The meta object literal for the '<em><b>Lower Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL__LOWER_BOUNDS = eINSTANCE.getTemporal_LowerBounds();

		/**
		 * The meta object literal for the '<em><b>Upper Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL__UPPER_BOUNDS = eINSTANCE.getTemporal_UpperBounds();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.PeriodImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__DURATION = eINSTANCE.getPeriod_Duration();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.StringIdentity <em>String Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.StringIdentity
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getStringIdentity()
		 * @generated
		 */
		EClass STRING_IDENTITY = eINSTANCE.getStringIdentity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_IDENTITY__ID = eINSTANCE.getStringIdentity_Id();

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
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DOCUMENTATION = eINSTANCE.getModelElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__URIS = eINSTANCE.getModelElement_Uris();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.NamedElementImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.NamedPeriodImpl <em>Named Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.NamedPeriodImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getNamedPeriod()
		 * @generated
		 */
		EClass NAMED_PERIOD = eINSTANCE.getNamedPeriod();

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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.AbstractPersona <em>Abstract Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.AbstractPersona
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractPersona()
		 * @generated
		 */
		EClass ABSTRACT_PERSONA = eINSTANCE.getAbstractPersona();

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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.PersonaDomainImpl <em>Persona Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.PersonaDomainImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaDomain()
		 * @generated
		 */
		EClass PERSONA_DOMAIN = eINSTANCE.getPersonaDomain();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA_DOMAIN__PERSONAS = eINSTANCE.getPersonaDomain_Personas();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl <em>Persona Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaReference()
		 * @generated
		 */
		EClass PERSONA_REFERENCE = eINSTANCE.getPersonaReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA_REFERENCE__TARGET = eINSTANCE.getPersonaReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.AbstractConcern <em>Abstract Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.AbstractConcern
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractConcern()
		 * @generated
		 */
		EClass ABSTRACT_CONCERN = eINSTANCE.getAbstractConcern();

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
		 * The meta object literal for the '<em><b>Addressed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__ADDRESSED_BY = eINSTANCE.getConcern_AddressedBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.AddressingCapabilitiesImpl <em>Addressing Capabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.AddressingCapabilitiesImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAddressingCapabilities()
		 * @generated
		 */
		EClass ADDRESSING_CAPABILITIES = eINSTANCE.getAddressingCapabilities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ConcernReferenceImpl <em>Concern Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ConcernReferenceImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcernReference()
		 * @generated
		 */
		EClass CONCERN_REFERENCE = eINSTANCE.getConcernReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN_REFERENCE__TARGET = eINSTANCE.getConcernReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ConcernDomainImpl <em>Concern Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ConcernDomainImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcernDomain()
		 * @generated
		 */
		EClass CONCERN_DOMAIN = eINSTANCE.getConcernDomain();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN_DOMAIN__CONCERNS = eINSTANCE.getConcernDomain_Concerns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.GoalImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Supporting Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SUPPORTING_NEEDS = eINSTANCE.getGoal_SupportingNeeds();

		/**
		 * The meta object literal for the '<em><b>Blockers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__BLOCKERS = eINSTANCE.getGoal_Blockers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.NeedImpl <em>Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.NeedImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getNeed()
		 * @generated
		 */
		EClass NEED = eINSTANCE.getNeed();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__SUPPORTS = eINSTANCE.getNeed_Supports();

		/**
		 * The meta object literal for the '<em><b>Violators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__VIOLATORS = eINSTANCE.getNeed_Violators();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.SupportedGoalsImpl <em>Supported Goals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.SupportedGoalsImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getSupportedGoals()
		 * @generated
		 */
		EClass SUPPORTED_GOALS = eINSTANCE.getSupportedGoals();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_GOALS__GOALS = eINSTANCE.getSupportedGoals_Goals();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.PainPointImpl <em>Pain Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.PainPointImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPainPoint()
		 * @generated
		 */
		EClass PAIN_POINT = eINSTANCE.getPainPoint();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__BLOCKS = eINSTANCE.getPainPoint_Blocks();

		/**
		 * The meta object literal for the '<em><b>Violates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__VIOLATES = eINSTANCE.getPainPoint_Violates();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.BlockedGoalsImpl <em>Blocked Goals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.BlockedGoalsImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getBlockedGoals()
		 * @generated
		 */
		EClass BLOCKED_GOALS = eINSTANCE.getBlockedGoals();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKED_GOALS__GOALS = eINSTANCE.getBlockedGoals_Goals();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ViolatedNeedsImpl <em>Violated Needs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ViolatedNeedsImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getViolatedNeeds()
		 * @generated
		 */
		EClass VIOLATED_NEEDS = eINSTANCE.getViolatedNeeds();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATED_NEEDS__NEEDS = eINSTANCE.getViolatedNeeds_Needs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.AbstractCapability <em>Abstract Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.AbstractCapability
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractCapability()
		 * @generated
		 */
		EClass ABSTRACT_CAPABILITY = eINSTANCE.getAbstractCapability();

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
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__ADDRESSES = eINSTANCE.getCapability_Addresses();

		/**
		 * The meta object literal for the '<em><b>Sub Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__SUB_CAPABILITIES = eINSTANCE.getCapability_SubCapabilities();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__LIFECYCLE = eINSTANCE.getCapability_Lifecycle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityReferenceImpl <em>Capability Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityReferenceImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityReference()
		 * @generated
		 */
		EClass CAPABILITY_REFERENCE = eINSTANCE.getCapabilityReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REFERENCE__TARGET = eINSTANCE.getCapabilityReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityDomainImpl <em>Capability Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityDomainImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityDomain()
		 * @generated
		 */
		EClass CAPABILITY_DOMAIN = eINSTANCE.getCapabilityDomain();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DOMAIN__CAPABILITIES = eINSTANCE.getCapabilityDomain_Capabilities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.AddressedConcernsImpl <em>Addressed Concerns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.AddressedConcernsImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAddressedConcerns()
		 * @generated
		 */
		EClass ADDRESSED_CONCERNS = eINSTANCE.getAddressedConcerns();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSED_CONCERNS__CONCERNS = eINSTANCE.getAddressedConcerns_Concerns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl <em>Capability Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityDependency()
		 * @generated
		 */
		EClass CAPABILITY_DEPENDENCY = eINSTANCE.getCapabilityDependency();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DEPENDENCY__CAPABILITIES = eINSTANCE.getCapabilityDependency_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEPENDENCY__KIND = eINSTANCE.getCapabilityDependency_Kind();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEPENDENCY__OPTIONAL = eINSTANCE.getCapabilityDependency_Optional();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.AbstractCapabilityProvider <em>Abstract Capability Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.AbstractCapabilityProvider
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractCapabilityProvider()
		 * @generated
		 */
		EClass ABSTRACT_CAPABILITY_PROVIDER = eINSTANCE.getAbstractCapabilityProvider();

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
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER__PROVIDES = eINSTANCE.getCapabilityProvider_Provides();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER__REQUIRES = eINSTANCE.getCapabilityProvider_Requires();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_PROVIDER__LIFECYCLE = eINSTANCE.getCapabilityProvider_Lifecycle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderDomainImpl <em>Capability Provider Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderDomainImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProviderDomain()
		 * @generated
		 */
		EClass CAPABILITY_PROVIDER_DOMAIN = eINSTANCE.getCapabilityProviderDomain();

		/**
		 * The meta object literal for the '<em><b>Capability Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS = eINSTANCE.getCapabilityProviderDomain_CapabilityProviders();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderReferenceImpl <em>Capability Provider Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderReferenceImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityProviderReference()
		 * @generated
		 */
		EClass CAPABILITY_PROVIDER_REFERENCE = eINSTANCE.getCapabilityProviderReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PROVIDER_REFERENCE__TARGET = eINSTANCE.getCapabilityProviderReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ProvidedCapabilityImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProvidedCapability()
		 * @generated
		 */
		EClass PROVIDED_CAPABILITY = eINSTANCE.getProvidedCapability();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_CAPABILITY__CAPABILITY = eINSTANCE.getProvidedCapability_Capability();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.AbstractEvidence <em>Abstract Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.AbstractEvidence
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractEvidence()
		 * @generated
		 */
		EClass ABSTRACT_EVIDENCE = eINSTANCE.getAbstractEvidence();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.EvidenceImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.EvidenceDomainImpl <em>Evidence Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.EvidenceDomainImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getEvidenceDomain()
		 * @generated
		 */
		EClass EVIDENCE_DOMAIN = eINSTANCE.getEvidenceDomain();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_DOMAIN__EVIDENCE = eINSTANCE.getEvidenceDomain_Evidence();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.RequiredCapabilityImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getRequiredCapability()
		 * @generated
		 */
		EClass REQUIRED_CAPABILITY = eINSTANCE.getRequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_CAPABILITY__CAPABILITY = eINSTANCE.getRequiredCapability_Capability();

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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.Undergoer <em>Undergoer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.Undergoer
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getUndergoer()
		 * @generated
		 */
		EClass UNDERGOER = eINSTANCE.getUndergoer();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDERGOER__ROLES = eINSTANCE.getUndergoer_Roles();

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
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ASSIGNMENTS = eINSTANCE.getRole_Assignments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.RoleAssignmentImpl <em>Role Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.RoleAssignmentImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getRoleAssignment()
		 * @generated
		 */
		EClass ROLE_ASSIGNMENT = eINSTANCE.getRoleAssignment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ASSIGNMENT__COMMENT = eINSTANCE.getRoleAssignment_Comment();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ASSIGNMENT__ACTORS = eINSTANCE.getRoleAssignment_Actors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.AbstractActor <em>Abstract Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.AbstractActor
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractActor()
		 * @generated
		 */
		EClass ABSTRACT_ACTOR = eINSTANCE.getAbstractActor();

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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ActorDomainImpl <em>Actor Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ActorDomainImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getActorDomain()
		 * @generated
		 */
		EClass ACTOR_DOMAIN = eINSTANCE.getActorDomain();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_DOMAIN__ACTORS = eINSTANCE.getActorDomain_Actors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.Lifecycle <em>Lifecycle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.Lifecycle
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getLifecycle()
		 * @generated
		 */
		EEnum LIFECYCLE = eINSTANCE.getLifecycle();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.DependencyKind <em>Dependency Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.DependencyKind
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getDependencyKind()
		 * @generated
		 */
		EEnum DEPENDENCY_KIND = eINSTANCE.getDependencyKind();

		/**
		 * The meta object literal for the '<em>Instant</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Instant
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getInstant()
		 * @generated
		 */
		EDataType INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '<em>Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Duration
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getDuration()
		 * @generated
		 */
		EDataType DURATION = eINSTANCE.getDuration();

	}

} //ProductmanagementPackage
