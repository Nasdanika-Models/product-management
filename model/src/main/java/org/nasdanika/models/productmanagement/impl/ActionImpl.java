/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Action;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.Feature;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ActionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ActionImpl#getRelatedCapabilities <em>Related Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ActionImpl#getRelatedFeatures <em>Related Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends ModelElementImpl implements Action {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOrder() {
		return (Integer)eDynamicGet(ProductManagementPackage.ACTION__ORDER, ProductManagementPackage.Literals.ACTION__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(Integer newOrder) {
		eDynamicSet(ProductManagementPackage.ACTION__ORDER, ProductManagementPackage.Literals.ACTION__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRelatedCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.ACTION__RELATED_CAPABILITIES, ProductManagementPackage.Literals.ACTION__RELATED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getRelatedFeatures() {
		return (EList<Feature>)eDynamicGet(ProductManagementPackage.ACTION__RELATED_FEATURES, ProductManagementPackage.Literals.ACTION__RELATED_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.ACTION__ORDER:
				return getOrder();
			case ProductManagementPackage.ACTION__RELATED_CAPABILITIES:
				return getRelatedCapabilities();
			case ProductManagementPackage.ACTION__RELATED_FEATURES:
				return getRelatedFeatures();
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
			case ProductManagementPackage.ACTION__ORDER:
				setOrder((Integer)newValue);
				return;
			case ProductManagementPackage.ACTION__RELATED_CAPABILITIES:
				getRelatedCapabilities().clear();
				getRelatedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductManagementPackage.ACTION__RELATED_FEATURES:
				getRelatedFeatures().clear();
				getRelatedFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case ProductManagementPackage.ACTION__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case ProductManagementPackage.ACTION__RELATED_CAPABILITIES:
				getRelatedCapabilities().clear();
				return;
			case ProductManagementPackage.ACTION__RELATED_FEATURES:
				getRelatedFeatures().clear();
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
			case ProductManagementPackage.ACTION__ORDER:
				return ORDER_EDEFAULT == null ? getOrder() != null : !ORDER_EDEFAULT.equals(getOrder());
			case ProductManagementPackage.ACTION__RELATED_CAPABILITIES:
				return !getRelatedCapabilities().isEmpty();
			case ProductManagementPackage.ACTION__RELATED_FEATURES:
				return !getRelatedFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
