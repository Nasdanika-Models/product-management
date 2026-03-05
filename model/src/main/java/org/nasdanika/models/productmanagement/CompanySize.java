/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Employee count bands and/or revenue bands.
 * Example: '1-50 employees', '$1M-$10M revenue'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.CompanySize#getEmployeeBand <em>Employee Band</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.CompanySize#getRevenueBand <em>Revenue Band</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCompanySize()
 * @model
 * @generated
 */
public interface CompanySize extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Employee Band</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Employee count band, e.g. '1-50', '51-200', '201-1000', '1000+'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Band</em>' attribute.
	 * @see #setEmployeeBand(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCompanySize_EmployeeBand()
	 * @model
	 * @generated
	 */
	String getEmployeeBand();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.CompanySize#getEmployeeBand <em>Employee Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Band</em>' attribute.
	 * @see #getEmployeeBand()
	 * @generated
	 */
	void setEmployeeBand(String value);

	/**
	 * Returns the value of the '<em><b>Revenue Band</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Revenue band, e.g. '<$1M', '$1M-$10M', '$10M-$100M', '$100M+'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revenue Band</em>' attribute.
	 * @see #setRevenueBand(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getCompanySize_RevenueBand()
	 * @model
	 * @generated
	 */
	String getRevenueBand();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.CompanySize#getRevenueBand <em>Revenue Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue Band</em>' attribute.
	 * @see #getRevenueBand()
	 * @generated
	 */
	void setRevenueBand(String value);

} // CompanySize
