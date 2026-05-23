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
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pain Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getViolates <em>Violates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PainPointImpl extends ConcernImpl implements PainPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PainPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.PAIN_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getBlocks() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.PAIN_POINT__BLOCKS, ProductmanagementPackage.Literals.PAIN_POINT__BLOCKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getViolates() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.PAIN_POINT__VIOLATES, ProductmanagementPackage.Literals.PAIN_POINT__VIOLATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				return ((InternalEList<?>)getViolates()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				return getBlocks();
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				return getViolates();
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends ConcernReference>)newValue);
				return;
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				getViolates().clear();
				getViolates().addAll((Collection<? extends ConcernReference>)newValue);
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				getBlocks().clear();
				return;
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				getViolates().clear();
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				return !getBlocks().isEmpty();
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				return !getViolates().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PainPointImpl
