/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The desired outcome the user is trying to accomplish.
 * 
 * Think: 'What is the user trying to achieve?'
 * 
 * Goals may be:
 * - Functional (ship releases faster)
 * - Emotional (feel confident in a deployment)
 * - Aspirational (reduce on-call burden over time)
 * 
 * Examples:
 * - Ship a stable release with minimal downtime
 * - Reduce troubleshooting from hours to minutes
 * - Automate repetitive tasks
 * 
 * A need is a requirement; a goal is an outcome.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Goal#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Goal#getRelatedGoals <em>Related Goals</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Goal Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.productmanagement.GoalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of goal — functional, emotional, or aspirational.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal Type</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.GoalType
	 * @see #setGoalType(GoalType)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGoal_GoalType()
	 * @model
	 * @generated
	 */
	GoalType getGoalType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Goal#getGoalType <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Type</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.GoalType
	 * @see #getGoalType()
	 * @generated
	 */
	void setGoalType(GoalType value);

	/**
	 * Returns the value of the '<em><b>Related Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other goals related to this goal. Supports shared goals across personas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGoal_RelatedGoals()
	 * @model
	 * @generated
	 */
	EList<Goal> getRelatedGoals();

} // Goal
