/**
 */
package org.nasdanika.models.product.management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.product.management.Capability;
import org.nasdanika.models.product.management.CapabilityProvider;
import org.nasdanika.models.product.management.CapabilityProviderVersion;
import org.nasdanika.models.product.management.ManagementPackage;
import org.nasdanika.models.product.management.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.impl.CapabilityProviderImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.CapabilityProviderImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.CapabilityProviderImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.CapabilityProviderImpl#getRoles <em>Roles</em>}</li>
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
		return ManagementPackage.Literals.CAPABILITY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getProvidedCapabilities() {
		return (EList<Capability>)eDynamicGet(ManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, ManagementPackage.Literals.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequiredCapabilities() {
		return (EList<Capability>)eDynamicGet(ManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES, ManagementPackage.Literals.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityProviderVersion> getVersions() {
		return (EList<CapabilityProviderVersion>)eDynamicGet(ManagementPackage.CAPABILITY_PROVIDER__VERSIONS, ManagementPackage.Literals.CAPABILITY_PROVIDER__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ManagementPackage.CAPABILITY_PROVIDER__ROLES, ManagementPackage.Literals.CAPABILITY_PROVIDER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ManagementPackage.CAPABILITY_PROVIDER__ROLES:
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
			case ManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case ManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case ManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return getVersions();
			case ManagementPackage.CAPABILITY_PROVIDER__ROLES:
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
			case ManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends CapabilityProviderVersion>)newValue);
				return;
			case ManagementPackage.CAPABILITY_PROVIDER__ROLES:
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
			case ManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case ManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case ManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				getVersions().clear();
				return;
			case ManagementPackage.CAPABILITY_PROVIDER__ROLES:
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
			case ManagementPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return !getProvidedCapabilities().isEmpty();
			case ManagementPackage.CAPABILITY_PROVIDER__REQUIRED_CAPABILITIES:
				return !getRequiredCapabilities().isEmpty();
			case ManagementPackage.CAPABILITY_PROVIDER__VERSIONS:
				return !getVersions().isEmpty();
			case ManagementPackage.CAPABILITY_PROVIDER__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderImpl
