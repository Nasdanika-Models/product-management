/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulatory Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A regulatory constraint determined by industry and/or geography.
 * Governs which capabilities and editions are enabled in specific contexts.
 * Examples: GDPR, HIPAA, SOC 2, data residency requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.RegulatoryConstraint#getRegulation <em>Regulation</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.RegulatoryConstraint#getAffectedCapabilities <em>Affected Capabilities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRegulatoryConstraint()
 * @model
 * @generated
 */
public interface RegulatoryConstraint extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the regulation, e.g. 'GDPR', 'HIPAA', 'SOC 2'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulation</em>' attribute.
	 * @see #setRegulation(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRegulatoryConstraint_Regulation()
	 * @model
	 * @generated
	 */
	String getRegulation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.RegulatoryConstraint#getRegulation <em>Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation</em>' attribute.
	 * @see #getRegulation()
	 * @generated
	 */
	void setRegulation(String value);

	/**
	 * Returns the value of the '<em><b>Affected Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities affected by this regulatory constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affected Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getRegulatoryConstraint_AffectedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getAffectedCapabilities();

} // RegulatoryConstraint
