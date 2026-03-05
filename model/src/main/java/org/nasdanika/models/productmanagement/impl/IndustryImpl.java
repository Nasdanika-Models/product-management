/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Industry;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.RegulatoryConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Industry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.IndustryImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.IndustryImpl#getRegulatoryConstraints <em>Regulatory Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndustryImpl extends ModelElementImpl implements Industry {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndustryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.INDUSTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return (String)eDynamicGet(ProductManagementPackage.INDUSTRY__CODE, ProductManagementPackage.Literals.INDUSTRY__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		eDynamicSet(ProductManagementPackage.INDUSTRY__CODE, ProductManagementPackage.Literals.INDUSTRY__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RegulatoryConstraint> getRegulatoryConstraints() {
		return (EList<RegulatoryConstraint>)eDynamicGet(ProductManagementPackage.INDUSTRY__REGULATORY_CONSTRAINTS, ProductManagementPackage.Literals.INDUSTRY__REGULATORY_CONSTRAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.INDUSTRY__REGULATORY_CONSTRAINTS:
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
			case ProductManagementPackage.INDUSTRY__CODE:
				return getCode();
			case ProductManagementPackage.INDUSTRY__REGULATORY_CONSTRAINTS:
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
			case ProductManagementPackage.INDUSTRY__CODE:
				setCode((String)newValue);
				return;
			case ProductManagementPackage.INDUSTRY__REGULATORY_CONSTRAINTS:
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
			case ProductManagementPackage.INDUSTRY__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ProductManagementPackage.INDUSTRY__REGULATORY_CONSTRAINTS:
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
			case ProductManagementPackage.INDUSTRY__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case ProductManagementPackage.INDUSTRY__REGULATORY_CONSTRAINTS:
				return !getRegulatoryConstraints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndustryImpl
