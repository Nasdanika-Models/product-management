/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a service level within a subscription.
 * Examples: LLM models available, token budget, response time guarantees.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ServiceLevel#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ServiceLevel#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getServiceLevel()
 * @model
 * @generated
 */
public interface ServiceLevel extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metric or dimension, e.g. 'response-time', 'token-budget', 'available-models'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getServiceLevel_Metric()
	 * @model
	 * @generated
	 */
	String getMetric();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ServiceLevel#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value or threshold for the metric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getServiceLevel_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ServiceLevel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ServiceLevel
