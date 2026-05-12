/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role that an Actor performs on an Undergoer.
 * Defines authority and responsibility with respect to an element.
 * Corresponds to architecture.Role (ecore://nasdanika.org/models/architecture).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Role#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Actor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actors currently performing this role.
	 * Bidirectional opposite of Actor.roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getRole_Actors()
	 * @see org.nasdanika.models.productmanagement.Actor#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Actor> getActors();

} // Role
