/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Behavior;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.BehaviorImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.BehaviorImpl#getRelatedNeeds <em>Related Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.BehaviorImpl#getRelatedPainPoints <em>Related Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.BehaviorImpl#getRelatedGoals <em>Related Goals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends ModelElementImpl implements Behavior {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return (String)eDynamicGet(ProductManagementPackage.BEHAVIOR__CATEGORY, ProductManagementPackage.Literals.BEHAVIOR__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		eDynamicSet(ProductManagementPackage.BEHAVIOR__CATEGORY, ProductManagementPackage.Literals.BEHAVIOR__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getRelatedNeeds() {
		return (EList<Need>)eDynamicGet(ProductManagementPackage.BEHAVIOR__RELATED_NEEDS, ProductManagementPackage.Literals.BEHAVIOR__RELATED_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PainPoint> getRelatedPainPoints() {
		return (EList<PainPoint>)eDynamicGet(ProductManagementPackage.BEHAVIOR__RELATED_PAIN_POINTS, ProductManagementPackage.Literals.BEHAVIOR__RELATED_PAIN_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getRelatedGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.BEHAVIOR__RELATED_GOALS, ProductManagementPackage.Literals.BEHAVIOR__RELATED_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.BEHAVIOR__CATEGORY:
				return getCategory();
			case ProductManagementPackage.BEHAVIOR__RELATED_NEEDS:
				return getRelatedNeeds();
			case ProductManagementPackage.BEHAVIOR__RELATED_PAIN_POINTS:
				return getRelatedPainPoints();
			case ProductManagementPackage.BEHAVIOR__RELATED_GOALS:
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
			case ProductManagementPackage.BEHAVIOR__CATEGORY:
				setCategory((String)newValue);
				return;
			case ProductManagementPackage.BEHAVIOR__RELATED_NEEDS:
				getRelatedNeeds().clear();
				getRelatedNeeds().addAll((Collection<? extends Need>)newValue);
				return;
			case ProductManagementPackage.BEHAVIOR__RELATED_PAIN_POINTS:
				getRelatedPainPoints().clear();
				getRelatedPainPoints().addAll((Collection<? extends PainPoint>)newValue);
				return;
			case ProductManagementPackage.BEHAVIOR__RELATED_GOALS:
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
			case ProductManagementPackage.BEHAVIOR__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case ProductManagementPackage.BEHAVIOR__RELATED_NEEDS:
				getRelatedNeeds().clear();
				return;
			case ProductManagementPackage.BEHAVIOR__RELATED_PAIN_POINTS:
				getRelatedPainPoints().clear();
				return;
			case ProductManagementPackage.BEHAVIOR__RELATED_GOALS:
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
			case ProductManagementPackage.BEHAVIOR__CATEGORY:
				return CATEGORY_EDEFAULT == null ? getCategory() != null : !CATEGORY_EDEFAULT.equals(getCategory());
			case ProductManagementPackage.BEHAVIOR__RELATED_NEEDS:
				return !getRelatedNeeds().isEmpty();
			case ProductManagementPackage.BEHAVIOR__RELATED_PAIN_POINTS:
				return !getRelatedPainPoints().isEmpty();
			case ProductManagementPackage.BEHAVIOR__RELATED_GOALS:
				return !getRelatedGoals().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorImpl
