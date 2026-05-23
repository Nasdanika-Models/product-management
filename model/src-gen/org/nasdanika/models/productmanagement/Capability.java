/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A capability extends PersonaDomain, ConcernDomain, and EvidenceDomain
 * to support self-contained capability definitions. A capability may:
 *  - address concerns owned by external personas or other capabilities
 *    (via AddressedConcerns)
 *  - introduce capability-specific personas (via PersonaDomain)
 *  - introduce concerns that exist by virtue of the capability itself,
 *    not owned by any persona (via ConcernDomain)
 *  - carry the evidence supporting all of the above (via EvidenceDomain)
 *  - decompose into sub-capabilities (via subCapabilities)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getAddressedConcerns <em>Addressed Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getAllAddressedConcerns <em>All Addressed Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getSubCapabilities <em>Sub Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends NamedPeriod, AbstractCapability, EvidenceDomain, PersonaDomain, ConcernDomain {
	/**
	 * Returns the value of the '<em><b>Addressed Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addressed Concerns</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_AddressedConcerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConcern> getAddressedConcerns();

	/**
	 * Returns the value of the '<em><b>All Addressed Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Addressed concerns from this capability plus addressedBy from concerns
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Addressed Concerns</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_AllAddressedConcerns()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AbstractConcern> getAllAddressedConcerns();

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
