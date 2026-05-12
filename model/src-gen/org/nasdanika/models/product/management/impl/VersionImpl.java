/**
 */
package org.nasdanika.models.product.management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.product.management.LifecycleStatusPeriod;
import org.nasdanika.models.product.management.ManagementPackage;
import org.nasdanika.models.product.management.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.impl.VersionImpl#getVersionString <em>Version String</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.VersionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.VersionImpl#getStatusPeriods <em>Status Periods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends ModelElementImpl implements Version {
	/**
	 * The default value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionString()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionString() {
		return (String)eDynamicGet(ManagementPackage.VERSION__VERSION_STRING, ManagementPackage.Literals.VERSION__VERSION_STRING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionString(String newVersionString) {
		eDynamicSet(ManagementPackage.VERSION__VERSION_STRING, ManagementPackage.Literals.VERSION__VERSION_STRING, newVersionString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return (String)eDynamicGet(ManagementPackage.VERSION__LABEL, ManagementPackage.Literals.VERSION__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		eDynamicSet(ManagementPackage.VERSION__LABEL, ManagementPackage.Literals.VERSION__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LifecycleStatusPeriod> getStatusPeriods() {
		return (EList<LifecycleStatusPeriod>)eDynamicGet(ManagementPackage.VERSION__STATUS_PERIODS, ManagementPackage.Literals.VERSION__STATUS_PERIODS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementPackage.VERSION__STATUS_PERIODS:
				return ((InternalEList<?>)getStatusPeriods()).basicRemove(otherEnd, msgs);
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
			case ManagementPackage.VERSION__VERSION_STRING:
				return getVersionString();
			case ManagementPackage.VERSION__LABEL:
				return getLabel();
			case ManagementPackage.VERSION__STATUS_PERIODS:
				return getStatusPeriods();
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
			case ManagementPackage.VERSION__VERSION_STRING:
				setVersionString((String)newValue);
				return;
			case ManagementPackage.VERSION__LABEL:
				setLabel((String)newValue);
				return;
			case ManagementPackage.VERSION__STATUS_PERIODS:
				getStatusPeriods().clear();
				getStatusPeriods().addAll((Collection<? extends LifecycleStatusPeriod>)newValue);
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
			case ManagementPackage.VERSION__VERSION_STRING:
				setVersionString(VERSION_STRING_EDEFAULT);
				return;
			case ManagementPackage.VERSION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ManagementPackage.VERSION__STATUS_PERIODS:
				getStatusPeriods().clear();
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
			case ManagementPackage.VERSION__VERSION_STRING:
				return VERSION_STRING_EDEFAULT == null ? getVersionString() != null : !VERSION_STRING_EDEFAULT.equals(getVersionString());
			case ManagementPackage.VERSION__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case ManagementPackage.VERSION__STATUS_PERIODS:
				return !getStatusPeriods().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VersionImpl
