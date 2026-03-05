/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A flavor of a product with a specific set of features and capabilities.
 * 
 * Examples: Professional Edition, Community Edition, Enterprise Edition.
 * 
 * Editions bundle features/capabilities and are sold via subscription plans.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Edition#getIncludedFeatures <em>Included Features</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Edition#getIncludedCapabilities <em>Included Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Edition#getAvailableGeographies <em>Available Geographies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Edition#getAvailableChannels <em>Available Channels</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEdition()
 * @model
 * @generated
 */
public interface Edition extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Included Features</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features included in this edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included Features</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEdition_IncludedFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getIncludedFeatures();

	/**
	 * Returns the value of the '<em><b>Included Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities directly included/entitled in this edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEdition_IncludedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getIncludedCapabilities();

	/**
	 * Returns the value of the '<em><b>Available Geographies</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Geography}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geographies where this edition is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Geographies</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEdition_AvailableGeographies()
	 * @model
	 * @generated
	 */
	EList<Geography> getAvailableGeographies();

	/**
	 * Returns the value of the '<em><b>Available Channels</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Channels through which this edition is available, e.g. Direct, Self-serve, Marketplace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Channels</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEdition_AvailableChannels()
	 * @model
	 * @generated
	 */
	EList<Channel> getAvailableChannels();

} // Edition
