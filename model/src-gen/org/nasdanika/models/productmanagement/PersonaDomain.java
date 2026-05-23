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
 *   <li>{@link org.nasdanika.models.productmanagement.PersonaDomain#getResolvedPersonas <em>Resolved Personas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersonaDomain()
 * @model
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
	 *        annotation="urn:org.nasdanika logicalContainment='false'"
	 * @generated
	 */
	EList<AbstractPersona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Resolved Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractPersona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Personas</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getPersonaDomain_ResolvedPersonas()
	 * @model keys="id" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="urn:org.nasdanika logicalContainment='true'"
	 * @generated
	 */
	EList<AbstractPersona> getResolvedPersonas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" startUnique="false"
	 * @generated
	 */
	AbstractPersona resolvePersonaReference(AbstractPersona start);

} // PersonaDomain
