/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A consistent, characteristic pattern in how a persona operates.
 * Behaviors are habitual, preference-based, and cross-situational.
 * 
 * They capture:
 * - Attitudes (risk-averse, data-driven, collaborative)
 * - Work style (async vs synchronous, detail-oriented, shortcut-taking)
 * - Motivation drivers (speed, quality, confidence, accuracy)
 * - Decision inclinations (consult peers, trust AI, check data first)
 * - Interaction patterns (reads docs, prefers autocomplete, avoids manual steps)
 * 
 * Examples:
 * - 'Checks results multiple times before making a decision'
 * - 'Prefers automation over manual review'
 * 
 * Behaviors help design how the experience should feel.
 * They guide design principles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Behavior#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Behavior#getRelatedNeeds <em>Related Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Behavior#getRelatedPainPoints <em>Related Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Behavior#getRelatedGoals <em>Related Goals</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of behavior, e.g. 'attitude', 'work-style', 'motivation-driver', 'decision-inclination', 'interaction-pattern'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getBehavior_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Behavior#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Related Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Needs related to or driven by this behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getBehavior_RelatedNeeds()
	 * @model
	 * @generated
	 */
	EList<Need> getRelatedNeeds();

	/**
	 * Returns the value of the '<em><b>Related Pain Points</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pain points related to or caused by this behavior (behavioral friction).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Pain Points</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getBehavior_RelatedPainPoints()
	 * @model
	 * @generated
	 */
	EList<PainPoint> getRelatedPainPoints();

	/**
	 * Returns the value of the '<em><b>Related Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals motivated by this behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getBehavior_RelatedGoals()
	 * @model
	 * @generated
	 */
	EList<Goal> getRelatedGoals();

} // Behavior
