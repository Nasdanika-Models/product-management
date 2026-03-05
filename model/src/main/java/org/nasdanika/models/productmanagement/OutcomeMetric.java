/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outcome Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A measurable metric tied to outcomes.
 * Used to validate value propositions and hypotheses.
 * Examples: activation rate, NRR, win-rate, time-to-value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.OutcomeMetric#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.OutcomeMetric#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getOutcomeMetric()
 * @model
 * @generated
 */
public interface OutcomeMetric extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit of measurement, e.g. 'percent', 'seconds', 'count'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getOutcomeMetric_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.OutcomeMetric#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target value for this metric, e.g. '>90%', '<5s'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Value</em>' attribute.
	 * @see #setTargetValue(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getOutcomeMetric_TargetValue()
	 * @model
	 * @generated
	 */
	String getTargetValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.OutcomeMetric#getTargetValue <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' attribute.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(String value);

} // OutcomeMetric
