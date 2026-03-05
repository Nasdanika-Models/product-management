/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Industry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An industry classification (e.g. NAICS/SIC taxonomy).
 * Examples: Financial Services, Healthcare, Manufacturing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Industry#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Industry#getRegulatoryConstraints <em>Regulatory Constraints</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIndustry()
 * @model
 * @generated
 */
public interface Industry extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Industry classification code, e.g. NAICS or SIC code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIndustry_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Industry#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Regulatory Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.RegulatoryConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory constraints applicable to this industry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory Constraints</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getIndustry_RegulatoryConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegulatoryConstraint> getRegulatoryConstraints();

} // Industry
