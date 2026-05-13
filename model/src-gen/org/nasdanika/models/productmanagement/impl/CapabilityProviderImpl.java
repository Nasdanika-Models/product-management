/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.ProvidedCapability;
import org.nasdanika.models.productmanagement.RequiredCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderImpl extends NamedPeriodImpl implements CapabilityProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.CAPABILITY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProvidedCapability> getProvides() {
		return (EList<ProvidedCapability>)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDES, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER__PROVIDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequiredCapability> getRequires() {
		return (EList<RequiredCapability>)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRES, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER__REQUIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDES:
				return getProvides();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRES:
				return getRequires();
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends ProvidedCapability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequiredCapability>)newValue);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDES:
				getProvides().clear();
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRES:
				getRequires().clear();
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDES:
				return !getProvides().isEmpty();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRES:
				return !getRequires().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderImpl
