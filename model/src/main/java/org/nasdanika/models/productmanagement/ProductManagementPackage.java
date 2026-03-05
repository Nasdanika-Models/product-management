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
 * An Ecore model for the product management domain covering personas, needs, goals, pain points,
 * products, features, capabilities, editions, subscriptions, value propositions, market segments,
 * hypotheses, and more.
 * 
 * The model supports fine-grained product management and user education, allowing both the product
 * builder and product users to achieve maximum synergetic value. It can also be used as a runtime or
 * build artifact to tie product usage to the model and generate reports such as popular features.
 * 
 * Key domain areas:
 * - Persona: fictional but research-based representation of target users with behaviors, actions, needs, goals, and pain points
 * - Product: portfolios, products, editions, features, capabilities, and capability providers
 * - Commercial: subscriptions and pricing
 * - Versioning: versions and releases
 * - Value: value propositions, evidence, alternatives, and outcome metrics
 * - Market: segments, industries, geographies, company sizes, channels, and ideal customer profiles
 * - Hypothesis: testable beliefs driving product decisions
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.productmanagement.ProductManagementFactory
 * @model kind="package"
 * @generated
 */
public interface ProductManagementPackage extends EPackage {
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
	String eNS_URI = "ecore://nasdanika.org/models/productmanagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.productmanagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductManagementPackage eINSTANCE = org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ModelElementImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PersonaImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__AGE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ROLE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Experience Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__EXPERIENCE_LEVEL = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__WORK_ENVIRONMENT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tools Used</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__TOOLS_USED = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attitudes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ATTITUDES = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__BEHAVIORS = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ACTIONS = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__GOALS = MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pain Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__PAIN_POINTS = MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.BehaviorImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CATEGORY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__RELATED_NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Pain Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__RELATED_PAIN_POINTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__RELATED_GOALS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ActionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ORDER = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RELATED_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RELATED_FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.NeedImpl <em>Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.NeedImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Supported Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__SUPPORTED_GOALS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED__RELATED_NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.GoalImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RELATED_GOALS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.PainPointImpl <em>Pain Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.PainPointImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getPainPoint()
	 * @generated
	 */
	int PAIN_POINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Violated Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__VIOLATED_NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocked Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__BLOCKED_GOALS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Pain Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT__RELATED_PAIN_POINTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pain Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pain Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIN_POINT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProductPortfolioImpl <em>Product Portfolio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProductPortfolioImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getProductPortfolio()
	 * @generated
	 */
	int PRODUCT_PORTFOLIO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PORTFOLIO__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PORTFOLIO__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PORTFOLIO__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PORTFOLIO__PRODUCTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Portfolio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PORTFOLIO_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Portfolio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PORTFOLIO_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProductImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Editions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__EDITIONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TARGET_PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VERSIONS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RELEASES = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.EditionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Included Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__INCLUDED_FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Included Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__INCLUDED_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available Geographies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__AVAILABLE_GEOGRAPHIES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__AVAILABLE_CHANNELS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PROVIDERS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__VERSIONS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.FeatureImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = CAPABILITY__ID;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROVIDERS = CAPABILITY__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSIONS = CAPABILITY__VERSIONS;

