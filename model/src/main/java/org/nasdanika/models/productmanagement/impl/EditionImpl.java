/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.Channel;
import org.nasdanika.models.productmanagement.Edition;
import org.nasdanika.models.productmanagement.Feature;
import org.nasdanika.models.productmanagement.Geography;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EditionImpl#getIncludedFeatures <em>Included Features</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EditionImpl#getIncludedCapabilities <em>Included Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EditionImpl#getAvailableGeographies <em>Available Geographies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EditionImpl#getAvailableChannels <em>Available Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditionImpl extends ModelElementImpl implements Edition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.EDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getIncludedFeatures() {
		return (EList<Feature>)eDynamicGet(ProductManagementPackage.EDITION__INCLUDED_FEATURES, ProductManagementPackage.Literals.EDITION__INCLUDED_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getIncludedCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.EDITION__INCLUDED_CAPABILITIES, ProductManagementPackage.Literals.EDITION__INCLUDED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Geography> getAvailableGeographies() {
		return (EList<Geography>)eDynamicGet(ProductManagementPackage.EDITION__AVAILABLE_GEOGRAPHIES, ProductManagementPackage.Literals.EDITION__AVAILABLE_GEOGRAPHIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Channel> getAvailableChannels() {
		return (EList<Channel>)eDynamicGet(ProductManagementPackage.EDITION__AVAILABLE_CHANNELS, ProductManagementPackage.Literals.EDITION__AVAILABLE_CHANNELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.EDITION__INCLUDED_FEATURES:
				return getIncludedFeatures();
			case ProductManagementPackage.EDITION__INCLUDED_CAPABILITIES:
				return getIncludedCapabilities();
			case ProductManagementPackage.EDITION__AVAILABLE_GEOGRAPHIES:
				return getAvailableGeographies();
			case ProductManagementPackage.EDITION__AVAILABLE_CHANNELS:
				return getAvailableChannels();
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
			case ProductManagementPackage.EDITION__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				getIncludedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case ProductManagementPackage.EDITION__INCLUDED_CAPABILITIES:
				getIncludedCapabilities().clear();
				getIncludedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductManagementPackage.EDITION__AVAILABLE_GEOGRAPHIES:
				getAvailableGeographies().clear();
				getAvailableGeographies().addAll((Collection<? extends Geography>)newValue);
				return;
			case ProductManagementPackage.EDITION__AVAILABLE_CHANNELS:
				getAvailableChannels().clear();
				getAvailableChannels().addAll((Collection<? extends Channel>)newValue);
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
			case ProductManagementPackage.EDITION__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				return;
			case ProductManagementPackage.EDITION__INCLUDED_CAPABILITIES:
				getIncludedCapabilities().clear();
				return;
			case ProductManagementPackage.EDITION__AVAILABLE_GEOGRAPHIES:
				getAvailableGeographies().clear();
				return;
			case ProductManagementPackage.EDITION__AVAILABLE_CHANNELS:
				getAvailableChannels().clear();
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
			case ProductManagementPackage.EDITION__INCLUDED_FEATURES:
				return !getIncludedFeatures().isEmpty();
			case ProductManagementPackage.EDITION__INCLUDED_CAPABILITIES:
				return !getIncludedCapabilities().isEmpty();
			case ProductManagementPackage.EDITION__AVAILABLE_GEOGRAPHIES:
				return !getAvailableGeographies().isEmpty();
			case ProductManagementPackage.EDITION__AVAILABLE_CHANNELS:
				return !getAvailableChannels().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EditionImpl
