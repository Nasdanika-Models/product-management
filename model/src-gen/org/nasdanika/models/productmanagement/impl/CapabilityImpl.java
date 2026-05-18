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
import org.nasdanika.models.productmanagement.AbstractConcern;
import org.nasdanika.models.productmanagement.AbstractEvidence;
import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.AddressedConcerns;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.EvidenceDomain;
import org.nasdanika.models.productmanagement.Lifecycle;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getSubCapabilities <em>Sub Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends NamedPeriodImpl implements Capability {
	/**
	 * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected static final Lifecycle LIFECYCLE_EDEFAULT = Lifecycle.DRAFT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getEvidence() {
		return (EList<Evidence>)eDynamicGet(ProductmanagementPackage.CAPABILITY__EVIDENCE, ProductmanagementPackage.Literals.EVIDENCE_DOMAIN__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractPersona> getPersonas() {
		return (EList<AbstractPersona>)eDynamicGet(ProductmanagementPackage.CAPABILITY__PERSONAS, ProductmanagementPackage.Literals.PERSONA_DOMAIN__PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractConcern> getConcerns() {
		return (EList<AbstractConcern>)eDynamicGet(ProductmanagementPackage.CAPABILITY__CONCERNS, ProductmanagementPackage.Literals.CONCERN_DOMAIN__CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AddressedConcerns> getAddresses() {
		return (EList<AddressedConcerns>)eDynamicGet(ProductmanagementPackage.CAPABILITY__ADDRESSES, ProductmanagementPackage.Literals.CAPABILITY__ADDRESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getSubCapabilities() {
		return (EList<AbstractCapability>)eDynamicGet(ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY__SUB_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lifecycle getLifecycle() {
		return (Lifecycle)eDynamicGet(ProductmanagementPackage.CAPABILITY__LIFECYCLE, ProductmanagementPackage.Literals.CAPABILITY__LIFECYCLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycle(Lifecycle newLifecycle) {
		eDynamicSet(ProductmanagementPackage.CAPABILITY__LIFECYCLE, ProductmanagementPackage.Literals.CAPABILITY__LIFECYCLE, newLifecycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.CAPABILITY__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return ((InternalEList<?>)getSubCapabilities()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CAPABILITY__EVIDENCE:
				return getEvidence();
			case ProductmanagementPackage.CAPABILITY__PERSONAS:
				return getPersonas();
			case ProductmanagementPackage.CAPABILITY__CONCERNS:
				return getConcerns();
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return getAddresses();
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return getSubCapabilities();
			case ProductmanagementPackage.CAPABILITY__LIFECYCLE:
				return getLifecycle();
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
			case ProductmanagementPackage.CAPABILITY__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends AbstractPersona>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends AbstractConcern>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends AddressedConcerns>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				getSubCapabilities().clear();
				getSubCapabilities().addAll((Collection<? extends AbstractCapability>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__LIFECYCLE:
				setLifecycle((Lifecycle)newValue);
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
			case ProductmanagementPackage.CAPABILITY__EVIDENCE:
				getEvidence().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__PERSONAS:
				getPersonas().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__CONCERNS:
				getConcerns().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				getAddresses().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				getSubCapabilities().clear();
				return;
			case ProductmanagementPackage.CAPABILITY__LIFECYCLE:
				setLifecycle(LIFECYCLE_EDEFAULT);
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
			case ProductmanagementPackage.CAPABILITY__EVIDENCE:
				return !getEvidence().isEmpty();
			case ProductmanagementPackage.CAPABILITY__PERSONAS:
				return !getPersonas().isEmpty();
			case ProductmanagementPackage.CAPABILITY__CONCERNS:
				return !getConcerns().isEmpty();
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return !getAddresses().isEmpty();
			case ProductmanagementPackage.CAPABILITY__SUB_CAPABILITIES:
				return !getSubCapabilities().isEmpty();
			case ProductmanagementPackage.CAPABILITY__LIFECYCLE:
				return getLifecycle() != LIFECYCLE_EDEFAULT;
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
		if (baseClass == AbstractCapability.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEvidence.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvidenceDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.CAPABILITY__EVIDENCE: return ProductmanagementPackage.EVIDENCE_DOMAIN__EVIDENCE;
				default: return -1;
			}
		}
		if (baseClass == AbstractPersona.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PersonaDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.CAPABILITY__PERSONAS: return ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractConcern.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConcernDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.CAPABILITY__CONCERNS: return ProductmanagementPackage.CONCERN_DOMAIN__CONCERNS;
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
		if (baseClass == AbstractCapability.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEvidence.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvidenceDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.EVIDENCE_DOMAIN__EVIDENCE: return ProductmanagementPackage.CAPABILITY__EVIDENCE;
				default: return -1;
			}
		}
		if (baseClass == AbstractPersona.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PersonaDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS: return ProductmanagementPackage.CAPABILITY__PERSONAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractConcern.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConcernDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.CONCERN_DOMAIN__CONCERNS: return ProductmanagementPackage.CAPABILITY__CONCERNS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityImpl
