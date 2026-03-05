/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.GoalType;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GoalImpl#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GoalImpl#getRelatedGoals <em>Related Goals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends ModelElementImpl implements Goal {
	/**
	 * The default value of the '{@link #getGoalType() <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalType()
	 * @generated
	 * @ordered
	 */
	protected static final GoalType GOAL_TYPE_EDEFAULT = GoalType.FUNCTIONAL;

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
		return ProductManagementPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalType getGoalType() {
		return (GoalType)eDynamicGet(ProductManagementPackage.GOAL__GOAL_TYPE, ProductManagementPackage.Literals.GOAL__GOAL_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalType(GoalType newGoalType) {
		eDynamicSet(ProductManagementPackage.GOAL__GOAL_TYPE, ProductManagementPackage.Literals.GOAL__GOAL_TYPE, newGoalType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getRelatedGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.GOAL__RELATED_GOALS, ProductManagementPackage.Literals.GOAL__RELATED_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.GOAL__GOAL_TYPE:
				return getGoalType();
			case ProductManagementPackage.GOAL__RELATED_GOALS:
				return getRelatedGoals();
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
			case ProductManagementPackage.GOAL__GOAL_TYPE:
				setGoalType((GoalType)newValue);
				return;
			case ProductManagementPackage.GOAL__RELATED_GOALS:
				getRelatedGoals().clear();
				getRelatedGoals().addAll((Collection<? extends Goal>)newValue);
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
			case ProductManagementPackage.GOAL__GOAL_TYPE:
				setGoalType(GOAL_TYPE_EDEFAULT);
				return;
			case ProductManagementPackage.GOAL__RELATED_GOALS:
				getRelatedGoals().clear();
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
			case ProductManagementPackage.GOAL__GOAL_TYPE:
				return getGoalType() != GOAL_TYPE_EDEFAULT;
			case ProductManagementPackage.GOAL__RELATED_GOALS:
				return !getRelatedGoals().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
