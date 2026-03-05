/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Portfolio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of related products managed as a group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductPortfolio#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductPortfolio()
 * @model
 * @generated
 */
public interface ProductPortfolio extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Products in this portfolio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductPortfolio_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

} // ProductPortfolio
