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
 * Ability to achieve something.
 * 
 * Examples: AI chat, embeddings generation, PDF export.
 * 
 * Capabilities are used by features. A Feature is a type of Capability.
 * Capabilities may be provided by one or more CapabilityProviders.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.CapabilityProvider}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.CapabilityProvider#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Providers that can deliver this capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Providers</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCapability_Providers()
	 * @see org.nasdanika.models.productmanagement.CapabilityProvider#getProvidedCapabilities
	 * @model opposite="providedCapabilities"
	 * @generated
	 */
	EList<CapabilityProvider> getProviders();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versions of this capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCapability_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version> getVersions();

} // Capability
