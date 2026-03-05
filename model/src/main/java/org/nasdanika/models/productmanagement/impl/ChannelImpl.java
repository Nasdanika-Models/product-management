/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Channel;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ChannelImpl#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends ModelElementImpl implements Channel {
	/**
	 * The default value of the '{@link #getChannelType() <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChannelType() {
		return (String)eDynamicGet(ProductManagementPackage.CHANNEL__CHANNEL_TYPE, ProductManagementPackage.Literals.CHANNEL__CHANNEL_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelType(String newChannelType) {
		eDynamicSet(ProductManagementPackage.CHANNEL__CHANNEL_TYPE, ProductManagementPackage.Literals.CHANNEL__CHANNEL_TYPE, newChannelType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.CHANNEL__CHANNEL_TYPE:
				return getChannelType();
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
			case ProductManagementPackage.CHANNEL__CHANNEL_TYPE:
				setChannelType((String)newValue);
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
			case ProductManagementPackage.CHANNEL__CHANNEL_TYPE:
				setChannelType(CHANNEL_TYPE_EDEFAULT);
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
			case ProductManagementPackage.CHANNEL__CHANNEL_TYPE:
				return CHANNEL_TYPE_EDEFAULT == null ? getChannelType() != null : !CHANNEL_TYPE_EDEFAULT.equals(getChannelType());
		}
		return super.eIsSet(featureID);
	}

} //ChannelImpl
