/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.VersionImpl#getVersionScheme <em>Version Scheme</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.VersionImpl#getVersionString <em>Version String</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.VersionImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends ModelElementImpl implements Version {
	/**
	 * The default value of the '{@link #getVersionScheme() <em>Version Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_SCHEME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionString()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionScheme() {
		return (String)eDynamicGet(ProductManagementPackage.VERSION__VERSION_SCHEME, ProductManagementPackage.Literals.VERSION__VERSION_SCHEME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionScheme(String newVersionScheme) {
		eDynamicSet(ProductManagementPackage.VERSION__VERSION_SCHEME, ProductManagementPackage.Literals.VERSION__VERSION_SCHEME, newVersionScheme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionString() {
		return (String)eDynamicGet(ProductManagementPackage.VERSION__VERSION_STRING, ProductManagementPackage.Literals.VERSION__VERSION_STRING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionString(String newVersionString) {
		eDynamicSet(ProductManagementPackage.VERSION__VERSION_STRING, ProductManagementPackage.Literals.VERSION__VERSION_STRING, newVersionString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(ProductManagementPackage.VERSION__DATE, ProductManagementPackage.Literals.VERSION__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(ProductManagementPackage.VERSION__DATE, ProductManagementPackage.Literals.VERSION__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.VERSION__VERSION_SCHEME:
				return getVersionScheme();
			case ProductManagementPackage.VERSION__VERSION_STRING:
				return getVersionString();
			case ProductManagementPackage.VERSION__DATE:
				return getDate();
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
			case ProductManagementPackage.VERSION__VERSION_SCHEME:
				setVersionScheme((String)newValue);
				return;
			case ProductManagementPackage.VERSION__VERSION_STRING:
				setVersionString((String)newValue);
				return;
			case ProductManagementPackage.VERSION__DATE:
				setDate((Date)newValue);
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
			case ProductManagementPackage.VERSION__VERSION_SCHEME:
				setVersionScheme(VERSION_SCHEME_EDEFAULT);
				return;
			case ProductManagementPackage.VERSION__VERSION_STRING:
				setVersionString(VERSION_STRING_EDEFAULT);
				return;
			case ProductManagementPackage.VERSION__DATE:
				setDate(DATE_EDEFAULT);
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
			case ProductManagementPackage.VERSION__VERSION_SCHEME:
				return VERSION_SCHEME_EDEFAULT == null ? getVersionScheme() != null : !VERSION_SCHEME_EDEFAULT.equals(getVersionScheme());
			case ProductManagementPackage.VERSION__VERSION_STRING:
				return VERSION_STRING_EDEFAULT == null ? getVersionString() != null : !VERSION_STRING_EDEFAULT.equals(getVersionString());
			case ProductManagementPackage.VERSION__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
		}
		return super.eIsSet(featureID);
	}

} //VersionImpl
