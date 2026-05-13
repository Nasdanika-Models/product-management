/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.CapabilityProviderReference;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Provider Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderReferenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityProviderReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderReferenceImpl extends MinimalEObjectImpl.Container implements CapabilityProviderReference {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityProviderReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.CAPABILITY_PROVIDER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__ID, ProductmanagementPackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__ID, ProductmanagementPackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityProvider getTarget() {
		return (CapabilityProvider)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityProvider basicGetTarget() {
		return (CapabilityProvider)eDynamicGet(ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(CapabilityProvider newTarget) {
		eDynamicSet(ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__ID:
				return getId();
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__ID:
				setId((String)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				setTarget((CapabilityProvider)newValue);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__ID:
				setId(ID_EDEFAULT);
				return;
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				setTarget((CapabilityProvider)null);
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
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case ProductmanagementPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderReferenceImpl
