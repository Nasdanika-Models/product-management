/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Alternative;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.AlternativeImpl#getAlternativeType <em>Alternative Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeImpl extends ModelElementImpl implements Alternative {
	/**
	 * The default value of the '{@link #getAlternativeType() <em>Alternative Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeType()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlternativeType() {
		return (String)eDynamicGet(ProductManagementPackage.ALTERNATIVE__ALTERNATIVE_TYPE, ProductManagementPackage.Literals.ALTERNATIVE__ALTERNATIVE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternativeType(String newAlternativeType) {
		eDynamicSet(ProductManagementPackage.ALTERNATIVE__ALTERNATIVE_TYPE, ProductManagementPackage.Literals.ALTERNATIVE__ALTERNATIVE_TYPE, newAlternativeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.ALTERNATIVE__ALTERNATIVE_TYPE:
				return getAlternativeType();
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
			case ProductManagementPackage.ALTERNATIVE__ALTERNATIVE_TYPE:
				setAlternativeType((String)newValue);
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
			case ProductManagementPackage.ALTERNATIVE__ALTERNATIVE_TYPE:
				setAlternativeType(ALTERNATIVE_TYPE_EDEFAULT);
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
			case ProductManagementPackage.ALTERNATIVE__ALTERNATIVE_TYPE:
				return ALTERNATIVE_TYPE_EDEFAULT == null ? getAlternativeType() != null : !ALTERNATIVE_TYPE_EDEFAULT.equals(getAlternativeType());
		}
		return super.eIsSet(featureID);
	}

} //AlternativeImpl
