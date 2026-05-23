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
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getAllAddresses <em>All Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getSubCapabilities <em>Sub Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getDependents <em>Dependents</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends NamedPeriod, AbstractCapability, EvidenceDomain, PersonaDomain, ConcernDomain {
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
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Dependencies as an abstract capability allows to
	 * model self-contained capabilities with inline dependencies
	 * and even dependency domains.
	 * When federated, such inline capabilities can be
	 * either replaced with CapabilityReference or CapabilityDependency
	 * or use URIs to de-dup multiple definitions into one logical definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCapability> getDependencies();

	/**
	 * Returns the value of the '<em><b>Dependents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.CapabilityReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Capabilities depending on this capability, excludes containment.
	 * Returns capability references, including capability dependencies, with target pointing
	 * to this capability and contained by the dependencies reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependents</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Dependents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<CapabilityReference> getDependents();

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
