/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

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
	public EList<ConcernReference> getSupportingNeeds() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.GOAL__SUPPORTING_NEEDS, ProductmanagementPackage.Literals.GOAL__SUPPORTING_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getBlockers() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.GOAL__BLOCKERS, ProductmanagementPackage.Literals.GOAL__BLOCKERS, true, true);
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
				getSupportingNeeds().addAll((Collection<? extends ConcernReference>)newValue);
				return;
			case ProductmanagementPackage.GOAL__BLOCKERS:
				getBlockers().clear();
				getBlockers().addAll((Collection<? extends ConcernReference>)newValue);
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
