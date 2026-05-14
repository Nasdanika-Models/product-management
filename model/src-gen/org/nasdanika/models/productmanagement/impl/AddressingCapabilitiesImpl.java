/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.AddressingCapabilities;
import org.nasdanika.models.productmanagement.CapabilityDomain;
import org.nasdanika.models.productmanagement.NamedElement;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressing Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.AddressingCapabilitiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.AddressingCapabilitiesImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressingCapabilitiesImpl extends ModelElementImpl implements AddressingCapabilities {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressingCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.ADDRESSING_CAPABILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME, ProductmanagementPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME, ProductmanagementPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getCapabilities() {
		return (EList<AbstractCapability>)eDynamicGet(ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY_DOMAIN__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME:
				return getName();
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES:
				return getCapabilities();
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
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME:
				setName((String)newValue);
				return;
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends AbstractCapability>)newValue);
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
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES:
				getCapabilities().clear();
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
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES:
				return !getCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME: return ProductmanagementPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapability.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES: return ProductmanagementPackage.CAPABILITY_DOMAIN__CAPABILITIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.NAMED_ELEMENT__NAME: return ProductmanagementPackage.ADDRESSING_CAPABILITIES__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapability.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.CAPABILITY_DOMAIN__CAPABILITIES: return ProductmanagementPackage.ADDRESSING_CAPABILITIES__CAPABILITIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AddressingCapabilitiesImpl
