/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Feature;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.Release;
import org.nasdanika.models.productmanagement.ReleaseStatus;
import org.nasdanika.models.productmanagement.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ReleaseImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ReleaseImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ReleaseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ReleaseImpl#getIncludedFeatures <em>Included Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseImpl extends ModelElementImpl implements Release {
	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ReleaseStatus STATUS_EDEFAULT = ReleaseStatus.PLANNED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.RELEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version getVersion() {
		return (Version)eDynamicGet(ProductManagementPackage.RELEASE__VERSION, ProductManagementPackage.Literals.RELEASE__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetVersion() {
		return (Version)eDynamicGet(ProductManagementPackage.RELEASE__VERSION, ProductManagementPackage.Literals.RELEASE__VERSION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(Version newVersion) {
		eDynamicSet(ProductManagementPackage.RELEASE__VERSION, ProductManagementPackage.Literals.RELEASE__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReleaseDate() {
		return (Date)eDynamicGet(ProductManagementPackage.RELEASE__RELEASE_DATE, ProductManagementPackage.Literals.RELEASE__RELEASE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(Date newReleaseDate) {
		eDynamicSet(ProductManagementPackage.RELEASE__RELEASE_DATE, ProductManagementPackage.Literals.RELEASE__RELEASE_DATE, newReleaseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseStatus getStatus() {
		return (ReleaseStatus)eDynamicGet(ProductManagementPackage.RELEASE__STATUS, ProductManagementPackage.Literals.RELEASE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ReleaseStatus newStatus) {
		eDynamicSet(ProductManagementPackage.RELEASE__STATUS, ProductManagementPackage.Literals.RELEASE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getIncludedFeatures() {
		return (EList<Feature>)eDynamicGet(ProductManagementPackage.RELEASE__INCLUDED_FEATURES, ProductManagementPackage.Literals.RELEASE__INCLUDED_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.RELEASE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case ProductManagementPackage.RELEASE__RELEASE_DATE:
				return getReleaseDate();
			case ProductManagementPackage.RELEASE__STATUS:
				return getStatus();
			case ProductManagementPackage.RELEASE__INCLUDED_FEATURES:
				return getIncludedFeatures();
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
			case ProductManagementPackage.RELEASE__VERSION:
				setVersion((Version)newValue);
				return;
			case ProductManagementPackage.RELEASE__RELEASE_DATE:
				setReleaseDate((Date)newValue);
				return;
			case ProductManagementPackage.RELEASE__STATUS:
				setStatus((ReleaseStatus)newValue);
				return;
			case ProductManagementPackage.RELEASE__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				getIncludedFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case ProductManagementPackage.RELEASE__VERSION:
				setVersion((Version)null);
				return;
			case ProductManagementPackage.RELEASE__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case ProductManagementPackage.RELEASE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ProductManagementPackage.RELEASE__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
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
			case ProductManagementPackage.RELEASE__VERSION:
				return basicGetVersion() != null;
			case ProductManagementPackage.RELEASE__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? getReleaseDate() != null : !RELEASE_DATE_EDEFAULT.equals(getReleaseDate());
			case ProductManagementPackage.RELEASE__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case ProductManagementPackage.RELEASE__INCLUDED_FEATURES:
				return !getIncludedFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReleaseImpl
