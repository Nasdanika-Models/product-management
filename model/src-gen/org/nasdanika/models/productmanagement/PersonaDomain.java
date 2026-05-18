/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.PersonaDomain#getPersonas <em>Personas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersonaDomain()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PersonaDomain extends NamedElement, AbstractPersona {
	/**
	 * Returns the value of the '<em><b>Personas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractPersona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersonaDomain_Personas()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<AbstractPersona> getPersonas();

} // PersonaDomain
