/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.ConcernType;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getSubConcerns <em>Sub Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getRelatedConcerns <em>Related Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ConcernImpl#getReferringConcerns <em>Referring Concerns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcernImpl extends ModelElementImpl implements Concern {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConcernType TYPE_EDEFAULT = ConcernType.GOAL;

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
	@Override
	public ConcernType getType() {
		return (ConcernType)eDynamicGet(ProductmanagementPackage.CONCERN__TYPE, ProductmanagementPackage.Literals.CONCERN__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ConcernType newType) {
		eDynamicSet(ProductmanagementPackage.CONCERN__TYPE, ProductmanagementPackage.Literals.CONCERN__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getSubConcerns() {
		return (EList<Concern>)eDynamicGet(ProductmanagementPackage.CONCERN__SUB_CONCERNS, ProductmanagementPackage.Literals.CONCERN__SUB_CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getRelatedConcerns() {
		return (EList<Concern>)eDynamicGet(ProductmanagementPackage.CONCERN__RELATED_CONCERNS, ProductmanagementPackage.Literals.CONCERN__RELATED_CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getReferringConcerns() {
		return (EList<Concern>)eDynamicGet(ProductmanagementPackage.CONCERN__REFERRING_CONCERNS, ProductmanagementPackage.Literals.CONCERN__REFERRING_CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.CONCERN__RELATED_CONCERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedConcerns()).basicAdd(otherEnd, msgs);
			case ProductmanagementPackage.CONCERN__REFERRING_CONCERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferringConcerns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.CONCERN__SUB_CONCERNS:
				return ((InternalEList<?>)getSubConcerns()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CONCERN__RELATED_CONCERNS:
				return ((InternalEList<?>)getRelatedConcerns()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.CONCERN__REFERRING_CONCERNS:
				return ((InternalEList<?>)getReferringConcerns()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.CONCERN__TYPE:
				return getType();
			case ProductmanagementPackage.CONCERN__SUB_CONCERNS:
				return getSubConcerns();
			case ProductmanagementPackage.CONCERN__RELATED_CONCERNS:
				return getRelatedConcerns();
			case ProductmanagementPackage.CONCERN__REFERRING_CONCERNS:
				return getReferringConcerns();
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
			case ProductmanagementPackage.CONCERN__TYPE:
				setType((ConcernType)newValue);
				return;
			case ProductmanagementPackage.CONCERN__SUB_CONCERNS:
				getSubConcerns().clear();
				getSubConcerns().addAll((Collection<? extends Concern>)newValue);
				return;
			case ProductmanagementPackage.CONCERN__RELATED_CONCERNS:
				getRelatedConcerns().clear();
				getRelatedConcerns().addAll((Collection<? extends Concern>)newValue);
				return;
			case ProductmanagementPackage.CONCERN__REFERRING_CONCERNS:
				getReferringConcerns().clear();
				getReferringConcerns().addAll((Collection<? extends Concern>)newValue);
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
			case ProductmanagementPackage.CONCERN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProductmanagementPackage.CONCERN__SUB_CONCERNS:
				getSubConcerns().clear();
				return;
			case ProductmanagementPackage.CONCERN__RELATED_CONCERNS:
				getRelatedConcerns().clear();
				return;
			case ProductmanagementPackage.CONCERN__REFERRING_CONCERNS:
				getReferringConcerns().clear();
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
			case ProductmanagementPackage.CONCERN__TYPE:
				return getType() != TYPE_EDEFAULT;
			case ProductmanagementPackage.CONCERN__SUB_CONCERNS:
				return !getSubConcerns().isEmpty();
			case ProductmanagementPackage.CONCERN__RELATED_CONCERNS:
				return !getRelatedConcerns().isEmpty();
			case ProductmanagementPackage.CONCERN__REFERRING_CONCERNS:
				return !getReferringConcerns().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConcernImpl
