/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityReference;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityReferenceImpl extends ModelElementImpl implements CapabilityReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.CAPABILITY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability getTarget() {
		return (Capability)eDynamicGet(ProductmanagementPackage.CAPABILITY_REFERENCE__TARGET, ProductmanagementPackage.Literals.CAPABILITY_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetTarget() {
		return (Capability)eDynamicGet(ProductmanagementPackage.CAPABILITY_REFERENCE__TARGET, ProductmanagementPackage.Literals.CAPABILITY_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Capability newTarget) {
		eDynamicSet(ProductmanagementPackage.CAPABILITY_REFERENCE__TARGET, ProductmanagementPackage.Literals.CAPABILITY_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY_REFERENCE__TARGET:
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
			case ProductmanagementPackage.CAPABILITY_REFERENCE__TARGET:
				setTarget((Capability)newValue);
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
			case ProductmanagementPackage.CAPABILITY_REFERENCE__TARGET:
				setTarget((Capability)null);
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
			case ProductmanagementPackage.CAPABILITY_REFERENCE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityReferenceImpl
