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

import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.PersonaReference;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaDomainImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaDomainImpl#getResolvedPersonas <em>Resolved Personas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaDomainImpl extends NamedElementImpl implements PersonaDomain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.PERSONA_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractPersona> getPersonas() {
		return (EList<AbstractPersona>)eDynamicGet(ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS, ProductmanagementPackage.Literals.PERSONA_DOMAIN__PERSONAS, true, true);
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
			case ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS:
				return getPersonas();
			case ProductmanagementPackage.PERSONA_DOMAIN__RESOLVED_PERSONAS:
				return getResolvedPersonas();
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
			case ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends AbstractPersona>)newValue);
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
			case ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS:
				getPersonas().clear();
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
			case ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS:
				return !getPersonas().isEmpty();
			case ProductmanagementPackage.PERSONA_DOMAIN__RESOLVED_PERSONAS:
				return !getResolvedPersonas().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProductmanagementPackage.PERSONA_DOMAIN___RESOLVE_PERSONA_REFERENCE__ABSTRACTPERSONA:
				return resolvePersonaReference((AbstractPersona)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PersonaDomainImpl
