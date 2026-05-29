/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Need#getViolatedBy <em>Violated By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Need#getAllViolatedBy <em>All Violated By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends Concern {
	/**
	 * Returns the value of the '<em><b>Violated By</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * References to pain points violating this need
	 * with an optional documentation explaining
	 * how the need is violated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Violated By</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed_ViolatedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernReference> getViolatedBy();

	/**
	 * Returns the value of the '<em><b>All Violated By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * ViolatedBy from this need plus violates from pain points
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Violated By</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed_AllViolatedBy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PainPoint> getAllViolatedBy();

} // Need
