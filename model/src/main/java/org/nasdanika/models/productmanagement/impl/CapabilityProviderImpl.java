/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderImpl extends ModelElementImpl implements CapabilityProvider {
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
		return ProductManagementPackage.Literals.CAPABILITY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getProvidedCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, ProductManagementPackage.Literals.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequiredCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES, ProductManagementPackage.Literals.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Version> getVersions() {
		return (EList<Version>)eDynamicGet(ProductManagementPackage.CAPABILITY_PROVIDER__VERSIONS, ProductManagementPackage.Literals.CAPABILITY_PROVIDER__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedCapabilities()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>)getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case ProductManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case ProductManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case ProductManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return getVersions();
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
			case ProductManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
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
			case ProductManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case ProductManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case ProductManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				getVersions().clear();
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
			case ProductManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return !getProvidedCapabilities().isEmpty();
			case ProductManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				return !getRequiredCapabilities().isEmpty();
			case ProductManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return !getVersions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderImpl
