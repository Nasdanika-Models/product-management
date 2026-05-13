/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violated Needs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ViolatedNeeds#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getViolatedNeeds()
 * @model
 * @generated
 */
public interface ViolatedNeeds extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.Need#getViolators <em>Violators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getViolatedNeeds_Needs()
	 * @see org.nasdanika.models.productmanagement.Need#getViolators
	 * @model opposite="violators" required="true"
	 * @generated
	 */
	EList<Need> getNeeds();

} // ViolatedNeeds
