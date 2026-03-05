/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Edition;
import org.nasdanika.models.productmanagement.Feature;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.Product;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.Release;
import org.nasdanika.models.productmanagement.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductImpl#getEditions <em>Editions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductImpl#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductImpl#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends ModelElementImpl implements Product {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Edition> getEditions() {
		return (EList<Edition>)eDynamicGet(ProductManagementPackage.PRODUCT__EDITIONS, ProductManagementPackage.Literals.PRODUCT__EDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eDynamicGet(ProductManagementPackage.PRODUCT__FEATURES, ProductManagementPackage.Literals.PRODUCT__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getTargetPersonas() {
		return (EList<Persona>)eDynamicGet(ProductManagementPackage.PRODUCT__TARGET_PERSONAS, ProductManagementPackage.Literals.PRODUCT__TARGET_PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Version> getVersions() {
		return (EList<Version>)eDynamicGet(ProductManagementPackage.PRODUCT__VERSIONS, ProductManagementPackage.Literals.PRODUCT__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(ProductManagementPackage.PRODUCT__RELEASES, ProductManagementPackage.Literals.PRODUCT__RELEASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.PRODUCT__EDITIONS:
				return ((InternalEList<?>)getEditions()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
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
			case ProductManagementPackage.PRODUCT__EDITIONS:
				return getEditions();
			case ProductManagementPackage.PRODUCT__FEATURES:
				return getFeatures();
			case ProductManagementPackage.PRODUCT__TARGET_PERSONAS:
				return getTargetPersonas();
			case ProductManagementPackage.PRODUCT__VERSIONS:
				return getVersions();
			case ProductManagementPackage.PRODUCT__RELEASES:
				return getReleases();
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
			case ProductManagementPackage.PRODUCT__EDITIONS:
				getEditions().clear();
				getEditions().addAll((Collection<? extends Edition>)newValue);
				return;
			case ProductManagementPackage.PRODUCT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case ProductManagementPackage.PRODUCT__TARGET_PERSONAS:
				getTargetPersonas().clear();
				getTargetPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductManagementPackage.PRODUCT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case ProductManagementPackage.PRODUCT__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
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
			case ProductManagementPackage.PRODUCT__EDITIONS:
				getEditions().clear();
				return;
			case ProductManagementPackage.PRODUCT__FEATURES:
				getFeatures().clear();
				return;
			case ProductManagementPackage.PRODUCT__TARGET_PERSONAS:
				getTargetPersonas().clear();
				return;
			case ProductManagementPackage.PRODUCT__VERSIONS:
				getVersions().clear();
				return;
			case ProductManagementPackage.PRODUCT__RELEASES:
				getReleases().clear();
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
			case ProductManagementPackage.PRODUCT__EDITIONS:
				return !getEditions().isEmpty();
			case ProductManagementPackage.PRODUCT__FEATURES:
				return !getFeatures().isEmpty();
			case ProductManagementPackage.PRODUCT__TARGET_PERSONAS:
				return !getTargetPersonas().isEmpty();
			case ProductManagementPackage.PRODUCT__VERSIONS:
				return !getVersions().isEmpty();
			case ProductManagementPackage.PRODUCT__RELEASES:
				return !getReleases().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
