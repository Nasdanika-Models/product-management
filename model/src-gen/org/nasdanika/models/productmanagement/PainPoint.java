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
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getAllBlocks <em>All Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getViolates <em>Violates</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.PainPoint#getAllViolates <em>All Violates</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint()
 * @model
 * @generated
 */
public interface PainPoint extends Concern {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernReference> getBlocks();

	/**
	 * Returns the value of the '<em><b>All Blocks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Blocks from this pain point plus blockers from pain points
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Blocks</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint_AllBlocks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Goal> getAllBlocks();

	/**
	 * Returns the value of the '<em><b>Violates</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violates</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint_Violates()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernReference> getViolates();

	/**
	 * Returns the value of the '<em><b>All Violates</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Blocks from this pain point plus blockers from pain points
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Violates</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPainPoint_AllViolates()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Need> getAllViolates();

} // PainPoint
