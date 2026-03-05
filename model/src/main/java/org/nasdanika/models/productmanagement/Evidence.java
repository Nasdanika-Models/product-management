/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Metrics, experiments, testimonials, or case studies that validate a value proposition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Evidence#getEvidenceType <em>Evidence Type</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Evidence#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Evidence#getMeasuredMetrics <em>Measured Metrics</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Evidence#getCollectedInSegments <em>Collected In Segments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEvidence()
 * @model
 * @generated
 */
public interface Evidence extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Evidence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of evidence, e.g. 'metric', 'experiment', 'testimonial', 'case-study'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence Type</em>' attribute.
	 * @see #setEvidenceType(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEvidence_EvidenceType()
	 * @model
	 * @generated
	 */
	String getEvidenceType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Evidence#getEvidenceType <em>Evidence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Type</em>' attribute.
	 * @see #getEvidenceType()
	 * @generated
	 */
	void setEvidenceType(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source of the evidence, e.g. a study name, customer name, experiment ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEvidence_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Evidence#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Measured Metrics</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.OutcomeMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outcome metrics that this evidence measures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measured Metrics</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEvidence_MeasuredMetrics()
	 * @model
	 * @generated
	 */
	EList<OutcomeMetric> getMeasuredMetrics();

	/**
	 * Returns the value of the '<em><b>Collected In Segments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.MarketSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market segments in which this evidence was collected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collected In Segments</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getEvidence_CollectedInSegments()
	 * @model
	 * @generated
	 */
	EList<MarketSegment> getCollectedInSegments();

} // Evidence
