/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Geography;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.RegulatoryConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GeographyImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GeographyImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GeographyImpl#getStateProvince <em>State Province</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GeographyImpl#getDataResidencyRegion <em>Data Residency Region</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GeographyImpl#getRegulatoryConstraints <em>Regulatory Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeographyImpl extends ModelElementImpl implements Geography {
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStateProvince() <em>State Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_PROVINCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDataResidencyRegion() <em>Data Residency Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResidencyRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESIDENCY_REGION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.GEOGRAPHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return (String)eDynamicGet(ProductManagementPackage.GEOGRAPHY__REGION, ProductManagementPackage.Literals.GEOGRAPHY__REGION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		eDynamicSet(ProductManagementPackage.GEOGRAPHY__REGION, ProductManagementPackage.Literals.GEOGRAPHY__REGION, newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return (String)eDynamicGet(ProductManagementPackage.GEOGRAPHY__COUNTRY, ProductManagementPackage.Literals.GEOGRAPHY__COUNTRY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		eDynamicSet(ProductManagementPackage.GEOGRAPHY__COUNTRY, ProductManagementPackage.Literals.GEOGRAPHY__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateProvince() {
		return (String)eDynamicGet(ProductManagementPackage.GEOGRAPHY__STATE_PROVINCE, ProductManagementPackage.Literals.GEOGRAPHY__STATE_PROVINCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvince(String newStateProvince) {
		eDynamicSet(ProductManagementPackage.GEOGRAPHY__STATE_PROVINCE, ProductManagementPackage.Literals.GEOGRAPHY__STATE_PROVINCE, newStateProvince);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResidencyRegion() {
		return (String)eDynamicGet(ProductManagementPackage.GEOGRAPHY__DATA_RESIDENCY_REGION, ProductManagementPackage.Literals.GEOGRAPHY__DATA_RESIDENCY_REGION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResidencyRegion(String newDataResidencyRegion) {
		eDynamicSet(ProductManagementPackage.GEOGRAPHY__DATA_RESIDENCY_REGION, ProductManagementPackage.Literals.GEOGRAPHY__DATA_RESIDENCY_REGION, newDataResidencyRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RegulatoryConstraint> getRegulatoryConstraints() {
		return (EList<RegulatoryConstraint>)eDynamicGet(ProductManagementPackage.GEOGRAPHY__REGULATORY_CONSTRAINTS, ProductManagementPackage.Literals.GEOGRAPHY__REGULATORY_CONSTRAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.GEOGRAPHY__REGULATORY_CONSTRAINTS:
				return ((InternalEList<?>)getRegulatoryConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.GEOGRAPHY__REGION:
				return getRegion();
			case ProductManagementPackage.GEOGRAPHY__COUNTRY:
				return getCountry();
			case ProductManagementPackage.GEOGRAPHY__STATE_PROVINCE:
				return getStateProvince();
			case ProductManagementPackage.GEOGRAPHY__DATA_RESIDENCY_REGION:
				return getDataResidencyRegion();
			case ProductManagementPackage.GEOGRAPHY__REGULATORY_CONSTRAINTS:
				return getRegulatoryConstraints();
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
			case ProductManagementPackage.GEOGRAPHY__REGION:
				setRegion((String)newValue);
				return;
			case ProductManagementPackage.GEOGRAPHY__COUNTRY:
				setCountry((String)newValue);
				return;
			case ProductManagementPackage.GEOGRAPHY__STATE_PROVINCE:
				setStateProvince((String)newValue);
				return;
			case ProductManagementPackage.GEOGRAPHY__DATA_RESIDENCY_REGION:
				setDataResidencyRegion((String)newValue);
				return;
			case ProductManagementPackage.GEOGRAPHY__REGULATORY_CONSTRAINTS:
				getRegulatoryConstraints().clear();
				getRegulatoryConstraints().addAll((Collection<? extends RegulatoryConstraint>)newValue);
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
			case ProductManagementPackage.GEOGRAPHY__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case ProductManagementPackage.GEOGRAPHY__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case ProductManagementPackage.GEOGRAPHY__STATE_PROVINCE:
				setStateProvince(STATE_PROVINCE_EDEFAULT);
				return;
			case ProductManagementPackage.GEOGRAPHY__DATA_RESIDENCY_REGION:
				setDataResidencyRegion(DATA_RESIDENCY_REGION_EDEFAULT);
				return;
			case ProductManagementPackage.GEOGRAPHY__REGULATORY_CONSTRAINTS:
				getRegulatoryConstraints().clear();
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
			case ProductManagementPackage.GEOGRAPHY__REGION:
				return REGION_EDEFAULT == null ? getRegion() != null : !REGION_EDEFAULT.equals(getRegion());
			case ProductManagementPackage.GEOGRAPHY__COUNTRY:
				return COUNTRY_EDEFAULT == null ? getCountry() != null : !COUNTRY_EDEFAULT.equals(getCountry());
			case ProductManagementPackage.GEOGRAPHY__STATE_PROVINCE:
				return STATE_PROVINCE_EDEFAULT == null ? getStateProvince() != null : !STATE_PROVINCE_EDEFAULT.equals(getStateProvince());
			case ProductManagementPackage.GEOGRAPHY__DATA_RESIDENCY_REGION:
				return DATA_RESIDENCY_REGION_EDEFAULT == null ? getDataResidencyRegion() != null : !DATA_RESIDENCY_REGION_EDEFAULT.equals(getDataResidencyRegion());
			case ProductManagementPackage.GEOGRAPHY__REGULATORY_CONSTRAINTS:
				return !getRegulatoryConstraints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeographyImpl
