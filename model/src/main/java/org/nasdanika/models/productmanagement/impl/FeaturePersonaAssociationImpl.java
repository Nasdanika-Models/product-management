/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.FeaturePersonaAssociation;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Persona Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.FeaturePersonaAssociationImpl#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturePersonaAssociationImpl extends ModelElementImpl implements FeaturePersonaAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePersonaAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.FEATURE_PERSONA_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persona getPersona() {
		return (Persona)eDynamicGet(ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION__PERSONA, ProductManagementPackage.Literals.FEATURE_PERSONA_ASSOCIATION__PERSONA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona basicGetPersona() {
		return (Persona)eDynamicGet(ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION__PERSONA, ProductManagementPackage.Literals.FEATURE_PERSONA_ASSOCIATION__PERSONA, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersona(Persona newPersona) {
		eDynamicSet(ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION__PERSONA, ProductManagementPackage.Literals.FEATURE_PERSONA_ASSOCIATION__PERSONA, newPersona);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION__PERSONA:
				if (resolve) return getPersona();
				return basicGetPersona();
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
			case ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION__PERSONA:
				setPersona((Persona)newValue);
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
			case ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION__PERSONA:
				setPersona((Persona)null);
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
			case ProductManagementPackage.FEATURE_PERSONA_ASSOCIATION__PERSONA:
				return basicGetPersona() != null;
		}
		return super.eIsSet(featureID);
	}

} //FeaturePersonaAssociationImpl
