/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person, group, or automated agent performing roles on
 * undergoers. Organized hierarchically via subActors. Is itself an undergoer.
 * For actors representing specific parties, use partyId to reference a party model
 * (ecore://nasdanika.org/models/party). Corresponds to architecture.Actor /
 * architecture.PartyActor (ecore://nasdanika.org/models/architecture).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Actor#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Actor#getOwnedRoles <em>Owned Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Actor#getSubActors <em>Sub Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Actor#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.Role#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles this actor performs. Bidirectional opposite of Role.actors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getActor_Roles()
	 * @see org.nasdanika.models.productmanagement.Role#getActors
	 * @model opposite="actors"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Owned Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles defined on this actor as an undergoer — roles
	 * that other actors perform on this actor, e.g. a 'Manager' role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Roles</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getActor_OwnedRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getOwnedRoles();

	/**
	 * Returns the value of the '<em><b>Sub Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested actors representing organizational sub-structure,
	 * such as sub-teams or individual members of a group actor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Actors</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getActor_SubActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getSubActors();

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI referencing a party (person or organization) in an
	 * external party model (ecore://nasdanika.org/models/party), resolved via Maven URI
	 * Handler for cross-resource identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getActor_PartyId()
	 * @model unique="false"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Actor#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

} // Actor
