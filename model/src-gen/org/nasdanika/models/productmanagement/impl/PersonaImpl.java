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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

import org.nasdanika.models.productmanagement.AbstractConcern;
import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.ConcernDomain;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getResolvedConcerns <em>Resolved Concerns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends NamedPeriodImpl implements Persona {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractConcern> getConcerns() {
		return (EList<AbstractConcern>)eDynamicGet(ProductmanagementPackage.PERSONA__CONCERNS, ProductmanagementPackage.Literals.CONCERN_DOMAIN__CONCERNS, true, true);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.PERSONA__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				return getConcerns();
			case ProductmanagementPackage.PERSONA__RESOLVED_CONCERNS:
				return getResolvedConcerns();
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends AbstractConcern>)newValue);
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				getConcerns().clear();
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				return !getConcerns().isEmpty();
			case ProductmanagementPackage.PERSONA__RESOLVED_CONCERNS:
				return !getResolvedConcerns().isEmpty();
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
		if (baseClass == AbstractPersona.class) {
			switch (derivedFeatureID) {
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
				case ProductmanagementPackage.PERSONA__CONCERNS: return ProductmanagementPackage.CONCERN_DOMAIN__CONCERNS;
				case ProductmanagementPackage.PERSONA__RESOLVED_CONCERNS: return ProductmanagementPackage.CONCERN_DOMAIN__RESOLVED_CONCERNS;
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
		if (baseClass == AbstractPersona.class) {
			switch (baseFeatureID) {
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
				case ProductmanagementPackage.CONCERN_DOMAIN__CONCERNS: return ProductmanagementPackage.PERSONA__CONCERNS;
				case ProductmanagementPackage.CONCERN_DOMAIN__RESOLVED_CONCERNS: return ProductmanagementPackage.PERSONA__RESOLVED_CONCERNS;
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
		if (baseClass == AbstractPersona.class) {
			switch (baseOperationID) {
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
				case ProductmanagementPackage.CONCERN_DOMAIN___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN: return ProductmanagementPackage.PERSONA___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN;
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
			case ProductmanagementPackage.PERSONA___RESOLVE_CONCERN_REFERENCE__ABSTRACTCONCERN:
				return resolveConcernReference((AbstractConcern)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonaImpl
