/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Channel;
import org.nasdanika.models.productmanagement.CompanySize;
import org.nasdanika.models.productmanagement.Geography;
import org.nasdanika.models.productmanagement.IdealCustomerProfile;
import org.nasdanika.models.productmanagement.Industry;
import org.nasdanika.models.productmanagement.MarketSegment;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Market Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl#getSegmentType <em>Segment Type</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl#getIndustries <em>Industries</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl#getGeographies <em>Geographies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl#getCompanySizes <em>Company Sizes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.MarketSegmentImpl#getIdealCustomerProfiles <em>Ideal Customer Profiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketSegmentImpl extends ModelElementImpl implements MarketSegment {
	/**
	 * The default value of the '{@link #getSegmentType() <em>Segment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.MARKET_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSegmentType() {
		return (String)eDynamicGet(ProductManagementPackage.MARKET_SEGMENT__SEGMENT_TYPE, ProductManagementPackage.Literals.MARKET_SEGMENT__SEGMENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentType(String newSegmentType) {
		eDynamicSet(ProductManagementPackage.MARKET_SEGMENT__SEGMENT_TYPE, ProductManagementPackage.Literals.MARKET_SEGMENT__SEGMENT_TYPE, newSegmentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getTargetPersonas() {
		return (EList<Persona>)eDynamicGet(ProductManagementPackage.MARKET_SEGMENT__TARGET_PERSONAS, ProductManagementPackage.Literals.MARKET_SEGMENT__TARGET_PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Industry> getIndustries() {
		return (EList<Industry>)eDynamicGet(ProductManagementPackage.MARKET_SEGMENT__INDUSTRIES, ProductManagementPackage.Literals.MARKET_SEGMENT__INDUSTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Geography> getGeographies() {
		return (EList<Geography>)eDynamicGet(ProductManagementPackage.MARKET_SEGMENT__GEOGRAPHIES, ProductManagementPackage.Literals.MARKET_SEGMENT__GEOGRAPHIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CompanySize> getCompanySizes() {
		return (EList<CompanySize>)eDynamicGet(ProductManagementPackage.MARKET_SEGMENT__COMPANY_SIZES, ProductManagementPackage.Literals.MARKET_SEGMENT__COMPANY_SIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Channel> getChannels() {
		return (EList<Channel>)eDynamicGet(ProductManagementPackage.MARKET_SEGMENT__CHANNELS, ProductManagementPackage.Literals.MARKET_SEGMENT__CHANNELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IdealCustomerProfile> getIdealCustomerProfiles() {
		return (EList<IdealCustomerProfile>)eDynamicGet(ProductManagementPackage.MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES, ProductManagementPackage.Literals.MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.MARKET_SEGMENT__INDUSTRIES:
				return ((InternalEList<?>)getIndustries()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.MARKET_SEGMENT__GEOGRAPHIES:
				return ((InternalEList<?>)getGeographies()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.MARKET_SEGMENT__COMPANY_SIZES:
				return ((InternalEList<?>)getCompanySizes()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.MARKET_SEGMENT__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES:
				return ((InternalEList<?>)getIdealCustomerProfiles()).basicRemove(otherEnd, msgs);
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
			case ProductManagementPackage.MARKET_SEGMENT__SEGMENT_TYPE:
				return getSegmentType();
			case ProductManagementPackage.MARKET_SEGMENT__TARGET_PERSONAS:
				return getTargetPersonas();
			case ProductManagementPackage.MARKET_SEGMENT__INDUSTRIES:
				return getIndustries();
			case ProductManagementPackage.MARKET_SEGMENT__GEOGRAPHIES:
				return getGeographies();
			case ProductManagementPackage.MARKET_SEGMENT__COMPANY_SIZES:
				return getCompanySizes();
			case ProductManagementPackage.MARKET_SEGMENT__CHANNELS:
				return getChannels();
			case ProductManagementPackage.MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES:
				return getIdealCustomerProfiles();
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
			case ProductManagementPackage.MARKET_SEGMENT__SEGMENT_TYPE:
				setSegmentType((String)newValue);
				return;
			case ProductManagementPackage.MARKET_SEGMENT__TARGET_PERSONAS:
				getTargetPersonas().clear();
				getTargetPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductManagementPackage.MARKET_SEGMENT__INDUSTRIES:
				getIndustries().clear();
				getIndustries().addAll((Collection<? extends Industry>)newValue);
				return;
			case ProductManagementPackage.MARKET_SEGMENT__GEOGRAPHIES:
				getGeographies().clear();
				getGeographies().addAll((Collection<? extends Geography>)newValue);
				return;
			case ProductManagementPackage.MARKET_SEGMENT__COMPANY_SIZES:
				getCompanySizes().clear();
				getCompanySizes().addAll((Collection<? extends CompanySize>)newValue);
				return;
			case ProductManagementPackage.MARKET_SEGMENT__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case ProductManagementPackage.MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES:
				getIdealCustomerProfiles().clear();
				getIdealCustomerProfiles().addAll((Collection<? extends IdealCustomerProfile>)newValue);
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
			case ProductManagementPackage.MARKET_SEGMENT__SEGMENT_TYPE:
				setSegmentType(SEGMENT_TYPE_EDEFAULT);
				return;
			case ProductManagementPackage.MARKET_SEGMENT__TARGET_PERSONAS:
				getTargetPersonas().clear();
				return;
			case ProductManagementPackage.MARKET_SEGMENT__INDUSTRIES:
				getIndustries().clear();
				return;
			case ProductManagementPackage.MARKET_SEGMENT__GEOGRAPHIES:
				getGeographies().clear();
				return;
			case ProductManagementPackage.MARKET_SEGMENT__COMPANY_SIZES:
				getCompanySizes().clear();
				return;
			case ProductManagementPackage.MARKET_SEGMENT__CHANNELS:
				getChannels().clear();
				return;
			case ProductManagementPackage.MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES:
				getIdealCustomerProfiles().clear();
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
			case ProductManagementPackage.MARKET_SEGMENT__SEGMENT_TYPE:
				return SEGMENT_TYPE_EDEFAULT == null ? getSegmentType() != null : !SEGMENT_TYPE_EDEFAULT.equals(getSegmentType());
			case ProductManagementPackage.MARKET_SEGMENT__TARGET_PERSONAS:
				return !getTargetPersonas().isEmpty();
			case ProductManagementPackage.MARKET_SEGMENT__INDUSTRIES:
				return !getIndustries().isEmpty();
			case ProductManagementPackage.MARKET_SEGMENT__GEOGRAPHIES:
				return !getGeographies().isEmpty();
			case ProductManagementPackage.MARKET_SEGMENT__COMPANY_SIZES:
				return !getCompanySizes().isEmpty();
			case ProductManagementPackage.MARKET_SEGMENT__CHANNELS:
				return !getChannels().isEmpty();
			case ProductManagementPackage.MARKET_SEGMENT__IDEAL_CUSTOMER_PROFILES:
				return !getIdealCustomerProfiles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MarketSegmentImpl
