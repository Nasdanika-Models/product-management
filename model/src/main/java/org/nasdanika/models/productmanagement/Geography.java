/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A geographic definition — region, country, state/province.
 * Can also include data residency region.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Geography#getRegion <em>Region</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Geography#getCountry <em>Country</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Geography#getStateProvince <em>State Province</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Geography#getDataResidencyRegion <em>Data Residency Region</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Geography#getRegulatoryConstraints <em>Regulatory Constraints</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGeography()
 * @model
 * @generated
 */
public interface Geography extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geographic region, e.g. 'EMEA', 'North America', 'APAC'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGeography_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Geography#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country name or ISO code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGeography_Country()
	 * @model
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Geography#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>State Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State or province within the country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Province</em>' attribute.
	 * @see #setStateProvince(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGeography_StateProvince()
	 * @model
	 * @generated
	 */
	String getStateProvince();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Geography#getStateProvince <em>State Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Province</em>' attribute.
	 * @see #getStateProvince()
	 * @generated
	 */
	void setStateProvince(String value);

	/**
	 * Returns the value of the '<em><b>Data Residency Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data residency region, if different from geographic region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Residency Region</em>' attribute.
	 * @see #setDataResidencyRegion(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGeography_DataResidencyRegion()
	 * @model
	 * @generated
	 */
	String getDataResidencyRegion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Geography#getDataResidencyRegion <em>Data Residency Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Residency Region</em>' attribute.
	 * @see #getDataResidencyRegion()
	 * @generated
	 */
	void setDataResidencyRegion(String value);

	/**
	 * Returns the value of the '<em><b>Regulatory Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.RegulatoryConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory constraints applicable to this geography.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory Constraints</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGeography_RegulatoryConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegulatoryConstraint> getRegulatoryConstraints();

} // Geography
