/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Goal#getSupportingNeeds <em>Supporting Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Goal#getBlockers <em>Blockers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Concern {
	/**
	 * Returns the value of the '<em><b>Supporting Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.SupportedGoals}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.SupportedGoals#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal_SupportingNeeds()
	 * @see org.nasdanika.models.productmanagement.SupportedGoals#getGoals
	 * @model opposite="goals"
	 * @generated
	 */
	EList<SupportedGoals> getSupportingNeeds();

	/**
	 * Returns the value of the '<em><b>Blockers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.BlockedGoals}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.BlockedGoals#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockers</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal_Blockers()
	 * @see org.nasdanika.models.productmanagement.BlockedGoals#getGoals
	 * @model opposite="goals"
	 * @generated
	 */
	EList<BlockedGoals> getBlockers();

} // Goal
