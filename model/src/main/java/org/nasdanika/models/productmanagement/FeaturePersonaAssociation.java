/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Persona Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association class between a Feature and a Persona.
 * Contained by the Feature. Allows describing how and why a feature is relevant to a specific persona.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.FeaturePersonaAssociation#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeaturePersonaAssociation()
 * @model
 * @generated
 */
public interface FeaturePersonaAssociation extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The persona associated with the containing feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persona</em>' reference.
	 * @see #setPersona(Persona)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getFeaturePersonaAssociation_Persona()
	 * @model required="true"
	 * @generated
	 */
	Persona getPersona();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.FeaturePersonaAssociation#getPersona <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' reference.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(Persona value);

} // FeaturePersonaAssociation
