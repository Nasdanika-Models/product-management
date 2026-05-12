/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.LifecycleStatus;
import org.nasdanika.models.productmanagement.LifecycleStatusPeriod;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifecycle Status Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.LifecycleStatusPeriodImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifecycleStatusPeriodImpl extends ModelElementImpl implements LifecycleStatusPeriod {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final LifecycleStatus STATUS_EDEFAULT = LifecycleStatus.PLANNED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleStatusPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.LIFECYCLE_STATUS_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecycleStatus getStatus() {
		return (LifecycleStatus)eDynamicGet(ProductmanagementPackage.LIFECYCLE_STATUS_PERIOD__STATUS, ProductmanagementPackage.Literals.LIFECYCLE_STATUS_PERIOD__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(LifecycleStatus newStatus) {
		eDynamicSet(ProductmanagementPackage.LIFECYCLE_STATUS_PERIOD__STATUS, ProductmanagementPackage.Literals.LIFECYCLE_STATUS_PERIOD__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductmanagementPackage.LIFECYCLE_STATUS_PERIOD__STATUS:
				return getStatus();
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
			case ProductmanagementPackage.LIFECYCLE_STATUS_PERIOD__STATUS:
				setStatus((LifecycleStatus)newValue);
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
			case ProductmanagementPackage.LIFECYCLE_STATUS_PERIOD__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ProductmanagementPackage.LIFECYCLE_STATUS_PERIOD__STATUS:
				return getStatus() != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //LifecycleStatusPeriodImpl
