/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something providing a capability.
 * 
 * Example: OpenAI GPT-4o model for AI chat.
 * 
 * Capability providers may require other capabilities — forming a directed acyclic graph.
 * There may be multiple capability providers for a single capability.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityProvider#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityProvider#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.CapabilityProvider#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCapabilityProvider()
 * @model
 * @generated
 */
public interface CapabilityProvider extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Provided Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.Capability#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities that this provider delivers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCapabilityProvider_ProvidedCapabilities()
	 * @see org.nasdanika.models.productmanagement.Capability#getProviders
	 * @model opposite="providers"
	 * @generated
	 */
	EList<Capability> getProvidedCapabilities();

	/**
	 * Returns the value of the '<em><b>Required Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities required by this provider (forms a directed acyclic graph).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCapabilityProvider_RequiredCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versions of this capability provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCapabilityProvider_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version> getVersions();

} // CapabilityProvider
