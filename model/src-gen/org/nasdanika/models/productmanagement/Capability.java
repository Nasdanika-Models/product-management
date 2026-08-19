/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getAllAddresses <em>All Addresses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends org.nasdanika.models.capability.Capability, PersonaDomain, ConcernDomain {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConcern> getAddresses();

	/**
	 * Returns the value of the '<em><b>All Addresses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Addressed concerns from this capability plus addressedBy from concerns
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Addresses</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_AllAddresses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AbstractConcern> getAllAddresses();

} // Capability
