/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.RegulatoryConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulatory Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.RegulatoryConstraintImpl#getRegulation <em>Regulation</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.RegulatoryConstraintImpl#getAffectedCapabilities <em>Affected Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatoryConstraintImpl extends ModelElementImpl implements RegulatoryConstraint {
	/**
	 * The default value of the '{@link #getRegulation() <em>Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulation()
	 * @generated
	 * @ordered
	 */
	protected static final String REGULATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatoryConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.REGULATORY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegulation() {
		return (String)eDynamicGet(ProductManagementPackage.REGULATORY_CONSTRAINT__REGULATION, ProductManagementPackage.Literals.REGULATORY_CONSTRAINT__REGULATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulation(String newRegulation) {
		eDynamicSet(ProductManagementPackage.REGULATORY_CONSTRAINT__REGULATION, ProductManagementPackage.Literals.REGULATORY_CONSTRAINT__REGULATION, newRegulation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getAffectedCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES, ProductManagementPackage.Literals.REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.REGULATORY_CONSTRAINT__REGULATION:
				return getRegulation();
			case ProductManagementPackage.REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES:
				return getAffectedCapabilities();
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
			case ProductManagementPackage.REGULATORY_CONSTRAINT__REGULATION:
				setRegulation((String)newValue);
				return;
			case ProductManagementPackage.REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES:
				getAffectedCapabilities().clear();
				getAffectedCapabilities().addAll((Collection<? extends Capability>)newValue);
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
			case ProductManagementPackage.REGULATORY_CONSTRAINT__REGULATION:
				setRegulation(REGULATION_EDEFAULT);
				return;
			case ProductManagementPackage.REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES:
				getAffectedCapabilities().clear();
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
			case ProductManagementPackage.REGULATORY_CONSTRAINT__REGULATION:
				return REGULATION_EDEFAULT == null ? getRegulation() != null : !REGULATION_EDEFAULT.equals(getRegulation());
			case ProductManagementPackage.REGULATORY_CONSTRAINT__AFFECTED_CAPABILITIES:
				return !getAffectedCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegulatoryConstraintImpl
