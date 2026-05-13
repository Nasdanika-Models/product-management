/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.SupportedGoals;
import org.nasdanika.models.productmanagement.ViolatedNeeds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getViolators <em>Violators</em>}</li>
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
	public EList<SupportedGoals> getSupports() {
		return (EList<SupportedGoals>)eDynamicGet(ProductmanagementPackage.NEED__SUPPORTS, ProductmanagementPackage.Literals.NEED__SUPPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViolatedNeeds> getViolators() {
		return (EList<ViolatedNeeds>)eDynamicGet(ProductmanagementPackage.NEED__VIOLATORS, ProductmanagementPackage.Literals.NEED__VIOLATORS, true, true);
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
			case ProductmanagementPackage.NEED__VIOLATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViolators()).basicAdd(otherEnd, msgs);
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				return ((InternalEList<?>)getSupports()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.NEED__VIOLATORS:
				return ((InternalEList<?>)getViolators()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.NEED__VIOLATORS:
				return getViolators();
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
				getSupports().addAll((Collection<? extends SupportedGoals>)newValue);
				return;
			case ProductmanagementPackage.NEED__VIOLATORS:
				getViolators().clear();
				getViolators().addAll((Collection<? extends ViolatedNeeds>)newValue);
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
			case ProductmanagementPackage.NEED__VIOLATORS:
				getViolators().clear();
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
			case ProductmanagementPackage.NEED__VIOLATORS:
				return !getViolators().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NeedImpl
