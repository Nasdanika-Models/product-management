/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressed Concerns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.AddressedConcerns#getConcerns <em>Concerns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getAddressedConcerns()
 * @model
 * @generated
 */
public interface AddressedConcerns extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Concern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getAddressedConcerns_Concerns()
	 * @model required="true"
	 * @generated
	 */
	EList<Concern> getConcerns();

} // AddressedConcerns
