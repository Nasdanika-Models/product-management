/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.capability.CapabilityPackage;

import org.nasdanika.models.nxcore.NxcorePackage;

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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl <em>Product Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProductModelImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getProductModel()
	 * @generated
	 */
	int PRODUCT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__PERSONAS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__RESOLVED_PERSONAS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITIES = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__RESOLVED_CAPABILITIES = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__CAPABILITY_PROVIDERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL__ACTORS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Persona Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Resolve Capability Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MODEL_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.AbstractPersona <em>Abstract Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.AbstractPersona
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getAbstractPersona()
	 * @generated
	 */
	int ABSTRACT_PERSONA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The number of structural features of the '<em>Abstract Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERSONA_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__CONCERNS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__RESOLVED_CONCERNS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Concern Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaDomainImpl <em>Persona Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaDomainImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaDomain()
	 * @generated
	 */
	int PERSONA_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__PERSONAS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN__RESOLVED_PERSONAS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Persona Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Persona Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Persona Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_DOMAIN_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl <em>Persona Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getPersonaReference()
	 * @generated
	 */
	int PERSONA_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__ID = ABSTRACT_PERSONA__ID;

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
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__DOC_CONTENTS = ABSTRACT_PERSONA__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__DOC_SECTIONS = ABSTRACT_PERSONA__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__MARKERS = ABSTRACT_PERSONA__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_REFERENCE__ICON = ABSTRACT_PERSONA__ICON;

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
	int ABSTRACT_CONCERN = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The number of structural features of the '<em>Abstract Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONCERN_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Addressed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ADDRESSED_BY = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Addressed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ALL_ADDRESSED_BY = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__SUPPORTS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ALL_SUPPORTS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__SUPPORTED_BY = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ALL_SUPPORTED_BY = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ConcernReferenceImpl <em>Concern Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ConcernReferenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getConcernReference()
	 * @generated
	 */
	int CONCERN_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__ID = ABSTRACT_CONCERN__ID;

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
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__DOC_CONTENTS = ABSTRACT_CONCERN__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__DOC_SECTIONS = ABSTRACT_CONCERN__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__MARKERS = ABSTRACT_CONCERN__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_REFERENCE__ICON = ABSTRACT_CONCERN__ICON;

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
	int CONCERN_DOMAIN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__CONCERNS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN__RESOLVED_CONCERNS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concern Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Concern Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concern Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_DOMAIN_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.GoalImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 9;

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
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_CONTENTS = CONCERN__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DOC_SECTIONS = CONCERN__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MARKERS = CONCERN__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ICON = CONCERN__ICON;

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
	 * The feature id for the '<em><b>Supports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUPPORTS = CONCERN__SUPPORTS;

	/**
	 * The feature id for the '<em><b>All Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALL_SUPPORTS = CONCERN__ALL_SUPPORTS;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUPPORTED_BY = CONCERN__SUPPORTED_BY;

	/**
	 * The feature id for the '<em><b>All Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALL_SUPPORTED_BY = CONCERN__ALL_SUPPORTED_BY;

	/**
	 * The feature id for the '<em><b>Blocked By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BLOCKED_BY = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Blocked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALL_BLOCKED_BY = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 2;

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
	int NEED = 10;

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
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DOC_CONTENTS = CONCERN__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DOC_SECTIONS = CONCERN__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__MARKERS = CONCERN__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ICON = CONCERN__ICON;

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
	int NEED__SUPPORTS = CONCERN__SUPPORTS;

	/**
	 * The feature id for the '<em><b>All Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ALL_SUPPORTS = CONCERN__ALL_SUPPORTS;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__SUPPORTED_BY = CONCERN__SUPPORTED_BY;

	/**
	 * The feature id for the '<em><b>All Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ALL_SUPPORTED_BY = CONCERN__ALL_SUPPORTED_BY;

	/**
	 * The feature id for the '<em><b>Violated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__VIOLATED_BY = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Violated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ALL_VIOLATED_BY = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 2;

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
	int PAIN_POINT = 11;

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
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DOC_CONTENTS = CONCERN__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DOC_SECTIONS = CONCERN__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__MARKERS = CONCERN__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ICON = CONCERN__ICON;

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
	 * The feature id for the '<em><b>Supports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__SUPPORTS = CONCERN__SUPPORTS;

	/**
	 * The feature id for the '<em><b>All Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ALL_SUPPORTS = CONCERN__ALL_SUPPORTS;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__SUPPORTED_BY = CONCERN__SUPPORTED_BY;

	/**
	 * The feature id for the '<em><b>All Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ALL_SUPPORTED_BY = CONCERN__ALL_SUPPORTED_BY;

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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = CapabilityPackage.CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOCUMENTATION = CapabilityPackage.CAPABILITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_REF = CapabilityPackage.CAPABILITY__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_FORMAT = CapabilityPackage.CAPABILITY__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_CONTENTS = CapabilityPackage.CAPABILITY__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DOC_SECTIONS = CapabilityPackage.CAPABILITY__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MARKERS = CapabilityPackage.CAPABILITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ICON = CapabilityPackage.CAPABILITY__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__URIS = CapabilityPackage.CAPABILITY__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = CapabilityPackage.CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DURATION = CapabilityPackage.CAPABILITY__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__START = CapabilityPackage.CAPABILITY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__END = CapabilityPackage.CAPABILITY__END;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EVIDENCE = CapabilityPackage.CAPABILITY__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ACCESS_CONTROL = CapabilityPackage.CAPABILITY__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ENCRYPTED_FEATURES = CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__VARIANT_FEATURES = CapabilityPackage.CAPABILITY__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SIGNATURES = CapabilityPackage.CAPABILITY__SIGNATURES;

	/**
	 * The feature id for the '<em><b>Lifecycles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__LIFECYCLES = CapabilityPackage.CAPABILITY__LIFECYCLES;

	/**
	 * The feature id for the '<em><b>Sojourns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SOJOURNS = CapabilityPackage.CAPABILITY__SOJOURNS;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CURRENT = CapabilityPackage.CAPABILITY__CURRENT;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DEPENDENCIES = CapabilityPackage.CAPABILITY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DEPENDENTS = CapabilityPackage.CAPABILITY__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PERSONAS = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RESOLVED_PERSONAS = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CONCERNS = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__RESOLVED_CONCERNS = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ADDRESSES = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ALL_ADDRESSES = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = CapabilityPackage.CAPABILITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST = CapabilityPackage.CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___GET_REFERRERS__EREFERENCE = CapabilityPackage.CAPABILITY___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Persona Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = CapabilityPackage.CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Resolve Concern Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = CapabilityPackage.CAPABILITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = CapabilityPackage.CAPABILITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CompositeCapabilityImpl <em>Composite Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CompositeCapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCompositeCapability()
	 * @generated
	 */
	int COMPOSITE_CAPABILITY = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DOCUMENTATION = CAPABILITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DOC_REF = CAPABILITY__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DOC_FORMAT = CAPABILITY__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DOC_CONTENTS = CAPABILITY__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DOC_SECTIONS = CAPABILITY__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__MARKERS = CAPABILITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__ICON = CAPABILITY__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__URIS = CAPABILITY__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DURATION = CAPABILITY__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__START = CAPABILITY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__END = CAPABILITY__END;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__EVIDENCE = CAPABILITY__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__ACCESS_CONTROL = CAPABILITY__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__ENCRYPTED_FEATURES = CAPABILITY__ENCRYPTED_FEATURES;

	/**
	 * The feature id for the '<em><b>Variant Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__VARIANT_FEATURES = CAPABILITY__VARIANT_FEATURES;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__SIGNATURES = CAPABILITY__SIGNATURES;

	/**
	 * The feature id for the '<em><b>Lifecycles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__LIFECYCLES = CAPABILITY__LIFECYCLES;

	/**
	 * The feature id for the '<em><b>Sojourns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__SOJOURNS = CAPABILITY__SOJOURNS;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__CURRENT = CAPABILITY__CURRENT;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DEPENDENCIES = CAPABILITY__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__DEPENDENTS = CAPABILITY__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__PERSONAS = CAPABILITY__PERSONAS;

	/**
	 * The feature id for the '<em><b>Resolved Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__RESOLVED_PERSONAS = CAPABILITY__RESOLVED_PERSONAS;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__CONCERNS = CAPABILITY__CONCERNS;

	/**
	 * The feature id for the '<em><b>Resolved Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__RESOLVED_CONCERNS = CAPABILITY__RESOLVED_CONCERNS;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__ADDRESSES = CAPABILITY__ADDRESSES;

	/**
	 * The feature id for the '<em><b>All Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__ALL_ADDRESSES = CAPABILITY__ALL_ADDRESSES;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__CAPABILITIES = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY__RESOLVED_CAPABILITIES = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST = CAPABILITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY___GET_REFERRERS__EREFERENCE = CAPABILITY___GET_REFERRERS__EREFERENCE;

	/**
	 * The operation id for the '<em>Resolve Persona Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA = CAPABILITY___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA;

	/**
	 * The operation id for the '<em>Resolve Concern Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN = CAPABILITY___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN;

	/**
	 * The operation id for the '<em>Resolve Capability Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>Instant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 14;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Duration
	 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 15;


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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Concern#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supports</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getSupports()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_Supports();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Concern#getAllSupports <em>All Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Supports</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getAllSupports()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_AllSupports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Concern#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported By</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getSupportedBy()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_SupportedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Concern#getAllSupportedBy <em>All Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Supported By</em>'.
	 * @see org.nasdanika.models.productmanagement.Concern#getAllSupportedBy()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_AllSupportedBy();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Goal#getBlockedBy <em>Blocked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocked By</em>'.
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
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CompositeCapability <em>Composite Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Capability</em>'.
	 * @see org.nasdanika.models.productmanagement.CompositeCapability
	 * @generated
	 */
	EClass getCompositeCapability();

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
		 * The meta object literal for the '<em><b>Supports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__SUPPORTS = eINSTANCE.getConcern_Supports();

		/**
		 * The meta object literal for the '<em><b>All Supports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__ALL_SUPPORTS = eINSTANCE.getConcern_AllSupports();

		/**
		 * The meta object literal for the '<em><b>Supported By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__SUPPORTED_BY = eINSTANCE.getConcern_SupportedBy();

		/**
		 * The meta object literal for the '<em><b>All Supported By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__ALL_SUPPORTED_BY = eINSTANCE.getConcern_AllSupportedBy();

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
		 * The meta object literal for the '<em><b>Blocked By</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CompositeCapabilityImpl <em>Composite Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CompositeCapabilityImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductmanagementPackageImpl#getCompositeCapability()
		 * @generated
		 */
		EClass COMPOSITE_CAPABILITY = eINSTANCE.getCompositeCapability();

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
