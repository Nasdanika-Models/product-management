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
import org.nasdanika.models.productmanagement.CapabilityProviderVersion;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.Role;

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
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderImpl#getRoles <em>Roles</em>}</li>
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
		return ProductmanagementPackage.Literals.CAPABILITY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getProvidedCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequiredCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityProviderVersion> getVersions() {
		return (EList<CapabilityProviderVersion>)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER__VERSIONS, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER__ROLES, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY_PROVIDER__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return getVersions();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__ROLES:
				return getRoles();
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends CapabilityProviderVersion>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				getVersions().clear();
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER__ROLES:
				getRoles().clear();
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return !getProvidedCapabilities().isEmpty();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				return !getRequiredCapabilities().isEmpty();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return !getVersions().isEmpty();
			case ProductmanagementPackage.CAPABILITY_PROVIDER__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderImpl
