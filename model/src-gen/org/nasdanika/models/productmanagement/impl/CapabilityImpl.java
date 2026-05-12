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
import org.nasdanika.models.productmanagement.CapabilityVersion;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getSubCapabilities <em>Sub Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getIncludedIn <em>Included In</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getRoles <em>Roles</em>}</li>
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
		return ProductmanagementPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityVersion> getVersions() {
		return (EList<CapabilityVersion>)eDynamicGet(ProductmanagementPackage.CAPABILITY__VERSIONS, ProductmanagementPackage.Literals.CAPABILITY__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getSubCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY__SUB_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getIncludes() {
		return (EList<Capability>)eDynamicGet(ProductmanagementPackage.CAPABILITY__INCLUDES, ProductmanagementPackage.Literals.CAPABILITY__INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getIncludedIn() {
		return (EList<Capability>)eDynamicGet(ProductmanagementPackage.CAPABILITY__INCLUDED_IN, ProductmanagementPackage.Literals.CAPABILITY__INCLUDED_IN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ProductmanagementPackage.CAPABILITY__ROLES, ProductmanagementPackage.Literals.CAPABILITY__ROLES, true, true);
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
			case ProductmanagementPackage.CAPABILITY__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__INCLUDED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludedIn()).basicAdd(otherEnd, msgs);
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
			case ProductmanagementPackage.CAPABILITY__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return ((InternalEList<?>)getSubCapabilities()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__INCLUDED_IN:
				return ((InternalEList<?>)getIncludedIn()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__ROLES:
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
			case ProductmanagementPackage.CAPABILITY__VERSIONS:
				return getVersions();
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return getSubCapabilities();
			case ProductmanagementPackage.CAPABILITY__INCLUDES:
				return getIncludes();
			case ProductmanagementPackage.CAPABILITY__INCLUDED_IN:
				return getIncludedIn();
			case ProductmanagementPackage.CAPABILITY__ROLES:
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
			case ProductmanagementPackage.CAPABILITY__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends CapabilityVersion>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				getSubCapabilities().clear();
				getSubCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__INCLUDED_IN:
				getIncludedIn().clear();
				getIncludedIn().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__ROLES:
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
			case ProductmanagementPackage.CAPABILITY__VERSIONS:
				getVersions().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				getSubCapabilities().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__INCLUDES:
				getIncludes().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__INCLUDED_IN:
				getIncludedIn().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__ROLES:
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
			case ProductmanagementPackage.CAPABILITY__VERSIONS:
				return !getVersions().isEmpty();
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return !getSubCapabilities().isEmpty();
			case ProductmanagementPackage.CAPABILITY__INCLUDES:
				return !getIncludes().isEmpty();
			case ProductmanagementPackage.CAPABILITY__INCLUDED_IN:
				return !getIncludedIn().isEmpty();
			case ProductmanagementPackage.CAPABILITY__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
