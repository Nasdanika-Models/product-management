/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Edition;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.ServiceLevel;
import org.nasdanika.models.productmanagement.Subscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.SubscriptionImpl#getBillingCycle <em>Billing Cycle</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.SubscriptionImpl#getPricingModel <em>Pricing Model</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.SubscriptionImpl#isAutoRenewal <em>Auto Renewal</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.SubscriptionImpl#getEditions <em>Editions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.SubscriptionImpl#getServiceLevels <em>Service Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends ModelElementImpl implements Subscription {
	/**
	 * The default value of the '{@link #getBillingCycle() <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_CYCLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPricingModel() <em>Pricing Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingModel()
	 * @generated
	 * @ordered
	 */
	protected static final String PRICING_MODEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAutoRenewal() <em>Auto Renewal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRenewal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_RENEWAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingCycle() {
		return (String)eDynamicGet(ProductManagementPackage.SUBSCRIPTION__BILLING_CYCLE, ProductManagementPackage.Literals.SUBSCRIPTION__BILLING_CYCLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingCycle(String newBillingCycle) {
		eDynamicSet(ProductManagementPackage.SUBSCRIPTION__BILLING_CYCLE, ProductManagementPackage.Literals.SUBSCRIPTION__BILLING_CYCLE, newBillingCycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPricingModel() {
		return (String)eDynamicGet(ProductManagementPackage.SUBSCRIPTION__PRICING_MODEL, ProductManagementPackage.Literals.SUBSCRIPTION__PRICING_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPricingModel(String newPricingModel) {
		eDynamicSet(ProductManagementPackage.SUBSCRIPTION__PRICING_MODEL, ProductManagementPackage.Literals.SUBSCRIPTION__PRICING_MODEL, newPricingModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoRenewal() {
		return (Boolean)eDynamicGet(ProductManagementPackage.SUBSCRIPTION__AUTO_RENEWAL, ProductManagementPackage.Literals.SUBSCRIPTION__AUTO_RENEWAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoRenewal(boolean newAutoRenewal) {
		eDynamicSet(ProductManagementPackage.SUBSCRIPTION__AUTO_RENEWAL, ProductManagementPackage.Literals.SUBSCRIPTION__AUTO_RENEWAL, newAutoRenewal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Edition> getEditions() {
		return (EList<Edition>)eDynamicGet(ProductManagementPackage.SUBSCRIPTION__EDITIONS, ProductManagementPackage.Literals.SUBSCRIPTION__EDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ServiceLevel> getServiceLevels() {
		return (EList<ServiceLevel>)eDynamicGet(ProductManagementPackage.SUBSCRIPTION__SERVICE_LEVELS, ProductManagementPackage.Literals.SUBSCRIPTION__SERVICE_LEVELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.SUBSCRIPTION__SERVICE_LEVELS:
				return ((InternalEList<?>)getServiceLevels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.SUBSCRIPTION__BILLING_CYCLE:
				return getBillingCycle();
			case ProductManagementPackage.SUBSCRIPTION__PRICING_MODEL:
				return getPricingModel();
			case ProductManagementPackage.SUBSCRIPTION__AUTO_RENEWAL:
				return isAutoRenewal();
			case ProductManagementPackage.SUBSCRIPTION__EDITIONS:
				return getEditions();
			case ProductManagementPackage.SUBSCRIPTION__SERVICE_LEVELS:
				return getServiceLevels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductManagementPackage.SUBSCRIPTION__BILLING_CYCLE:
				setBillingCycle((String)newValue);
				return;
			case ProductManagementPackage.SUBSCRIPTION__PRICING_MODEL:
				setPricingModel((String)newValue);
				return;
			case ProductManagementPackage.SUBSCRIPTION__AUTO_RENEWAL:
				setAutoRenewal((Boolean)newValue);
				return;
			case ProductManagementPackage.SUBSCRIPTION__EDITIONS:
				getEditions().clear();
				getEditions().addAll((Collection<? extends Edition>)newValue);
				return;
			case ProductManagementPackage.SUBSCRIPTION__SERVICE_LEVELS:
				getServiceLevels().clear();
				getServiceLevels().addAll((Collection<? extends ServiceLevel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductManagementPackage.SUBSCRIPTION__BILLING_CYCLE:
				setBillingCycle(BILLING_CYCLE_EDEFAULT);
				return;
			case ProductManagementPackage.SUBSCRIPTION__PRICING_MODEL:
				setPricingModel(PRICING_MODEL_EDEFAULT);
				return;
			case ProductManagementPackage.SUBSCRIPTION__AUTO_RENEWAL:
				setAutoRenewal(AUTO_RENEWAL_EDEFAULT);
				return;
			case ProductManagementPackage.SUBSCRIPTION__EDITIONS:
				getEditions().clear();
				return;
			case ProductManagementPackage.SUBSCRIPTION__SERVICE_LEVELS:
				getServiceLevels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductManagementPackage.SUBSCRIPTION__BILLING_CYCLE:
				return BILLING_CYCLE_EDEFAULT == null ? getBillingCycle() != null : !BILLING_CYCLE_EDEFAULT.equals(getBillingCycle());
			case ProductManagementPackage.SUBSCRIPTION__PRICING_MODEL:
				return PRICING_MODEL_EDEFAULT == null ? getPricingModel() != null : !PRICING_MODEL_EDEFAULT.equals(getPricingModel());
			case ProductManagementPackage.SUBSCRIPTION__AUTO_RENEWAL:
				return isAutoRenewal() != AUTO_RENEWAL_EDEFAULT;
			case ProductManagementPackage.SUBSCRIPTION__EDITIONS:
				return !getEditions().isEmpty();
			case ProductManagementPackage.SUBSCRIPTION__SERVICE_LEVELS:
				return !getServiceLevels().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionImpl
