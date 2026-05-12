/**
 */
package org.nasdanika.models.product.management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entity that provides one or more capabilities at
 * specific versions, e.g. a Maven module, OSGi bundle, or CLI assembly. Inspired
 * by the Eclipse P2 model. Is an Undergoer: actors perform roles on it. Dual
 * role: both provider and consumer of capabilities.
 * Corresponds to capability.CapabilityProvider
 * (ecore://nasdanika.org/models/capability).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.CapabilityProvider#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.CapabilityProvider#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.CapabilityProvider#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.CapabilityProvider#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.product.management.ManagementPackage#getCapabilityProvider()
 * @model
 * @generated
 */
public interface CapabilityProvider extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Provided Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities provided by this provider. References to
	 * Capability instances defined in the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Capabilities</em>' reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getCapabilityProvider_ProvidedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getProvidedCapabilities();

	/**
	 * Returns the value of the '<em><b>Required Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities required by this provider to function.
	 * Implements the Java/OSGi consumer side: this provider depends on capabilities
	 * provided by other providers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Capabilities</em>' reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getCapabilityProvider_RequiredCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.CapabilityProviderVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versions of this capability provider, each combining
	 * provider identity with version-specific metadata (version string, label, lifecycle).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getCapabilityProvider_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityProviderVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.product.management.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles defined on this provider as an undergoer, e.g.
	 * 'Maintainer' or 'Consumer'. Models architecture.Undergoer.roles
	 * (ecore://nasdanika.org/models/architecture).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.product.management.ManagementPackage#getCapabilityProvider_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // CapabilityProvider
