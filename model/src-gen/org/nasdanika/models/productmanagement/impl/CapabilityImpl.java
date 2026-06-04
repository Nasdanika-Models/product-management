/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.AbstractConcern;
import org.nasdanika.models.productmanagement.AbstractEvidence;
import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityReference;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.EvidenceDomain;
import org.nasdanika.models.productmanagement.Lifecycle;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.PersonaReference;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

import org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals;

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
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getResolvedPersonas <em>Resolved Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getResolvedConcerns <em>Resolved Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getAllAddresses <em>All Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CapabilityImpl#getDependents <em>Dependents</em>}</li>
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
	@Override
	public EList<AbstractPersona> getResolvedPersonas() {
		BasicEList<AbstractPersona> _xblockexpression = null;
		{
			final BasicEList<AbstractPersona> result = new BasicEList<AbstractPersona>();
			EList<AbstractPersona> _personas = this.getPersonas();
			for (final AbstractPersona persona : _personas) {
				{
					final AbstractPersona resolved = this.resolvePersonaReference(persona);
					if ((resolved != null)) {
						result.add(resolved);
					}
				}
			}
			_xblockexpression = result;
		}
		return _xblockexpression;
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
	@Override
	public EList<AbstractConcern> getResolvedConcerns() {
		BasicEList<AbstractConcern> _xblockexpression = null;
		{
			final BasicEList<AbstractConcern> result = new BasicEList<AbstractConcern>();
			EList<AbstractConcern> _concerns = this.getConcerns();
			for (final AbstractConcern concern : _concerns) {
				{
					final AbstractConcern resolved = this.resolveConcernReference(concern);
					if ((resolved != null)) {
						result.add(resolved);
					}
				}
			}
			_xblockexpression = result;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractConcern> getAddresses() {
		return (EList<AbstractConcern>)eDynamicGet(ProductmanagementPackage.CAPABILITY__ADDRESSES, ProductmanagementPackage.Literals.CAPABILITY__ADDRESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractConcern> getAllAddresses() {
		BasicEList<AbstractConcern> _xblockexpression = null;
		{
			final BasicEList<AbstractConcern> result = new BasicEList<AbstractConcern>();
			result.addAll(this.getAddresses());
			EList<EObject> _referrers = this.getReferrers(Literals.CONCERN__ADDRESSED_BY);
			for (final EObject referrer : _referrers) {
				if ((referrer instanceof AbstractConcern)) {
					result.add(((AbstractConcern)referrer));
				}
			}
			_xblockexpression = result;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getDependencies() {
		return (EList<AbstractCapability>)eDynamicGet(ProductmanagementPackage.CAPABILITY__DEPENDENCIES, ProductmanagementPackage.Literals.CAPABILITY__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityReference> getDependents() {
		BasicEList<CapabilityReference> _xblockexpression = null;
		{
			final BasicEList<CapabilityReference> result = new BasicEList<CapabilityReference>();
			EList<EObject> _referrers = this.getReferrers(Literals.CAPABILITY_REFERENCE__TARGET);
			for (final EObject referrer : _referrers) {
				EReference _eContainmentFeature = referrer.eContainmentFeature();
				boolean _tripleEquals = (_eContainmentFeature == Literals.CAPABILITY__DEPENDENCIES);
				if (_tripleEquals) {
					if ((referrer instanceof CapabilityReference)) {
						result.add(((CapabilityReference)referrer));
					}
				}
			}
			_xblockexpression = result;
		}
		return _xblockexpression;
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
	public AbstractConcern resolveConcernReference(final AbstractConcern start) {
		AbstractConcern current = start;
		final HashSet<AbstractConcern> seen = new HashSet<AbstractConcern>();
		while ((current instanceof ConcernReference)) {
			{
				boolean _add = seen.add(current);
				boolean _not = (!_add);
				if (_not) {
					return null;
				}
				current = ((ConcernReference)current).getTarget();
				if ((current == null)) {
					return null;
				}
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractPersona resolvePersonaReference(final AbstractPersona start) {
		AbstractPersona current = start;
		final HashSet<AbstractPersona> seen = new HashSet<AbstractPersona>();
		while ((current instanceof PersonaReference)) {
			{
				boolean _add = seen.add(current);
				boolean _not = (!_add);
				if (_not) {
					return null;
				}
				current = ((PersonaReference)current).getTarget();
				if ((current == null)) {
					return null;
				}
			}
		}
		return current;
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
			case ProductmanagementPackage.CAPABILITY__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CAPABILITY__RESOLVED_PERSONAS:
				return getResolvedPersonas();
			case ProductmanagementPackage.CAPABILITY__CONCERNS:
				return getConcerns();
			case ProductmanagementPackage.CAPABILITY__RESOLVED_CONCERNS:
				return getResolvedConcerns();
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return getAddresses();
			case ProductmanagementPackage.CAPABILITY__ALL_ADDRESSES:
				return getAllAddresses();
			case ProductmanagementPackage.CAPABILITY__DEPENDENCIES:
				return getDependencies();
			case ProductmanagementPackage.CAPABILITY__DEPENDENTS:
				return getDependents();
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
				getAddresses().addAll((Collection<? extends AbstractConcern>)newValue);
				return;
			case ProductmanagementPackage.CAPABILITY__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends AbstractCapability>)newValue);
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
			case ProductmanagementPackage.CAPABILITY__DEPENDENCIES:
				getDependencies().clear();
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
			case ProductmanagementPackage.CAPABILITY__RESOLVED_PERSONAS:
				return !getResolvedPersonas().isEmpty();
			case ProductmanagementPackage.CAPABILITY__CONCERNS:
				return !getConcerns().isEmpty();
			case ProductmanagementPackage.CAPABILITY__RESOLVED_CONCERNS:
				return !getResolvedConcerns().isEmpty();
			case ProductmanagementPackage.CAPABILITY__ADDRESSES:
				return !getAddresses().isEmpty();
			case ProductmanagementPackage.CAPABILITY__ALL_ADDRESSES:
				return !getAllAddresses().isEmpty();
			case ProductmanagementPackage.CAPABILITY__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case ProductmanagementPackage.CAPABILITY__DEPENDENTS:
				return !getDependents().isEmpty();
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
				case ProductmanagementPackage.CAPABILITY__RESOLVED_PERSONAS: return ProductmanagementPackage.PERSONA_DOMAIN__RESOLVED_PERSONAS;
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
				case ProductmanagementPackage.CAPABILITY__RESOLVED_CONCERNS: return ProductmanagementPackage.CONCERN_DOMAIN__RESOLVED_CONCERNS;
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
				case ProductmanagementPackage.PERSONA_DOMAIN__RESOLVED_PERSONAS: return ProductmanagementPackage.CAPABILITY__RESOLVED_PERSONAS;
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
				case ProductmanagementPackage.CONCERN_DOMAIN__RESOLVED_CONCERNS: return ProductmanagementPackage.CAPABILITY__RESOLVED_CONCERNS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractCapability.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEvidence.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == EvidenceDomain.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractPersona.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PersonaDomain.class) {
			switch (baseOperationID) {
				case ProductmanagementPackage.PERSONA_DOMAIN___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA: return ProductmanagementPackage.CAPABILITY___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA;
				default: return -1;
			}
		}
		if (baseClass == AbstractConcern.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ConcernDomain.class) {
			switch (baseOperationID) {
				case ProductmanagementPackage.CONCERN_DOMAIN___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN: return ProductmanagementPackage.CAPABILITY___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProductmanagementPackage.CAPABILITY___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN:
				return resolveConcernReference((AbstractConcern)arguments.get(0));
			case ProductmanagementPackage.CAPABILITY___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA:
				return resolvePersonaReference((AbstractPersona)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CapabilityImpl
