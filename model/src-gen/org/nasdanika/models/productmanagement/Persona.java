/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A named archetype of a product stakeholder whose concerns
 * drive product decisions. Supports multiple inheritance via subPersonas (containment)
 * and superPersonas (reference). Is an Undergoer: actors perform roles on it (e.g.,
 * a Representative role). Participates as an MCDA alternative for prioritization.
 * Corresponds to enterprise.Stakeholder (ecore://nasdanika.org/models/enterprise).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getSubPersonas <em>Sub Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getSuperPersonas <em>Super Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Persona#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals, needs, or pain points belonging to this persona.
	 * Primary containment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersona_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Sub Personas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specialized personas that inherit from this persona.
	 * Primary containment. Analogous to Ecore subclasses — sub-personas inherit concerns
	 * and characteristics from their super-personas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Personas</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersona_SubPersonas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Persona> getSubPersonas();

	/**
	 * Returns the value of the '<em><b>Super Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization references to personas this persona
	 * specializes. Modeled on Ecore eSuperTypes / Java interface duality — a persona
	 * may specialize multiple super-personas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Personas</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersona_SuperPersonas()
	 * @model
	 * @generated
	 */
	EList<Persona> getSuperPersonas();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated population size: the number of individuals or
	 * accounts represented by this persona archetype. Used in resource-allocation and
	 * business-case modeling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(int)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersona_Population()
	 * @model unique="false"
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Persona#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles defined on this persona as an undergoer, e.g. a
	 * 'Representative' role (an actor who can speak for the persona in decision-making).
	 * Models architecture.Undergoer.roles (ecore://nasdanika.org/models/architecture).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersona_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Persona