	/**
	 * The feature id for the '<em><b>Addressed Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ADDRESSED_NEEDS = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supported Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPPORTED_GOALS = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Addressed Pain Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ADDRESSED_PAIN_POINTS = CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Persona Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PERSONA_ASSOCIATIONS = CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__USED_CAPABILITIES = CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.FeaturePersonaAssociationImpl <em>Feature Persona Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.FeaturePersonaAssociationImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getFeaturePersonaAssociation()
	 * @generated
	 */
	int FEATURE_PERSONA_ASSOCIATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PERSONA_ASSOCIATION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PERSONA_ASSOCIATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PERSONA_ASSOCIATION__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PERSONA_ASSOCIATION__PERSONA = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Persona Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PERSONA_ASSOCIATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Persona Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PERSONA_ASSOCIATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl <em>Capability Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getCapabilityProvider()
	 * @generated
	 */
	int CAPABILITY_PROVIDER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER__ID = MODEL_ELEMENT__ID;

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
	 * The number of structural features of the '<em>Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Capability Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PROVIDER_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.VersionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Version Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_SCHEME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_STRING = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DATE = MODEL_ELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ReleaseImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__VERSION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RELEASE_DATE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__STATUS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Included Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__INCLUDED_FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.SubscriptionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Billing Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__BILLING_CYCLE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pricing Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PRICING_MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Renewal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__AUTO_RENEWAL = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__EDITIONS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SERVICE_LEVELS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ServiceLevelImpl <em>Service Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ServiceLevelImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getServiceLevel()
	 * @generated
	 */
	int SERVICE_LEVEL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__METRIC = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__VALUE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl <em>Value Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ValuePropositionImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getValueProposition()
	 * @generated
	 */
	int VALUE_PROPOSITION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__STATEMENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__TARGET_PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Addressed Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__ADDRESSED_NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__SUPPORTED_GOALS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mitigated Pain Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__MITIGATED_PAIN_POINTS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enabling Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__ENABLING_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Packaged In Editions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__PACKAGED_IN_EDITIONS = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Differentiated From Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__SUPPORTING_EVIDENCE = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__TARGET_SEGMENTS = MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Value Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Value Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.EvidenceImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Evidence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__EVIDENCE_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measured Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__MEASURED_METRICS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collected In Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__COLLECTED_IN_SEGMENTS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.OutcomeMetricImpl <em>Outcome Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.OutcomeMetricImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getOutcomeMetric()
	 * @generated
	 */
	int OUTCOME_METRIC = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_METRIC__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_METRIC__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_METRIC__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_METRIC__UNIT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_METRIC__TARGET_VALUE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Outcome Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_METRIC_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Outcome Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_METRIC_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.AlternativeImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Alternative Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ALTERNATIVE_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl <em>Market Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.MarketSegmentImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getMarketSegment()
	 * @generated
	 */
	int MARKET_SEGMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Segment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__SEGMENT_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__TARGET_PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Industries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__INDUSTRIES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geographies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__GEOGRAPHIES = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Company Sizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__COMPANY_SIZES = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__CHANNELS = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ideal Customer Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Market Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Market Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.IndustryImpl <em>Industry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.IndustryImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getIndustry()
	 * @generated
	 */
	int INDUSTRY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY__CODE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulatory Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY__REGULATORY_CONSTRAINTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Industry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Industry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.GeographyImpl <em>Geography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.GeographyImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getGeography()
	 * @generated
	 */
	int GEOGRAPHY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__REGION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__COUNTRY = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__STATE_PROVINCE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Residency Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__DATA_RESIDENCY_REGION = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Regulatory Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY__REGULATORY_CONSTRAINTS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Geography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Geography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHY_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.CompanySizeImpl <em>Company Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.CompanySizeImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getCompanySize()
	 * @generated
	 */
	int COMPANY_SIZE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_SIZE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_SIZE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_SIZE__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Employee Band</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_SIZE__EMPLOYEE_BAND = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revenue Band</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_SIZE__REVENUE_BAND = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Company Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_SIZE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Company Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_SIZE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ChannelImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl <em>Ideal Customer Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getIdealCustomerProfile()
	 * @generated
	 */
	int IDEAL_CUSTOMER_PROFILE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Target Industries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Company Sizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Geographies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tech Stack</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__TECH_STACK = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ideal Customer Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ideal Customer Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CUSTOMER_PROFILE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.RegulatoryConstraintImpl <em>Regulatory Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.RegulatoryConstraintImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getRegulatoryConstraint()
	 * @generated
	 */
	int REGULATORY_CONSTRAINT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_CONSTRAINT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_CONSTRAINT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_CONSTRAINT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_CONSTRAINT__REGULATION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Regulatory Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_CONSTRAINT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Regulatory Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATORY_CONSTRAINT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl <em>Hypothesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.HypothesisImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getHypothesis()
	 * @generated
	 */
	int HYPOTHESIS = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__STATEMENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__STATUS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__ASSUMPTIONS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__RISKS = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__OWNER = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__CREATED_AT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__LAST_UPDATED_AT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Personas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__TARGET_PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Linked Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__LINKED_NEEDS = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Linked Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__LINKED_GOALS = MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Linked Pain Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__LINKED_PAIN_POINTS = MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Enabled By Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__ENABLED_BY_CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Supports Value Propositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS = MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__EVIDENCE = MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Success Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS__SUCCESS_METRICS = MODEL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Hypothesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPOTHESIS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getProductManagementModel()
	 * @generated
	 */
	int PRODUCT_MANAGEMENT_MODEL = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__PERSONAS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfolios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__PRODUCTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__CAPABILITIES = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Propositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__EVIDENCE = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Outcome Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS = MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Market Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS = MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hypotheses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL__HYPOTHESES = MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MANAGEMENT_MODEL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.GoalType <em>Goal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.GoalType
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getGoalType()
	 * @generated
	 */
	int GOAL_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.ReleaseStatus <em>Release Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.ReleaseStatus
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getReleaseStatus()
	 * @generated
	 */
	int RELEASE_STATUS = 32;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.productmanagement.HypothesisStatus <em>Hypothesis Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.productmanagement.HypothesisStatus
	 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getHypothesisStatus()
	 * @generated
	 */
	int HYPOTHESIS_STATUS = 33;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ModelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.productmanagement.ModelElement#getId()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Id();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Persona#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getAge()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Persona#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getRole()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Persona#getExperienceLevel <em>Experience Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience Level</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getExperienceLevel()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_ExperienceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Persona#getWorkEnvironment <em>Work Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Environment</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getWorkEnvironment()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_WorkEnvironment();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.productmanagement.Persona#getToolsUsed <em>Tools Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tools Used</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getToolsUsed()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_ToolsUsed();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.productmanagement.Persona#getAttitudes <em>Attitudes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attitudes</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getAttitudes()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Attitudes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getBehaviors()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getActions()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getNeeds()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Needs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getGoals()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Persona#getPainPoints <em>Pain Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pain Points</em>'.
	 * @see org.nasdanika.models.productmanagement.Persona#getPainPoints()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_PainPoints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.nasdanika.models.productmanagement.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Behavior#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.nasdanika.models.productmanagement.Behavior#getCategory()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Category();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Behavior#getRelatedNeeds <em>Related Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.Behavior#getRelatedNeeds()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_RelatedNeeds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Behavior#getRelatedPainPoints <em>Related Pain Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Pain Points</em>'.
	 * @see org.nasdanika.models.productmanagement.Behavior#getRelatedPainPoints()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_RelatedPainPoints();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Behavior#getRelatedGoals <em>Related Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.Behavior#getRelatedGoals()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_RelatedGoals();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.nasdanika.models.productmanagement.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Action#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.nasdanika.models.productmanagement.Action#getOrder()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Order();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Action#getRelatedCapabilities <em>Related Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.Action#getRelatedCapabilities()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_RelatedCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Action#getRelatedFeatures <em>Related Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Features</em>'.
	 * @see org.nasdanika.models.productmanagement.Action#getRelatedFeatures()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_RelatedFeatures();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Need#getSupportedGoals <em>Supported Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.Need#getSupportedGoals()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_SupportedGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Need#getRelatedNeeds <em>Related Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.Need#getRelatedNeeds()
	 * @see #getNeed()
	 * @generated
	 */
	EReference getNeed_RelatedNeeds();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Goal#getGoalType <em>Goal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Type</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getGoalType()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_GoalType();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Goal#getRelatedGoals <em>Related Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.Goal#getRelatedGoals()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_RelatedGoals();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.PainPoint#getViolatedNeeds <em>Violated Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Violated Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint#getViolatedNeeds()
	 * @see #getPainPoint()
	 * @generated
	 */
	EReference getPainPoint_ViolatedNeeds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.PainPoint#getBlockedGoals <em>Blocked Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocked Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint#getBlockedGoals()
	 * @see #getPainPoint()
	 * @generated
	 */
	EReference getPainPoint_BlockedGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.PainPoint#getRelatedPainPoints <em>Related Pain Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Pain Points</em>'.
	 * @see org.nasdanika.models.productmanagement.PainPoint#getRelatedPainPoints()
	 * @see #getPainPoint()
	 * @generated
	 */
	EReference getPainPoint_RelatedPainPoints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ProductPortfolio <em>Product Portfolio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Portfolio</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductPortfolio
	 * @generated
	 */
	EClass getProductPortfolio();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductPortfolio#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductPortfolio#getProducts()
	 * @see #getProductPortfolio()
	 * @generated
	 */
	EReference getProductPortfolio_Products();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.nasdanika.models.productmanagement.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Product#getEditions <em>Editions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editions</em>'.
	 * @see org.nasdanika.models.productmanagement.Product#getEditions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Editions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.nasdanika.models.productmanagement.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Product#getTargetPersonas <em>Target Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.Product#getTargetPersonas()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_TargetPersonas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Product#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.nasdanika.models.productmanagement.Product#getVersions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Product#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.nasdanika.models.productmanagement.Product#getReleases()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Releases();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see org.nasdanika.models.productmanagement.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Edition#getIncludedFeatures <em>Included Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Features</em>'.
	 * @see org.nasdanika.models.productmanagement.Edition#getIncludedFeatures()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_IncludedFeatures();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Edition#getIncludedCapabilities <em>Included Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.Edition#getIncludedCapabilities()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_IncludedCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Edition#getAvailableGeographies <em>Available Geographies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Geographies</em>'.
	 * @see org.nasdanika.models.productmanagement.Edition#getAvailableGeographies()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_AvailableGeographies();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Edition#getAvailableChannels <em>Available Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Channels</em>'.
	 * @see org.nasdanika.models.productmanagement.Edition#getAvailableChannels()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_AvailableChannels();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.nasdanika.models.productmanagement.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Feature#getAddressedNeeds <em>Addressed Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addressed Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.Feature#getAddressedNeeds()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AddressedNeeds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Feature#getSupportedGoals <em>Supported Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.Feature#getSupportedGoals()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SupportedGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Feature#getAddressedPainPoints <em>Addressed Pain Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addressed Pain Points</em>'.
	 * @see org.nasdanika.models.productmanagement.Feature#getAddressedPainPoints()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AddressedPainPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Feature#getPersonaAssociations <em>Persona Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persona Associations</em>'.
	 * @see org.nasdanika.models.productmanagement.Feature#getPersonaAssociations()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_PersonaAssociations();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Feature#getUsedCapabilities <em>Used Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.Feature#getUsedCapabilities()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_UsedCapabilities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.FeaturePersonaAssociation <em>Feature Persona Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Persona Association</em>'.
	 * @see org.nasdanika.models.productmanagement.FeaturePersonaAssociation
	 * @generated
	 */
	EClass getFeaturePersonaAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.FeaturePersonaAssociation#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persona</em>'.
	 * @see org.nasdanika.models.productmanagement.FeaturePersonaAssociation#getPersona()
	 * @see #getFeaturePersonaAssociation()
	 * @generated
	 */
	EReference getFeaturePersonaAssociation_Persona();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Capability#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providers</em>'.
	 * @see org.nasdanika.models.productmanagement.Capability#getProviders()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Providers();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.nasdanika.models.productmanagement.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Version#getVersionScheme <em>Version Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Scheme</em>'.
	 * @see org.nasdanika.models.productmanagement.Version#getVersionScheme()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionScheme();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Version#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.productmanagement.Version#getDate()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Date();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.nasdanika.models.productmanagement.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.productmanagement.Release#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.nasdanika.models.productmanagement.Release#getVersion()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Release#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.nasdanika.models.productmanagement.Release#getReleaseDate()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Release#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.productmanagement.Release#getStatus()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Release#getIncludedFeatures <em>Included Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Features</em>'.
	 * @see org.nasdanika.models.productmanagement.Release#getIncludedFeatures()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_IncludedFeatures();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see org.nasdanika.models.productmanagement.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Subscription#getBillingCycle <em>Billing Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Cycle</em>'.
	 * @see org.nasdanika.models.productmanagement.Subscription#getBillingCycle()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_BillingCycle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Subscription#getPricingModel <em>Pricing Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pricing Model</em>'.
	 * @see org.nasdanika.models.productmanagement.Subscription#getPricingModel()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_PricingModel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Subscription#isAutoRenewal <em>Auto Renewal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Renewal</em>'.
	 * @see org.nasdanika.models.productmanagement.Subscription#isAutoRenewal()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_AutoRenewal();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Subscription#getEditions <em>Editions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editions</em>'.
	 * @see org.nasdanika.models.productmanagement.Subscription#getEditions()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_Editions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Subscription#getServiceLevels <em>Service Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Levels</em>'.
	 * @see org.nasdanika.models.productmanagement.Subscription#getServiceLevels()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_ServiceLevels();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level</em>'.
	 * @see org.nasdanika.models.productmanagement.ServiceLevel
	 * @generated
	 */
	EClass getServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ServiceLevel#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.nasdanika.models.productmanagement.ServiceLevel#getMetric()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_Metric();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ServiceLevel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.productmanagement.ServiceLevel#getValue()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ValueProposition <em>Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Proposition</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition
	 * @generated
	 */
	EClass getValueProposition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.ValueProposition#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getStatement()
	 * @see #getValueProposition()
	 * @generated
	 */
	EAttribute getValueProposition_Statement();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getTargetPersonas <em>Target Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getTargetPersonas()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_TargetPersonas();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getAddressedNeeds <em>Addressed Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addressed Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getAddressedNeeds()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_AddressedNeeds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getSupportedGoals <em>Supported Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getSupportedGoals()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_SupportedGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getMitigatedPainPoints <em>Mitigated Pain Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigated Pain Points</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getMitigatedPainPoints()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_MitigatedPainPoints();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getEnablingCapabilities <em>Enabling Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enabling Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getEnablingCapabilities()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_EnablingCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getPackagedInEditions <em>Packaged In Editions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packaged In Editions</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getPackagedInEditions()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_PackagedInEditions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getDifferentiatedFromAlternatives <em>Differentiated From Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Differentiated From Alternatives</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getDifferentiatedFromAlternatives()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_DifferentiatedFromAlternatives();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getSupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Evidence</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getSupportingEvidence()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_SupportingEvidence();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.ValueProposition#getTargetSegments <em>Target Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Segments</em>'.
	 * @see org.nasdanika.models.productmanagement.ValueProposition#getTargetSegments()
	 * @see #getValueProposition()
	 * @generated
	 */
	EReference getValueProposition_TargetSegments();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Evidence#getEvidenceType <em>Evidence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evidence Type</em>'.
	 * @see org.nasdanika.models.productmanagement.Evidence#getEvidenceType()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_EvidenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Evidence#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.productmanagement.Evidence#getSource()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Evidence#getMeasuredMetrics <em>Measured Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measured Metrics</em>'.
	 * @see org.nasdanika.models.productmanagement.Evidence#getMeasuredMetrics()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_MeasuredMetrics();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Evidence#getCollectedInSegments <em>Collected In Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collected In Segments</em>'.
	 * @see org.nasdanika.models.productmanagement.Evidence#getCollectedInSegments()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_CollectedInSegments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.OutcomeMetric <em>Outcome Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outcome Metric</em>'.
	 * @see org.nasdanika.models.productmanagement.OutcomeMetric
	 * @generated
	 */
	EClass getOutcomeMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.OutcomeMetric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.nasdanika.models.productmanagement.OutcomeMetric#getUnit()
	 * @see #getOutcomeMetric()
	 * @generated
	 */
	EAttribute getOutcomeMetric_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.OutcomeMetric#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Value</em>'.
	 * @see org.nasdanika.models.productmanagement.OutcomeMetric#getTargetValue()
	 * @see #getOutcomeMetric()
	 * @generated
	 */
	EAttribute getOutcomeMetric_TargetValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see org.nasdanika.models.productmanagement.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Alternative#getAlternativeType <em>Alternative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Type</em>'.
	 * @see org.nasdanika.models.productmanagement.Alternative#getAlternativeType()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_AlternativeType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.MarketSegment <em>Market Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Segment</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment
	 * @generated
	 */
	EClass getMarketSegment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.MarketSegment#getSegmentType <em>Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Type</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment#getSegmentType()
	 * @see #getMarketSegment()
	 * @generated
	 */
	EAttribute getMarketSegment_SegmentType();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.MarketSegment#getTargetPersonas <em>Target Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment#getTargetPersonas()
	 * @see #getMarketSegment()
	 * @generated
	 */
	EReference getMarketSegment_TargetPersonas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.MarketSegment#getIndustries <em>Industries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Industries</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment#getIndustries()
	 * @see #getMarketSegment()
	 * @generated
	 */
	EReference getMarketSegment_Industries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.MarketSegment#getGeographies <em>Geographies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geographies</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment#getGeographies()
	 * @see #getMarketSegment()
	 * @generated
	 */
	EReference getMarketSegment_Geographies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.MarketSegment#getCompanySizes <em>Company Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Company Sizes</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment#getCompanySizes()
	 * @see #getMarketSegment()
	 * @generated
	 */
	EReference getMarketSegment_CompanySizes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.MarketSegment#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment#getChannels()
	 * @see #getMarketSegment()
	 * @generated
	 */
	EReference getMarketSegment_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.MarketSegment#getIdealCustomerProfiles <em>Ideal Customer Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ideal Customer Profiles</em>'.
	 * @see org.nasdanika.models.productmanagement.MarketSegment#getIdealCustomerProfiles()
	 * @see #getMarketSegment()
	 * @generated
	 */
	EReference getMarketSegment_IdealCustomerProfiles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Industry <em>Industry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Industry</em>'.
	 * @see org.nasdanika.models.productmanagement.Industry
	 * @generated
	 */
	EClass getIndustry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Industry#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.productmanagement.Industry#getCode()
	 * @see #getIndustry()
	 * @generated
	 */
	EAttribute getIndustry_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Industry#getRegulatoryConstraints <em>Regulatory Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regulatory Constraints</em>'.
	 * @see org.nasdanika.models.productmanagement.Industry#getRegulatoryConstraints()
	 * @see #getIndustry()
	 * @generated
	 */
	EReference getIndustry_RegulatoryConstraints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Geography <em>Geography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geography</em>'.
	 * @see org.nasdanika.models.productmanagement.Geography
	 * @generated
	 */
	EClass getGeography();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Geography#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.nasdanika.models.productmanagement.Geography#getRegion()
	 * @see #getGeography()
	 * @generated
	 */
	EAttribute getGeography_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Geography#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.nasdanika.models.productmanagement.Geography#getCountry()
	 * @see #getGeography()
	 * @generated
	 */
	EAttribute getGeography_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Geography#getStateProvince <em>State Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Province</em>'.
	 * @see org.nasdanika.models.productmanagement.Geography#getStateProvince()
	 * @see #getGeography()
	 * @generated
	 */
	EAttribute getGeography_StateProvince();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Geography#getDataResidencyRegion <em>Data Residency Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Residency Region</em>'.
	 * @see org.nasdanika.models.productmanagement.Geography#getDataResidencyRegion()
	 * @see #getGeography()
	 * @generated
	 */
	EAttribute getGeography_DataResidencyRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.Geography#getRegulatoryConstraints <em>Regulatory Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regulatory Constraints</em>'.
	 * @see org.nasdanika.models.productmanagement.Geography#getRegulatoryConstraints()
	 * @see #getGeography()
	 * @generated
	 */
	EReference getGeography_RegulatoryConstraints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.CompanySize <em>Company Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company Size</em>'.
	 * @see org.nasdanika.models.productmanagement.CompanySize
	 * @generated
	 */
	EClass getCompanySize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.CompanySize#getEmployeeBand <em>Employee Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Band</em>'.
	 * @see org.nasdanika.models.productmanagement.CompanySize#getEmployeeBand()
	 * @see #getCompanySize()
	 * @generated
	 */
	EAttribute getCompanySize_EmployeeBand();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.CompanySize#getRevenueBand <em>Revenue Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue Band</em>'.
	 * @see org.nasdanika.models.productmanagement.CompanySize#getRevenueBand()
	 * @see #getCompanySize()
	 * @generated
	 */
	EAttribute getCompanySize_RevenueBand();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org.nasdanika.models.productmanagement.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Channel#getChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Type</em>'.
	 * @see org.nasdanika.models.productmanagement.Channel#getChannelType()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_ChannelType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.IdealCustomerProfile <em>Ideal Customer Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ideal Customer Profile</em>'.
	 * @see org.nasdanika.models.productmanagement.IdealCustomerProfile
	 * @generated
	 */
	EClass getIdealCustomerProfile();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetIndustries <em>Target Industries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Industries</em>'.
	 * @see org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetIndustries()
	 * @see #getIdealCustomerProfile()
	 * @generated
	 */
	EReference getIdealCustomerProfile_TargetIndustries();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetCompanySizes <em>Target Company Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Company Sizes</em>'.
	 * @see org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetCompanySizes()
	 * @see #getIdealCustomerProfile()
	 * @generated
	 */
	EReference getIdealCustomerProfile_TargetCompanySizes();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetGeographies <em>Target Geographies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Geographies</em>'.
	 * @see org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetGeographies()
	 * @see #getIdealCustomerProfile()
	 * @generated
	 */
	EReference getIdealCustomerProfile_TargetGeographies();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTechStack <em>Tech Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tech Stack</em>'.
	 * @see org.nasdanika.models.productmanagement.IdealCustomerProfile#getTechStack()
	 * @see #getIdealCustomerProfile()
	 * @generated
	 */
	EAttribute getIdealCustomerProfile_TechStack();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetPersonas <em>Target Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.IdealCustomerProfile#getTargetPersonas()
	 * @see #getIdealCustomerProfile()
	 * @generated
	 */
	EReference getIdealCustomerProfile_TargetPersonas();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.RegulatoryConstraint <em>Regulatory Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulatory Constraint</em>'.
	 * @see org.nasdanika.models.productmanagement.RegulatoryConstraint
	 * @generated
	 */
	EClass getRegulatoryConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.RegulatoryConstraint#getRegulation <em>Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation</em>'.
	 * @see org.nasdanika.models.productmanagement.RegulatoryConstraint#getRegulation()
	 * @see #getRegulatoryConstraint()
	 * @generated
	 */
	EAttribute getRegulatoryConstraint_Regulation();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.RegulatoryConstraint#getAffectedCapabilities <em>Affected Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.RegulatoryConstraint#getAffectedCapabilities()
	 * @see #getRegulatoryConstraint()
	 * @generated
	 */
	EReference getRegulatoryConstraint_AffectedCapabilities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.Hypothesis <em>Hypothesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypothesis</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis
	 * @generated
	 */
	EClass getHypothesis();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Hypothesis#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getStatement()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_Statement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Hypothesis#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getStatus()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_Status();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.productmanagement.Hypothesis#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Assumptions</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getAssumptions()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_Assumptions();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.productmanagement.Hypothesis#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Risks</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getRisks()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_Risks();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Hypothesis#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getOwner()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Hypothesis#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getCreatedAt()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.productmanagement.Hypothesis#getLastUpdatedAt <em>Last Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated At</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getLastUpdatedAt()
	 * @see #getHypothesis()
	 * @generated
	 */
	EAttribute getHypothesis_LastUpdatedAt();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getTargetPersonas <em>Target Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getTargetPersonas()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_TargetPersonas();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getLinkedNeeds <em>Linked Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Needs</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getLinkedNeeds()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_LinkedNeeds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getLinkedGoals <em>Linked Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Goals</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getLinkedGoals()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_LinkedGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getLinkedPainPoints <em>Linked Pain Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Pain Points</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getLinkedPainPoints()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_LinkedPainPoints();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getEnabledByCapabilities <em>Enabled By Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enabled By Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getEnabledByCapabilities()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_EnabledByCapabilities();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getSupportsValuePropositions <em>Supports Value Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports Value Propositions</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getSupportsValuePropositions()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_SupportsValuePropositions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getEvidence()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_Evidence();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.productmanagement.Hypothesis#getSuccessMetrics <em>Success Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Success Metrics</em>'.
	 * @see org.nasdanika.models.productmanagement.Hypothesis#getSuccessMetrics()
	 * @see #getHypothesis()
	 * @generated
	 */
	EReference getHypothesis_SuccessMetrics();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.productmanagement.ProductManagementModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel
	 * @generated
	 */
	EClass getProductManagementModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personas</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getPersonas()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Personas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getPortfolios <em>Portfolios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portfolios</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getPortfolios()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Portfolios();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getProducts()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getCapabilities()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getCapabilityProviders <em>Capability Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Providers</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getCapabilityProviders()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_CapabilityProviders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriptions</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getSubscriptions()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Subscriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getValuePropositions <em>Value Propositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Propositions</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getValuePropositions()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_ValuePropositions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getEvidence()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Evidence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getAlternatives()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Alternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getOutcomeMetrics <em>Outcome Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outcome Metrics</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getOutcomeMetrics()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_OutcomeMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getMarketSegments <em>Market Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Market Segments</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getMarketSegments()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_MarketSegments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.productmanagement.ProductManagementModel#getHypotheses <em>Hypotheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypotheses</em>'.
	 * @see org.nasdanika.models.productmanagement.ProductManagementModel#getHypotheses()
	 * @see #getProductManagementModel()
	 * @generated
	 */
	EReference getProductManagementModel_Hypotheses();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.productmanagement.GoalType <em>Goal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Type</em>'.
	 * @see org.nasdanika.models.productmanagement.GoalType
	 * @generated
	 */
	EEnum getGoalType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.productmanagement.ReleaseStatus <em>Release Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Release Status</em>'.
	 * @see org.nasdanika.models.productmanagement.ReleaseStatus
	 * @generated
	 */
	EEnum getReleaseStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.productmanagement.HypothesisStatus <em>Hypothesis Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hypothesis Status</em>'.
	 * @see org.nasdanika.models.productmanagement.HypothesisStatus
	 * @generated
	 */
	EEnum getHypothesisStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductManagementFactory getProductManagementFactory();

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
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ID = eINSTANCE.getModelElement_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.PersonaImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__AGE = eINSTANCE.getPersona_Age();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__ROLE = eINSTANCE.getPersona_Role();

		/**
		 * The meta object literal for the '<em><b>Experience Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__EXPERIENCE_LEVEL = eINSTANCE.getPersona_ExperienceLevel();

		/**
		 * The meta object literal for the '<em><b>Work Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__WORK_ENVIRONMENT = eINSTANCE.getPersona_WorkEnvironment();

		/**
		 * The meta object literal for the '<em><b>Tools Used</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__TOOLS_USED = eINSTANCE.getPersona_ToolsUsed();

		/**
		 * The meta object literal for the '<em><b>Attitudes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__ATTITUDES = eINSTANCE.getPersona_Attitudes();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__BEHAVIORS = eINSTANCE.getPersona_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__ACTIONS = eINSTANCE.getPersona_Actions();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__NEEDS = eINSTANCE.getPersona_Needs();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__GOALS = eINSTANCE.getPersona_Goals();

		/**
		 * The meta object literal for the '<em><b>Pain Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__PAIN_POINTS = eINSTANCE.getPersona_PainPoints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.BehaviorImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__CATEGORY = eINSTANCE.getBehavior_Category();

		/**
		 * The meta object literal for the '<em><b>Related Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__RELATED_NEEDS = eINSTANCE.getBehavior_RelatedNeeds();

		/**
		 * The meta object literal for the '<em><b>Related Pain Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__RELATED_PAIN_POINTS = eINSTANCE.getBehavior_RelatedPainPoints();

		/**
		 * The meta object literal for the '<em><b>Related Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__RELATED_GOALS = eINSTANCE.getBehavior_RelatedGoals();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ActionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ORDER = eINSTANCE.getAction_Order();

		/**
		 * The meta object literal for the '<em><b>Related Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__RELATED_CAPABILITIES = eINSTANCE.getAction_RelatedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Related Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__RELATED_FEATURES = eINSTANCE.getAction_RelatedFeatures();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.NeedImpl <em>Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.NeedImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getNeed()
		 * @generated
		 */
		EClass NEED = eINSTANCE.getNeed();

