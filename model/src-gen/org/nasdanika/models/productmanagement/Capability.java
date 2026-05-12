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
 * An ability that addresses persona concerns, e.g. 'generate
 * a documentation site from an Xcore metamodel'. Hierarchical via subCapabilities.
 * Bidirectional composition via includes/includedIn. Versioned via CapabilityVersion.
 * Is an Undergoer: actors perform roles on it. Participates in MCDA weight derivation.
 * Corresponds to capability.Capability (ecore://nasdanika.org/models/capability).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getSubCapabilities <em>Sub Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getIncludedIn <em>Included In</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Capability#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.CapabilityVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versions of this capability. May be empty for simple
	 * models. CapabilityVersion extends both Capability and Version, enabling version-
	 * specific property overrides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Sub Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * More specific capabilities belonging to this capability.
	 * Used to build a capability hierarchy, e.g. 'Documentation' containing 'HTML Site
	 * Generation', 'PDF Export', and 'Diagram Generation'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_SubCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getSubCapabilities();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.Capability#getIncludedIn <em>Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other capabilities that this capability includes or
	 * depends on. Bidirectional opposite of includedIn.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Includes()
	 * @see org.nasdanika.models.productmanagement.Capability#getIncludedIn
	 * @model opposite="includedIn"
	 * @generated
	 */
	EList<Capability> getIncludes();

	/**
	 * Returns the value of the '<em><b>Included In</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.productmanagement.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities that include this capability. Derived
	 * bidirectional opposite of includes. Automatically maintained by EMF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included In</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_IncludedIn()
	 * @see org.nasdanika.models.productmanagement.Capability#getIncludes
	 * @model opposite="includes"
	 * @generated
	 */
	EList<Capability> getIncludedIn();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles defined on this capability as an undergoer,
	 * e.g. 'Owner' or 'Contributor' roles. Models architecture.Undergoer.roles
	 * (ecore://nasdanika.org/models/architecture).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getCapability_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Capability
