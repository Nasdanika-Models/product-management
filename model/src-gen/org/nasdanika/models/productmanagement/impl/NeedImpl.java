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
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getAllSupports <em>All Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getViolatedBy <em>Violated By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.NeedImpl#getAllViolatedBy <em>All Violated By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends ConcernImpl implements Need {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernReference> getSupports() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.NEED__SUPPORTS, ProductmanagementPackage.Literals.NEED__SUPPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getAllSupports() {
		BasicEList<Goal> _xblockexpression = null;
		{
			final BasicEList<Goal> result = new BasicEList<Goal>();
			EList<ConcernReference> _supports = this.getSupports();
			for (final ConcernReference ref : _supports) {
				{
					Concern target = ref.getTarget();
					if ((target instanceof Goal)) {
						result.add(((Goal)target));
					}
				}
			}
			EList<EObject> _referrers = this.getReferrers(Literals.GOAL__SUPPORTED_BY);
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
	public EList<ConcernReference> getViolatedBy() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.NEED__VIOLATED_BY, ProductmanagementPackage.Literals.NEED__VIOLATED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PainPoint> getAllViolatedBy() {
		BasicEList<PainPoint> _xblockexpression = null;
		{
			final BasicEList<PainPoint> result = new BasicEList<PainPoint>();
			EList<ConcernReference> _violatedBy = this.getViolatedBy();
			for (final ConcernReference ref : _violatedBy) {
				{
					Concern target = ref.getTarget();
					if ((target instanceof PainPoint)) {
						result.add(((PainPoint)target));
					}
				}
			}
			EList<EObject> _referrers = this.getReferrers(Literals.PAIN_POINT__VIOLATES);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.NEED__SUPPORTS:
				return ((InternalEList<?>)getSupports()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				return ((InternalEList<?>)getViolatedBy()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				return getSupports();
			case ProductmanagementPackage.NEED__ALL_SUPPORTS:
				return getAllSupports();
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				return getViolatedBy();
			case ProductmanagementPackage.NEED__ALL_VIOLATED_BY:
				return getAllViolatedBy();
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				getSupports().clear();
				getSupports().addAll((Collection<? extends ConcernReference>)newValue);
				return;
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				getViolatedBy().clear();
				getViolatedBy().addAll((Collection<? extends ConcernReference>)newValue);
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				getSupports().clear();
				return;
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				getViolatedBy().clear();
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
			case ProductmanagementPackage.NEED__SUPPORTS:
				return !getSupports().isEmpty();
			case ProductmanagementPackage.NEED__ALL_SUPPORTS:
				return !getAllSupports().isEmpty();
			case ProductmanagementPackage.NEED__VIOLATED_BY:
				return !getViolatedBy().isEmpty();
			case ProductmanagementPackage.NEED__ALL_VIOLATED_BY:
				return !getAllViolatedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NeedImpl
