/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.CompanySize;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CompanySizeImpl#getEmployeeBand <em>Employee Band</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CompanySizeImpl#getRevenueBand <em>Revenue Band</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanySizeImpl extends ModelElementImpl implements CompanySize {
	/**
	 * The default value of the '{@link #getEmployeeBand() <em>Employee Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeBand()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_BAND_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRevenueBand() <em>Revenue Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenueBand()
	 * @generated
	 * @ordered
	 */
	protected static final String REVENUE_BAND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanySizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.COMPANY_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmployeeBand() {
		return (String)eDynamicGet(ProductManagementPackage.COMPANY_SIZE__EMPLOYEE_BAND, ProductManagementPackage.Literals.COMPANY_SIZE__EMPLOYEE_BAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeeBand(String newEmployeeBand) {
		eDynamicSet(ProductManagementPackage.COMPANY_SIZE__EMPLOYEE_BAND, ProductManagementPackage.Literals.COMPANY_SIZE__EMPLOYEE_BAND, newEmployeeBand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevenueBand() {
		return (String)eDynamicGet(ProductManagementPackage.COMPANY_SIZE__REVENUE_BAND, ProductManagementPackage.Literals.COMPANY_SIZE__REVENUE_BAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevenueBand(String newRevenueBand) {
		eDynamicSet(ProductManagementPackage.COMPANY_SIZE__REVENUE_BAND, ProductManagementPackage.Literals.COMPANY_SIZE__REVENUE_BAND, newRevenueBand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.COMPANY_SIZE__EMPLOYEE_BAND:
				return getEmployeeBand();
			case ProductManagementPackage.COMPANY_SIZE__REVENUE_BAND:
				return getRevenueBand();
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
			case ProductManagementPackage.COMPANY_SIZE__EMPLOYEE_BAND:
				setEmployeeBand((String)newValue);
				return;
			case ProductManagementPackage.COMPANY_SIZE__REVENUE_BAND:
				setRevenueBand((String)newValue);
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
			case ProductManagementPackage.COMPANY_SIZE__EMPLOYEE_BAND:
				setEmployeeBand(EMPLOYEE_BAND_EDEFAULT);
				return;
			case ProductManagementPackage.COMPANY_SIZE__REVENUE_BAND:
				setRevenueBand(REVENUE_BAND_EDEFAULT);
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
			case ProductManagementPackage.COMPANY_SIZE__EMPLOYEE_BAND:
				return EMPLOYEE_BAND_EDEFAULT == null ? getEmployeeBand() != null : !EMPLOYEE_BAND_EDEFAULT.equals(getEmployeeBand());
			case ProductManagementPackage.COMPANY_SIZE__REVENUE_BAND:
				return REVENUE_BAND_EDEFAULT == null ? getRevenueBand() != null : !REVENUE_BAND_EDEFAULT.equals(getRevenueBand());
		}
		return super.eIsSet(featureID);
	}

} //CompanySizeImpl
