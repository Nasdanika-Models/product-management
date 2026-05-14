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
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getSubCapabilities <em>Sub Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends NamedPeriod, AbstractCapability {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AddressedConcerns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddressedConcerns> getAddresses();

	/**
	 * Returns the value of the '<em><b>Sub Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_SubCapabilities()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<AbstractCapability> getSubCapabilities();

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.productmanagement.Lifecycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.Lifecycle
	 * @see #setLifecycle(Lifecycle)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Lifecycle()
	 * @model unique="false"
	 * @generated
	 */
	Lifecycle getLifecycle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Capability#getLifecycle <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.Lifecycle
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(Lifecycle value);

} // Capability
