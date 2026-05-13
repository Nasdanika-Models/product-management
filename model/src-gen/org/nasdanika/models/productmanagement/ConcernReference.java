/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ConcernReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcernReference()
 * @model
 * @generated
 */
public interface ConcernReference extends AbstractConcern {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Concern)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getConcernReference_Target()
	 * @model
	 * @generated
	 */
	Concern getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ConcernReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Concern value);

} // ConcernReference
