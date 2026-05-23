/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getViolatedBy <em>Violated By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends ConcernImpl implements Need {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getSupports() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.NEED__SUPPORTS, ProductmanagementPackage.Literals.NEED__SUPPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getViolatedBy() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.NEED__VIOLATED_BY, ProductmanagementPackage.Literals.NEED__VIOLATED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.NEED__SUPPORTS:
				return ((InternalEList<?>)getSupports()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				return ((InternalEList<?>)getViolatedBy()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				return getSupports();
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				return getViolatedBy();
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				getSupports().clear();
				getSupports().addAll((Collection<? extends ConcernReference>)newValue);
				return;
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				getViolatedBy().clear();
				getViolatedBy().addAll((Collection<? extends ConcernReference>)newValue);
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				getSupports().clear();
				return;
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				getViolatedBy().clear();
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				return !getSupports().isEmpty();
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				return !getViolatedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NeedImpl
