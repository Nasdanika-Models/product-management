/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.AbstractCapabilityProvider;
import org.nasdanika.models.productmanagement.CapabilityProviderDomain;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Provider Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderDomainImpl#getCapabilityProviders <em>Capability Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderDomainImpl extends NamedElementImpl implements CapabilityProviderDomain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityProviderDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.CAPABILITY_PROVIDER_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapabilityProvider> getCapabilityProviders() {
		return (EList<AbstractCapabilityProvider>)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS:
				return ((InternalEList<?>)getCapabilityProviders()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS:
				return getCapabilityProviders();
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS:
				getCapabilityProviders().clear();
				getCapabilityProviders().addAll((Collection<? extends AbstractCapabilityProvider>)newValue);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS:
				getCapabilityProviders().clear();
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS:
				return !getCapabilityProviders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderDomainImpl
