/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blocked Goals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.BlockedGoals#getGoals <em>Goals</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getBlockedGoals()
 * @model
 * @generated
 */
public interface BlockedGoals extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.Goal#getBlockers <em>Blockers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getBlockedGoals_Goals()
	 * @see org.nasdanika.models.productmanagement.Goal#getBlockers
	 * @model opposite="blockers" required="true"
	 * @generated
	 */
	EList<Goal> getGoals();

} // BlockedGoals
