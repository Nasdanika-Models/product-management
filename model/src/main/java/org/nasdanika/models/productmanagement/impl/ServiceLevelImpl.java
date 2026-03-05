/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.ServiceLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ServiceLevelImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ServiceLevelImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelImpl extends ModelElementImpl implements ServiceLevel {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.SERVICE_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetric() {
		return (String)eDynamicGet(ProductManagementPackage.SERVICE_LEVEL__METRIC, ProductManagementPackage.Literals.SERVICE_LEVEL__METRIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(String newMetric) {
		eDynamicSet(ProductManagementPackage.SERVICE_LEVEL__METRIC, ProductManagementPackage.Literals.SERVICE_LEVEL__METRIC, newMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(ProductManagementPackage.SERVICE_LEVEL__VALUE, ProductManagementPackage.Literals.SERVICE_LEVEL__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(ProductManagementPackage.SERVICE_LEVEL__VALUE, ProductManagementPackage.Literals.SERVICE_LEVEL__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.SERVICE_LEVEL__METRIC:
				return getMetric();
			case ProductManagementPackage.SERVICE_LEVEL__VALUE:
				return getValue();
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
			case ProductManagementPackage.SERVICE_LEVEL__METRIC:
				setMetric((String)newValue);
				return;
			case ProductManagementPackage.SERVICE_LEVEL__VALUE:
				setValue((String)newValue);
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
			case ProductManagementPackage.SERVICE_LEVEL__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case ProductManagementPackage.SERVICE_LEVEL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ProductManagementPackage.SERVICE_LEVEL__METRIC:
				return METRIC_EDEFAULT == null ? getMetric() != null : !METRIC_EDEFAULT.equals(getMetric());
			case ProductManagementPackage.SERVICE_LEVEL__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelImpl
