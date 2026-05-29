/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

import org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GoalImpl#getBlockedBy <em>Blocked By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.GoalImpl#getAllBlockedBy <em>All Blocked By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends ConcernImpl implements Goal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getBlockedBy() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.GOAL__BLOCKED_BY, ProductmanagementPackage.Literals.GOAL__BLOCKED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PainPoint> getAllBlockedBy() {
		BasicEList<PainPoint> _xblockexpression = null;
		{
			final BasicEList<PainPoint> result = new BasicEList<PainPoint>();
			EList<ConcernReference> _blockedBy = this.getBlockedBy();
			for (final ConcernReference ref : _blockedBy) {
				{
					Concern target = ref.getTarget();
					if ((target instanceof PainPoint)) {
						result.add(((PainPoint)target));
					}
				}
			}
			EList<EObject> _referrers = this.getReferrers(Literals.PAIN_POINT__BLOCKS);
			for (final EObject referrer : _referrers) {
				if ((referrer instanceof PainPoint)) {
					result.add(((PainPoint)referrer));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductmanagementPackage.GOAL__BLOCKED_BY:
				return getBlockedBy();
			case ProductmanagementPackage.GOAL__ALL_BLOCKED_BY:
				return getAllBlockedBy();
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
			case ProductmanagementPackage.GOAL__BLOCKED_BY:
				getBlockedBy().clear();
				getBlockedBy().addAll((Collection<? extends ConcernReference>)newValue);
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
			case ProductmanagementPackage.GOAL__BLOCKED_BY:
				getBlockedBy().clear();
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
			case ProductmanagementPackage.GOAL__BLOCKED_BY:
				return !getBlockedBy().isEmpty();
			case ProductmanagementPackage.GOAL__ALL_BLOCKED_BY:
				return !getAllBlockedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