		/**
		 * The meta object literal for the '<em><b>Supported Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__SUPPORTED_GOALS = eINSTANCE.getNeed_SupportedGoals();

		/**
		 * The meta object literal for the '<em><b>Related Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEED__RELATED_NEEDS = eINSTANCE.getNeed_RelatedNeeds();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.GoalImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Goal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__GOAL_TYPE = eINSTANCE.getGoal_GoalType();

		/**
		 * The meta object literal for the '<em><b>Related Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__RELATED_GOALS = eINSTANCE.getGoal_RelatedGoals();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.PainPointImpl <em>Pain Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.PainPointImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getPainPoint()
		 * @generated
		 */
		EClass PAIN_POINT = eINSTANCE.getPainPoint();

		/**
		 * The meta object literal for the '<em><b>Violated Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__VIOLATED_NEEDS = eINSTANCE.getPainPoint_ViolatedNeeds();

		/**
		 * The meta object literal for the '<em><b>Blocked Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__BLOCKED_GOALS = eINSTANCE.getPainPoint_BlockedGoals();

		/**
		 * The meta object literal for the '<em><b>Related Pain Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIN_POINT__RELATED_PAIN_POINTS = eINSTANCE.getPainPoint_RelatedPainPoints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ProductPortfolioImpl <em>Product Portfolio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ProductPortfolioImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getProductPortfolio()
		 * @generated
		 */
		EClass PRODUCT_PORTFOLIO = eINSTANCE.getProductPortfolio();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PORTFOLIO__PRODUCTS = eINSTANCE.getProductPortfolio_Products();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ProductImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Editions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__EDITIONS = eINSTANCE.getProduct_Editions();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

		/**
		 * The meta object literal for the '<em><b>Target Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TARGET_PERSONAS = eINSTANCE.getProduct_TargetPersonas();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__VERSIONS = eINSTANCE.getProduct_Versions();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__RELEASES = eINSTANCE.getProduct_Releases();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.EditionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '<em><b>Included Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__INCLUDED_FEATURES = eINSTANCE.getEdition_IncludedFeatures();

		/**
		 * The meta object literal for the '<em><b>Included Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__INCLUDED_CAPABILITIES = eINSTANCE.getEdition_IncludedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Available Geographies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__AVAILABLE_GEOGRAPHIES = eINSTANCE.getEdition_AvailableGeographies();

		/**
		 * The meta object literal for the '<em><b>Available Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__AVAILABLE_CHANNELS = eINSTANCE.getEdition_AvailableChannels();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.FeatureImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Addressed Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ADDRESSED_NEEDS = eINSTANCE.getFeature_AddressedNeeds();

		/**
		 * The meta object literal for the '<em><b>Supported Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SUPPORTED_GOALS = eINSTANCE.getFeature_SupportedGoals();

		/**
		 * The meta object literal for the '<em><b>Addressed Pain Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ADDRESSED_PAIN_POINTS = eINSTANCE.getFeature_AddressedPainPoints();

		/**
		 * The meta object literal for the '<em><b>Persona Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PERSONA_ASSOCIATIONS = eINSTANCE.getFeature_PersonaAssociations();

		/**
		 * The meta object literal for the '<em><b>Used Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__USED_CAPABILITIES = eINSTANCE.getFeature_UsedCapabilities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.FeaturePersonaAssociationImpl <em>Feature Persona Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.FeaturePersonaAssociationImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getFeaturePersonaAssociation()
		 * @generated
		 */
		EClass FEATURE_PERSONA_ASSOCIATION = eINSTANCE.getFeaturePersonaAssociation();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PERSONA_ASSOCIATION__PERSONA = eINSTANCE.getFeaturePersonaAssociation_Persona();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__PROVIDERS = eINSTANCE.getCapability_Providers();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__VERSIONS = eINSTANCE.getCapability_Versions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl <em>Capability Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getCapabilityProvider()
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
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.VersionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Version Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_SCHEME = eINSTANCE.getVersion_VersionScheme();

