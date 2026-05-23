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
 *   <li>{@link org.nasdanika.models.productmanagement.Need#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Need#getViolatedBy <em>Violated By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends Concern {
	/**
	 * Returns the value of the '<em><b>Supports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ConcernReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Goals supported by this need
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed_Supports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernReference> getSupports();

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

} // Need
