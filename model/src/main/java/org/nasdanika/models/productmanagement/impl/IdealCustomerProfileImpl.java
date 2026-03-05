/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.CompanySize;
import org.nasdanika.models.productmanagement.Geography;
import org.nasdanika.models.productmanagement.IdealCustomerProfile;
import org.nasdanika.models.productmanagement.Industry;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ideal Customer Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl#getTargetIndustries <em>Target Industries</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl#getTargetCompanySizes <em>Target Company Sizes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl#getTargetGeographies <em>Target Geographies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl#getTechStack <em>Tech Stack</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.IdealCustomerProfileImpl#getTargetPersonas <em>Target Personas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdealCustomerProfileImpl extends ModelElementImpl implements IdealCustomerProfile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdealCustomerProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.IDEAL_CUSTOMER_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Industry> getTargetIndustries() {
		return (EList<Industry>)eDynamicGet(ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES, ProductManagementPackage.Literals.IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CompanySize> getTargetCompanySizes() {
		return (EList<CompanySize>)eDynamicGet(ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES, ProductManagementPackage.Literals.IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Geography> getTargetGeographies() {
		return (EList<Geography>)eDynamicGet(ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES, ProductManagementPackage.Literals.IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getTechStack() {
		return (EList<String>)eDynamicGet(ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TECH_STACK, ProductManagementPackage.Literals.IDEAL_CUSTOMER_PROFILE__TECH_STACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getTargetPersonas() {
		return (EList<Persona>)eDynamicGet(ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS, ProductManagementPackage.Literals.IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES:
				return getTargetIndustries();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES:
				return getTargetCompanySizes();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES:
				return getTargetGeographies();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TECH_STACK:
				return getTechStack();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS:
				return getTargetPersonas();
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
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES:
				getTargetIndustries().clear();
				getTargetIndustries().addAll((Collection<? extends Industry>)newValue);
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES:
				getTargetCompanySizes().clear();
				getTargetCompanySizes().addAll((Collection<? extends CompanySize>)newValue);
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES:
				getTargetGeographies().clear();
				getTargetGeographies().addAll((Collection<? extends Geography>)newValue);
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TECH_STACK:
				getTechStack().clear();
				getTechStack().addAll((Collection<? extends String>)newValue);
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS:
				getTargetPersonas().clear();
				getTargetPersonas().addAll((Collection<? extends Persona>)newValue);
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
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES:
				getTargetIndustries().clear();
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES:
				getTargetCompanySizes().clear();
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES:
				getTargetGeographies().clear();
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TECH_STACK:
				getTechStack().clear();
				return;
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS:
				getTargetPersonas().clear();
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
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_INDUSTRIES:
				return !getTargetIndustries().isEmpty();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_COMPANY_SIZES:
				return !getTargetCompanySizes().isEmpty();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_GEOGRAPHIES:
				return !getTargetGeographies().isEmpty();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TECH_STACK:
				return !getTechStack().isEmpty();
			case ProductManagementPackage.IDEAL_CUSTOMER_PROFILE__TARGET_PERSONAS:
				return !getTargetPersonas().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IdealCustomerProfileImpl
