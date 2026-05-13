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
import org.nasdanika.models.productmanagement.AbstractEvidence;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.EvidenceDomain;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.ProvidedCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProvidedCapabilityImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProvidedCapabilityImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedCapabilityImpl extends NamedPeriodImpl implements ProvidedCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.PROVIDED_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getEvidence() {
		return (EList<Evidence>)eDynamicGet(ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE, ProductmanagementPackage.Literals.EVIDENCE_DOMAIN__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapability getCapability() {
		return (AbstractCapability)eDynamicGet(ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY, ProductmanagementPackage.Literals.PROVIDED_CAPABILITY__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapability(AbstractCapability newCapability, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCapability, ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability(AbstractCapability newCapability) {
		eDynamicSet(ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY, ProductmanagementPackage.Literals.PROVIDED_CAPABILITY__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY:
				return basicSetCapability(null, msgs);
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
			case ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE:
				return getEvidence();
			case ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY:
				return getCapability();
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
			case ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY:
				setCapability((AbstractCapability)newValue);
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
			case ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE:
				getEvidence().clear();
				return;
			case ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY:
				setCapability((AbstractCapability)null);
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
			case ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE:
				return !getEvidence().isEmpty();
			case ProductmanagementPackage.PROVIDED_CAPABILITY__CAPABILITY:
				return getCapability() != null;
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
		if (baseClass == AbstractEvidence.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvidenceDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE: return ProductmanagementPackage.EVIDENCE_DOMAIN__EVIDENCE;
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
		if (baseClass == AbstractEvidence.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvidenceDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.EVIDENCE_DOMAIN__EVIDENCE: return ProductmanagementPackage.PROVIDED_CAPABILITY__EVIDENCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProvidedCapabilityImpl
