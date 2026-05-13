/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.AddressedConcerns;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getSubCapabilities <em>Sub Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends NamedPeriodImpl implements Capability {
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
	public EList<AddressedConcerns> getAddresses() {
		return (EList<AddressedConcerns>)eDynamicGet(ProductmanagementPackage.CAPABILITY__ADDRESSES, ProductmanagementPackage.Literals.CAPABILITY__ADDRESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getSubCapabilities() {
		return (EList<AbstractCapability>)eDynamicGet(ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY__SUB_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return ((InternalEList<?>)getSubCapabilities()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return getAddresses();
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return getSubCapabilities();
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
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends AddressedConcerns>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				getSubCapabilities().clear();
				getSubCapabilities().addAll((Collection<? extends AbstractCapability>)newValue);
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
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				getAddresses().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				getSubCapabilities().clear();
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
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return !getAddresses().isEmpty();
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return !getSubCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
