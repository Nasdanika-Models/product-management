/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.OutcomeMetric;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcome Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.OutcomeMetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.OutcomeMetricImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutcomeMetricImpl extends ModelElementImpl implements OutcomeMetric {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutcomeMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.OUTCOME_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return (String)eDynamicGet(ProductManagementPackage.OUTCOME_METRIC__UNIT, ProductManagementPackage.Literals.OUTCOME_METRIC__UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		eDynamicSet(ProductManagementPackage.OUTCOME_METRIC__UNIT, ProductManagementPackage.Literals.OUTCOME_METRIC__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetValue() {
		return (String)eDynamicGet(ProductManagementPackage.OUTCOME_METRIC__TARGET_VALUE, ProductManagementPackage.Literals.OUTCOME_METRIC__TARGET_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetValue(String newTargetValue) {
		eDynamicSet(ProductManagementPackage.OUTCOME_METRIC__TARGET_VALUE, ProductManagementPackage.Literals.OUTCOME_METRIC__TARGET_VALUE, newTargetValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.OUTCOME_METRIC__UNIT:
				return getUnit();
			case ProductManagementPackage.OUTCOME_METRIC__TARGET_VALUE:
				return getTargetValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductManagementPackage.OUTCOME_METRIC__UNIT:
				setUnit((String)newValue);
				return;
			case ProductManagementPackage.OUTCOME_METRIC__TARGET_VALUE:
				setTargetValue((String)newValue);
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
			case ProductManagementPackage.OUTCOME_METRIC__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case ProductManagementPackage.OUTCOME_METRIC__TARGET_VALUE:
				setTargetValue(TARGET_VALUE_EDEFAULT);
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
			case ProductManagementPackage.OUTCOME_METRIC__UNIT:
				return UNIT_EDEFAULT == null ? getUnit() != null : !UNIT_EDEFAULT.equals(getUnit());
			case ProductManagementPackage.OUTCOME_METRIC__TARGET_VALUE:
				return TARGET_VALUE_EDEFAULT == null ? getTargetValue() != null : !TARGET_VALUE_EDEFAULT.equals(getTargetValue());
		}
		return super.eIsSet(featureID);
	}

} //OutcomeMetricImpl
