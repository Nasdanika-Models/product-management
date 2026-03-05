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
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends ModelElementImpl implements Capability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityProvider> getProviders() {
		return (EList<CapabilityProvider>)eDynamicGet(ProductManagementPackage.CAPABILITY__PROVIDERS, ProductManagementPackage.Literals.CAPABILITY__PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Version> getVersions() {
		return (EList<Version>)eDynamicGet(ProductManagementPackage.CAPABILITY__VERSIONS, ProductManagementPackage.Literals.CAPABILITY__VERSIONS, true, true);
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
			case ProductManagementPackage.CAPABILITY__PROVIDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProviders()).basicAdd(otherEnd, msgs);
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
			case ProductManagementPackage.CAPABILITY__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.CAPABILITY__VERSIONS:
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
			case ProductManagementPackage.CAPABILITY__PROVIDERS:
				return getProviders();
			case ProductManagementPackage.CAPABILITY__VERSIONS:
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
			case ProductManagementPackage.CAPABILITY__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends CapabilityProvider>)newValue);
				return;
			case ProductManagementPackage.CAPABILITY__VERSIONS:
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
			case ProductManagementPackage.CAPABILITY__PROVIDERS:
				getProviders().clear();
				return;
			case ProductManagementPackage.CAPABILITY__VERSIONS:
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
			case ProductManagementPackage.CAPABILITY__PROVIDERS:
				return !getProviders().isEmpty();
			case ProductManagementPackage.CAPABILITY__VERSIONS:
				return !getVersions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
