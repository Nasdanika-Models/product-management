/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.BlockedGoals;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.SupportedGoals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GoalImpl#getSupportingNeeds <em>Supporting Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GoalImpl#getBlockers <em>Blockers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends ConcernImpl implements Goal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SupportedGoals> getSupportingNeeds() {
		return (EList<SupportedGoals>)eDynamicGet(ProductmanagementPackage.GOAL__SUPPORTING_NEEDS, ProductmanagementPackage.Literals.GOAL__SUPPORTING_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BlockedGoals> getBlockers() {
		return (EList<BlockedGoals>)eDynamicGet(ProductmanagementPackage.GOAL__BLOCKERS, ProductmanagementPackage.Literals.GOAL__BLOCKERS, true, true);
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
			case ProductmanagementPackage.GOAL__SUPPORTING_NEEDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportingNeeds()).basicAdd(otherEnd, msgs);
			case ProductmanagementPackage.GOAL__BLOCKERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlockers()).basicAdd(otherEnd, msgs);
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
			case ProductmanagementPackage.GOAL__SUPPORTING_NEEDS:
				return ((InternalEList<?>)getSupportingNeeds()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.GOAL__BLOCKERS:
				return ((InternalEList<?>)getBlockers()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.GOAL__SUPPORTING_NEEDS:
				return getSupportingNeeds();
			case ProductmanagementPackage.GOAL__BLOCKERS:
				return getBlockers();
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
			case ProductmanagementPackage.GOAL__SUPPORTING_NEEDS:
				getSupportingNeeds().clear();
				getSupportingNeeds().addAll((Collection<? extends SupportedGoals>)newValue);
				return;
			case ProductmanagementPackage.GOAL__BLOCKERS:
				getBlockers().clear();
				getBlockers().addAll((Collection<? extends BlockedGoals>)newValue);
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
			case ProductmanagementPackage.GOAL__SUPPORTING_NEEDS:
				getSupportingNeeds().clear();
				return;
			case ProductmanagementPackage.GOAL__BLOCKERS:
				getBlockers().clear();
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
			case ProductmanagementPackage.GOAL__SUPPORTING_NEEDS:
				return !getSupportingNeeds().isEmpty();
			case ProductmanagementPackage.GOAL__BLOCKERS:
				return !getBlockers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
