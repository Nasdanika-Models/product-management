/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getSupportedGoals <em>Supported Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getRelatedNeeds <em>Related Needs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends ModelElementImpl implements Need {
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
		return ProductManagementPackage.Literals.NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getSupportedGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.NEED__SUPPORTED_GOALS, ProductManagementPackage.Literals.NEED__SUPPORTED_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getRelatedNeeds() {
		return (EList<Need>)eDynamicGet(ProductManagementPackage.NEED__RELATED_NEEDS, ProductManagementPackage.Literals.NEED__RELATED_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.NEED__SUPPORTED_GOALS:
				return getSupportedGoals();
			case ProductManagementPackage.NEED__RELATED_NEEDS:
				return getRelatedNeeds();
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
			case ProductManagementPackage.NEED__SUPPORTED_GOALS:
				getSupportedGoals().clear();
				getSupportedGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ProductManagementPackage.NEED__RELATED_NEEDS:
				getRelatedNeeds().clear();
				getRelatedNeeds().addAll((Collection<? extends Need>)newValue);
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
			case ProductManagementPackage.NEED__SUPPORTED_GOALS:
				getSupportedGoals().clear();
				return;
			case ProductManagementPackage.NEED__RELATED_NEEDS:
				getRelatedNeeds().clear();
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
			case ProductManagementPackage.NEED__SUPPORTED_GOALS:
				return !getSupportedGoals().isEmpty();
			case ProductManagementPackage.NEED__RELATED_NEEDS:
				return !getRelatedNeeds().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NeedImpl
