/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Subscriptions define how the user pays and for how long.
 * 
 * Examples:
 * - Monthly vs yearly
 * - Per-user vs per-device
 * - Pay-as-you-go vs committed
 * - Auto-renewal terms
 * - Usage-based or hybrid pricing
 * 
 * A subscription describes pricing and time, not features.
 * However, a subscription may also define service levels — for example, LLM models available,
 * token budget, response time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Subscription#getBillingCycle <em>Billing Cycle</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Subscription#getPricingModel <em>Pricing Model</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Subscription#isAutoRenewal <em>Auto Renewal</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Subscription#getEditions <em>Editions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Subscription#getServiceLevels <em>Service Levels</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getSubscription()
 * @model
 * @generated
 */
public interface Subscription extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Billing Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Billing cycle, e.g. 'monthly', 'yearly', 'pay-as-you-go'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Billing Cycle</em>' attribute.
	 * @see #setBillingCycle(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getSubscription_BillingCycle()
	 * @model
	 * @generated
	 */
	String getBillingCycle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Subscription#getBillingCycle <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Cycle</em>' attribute.
	 * @see #getBillingCycle()
	 * @generated
	 */
	void setBillingCycle(String value);

	/**
	 * Returns the value of the '<em><b>Pricing Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pricing model, e.g. 'per-user', 'per-device', 'usage-based', 'hybrid', 'flat-rate'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pricing Model</em>' attribute.
	 * @see #setPricingModel(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getSubscription_PricingModel()
	 * @model
	 * @generated
	 */
	String getPricingModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Subscription#getPricingModel <em>Pricing Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Model</em>' attribute.
	 * @see #getPricingModel()
	 * @generated
	 */
	void setPricingModel(String value);

	/**
	 * Returns the value of the '<em><b>Auto Renewal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the subscription auto-renews.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Renewal</em>' attribute.
	 * @see #setAutoRenewal(boolean)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getSubscription_AutoRenewal()
	 * @model
	 * @generated
	 */
	boolean isAutoRenewal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Subscription#isAutoRenewal <em>Auto Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Renewal</em>' attribute.
	 * @see #isAutoRenewal()
	 * @generated
	 */
	void setAutoRenewal(boolean value);

	/**
	 * Returns the value of the '<em><b>Editions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Editions sold through this subscription plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editions</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getSubscription_Editions()
	 * @model
	 * @generated
	 */
	EList<Edition> getEditions();

	/**
	 * Returns the value of the '<em><b>Service Levels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ServiceLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service level definitions for this subscription, e.g. token budgets, response times, available models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Levels</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getSubscription_ServiceLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevel> getServiceLevels();

} // Subscription
