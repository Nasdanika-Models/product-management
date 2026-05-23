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
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * References to needs supporting this goal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal_SupportingNeeds()
	 * @model
	 * @generated
	 */
	EList<ConcernReference> getSupportingNeeds();

	/**
	 * Returns the value of the '<em><b>Blockers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * References to pain points blocking this goal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blockers</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal_Blockers()
	 * @model
	 * @generated
	 */
	EList<ConcernReference> getBlockers();

} // Goal
