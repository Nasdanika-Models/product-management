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

import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.CapabilityDomain;
import org.nasdanika.models.productmanagement.CapabilityReference;
import org.nasdanika.models.productmanagement.CompositeCapability;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CompositeCapabilityImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.CompositeCapabilityImpl#getResolvedCapabilities <em>Resolved Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeCapabilityImpl extends CapabilityImpl implements CompositeCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.COMPOSITE_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getCapabilities() {
		return (EList<AbstractCapability>)eDynamicGet(ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY_DOMAIN__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCapability> getResolvedCapabilities() {
		BasicEList<AbstractCapability> _xblockexpression = null;
		{
			final BasicEList<AbstractCapability> result = new BasicEList<AbstractCapability>();
			EList<AbstractCapability> _capabilities = this.getCapabilities();
			for (final AbstractCapability capability : _capabilities) {
				{
					final AbstractCapability resolved = this.resolveCapabilityReference(capability);
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
	public AbstractCapability resolveCapabilityReference(final AbstractCapability start) {
		AbstractCapability current = start;
		final HashSet<AbstractCapability> seen = new HashSet<AbstractCapability>();
		while ((current instanceof CapabilityReference)) {
			{
				boolean _add = seen.add(current);
				boolean _not = (!_add);
				if (_not) {
					return null;
				}
				current = ((CapabilityReference)current).getTarget();
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
			case ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES:
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
			case ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES:
				return getCapabilities();
			case ProductmanagementPackage.COMPOSITE_CAPABILITY__RESOLVED_CAPABILITIES:
				return getResolvedCapabilities();
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
			case ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES:
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
			case ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES:
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
			case ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case ProductmanagementPackage.COMPOSITE_CAPABILITY__RESOLVED_CAPABILITIES:
				return !getResolvedCapabilities().isEmpty();
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
		if (baseClass == CapabilityDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES: return ProductmanagementPackage.CAPABILITY_DOMAIN__CAPABILITIES;
				case ProductmanagementPackage.COMPOSITE_CAPABILITY__RESOLVED_CAPABILITIES: return ProductmanagementPackage.CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES;
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
		if (baseClass == CapabilityDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.CAPABILITY_DOMAIN__CAPABILITIES: return ProductmanagementPackage.COMPOSITE_CAPABILITY__CAPABILITIES;
				case ProductmanagementPackage.CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES: return ProductmanagementPackage.COMPOSITE_CAPABILITY__RESOLVED_CAPABILITIES;
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
		if (baseClass == CapabilityDomain.class) {
			switch (baseOperationID) {
				case ProductmanagementPackage.CAPABILITY_DOMAIN___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY: return ProductmanagementPackage.COMPOSITE_CAPABILITY___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY;
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
			case ProductmanagementPackage.COMPOSITE_CAPABILITY___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY:
				return resolveCapabilityReference((AbstractCapability)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompositeCapabilityImpl
