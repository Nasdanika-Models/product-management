/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

import org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pain Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getAllBlocks <em>All Blocks</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getViolates <em>Violates</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PainPointImpl#getAllViolates <em>All Violates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PainPointImpl extends ConcernImpl implements PainPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PainPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.PAIN_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getBlocks() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.PAIN_POINT__BLOCKS, ProductmanagementPackage.Literals.PAIN_POINT__BLOCKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getAllBlocks() {
		BasicEList<Goal> _xblockexpression = null;
		{
			final BasicEList<Goal> result = new BasicEList<Goal>();
			EList<ConcernReference> _blocks = this.getBlocks();
			for (final ConcernReference ref : _blocks) {
				{
					Concern target = ref.getTarget();
					if ((target instanceof Goal)) {
						result.add(((Goal)target));
					}
				}
			}
			EList<EObject> _referrers = this.getReferrers(Literals.GOAL__BLOCKED_BY);
			for (final EObject referrer : _referrers) {
				if ((referrer instanceof Goal)) {
					result.add(((Goal)referrer));
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
	public EList<ConcernReference> getViolates() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.PAIN_POINT__VIOLATES, ProductmanagementPackage.Literals.PAIN_POINT__VIOLATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Need> getAllViolates() {
		BasicEList<Need> _xblockexpression = null;
		{
			final BasicEList<Need> result = new BasicEList<Need>();
			EList<ConcernReference> _violates = this.getViolates();
			for (final ConcernReference ref : _violates) {
				{
					Concern target = ref.getTarget();
					if ((target instanceof Need)) {
						result.add(((Need)target));
					}
				}
			}
			EList<EObject> _referrers = this.getReferrers(Literals.NEED__VIOLATED_BY);
			for (final EObject referrer : _referrers) {
				if ((referrer instanceof Need)) {
					result.add(((Need)referrer));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				return ((InternalEList<?>)getViolates()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				return getBlocks();
			case ProductmanagementPackage.PAIN_POINT__ALL_BLOCKS:
				return getAllBlocks();
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				return getViolates();
			case ProductmanagementPackage.PAIN_POINT__ALL_VIOLATES:
				return getAllViolates();
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends ConcernReference>)newValue);
				return;
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				getViolates().clear();
				getViolates().addAll((Collection<? extends ConcernReference>)newValue);
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				getBlocks().clear();
				return;
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				getViolates().clear();
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
			case ProductmanagementPackage.PAIN_POINT__BLOCKS:
				return !getBlocks().isEmpty();
			case ProductmanagementPackage.PAIN_POINT__ALL_BLOCKS:
				return !getAllBlocks().isEmpty();
			case ProductmanagementPackage.PAIN_POINT__VIOLATES:
				return !getViolates().isEmpty();
			case ProductmanagementPackage.PAIN_POINT__ALL_VIOLATES:
				return !getAllViolates().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PainPointImpl