		/**
		 * The meta object literal for the '<em><b>Version String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_STRING = eINSTANCE.getVersion_VersionString();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DATE = eINSTANCE.getVersion_Date();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ReleaseImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__VERSION = eINSTANCE.getRelease_Version();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__RELEASE_DATE = eINSTANCE.getRelease_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__STATUS = eINSTANCE.getRelease_Status();

		/**
		 * The meta object literal for the '<em><b>Included Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__INCLUDED_FEATURES = eINSTANCE.getRelease_IncludedFeatures();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.SubscriptionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Billing Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__BILLING_CYCLE = eINSTANCE.getSubscription_BillingCycle();

		/**
		 * The meta object literal for the '<em><b>Pricing Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__PRICING_MODEL = eINSTANCE.getSubscription_PricingModel();

		/**
		 * The meta object literal for the '<em><b>Auto Renewal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__AUTO_RENEWAL = eINSTANCE.getSubscription_AutoRenewal();

		/**
		 * The meta object literal for the '<em><b>Editions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__EDITIONS = eINSTANCE.getSubscription_Editions();

		/**
		 * The meta object literal for the '<em><b>Service Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__SERVICE_LEVELS = eINSTANCE.getSubscription_ServiceLevels();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ServiceLevelImpl <em>Service Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ServiceLevelImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getServiceLevel()
		 * @generated
		 */
		EClass SERVICE_LEVEL = eINSTANCE.getServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__METRIC = eINSTANCE.getServiceLevel_Metric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__VALUE = eINSTANCE.getServiceLevel_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl <em>Value Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ValuePropositionImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getValueProposition()
		 * @generated
		 */
		EClass VALUE_PROPOSITION = eINSTANCE.getValueProposition();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PROPOSITION__STATEMENT = eINSTANCE.getValueProposition_Statement();

		/**
		 * The meta object literal for the '<em><b>Target Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__TARGET_PERSONAS = eINSTANCE.getValueProposition_TargetPersonas();

		/**
		 * The meta object literal for the '<em><b>Addressed Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__ADDRESSED_NEEDS = eINSTANCE.getValueProposition_AddressedNeeds();

		/**
		 * The meta object literal for the '<em><b>Supported Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__SUPPORTED_GOALS = eINSTANCE.getValueProposition_SupportedGoals();

		/**
		 * The meta object literal for the '<em><b>Mitigated Pain Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__MITIGATED_PAIN_POINTS = eINSTANCE.getValueProposition_MitigatedPainPoints();

		/**
		 * The meta object literal for the '<em><b>Enabling Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__ENABLING_CAPABILITIES = eINSTANCE.getValueProposition_EnablingCapabilities();

		/**
		 * The meta object literal for the '<em><b>Packaged In Editions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__PACKAGED_IN_EDITIONS = eINSTANCE.getValueProposition_PackagedInEditions();

		/**
		 * The meta object literal for the '<em><b>Differentiated From Alternatives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES = eINSTANCE.getValueProposition_DifferentiatedFromAlternatives();

		/**
		 * The meta object literal for the '<em><b>Supporting Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__SUPPORTING_EVIDENCE = eINSTANCE.getValueProposition_SupportingEvidence();

		/**
		 * The meta object literal for the '<em><b>Target Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPOSITION__TARGET_SEGMENTS = eINSTANCE.getValueProposition_TargetSegments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.EvidenceImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Evidence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__EVIDENCE_TYPE = eINSTANCE.getEvidence_EvidenceType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__SOURCE = eINSTANCE.getEvidence_Source();

		/**
		 * The meta object literal for the '<em><b>Measured Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__MEASURED_METRICS = eINSTANCE.getEvidence_MeasuredMetrics();

		/**
		 * The meta object literal for the '<em><b>Collected In Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__COLLECTED_IN_SEGMENTS = eINSTANCE.getEvidence_CollectedInSegments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.OutcomeMetricImpl <em>Outcome Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.OutcomeMetricImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getOutcomeMetric()
		 * @generated
		 */
		EClass OUTCOME_METRIC = eINSTANCE.getOutcomeMetric();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTCOME_METRIC__UNIT = eINSTANCE.getOutcomeMetric_Unit();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTCOME_METRIC__TARGET_VALUE = eINSTANCE.getOutcomeMetric_TargetValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.AlternativeImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Alternative Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE__ALTERNATIVE_TYPE = eINSTANCE.getAlternative_AlternativeType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl <em>Market Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.MarketSegmentImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getMarketSegment()
		 * @generated
		 */
		EClass MARKET_SEGMENT = eINSTANCE.getMarketSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_SEGMENT__SEGMENT_TYPE = eINSTANCE.getMarketSegment_SegmentType();

		/**
		 * The meta object literal for the '<em><b>Target Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_SEGMENT__TARGET_PERSONAS = eINSTANCE.getMarketSegment_TargetPersonas();

		/**
		 * The meta object literal for the '<em><b>Industries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_SEGMENT__INDUSTRIES = eINSTANCE.getMarketSegment_Industries();

		/**
		 * The meta object literal for the '<em><b>Geographies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_SEGMENT__GEOGRAPHIES = eINSTANCE.getMarketSegment_Geographies();

		/**
		 * The meta object literal for the '<em><b>Company Sizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_SEGMENT__COMPANY_SIZES = eINSTANCE.getMarketSegment_CompanySizes();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_SEGMENT__CHANNELS = eINSTANCE.getMarketSegment_Channels();

		/**
		 * The meta object literal for the '<em><b>Ideal Customer Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES = eINSTANCE.getMarketSegment_IdealCustomerProfiles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.IndustryImpl <em>Industry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.IndustryImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getIndustry()
		 * @generated
		 */
		EClass INDUSTRY = eINSTANCE.getIndustry();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDUSTRY__CODE = eINSTANCE.getIndustry_Code();

		/**
		 * The meta object literal for the '<em><b>Regulatory Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUSTRY__REGULATORY_CONSTRAINTS = eINSTANCE.getIndustry_RegulatoryConstraints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.GeographyImpl <em>Geography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.GeographyImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getGeography()
		 * @generated
		 */
		EClass GEOGRAPHY = eINSTANCE.getGeography();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHY__REGION = eINSTANCE.getGeography_Region();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHY__COUNTRY = eINSTANCE.getGeography_Country();

		/**
		 * The meta object literal for the '<em><b>State Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHY__STATE_PROVINCE = eINSTANCE.getGeography_StateProvince();

		/**
		 * The meta object literal for the '<em><b>Data Residency Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHY__DATA_RESIDENCY_REGION = eINSTANCE.getGeography_DataResidencyRegion();

		/**
		 * The meta object literal for the '<em><b>Regulatory Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHY__REGULATORY_CONSTRAINTS = eINSTANCE.getGeography_RegulatoryConstraints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.CompanySizeImpl <em>Company Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.CompanySizeImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getCompanySize()
		 * @generated
		 */
		EClass COMPANY_SIZE = eINSTANCE.getCompanySize();

		/**
		 * The meta object literal for the '<em><b>Employee Band</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_SIZE__EMPLOYEE_BAND = eINSTANCE.getCompanySize_EmployeeBand();

		/**
		 * The meta object literal for the '<em><b>Revenue Band</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_SIZE__REVENUE_BAND = eINSTANCE.getCompanySize_RevenueBand();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ChannelImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Channel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CHANNEL_TYPE = eINSTANCE.getChannel_ChannelType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl <em>Ideal Customer Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getIdealCustomerProfile()
		 * @generated
		 */
		EClass IDEAL_CUSTOMER_PROFILE = eINSTANCE.getIdealCustomerProfile();

		/**
		 * The meta object literal for the '<em><b>Target Industries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES = eINSTANCE.getIdealCustomerProfile_TargetIndustries();

		/**
		 * The meta object literal for the '<em><b>Target Company Sizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES = eINSTANCE.getIdealCustomerProfile_TargetCompanySizes();

		/**
		 * The meta object literal for the '<em><b>Target Geographies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES = eINSTANCE.getIdealCustomerProfile_TargetGeographies();

		/**
		 * The meta object literal for the '<em><b>Tech Stack</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDEAL_CUSTOMER_PROFILE__TECH_STACK = eINSTANCE.getIdealCustomerProfile_TechStack();

		/**
		 * The meta object literal for the '<em><b>Target Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS = eINSTANCE.getIdealCustomerProfile_TargetPersonas();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.RegulatoryConstraintImpl <em>Regulatory Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.RegulatoryConstraintImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getRegulatoryConstraint()
		 * @generated
		 */
		EClass REGULATORY_CONSTRAINT = eINSTANCE.getRegulatoryConstraint();

		/**
		 * The meta object literal for the '<em><b>Regulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATORY_CONSTRAINT__REGULATION = eINSTANCE.getRegulatoryConstraint_Regulation();

		/**
		 * The meta object literal for the '<em><b>Affected Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES = eINSTANCE.getRegulatoryConstraint_AffectedCapabilities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl <em>Hypothesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.HypothesisImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getHypothesis()
		 * @generated
		 */
		EClass HYPOTHESIS = eINSTANCE.getHypothesis();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__STATEMENT = eINSTANCE.getHypothesis_Statement();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__STATUS = eINSTANCE.getHypothesis_Status();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__ASSUMPTIONS = eINSTANCE.getHypothesis_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Risks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__RISKS = eINSTANCE.getHypothesis_Risks();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__OWNER = eINSTANCE.getHypothesis_Owner();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__CREATED_AT = eINSTANCE.getHypothesis_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Last Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPOTHESIS__LAST_UPDATED_AT = eINSTANCE.getHypothesis_LastUpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Target Personas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__TARGET_PERSONAS = eINSTANCE.getHypothesis_TargetPersonas();

		/**
		 * The meta object literal for the '<em><b>Linked Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__LINKED_NEEDS = eINSTANCE.getHypothesis_LinkedNeeds();

		/**
		 * The meta object literal for the '<em><b>Linked Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__LINKED_GOALS = eINSTANCE.getHypothesis_LinkedGoals();

		/**
		 * The meta object literal for the '<em><b>Linked Pain Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__LINKED_PAIN_POINTS = eINSTANCE.getHypothesis_LinkedPainPoints();

		/**
		 * The meta object literal for the '<em><b>Enabled By Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__ENABLED_BY_CAPABILITIES = eINSTANCE.getHypothesis_EnabledByCapabilities();

		/**
		 * The meta object literal for the '<em><b>Supports Value Propositions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS = eINSTANCE.getHypothesis_SupportsValuePropositions();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__EVIDENCE = eINSTANCE.getHypothesis_Evidence();

		/**
		 * The meta object literal for the '<em><b>Success Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPOTHESIS__SUCCESS_METRICS = eINSTANCE.getHypothesis_SuccessMetrics();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getProductManagementModel()
		 * @generated
		 */
		EClass PRODUCT_MANAGEMENT_MODEL = eINSTANCE.getProductManagementModel();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__PERSONAS = eINSTANCE.getProductManagementModel_Personas();

		/**
		 * The meta object literal for the '<em><b>Portfolios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS = eINSTANCE.getProductManagementModel_Portfolios();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__PRODUCTS = eINSTANCE.getProductManagementModel_Products();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__CAPABILITIES = eINSTANCE.getProductManagementModel_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Capability Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS = eINSTANCE.getProductManagementModel_CapabilityProviders();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS = eINSTANCE.getProductManagementModel_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Value Propositions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS = eINSTANCE.getProductManagementModel_ValuePropositions();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__EVIDENCE = eINSTANCE.getProductManagementModel_Evidence();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES = eINSTANCE.getProductManagementModel_Alternatives();

		/**
		 * The meta object literal for the '<em><b>Outcome Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS = eINSTANCE.getProductManagementModel_OutcomeMetrics();

		/**
		 * The meta object literal for the '<em><b>Market Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS = eINSTANCE.getProductManagementModel_MarketSegments();

		/**
		 * The meta object literal for the '<em><b>Hypotheses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MANAGEMENT_MODEL__HYPOTHESES = eINSTANCE.getProductManagementModel_Hypotheses();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.GoalType <em>Goal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.GoalType
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getGoalType()
		 * @generated
		 */
		EEnum GOAL_TYPE = eINSTANCE.getGoalType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.ReleaseStatus <em>Release Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.ReleaseStatus
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getReleaseStatus()
		 * @generated
		 */
		EEnum RELEASE_STATUS = eINSTANCE.getReleaseStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.productmanagement.HypothesisStatus <em>Hypothesis Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.productmanagement.HypothesisStatus
		 * @see org.nasdanika.models.productmanagement.impl.ProductManagementPackageImpl#getHypothesisStatus()
		 * @generated
		 */
		EEnum HYPOTHESIS_STATUS = eINSTANCE.getHypothesisStatus();

	}

} //ProductManagementPackage
