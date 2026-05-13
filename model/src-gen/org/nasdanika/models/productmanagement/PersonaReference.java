/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.PersonaReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersonaReference()
 * @model
 * @generated
 */
public interface PersonaReference extends AbstractPersona {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Persona)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersonaReference_Target()
	 * @model
	 * @generated
	 */
	Persona getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.PersonaReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Persona value);

} // PersonaReference
