/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pain Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getViolatedNeeds <em>Violated Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getBlockedGoals <em>Blocked Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getRelatedPainPoints <em>Related Pain Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PainPointImpl extends ModelElementImpl implements PainPoint {
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
		return ProductManagementPackage.Literals.PAIN_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getViolatedNeeds() {
		return (EList<Need>)eDynamicGet(ProductManagementPackage.PAIN_POINT__VIOLATED_NEEDS, ProductManagementPackage.Literals.PAIN_POINT__VIOLATED_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getBlockedGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.PAIN_POINT__BLOCKED_GOALS, ProductManagementPackage.Literals.PAIN_POINT__BLOCKED_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PainPoint> getRelatedPainPoints() {
		return (EList<PainPoint>)eDynamicGet(ProductManagementPackage.PAIN_POINT__RELATED_PAIN_POINTS, ProductManagementPackage.Literals.PAIN_POINT__RELATED_PAIN_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.PAIN_POINT__VIOLATED_NEEDS:
				return getViolatedNeeds();
			case ProductManagementPackage.PAIN_POINT__BLOCKED_GOALS:
				return getBlockedGoals();
			case ProductManagementPackage.PAIN_POINT__RELATED_PAIN_POINTS:
				return getRelatedPainPoints();
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
			case ProductManagementPackage.PAIN_POINT__VIOLATED_NEEDS:
				getViolatedNeeds().clear();
				getViolatedNeeds().addAll((Collection<? extends Need>)newValue);
				return;
			case ProductManagementPackage.PAIN_POINT__BLOCKED_GOALS:
				getBlockedGoals().clear();
				getBlockedGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ProductManagementPackage.PAIN_POINT__RELATED_PAIN_POINTS:
				getRelatedPainPoints().clear();
				getRelatedPainPoints().addAll((Collection<? extends PainPoint>)newValue);
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
			case ProductManagementPackage.PAIN_POINT__VIOLATED_NEEDS:
				getViolatedNeeds().clear();
				return;
			case ProductManagementPackage.PAIN_POINT__BLOCKED_GOALS:
				getBlockedGoals().clear();
				return;
			case ProductManagementPackage.PAIN_POINT__RELATED_PAIN_POINTS:
				getRelatedPainPoints().clear();
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
			case ProductManagementPackage.PAIN_POINT__VIOLATED_NEEDS:
				return !getViolatedNeeds().isEmpty();
			case ProductManagementPackage.PAIN_POINT__BLOCKED_GOALS:
				return !getBlockedGoals().isEmpty();
			case ProductManagementPackage.PAIN_POINT__RELATED_PAIN_POINTS:
				return !getRelatedPainPoints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PainPointImpl
