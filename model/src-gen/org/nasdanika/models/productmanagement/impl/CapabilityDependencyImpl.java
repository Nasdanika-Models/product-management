/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityDependency;
import org.nasdanika.models.productmanagement.DependencyKind;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityDependencyImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityDependencyImpl extends ModelElementImpl implements CapabilityDependency {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DependencyKind KIND_EDEFAULT = DependencyKind.PREREQUISITE;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.CAPABILITY_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductmanagementPackage.CAPABILITY_DEPENDENCY__CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY_DEPENDENCY__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyKind getKind() {
		return (DependencyKind)eDynamicGet(ProductmanagementPackage.CAPABILITY_DEPENDENCY__KIND, ProductmanagementPackage.Literals.CAPABILITY_DEPENDENCY__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(DependencyKind newKind) {
		eDynamicSet(ProductmanagementPackage.CAPABILITY_DEPENDENCY__KIND, ProductmanagementPackage.Literals.CAPABILITY_DEPENDENCY__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return (Boolean)eDynamicGet(ProductmanagementPackage.CAPABILITY_DEPENDENCY__OPTIONAL, ProductmanagementPackage.Literals.CAPABILITY_DEPENDENCY__OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		eDynamicSet(ProductmanagementPackage.CAPABILITY_DEPENDENCY__OPTIONAL, ProductmanagementPackage.Literals.CAPABILITY_DEPENDENCY__OPTIONAL, newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__CAPABILITIES:
				return getCapabilities();
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__KIND:
				return getKind();
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__OPTIONAL:
				return isOptional();
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
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__KIND:
				setKind((DependencyKind)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__OPTIONAL:
				setOptional((Boolean)newValue);
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
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__CAPABILITIES:
				getCapabilities().clear();
				return;
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__KIND:
				return getKind() != KIND_EDEFAULT;
			case ProductmanagementPackage.CAPABILITY_DEPENDENCY__OPTIONAL:
				return isOptional() != OPTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityDependencyImpl
