/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of features targeting a specific persona or a subset of personas.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Product#getEditions <em>Editions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Product#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Product#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Product#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Product#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Editions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Different flavors/editions of this product, e.g. Community, Professional, Enterprise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProduct_Editions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edition> getEditions();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Features belonging to this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProduct_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Target Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas this product is targeting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Personas</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProduct_TargetPersonas()
	 * @model
	 * @generated
	 */
	EList<Persona> getTargetPersonas();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versions of this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProduct_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Releases of this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProduct_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

} // Product
