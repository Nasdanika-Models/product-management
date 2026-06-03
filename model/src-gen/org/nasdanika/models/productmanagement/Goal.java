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
 *   <li>{@link org.nasdanika.models.productmanagement.Goal#getBlockedBy <em>Blocked By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Goal#getAllBlockedBy <em>All Blocked By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Concern {
	/**
	 * Returns the value of the '<em><b>Blocked By</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * References to pain points blocking this goal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocked By</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal_BlockedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernReference> getBlockedBy();

	/**
	 * Returns the value of the '<em><b>All Blocked By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * BlockedBy from this goal plus blocks from pain points
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Blocked By</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getGoal_AllBlockedBy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PainPoint> getAllBlockedBy();

} // Goal
