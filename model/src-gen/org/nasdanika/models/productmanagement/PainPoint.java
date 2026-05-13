/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pain Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getViolates <em>Violates</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint()
 * @model
 * @generated
 */
public interface PainPoint extends Concern {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.BlockedGoals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockedGoals> getBlocks();

	/**
	 * Returns the value of the '<em><b>Violates</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ViolatedNeeds}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violates</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint_Violates()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViolatedNeeds> getViolates();

} // PainPoint
