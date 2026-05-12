/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root container for a product management model. Is itself a
 * Period (enabling relative-date templates) and an Undergoer (actors can be assigned
 * roles on the model itself). Contains all primary elements: personas, capabilities,
 * capability providers, work packages, offerings, actors, and proposals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getCapabilityProviders <em>Capability Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getWorkPackages <em>Work Packages</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getOfferings <em>Offerings</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getProposals <em>Proposals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductModel#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel()
 * @model
 * @generated
 */
public interface ProductModel extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Personas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas whose concerns drive product decisions.
	 * Primary containment. Personas may reference each other via superPersonas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_Personas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities that address persona concerns.
	 * Organized hierarchically via Capability.subCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.CapabilityProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entities that provide one or more capabilities at specific
	 * versions, e.g. Maven modules, CLI assemblies, or deployable bundles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Providers</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_CapabilityProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityProvider> getCapabilityProviders();

	/**
	 * Returns the value of the '<em><b>Work Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.WorkPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Units of planned or in-progress work with temporal scope.
	 * Nestable; top-level work packages are contained here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Packages</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_WorkPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPackage> getWorkPackages();

	/**
	 * Returns the value of the '<em><b>Offerings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Offering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consumable forms of capability providers that can be
	 * adopted as a unit, e.g. a Maven artifact, a CLI download, or a deployable bundle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offerings</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_Offerings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Offering> getOfferings();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * People or groups that perform roles on undergoers.
	 * Organized hierarchically via Actor.subActors to reflect organizational structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Proposals</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Proposal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bids to build a capability or complete a work package.
	 * Proposals carry a cost (possibly zero) and acknowledge implicit ownership costs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proposals</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_Proposals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proposal> getProposals();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles defined on this product model, performed by Actors.
	 * Models the architecture.Undergoer.roles pattern
	 * (ecore://nasdanika.org/models/architecture).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProductModel_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // ProductModel
