/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A competitor or incumbent solution against which a value proposition is differentiated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Alternative#getAlternativeType <em>Alternative Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Alternative Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of alternative, e.g. 'competitor', 'incumbent', 'manual-process', 'open-source'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative Type</em>' attribute.
	 * @see #setAlternativeType(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getAlternative_AlternativeType()
	 * @model
	 * @generated
	 */
	String getAlternativeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Alternative#getAlternativeType <em>Alternative Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Type</em>' attribute.
	 * @see #getAlternativeType()
	 * @generated
	 */
	void setAlternativeType(String value);

} // Alternative
