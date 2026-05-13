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
 *   <li>{@link org.nasdanika.models.productmanagement.Need#getViolators <em>Violators</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends Concern {
	/**
	 * Returns the value of the '<em><b>Supports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.SupportedGoals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed_Supports()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportedGoals> getSupports();

	/**
	 * Returns the value of the '<em><b>Violators</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ViolatedNeeds}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.ViolatedNeeds#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violators</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getNeed_Violators()
	 * @see org.nasdanika.models.productmanagement.ViolatedNeeds#getNeeds
	 * @model opposite="needs"
	 * @generated
	 */
	EList<ViolatedNeeds> getViolators();

} // Need
