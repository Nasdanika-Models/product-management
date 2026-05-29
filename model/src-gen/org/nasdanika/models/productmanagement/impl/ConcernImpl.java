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

import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernReference;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

import org.nasdanika.models.productmanagement.ProductmanagementPackage.Literals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getAddressedBy <em>Addressed By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getAllAddressedBy <em>All Addressed By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getAllSupports <em>All Supports</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getAllSupportedBy <em>All Supported By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcernImpl extends NamedPeriodImpl implements Concern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.CONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getAddressedBy() {
		return (EList<AbstractCapability>)eDynamicGet(ProductmanagementPackage.CONCERN__ADDRESSED_BY, ProductmanagementPackage.Literals.CONCERN__ADDRESSED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCapability> getAllAddressedBy() {
		BasicEList<AbstractCapability> _xblockexpression = null;
		{
			final BasicEList<AbstractCapability> result = new BasicEList<AbstractCapability>();
			result.addAll(this.getAddressedBy());
			EList<EObject> _referrers = this.getReferrers(Literals.CAPABILITY__ADDRESSES);
			for (final EObject referrer : _referrers) {
				if ((referrer instanceof AbstractCapability)) {
					result.add(((AbstractCapability)referrer));
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
	public EList<ConcernReference> getSupports() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.CONCERN__SUPPORTS, ProductmanagementPackage.Literals.CONCERN__SUPPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Concern> getAllSupports() {
		BasicEList<Concern> _xblockexpression = null;
		{
			final BasicEList<Concern> result = new BasicEList<Concern>();
			EList<ConcernReference> _supports = this.getSupports();
			for (final ConcernReference ref : _supports) {
				{
					Concern target = ref.getTarget();
					result.add(target);
				}
			}
			EList<EObject> _referrers = this.getReferrers(Literals.CONCERN__SUPPORTED_BY);
			for (final EObject referrer : _referrers) {
				if ((referrer instanceof Concern)) {
					result.add(((Concern)referrer));
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
	public EList<ConcernReference> getSupportedBy() {
		return (EList<ConcernReference>)eDynamicGet(ProductmanagementPackage.CONCERN__SUPPORTED_BY, ProductmanagementPackage.Literals.CONCERN__SUPPORTED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Concern> getAllSupportedBy() {
		BasicEList<Concern> _xblockexpression = null;
		{
			final BasicEList<Concern> result = new BasicEList<Concern>();
			EList<ConcernReference> _supportedBy = this.getSupportedBy();
			for (final ConcernReference ref : _supportedBy) {
				{
					Concern target = ref.getTarget();
					result.add(target);
				}
			}
			EList<EObject> _referrers = this.getReferrers(Literals.CONCERN__SUPPORTS);
			for (final EObject referrer : _referrers) {
				if ((referrer instanceof Concern)) {
					result.add(((Concern)referrer));
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
			case ProductmanagementPackage.CONCERN__ADDRESSED_BY:
				return ((InternalEList<?>)getAddressedBy()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CONCERN__SUPPORTS:
				return ((InternalEList<?>)getSupports()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CONCERN__ADDRESSED_BY:
				return getAddressedBy();
			case ProductmanagementPackage.CONCERN__ALL_ADDRESSED_BY:
				return getAllAddressedBy();
			case ProductmanagementPackage.CONCERN__SUPPORTS:
				return getSupports();
			case ProductmanagementPackage.CONCERN__ALL_SUPPORTS:
				return getAllSupports();
			case ProductmanagementPackage.CONCERN__SUPPORTED_BY:
				return getSupportedBy();
			case ProductmanagementPackage.CONCERN__ALL_SUPPORTED_BY:
				return getAllSupportedBy();
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
			case ProductmanagementPackage.CONCERN__ADDRESSED_BY:
				getAddressedBy().clear();
				getAddressedBy().addAll((Collection<? extends AbstractCapability>)newValue);
				return;
			case ProductmanagementPackage.CONCERN__SUPPORTS:
				getSupports().clear();
				getSupports().addAll((Collection<? extends ConcernReference>)newValue);
				return;
			case ProductmanagementPackage.CONCERN__SUPPORTED_BY:
				getSupportedBy().clear();
				getSupportedBy().addAll((Collection<? extends ConcernReference>)newValue);
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
			case ProductmanagementPackage.CONCERN__ADDRESSED_BY:
				getAddressedBy().clear();
				return;
			case ProductmanagementPackage.CONCERN__SUPPORTS:
				getSupports().clear();
				return;
			case ProductmanagementPackage.CONCERN__SUPPORTED_BY:
				getSupportedBy().clear();
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
			case ProductmanagementPackage.CONCERN__ADDRESSED_BY:
				return !getAddressedBy().isEmpty();
			case ProductmanagementPackage.CONCERN__ALL_ADDRESSED_BY:
				return !getAllAddressedBy().isEmpty();
			case ProductmanagementPackage.CONCERN__SUPPORTS:
				return !getSupports().isEmpty();
			case ProductmanagementPackage.CONCERN__ALL_SUPPORTS:
				return !getAllSupports().isEmpty();
			case ProductmanagementPackage.CONCERN__SUPPORTED_BY:
				return !getSupportedBy().isEmpty();
			case ProductmanagementPackage.CONCERN__ALL_SUPPORTED_BY:
				return !getAllSupportedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConcernImpl
