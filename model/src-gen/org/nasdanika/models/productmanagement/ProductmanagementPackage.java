/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.Referrable <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.Referrable
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST = 0;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE___GET_REFERRERS__EREFERENCE = 1;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.TemporalImpl <em>Temporal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.TemporalImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 1;

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
	int PERIOD = 2;

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
	int STRING_IDENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY__ID = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST = REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY___GET_REFERRERS__EREFERENCE = REFERRABLE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ModelElementImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID = STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ICON = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOCUMENTATION = STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_REF = STRING_IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_FORMAT = STRING_IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__URIS = STRING_IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___GET_REFERRERS__EREFERENCE = STRING_IDENTITY___GET_REFERRERS__EREFERENCE;

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
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ICON = MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_REF = MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_FORMAT = MODEL_ELEMENT__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GET_REFERRERS__EREFERENCE = MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

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
	int NAMED_PERIOD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

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
	int PRODUCT_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The feature id for the '<em><b>Resolved Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__RESOLVED_PERSONAS = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITIES = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__RESOLVED_CAPABILITIES = NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITY_PROVIDERS = NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ACTORS = NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Persona Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Resolve Capability Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY = NAMED_PERIOD_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractPersona <em>Abstract Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractPersona
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractPersona()
	 * @generated
	 */
	int ABSTRACT_PERSONA = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__ICON = MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOC_REF = MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOC_FORMAT = MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The number of structural features of the '<em>Abstract Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA___COLLECT__OBJECT_EREFERENCE_ELIST = MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA___GET_REFERRERS__EREFERENCE = MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The feature id for the '<em><b>Resolved Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__RESOLVED_CONCERNS = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Concern Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaDomainImpl <em>Persona Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaDomain()
	 * @generated
	 */
	int PERSONA_DOMAIN = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

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
	 * The feature id for the '<em><b>Resolved Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__RESOLVED_PERSONAS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Persona Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Persona Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Persona Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl <em>Persona Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaReference()
	 * @generated
	 */
	int PERSONA_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__ID = ABSTRACT_PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__ICON = ABSTRACT_PERSONA__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__DOCUMENTATION = ABSTRACT_PERSONA__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__DOC_REF = ABSTRACT_PERSONA__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__DOC_FORMAT = ABSTRACT_PERSONA__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__URIS = ABSTRACT_PERSONA__URIS;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = ABSTRACT_PERSONA___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE___GET_REFERRERS__EREFERENCE = ABSTRACT_PERSONA___GET_REFERRERS__EREFERENCE;

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
	int ABSTRACT_CONCERN = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__ICON = MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOC_REF = MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOC_FORMAT = MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The number of structural features of the '<em>Abstract Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST = MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN___GET_REFERRERS__EREFERENCE = MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ConcernImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The feature id for the '<em><b>All Addressed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ALL_ADDRESSED_BY = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__ICON = ABSTRACT_CONCERN__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__DOCUMENTATION = ABSTRACT_CONCERN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__DOC_REF = ABSTRACT_CONCERN__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__DOC_FORMAT = ABSTRACT_CONCERN__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__URIS = ABSTRACT_CONCERN__URIS;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = ABSTRACT_CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE___GET_REFERRERS__EREFERENCE = ABSTRACT_CONCERN___GET_REFERRERS__EREFERENCE;

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
	int CONCERN_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__CONCERNS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__RESOLVED_CONCERNS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concern Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Concern Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concern Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ICON = CONCERN__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOCUMENTATION = CONCERN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_REF = CONCERN__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_FORMAT = CONCERN__DOC_FORMAT;

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
	 * The feature id for the '<em><b>All Addressed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALL_ADDRESSED_BY = CONCERN__ALL_ADDRESSED_BY;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUPPORTED_BY = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALL_SUPPORTED_BY = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BLOCKED_BY = CONCERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Blocked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALL_BLOCKED_BY = CONCERN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___COLLECT__OBJECT_EREFERENCE_ELIST = CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___GET_REFERRERS__EREFERENCE = CONCERN___GET_REFERRERS__EREFERENCE;

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
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ICON = CONCERN__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DOCUMENTATION = CONCERN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DOC_REF = CONCERN__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DOC_FORMAT = CONCERN__DOC_FORMAT;

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
	 * The feature id for the '<em><b>All Addressed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ALL_ADDRESSED_BY = CONCERN__ALL_ADDRESSED_BY;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__SUPPORTS = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ALL_SUPPORTS = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Violated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__VIOLATED_BY = CONCERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Violated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ALL_VIOLATED_BY = CONCERN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED___COLLECT__OBJECT_EREFERENCE_ELIST = CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED___GET_REFERRERS__EREFERENCE = CONCERN___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_OPERATION_COUNT = CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PainPointImpl <em>Pain Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PainPointImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPainPoint()
	 * @generated
	 */
	int PAIN_POINT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ID = CONCERN__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ICON = CONCERN__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DOCUMENTATION = CONCERN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DOC_REF = CONCERN__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DOC_FORMAT = CONCERN__DOC_FORMAT;

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
	 * The feature id for the '<em><b>All Addressed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ALL_ADDRESSED_BY = CONCERN__ALL_ADDRESSED_BY;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__BLOCKS = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ALL_BLOCKS = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Violates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__VIOLATES = CONCERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Violates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ALL_VIOLATES = CONCERN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pain Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT___COLLECT__OBJECT_EREFERENCE_ELIST = CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT___GET_REFERRERS__EREFERENCE = CONCERN___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Pain Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT_OPERATION_COUNT = CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractCapability <em>Abstract Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractCapability
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractCapability()
	 * @generated
	 */
	int ABSTRACT_CAPABILITY = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__ICON = MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__DOC_REF = MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__DOC_FORMAT = MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The number of structural features of the '<em>Abstract Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST = MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY___GET_REFERRERS__EREFERENCE = MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PERSONAS = NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolved Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RESOLVED_PERSONAS = NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CONCERNS = NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolved Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RESOLVED_CONCERNS = NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ADDRESSES = NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ALL_ADDRESSES = NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SUB_CAPABILITIES = NAMED_PERIOD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DEPENDENCIES = NAMED_PERIOD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DEPENDENTS = NAMED_PERIOD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__LIFECYCLE = NAMED_PERIOD_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = NAMED_PERIOD_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Persona Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Resolve Concern Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = NAMED_PERIOD_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = NAMED_PERIOD_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityReferenceImpl <em>Capability Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityReference()
	 * @generated
	 */
	int CAPABILITY_REFERENCE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__ICON = MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__DOC_REF = MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__DOC_FORMAT = MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE___GET_REFERRERS__EREFERENCE = MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Capability Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REFERENCE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityDomainImpl <em>Capability Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityDomain()
	 * @generated
	 */
	int CAPABILITY_DOMAIN = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

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
	 * The feature id for the '<em><b>Resolved Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Capability Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capability Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DOMAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl <em>Capability Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapabilityDependency()
	 * @generated
	 */
	int CAPABILITY_DEPENDENCY = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__ID = CAPABILITY_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__ICON = CAPABILITY_REFERENCE__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__DOCUMENTATION = CAPABILITY_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__DOC_REF = CAPABILITY_REFERENCE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__DOC_FORMAT = CAPABILITY_REFERENCE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__URIS = CAPABILITY_REFERENCE__URIS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__TARGET = CAPABILITY_REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__KIND = CAPABILITY_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY__QUALIFIER = CAPABILITY_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY_FEATURE_COUNT = CAPABILITY_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY___COLLECT__OBJECT_EREFERENCE_ELIST = CAPABILITY_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY___GET_REFERRERS__EREFERENCE = CAPABILITY_REFERENCE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Capability Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEPENDENCY_OPERATION_COUNT = CAPABILITY_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractCapabilityProvider <em>Abstract Capability Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractCapabilityProvider
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractCapabilityProvider()
	 * @generated
	 */
	int ABSTRACT_CAPABILITY_PROVIDER = 24;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_PROVIDER___COLLECT__OBJECT_EREFERENCE_ELIST = STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAPABILITY_PROVIDER___GET_REFERRERS__EREFERENCE = STRING_IDENTITY___GET_REFERRERS__EREFERENCE;

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
	int CAPABILITY_PROVIDER = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

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
	int CAPABILITY_PROVIDER_DOMAIN = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_DOMAIN___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

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
	int CAPABILITY_PROVIDER_REFERENCE = 27;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = ABSTRACT_CAPABILITY_PROVIDER___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_REFERENCE___GET_REFERRERS__EREFERENCE = ABSTRACT_CAPABILITY_PROVIDER___GET_REFERRERS__EREFERENCE;

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
	int PROVIDED_CAPABILITY = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

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
	int ABSTRACT_EVIDENCE = 29;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVIDENCE___COLLECT__OBJECT_EREFERENCE_ELIST = STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVIDENCE___GET_REFERRERS__EREFERENCE = STRING_IDENTITY___GET_REFERRERS__EREFERENCE;

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
	int EVIDENCE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

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
	int EVIDENCE_DOMAIN = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_DOMAIN___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

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
	int REQUIRED_CAPABILITY = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

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
	int VERSION = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

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
	int UNDERGOER = 34;

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
	int ROLE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

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
	int ROLE_ASSIGNMENT = 36;

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
	int ABSTRACT_ACTOR = 37;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___COLLECT__OBJECT_EREFERENCE_ELIST = STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR___GET_REFERRERS__EREFERENCE = STRING_IDENTITY___GET_REFERRERS__EREFERENCE;

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
	int ACTOR = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ICON = NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOCUMENTATION = NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOC_REF = NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOC_FORMAT = NAMED_PERIOD__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_REFERRERS__EREFERENCE = NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

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
	int ACTOR_DOMAIN = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

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
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_DOMAIN___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

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
	int LIFECYCLE = 40;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.DependencyKind <em>Dependency Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.DependencyKind
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getDependencyKind()
	 * @generated
	 */
	int DEPENDENCY_KIND = 41;

	/**
	 * The meta object id for the '<em>Instant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 42;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Duration
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 43;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see org.nasdanika.models.productmanagement.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.productmanagement.Referrable#collect(java.lang.Object, org.eclipse.emf.ecore.EReference, org.eclipse.emf.common.util.EList) <em>Collect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect</em>' operation.
	 * @see org.nasdanika.models.productmanagement.Referrable#collect(java.lang.Object, org.eclipse.emf.ecore.EReference, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getReferrable__Collect__Object_EReference_EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.productmanagement.Referrable#getReferrers(org.eclipse.emf.ecore.EReference) <em>Get Referrers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referrers</em>' operation.
	 * @see org.nasdanika.models.productmanagement.Referrable#getReferrers(org.eclipse.emf.ecore.EReference)
	 * @generated
	 */
	EOperation getReferrable__GetReferrers__EReference();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getIcon()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Icon();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getDocRef <em>Doc Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Ref</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getDocRef()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_DocRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getDocFormat <em>Doc Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Format</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getDocFormat()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_DocFormat();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.PersonaDomain#getResolvedPersonas <em>Resolved Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.PersonaDomain#getResolvedPersonas()
	 * @see #getPersonaDomain()
	 * @generated
	 */
	EReference getPersonaDomain_ResolvedPersonas();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.productmanagement.PersonaDomain#resolvePersonaReference(org.nasdanika.models.productmanagement.AbstractPersona) <em>Resolve Persona Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Persona Reference</em>' operation.
	 * @see org.nasdanika.models.productmanagement.PersonaDomain#resolvePersonaReference(org.nasdanika.models.productmanagement.AbstractPersona)
	 * @generated
	 */
	EOperation getPersonaDomain__ResolvePersonaReference__AbstractPersona();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Concern#getAllAddressedBy <em>All Addressed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Addressed By</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getAllAddressedBy()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_AllAddressedBy();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ConcernDomain#getResolvedConcerns <em>Resolved Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Concerns</em>'.
	 * @see org.nasdanika.models.productmanagement.ConcernDomain#getResolvedConcerns()
	 * @see #getConcernDomain()
	 * @generated
	 */
	EReference getConcernDomain_ResolvedConcerns();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.productmanagement.ConcernDomain#resolveConcernReference(org.nasdanika.models.productmanagement.AbstractConcern) <em>Resolve Concern Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Concern Reference</em>' operation.
	 * @see org.nasdanika.models.productmanagement.ConcernDomain#resolveConcernReference(org.nasdanika.models.productmanagement.AbstractConcern)
	 * @generated
	 */
	EOperation getConcernDomain__ResolveConcernReference__AbstractConcern();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Goal#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported By</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getSupportedBy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_SupportedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Goal#getAllSupportedBy <em>All Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Supported By</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getAllSupportedBy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_AllSupportedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Goal#getBlockedBy <em>Blocked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocked By</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getBlockedBy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_BlockedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Goal#getAllBlockedBy <em>All Blocked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Blocked By</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getAllBlockedBy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_AllBlockedBy();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Need#getAllSupports <em>All Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Supports</em>'.
	 * @see org.nasdanika.models.productmanagement.Need#getAllSupports()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_AllSupports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Need#getViolatedBy <em>Violated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Violated By</em>'.
	 * @see org.nasdanika.models.productmanagement.Need#getViolatedBy()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_ViolatedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Need#getAllViolatedBy <em>All Violated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Violated By</em>'.
	 * @see org.nasdanika.models.productmanagement.Need#getAllViolatedBy()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_AllViolatedBy();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.PainPoint#getAllBlocks <em>All Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Blocks</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint#getAllBlocks()
	 * @see #getPainPoint()
	 * @generated
	 */
	EReference getPainPoint_AllBlocks();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.PainPoint#getAllViolates <em>All Violates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Violates</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint#getAllViolates()
	 * @see #getPainPoint()
	 * @generated
	 */
	EReference getPainPoint_AllViolates();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Capability#getAllAddresses <em>All Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Addresses</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getAllAddresses()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_AllAddresses();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Capability#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getDependencies()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Dependencies();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Capability#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependents</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getDependents()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Dependents();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.CapabilityDomain#getResolvedCapabilities <em>Resolved Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDomain#getResolvedCapabilities()
	 * @see #getCapabilityDomain()
	 * @generated
	 */
	EReference getCapabilityDomain_ResolvedCapabilities();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.productmanagement.CapabilityDomain#resolveCapabilityReference(org.nasdanika.models.productmanagement.AbstractCapability) <em>Resolve Capability Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Capability Reference</em>' operation.
	 * @see org.nasdanika.models.productmanagement.CapabilityDomain#resolveCapabilityReference(org.nasdanika.models.productmanagement.AbstractCapability)
	 * @generated
	 */
	EOperation getCapabilityDomain__ResolveCapabilityReference__AbstractCapability();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.CapabilityDependency#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.nasdanika.models.productmanagement.CapabilityDependency#getQualifier()
	 * @see #getCapabilityDependency()
	 * @generated
	 */
	EAttribute getCapabilityDependency_Qualifier();

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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.Referrable <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.Referrable
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Collect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST = eINSTANCE.getReferrable__Collect__Object_EReference_EList();

		/**
		 * The meta object literal for the '<em><b>Get Referrers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERRABLE___GET_REFERRERS__EREFERENCE = eINSTANCE.getReferrable__GetReferrers__EReference();

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
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ICON = eINSTANCE.getModelElement_Icon();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DOCUMENTATION = eINSTANCE.getModelElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Doc Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DOC_REF = eINSTANCE.getModelElement_DocRef();

		/**
		 * The meta object literal for the '<em><b>Doc Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DOC_FORMAT = eINSTANCE.getModelElement_DocFormat();

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
		 * The meta object literal for the '<em><b>Resolved Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA_DOMAIN__RESOLVED_PERSONAS = eINSTANCE.getPersonaDomain_ResolvedPersonas();

		/**
		 * The meta object literal for the '<em><b>Resolve Persona Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONA_DOMAIN___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = eINSTANCE.getPersonaDomain__ResolvePersonaReference__AbstractPersona();

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
		 * The meta object literal for the '<em><b>All Addressed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__ALL_ADDRESSED_BY = eINSTANCE.getConcern_AllAddressedBy();

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
		 * The meta object literal for the '<em><b>Resolved Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN_DOMAIN__RESOLVED_CONCERNS = eINSTANCE.getConcernDomain_ResolvedConcerns();

		/**
		 * The meta object literal for the '<em><b>Resolve Concern Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONCERN_DOMAIN___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = eINSTANCE.getConcernDomain__ResolveConcernReference__AbstractConcern();

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
		 * The meta object literal for the '<em><b>Supported By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SUPPORTED_BY = eINSTANCE.getGoal_SupportedBy();

		/**
		 * The meta object literal for the '<em><b>All Supported By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ALL_SUPPORTED_BY = eINSTANCE.getGoal_AllSupportedBy();

		/**
		 * The meta object literal for the '<em><b>Blocked By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__BLOCKED_BY = eINSTANCE.getGoal_BlockedBy();

		/**
		 * The meta object literal for the '<em><b>All Blocked By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ALL_BLOCKED_BY = eINSTANCE.getGoal_AllBlockedBy();

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
		 * The meta object literal for the '<em><b>All Supports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__ALL_SUPPORTS = eINSTANCE.getNeed_AllSupports();

		/**
		 * The meta object literal for the '<em><b>Violated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__VIOLATED_BY = eINSTANCE.getNeed_ViolatedBy();

		/**
		 * The meta object literal for the '<em><b>All Violated By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__ALL_VIOLATED_BY = eINSTANCE.getNeed_AllViolatedBy();

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
		 * The meta object literal for the '<em><b>All Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__ALL_BLOCKS = eINSTANCE.getPainPoint_AllBlocks();

		/**
		 * The meta object literal for the '<em><b>Violates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__VIOLATES = eINSTANCE.getPainPoint_Violates();

		/**
		 * The meta object literal for the '<em><b>All Violates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__ALL_VIOLATES = eINSTANCE.getPainPoint_AllViolates();

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
		 * The meta object literal for the '<em><b>All Addresses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__ALL_ADDRESSES = eINSTANCE.getCapability_AllAddresses();

		/**
		 * The meta object literal for the '<em><b>Sub Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__SUB_CAPABILITIES = eINSTANCE.getCapability_SubCapabilities();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__DEPENDENCIES = eINSTANCE.getCapability_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Dependents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__DEPENDENTS = eINSTANCE.getCapability_Dependents();

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
		 * The meta object literal for the '<em><b>Resolved Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES = eINSTANCE.getCapabilityDomain_ResolvedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Resolve Capability Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPABILITY_DOMAIN___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY = eINSTANCE.getCapabilityDomain__ResolveCapabilityReference__AbstractCapability();

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
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEPENDENCY__KIND = eINSTANCE.getCapabilityDependency_Kind();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_DEPENDENCY__QUALIFIER = eINSTANCE.getCapabilityDependency_Qualifier();

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
