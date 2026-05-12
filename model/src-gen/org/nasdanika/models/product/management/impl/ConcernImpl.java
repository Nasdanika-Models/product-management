/**
 */
package org.nasdanika.models.product.management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.product.management.Concern;
import org.nasdanika.models.product.management.ConcernType;
import org.nasdanika.models.product.management.ManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.impl.ConcernImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.ConcernImpl#getSubConcerns <em>Sub Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.ConcernImpl#getRelatedConcerns <em>Related Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.ConcernImpl#getReferringConcerns <em>Referring Concerns</em>}</li>
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
		return ManagementPackage.Literals.CONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernType getType() {
		return (ConcernType)eDynamicGet(ManagementPackage.CONCERN__TYPE, ManagementPackage.Literals.CONCERN__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ConcernType newType) {
		eDynamicSet(ManagementPackage.CONCERN__TYPE, ManagementPackage.Literals.CONCERN__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getSubConcerns() {
		return (EList<Concern>)eDynamicGet(ManagementPackage.CONCERN__SUB_CONCERNS, ManagementPackage.Literals.CONCERN__SUB_CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getRelatedConcerns() {
		return (EList<Concern>)eDynamicGet(ManagementPackage.CONCERN__RELATED_CONCERNS, ManagementPackage.Literals.CONCERN__RELATED_CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getReferringConcerns() {
		return (EList<Concern>)eDynamicGet(ManagementPackage.CONCERN__REFERRING_CONCERNS, ManagementPackage.Literals.CONCERN__REFERRING_CONCERNS, true, true);
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
			case ManagementPackage.CONCERN__RELATED_CONCERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedConcerns()).basicAdd(otherEnd, msgs);
			case ManagementPackage.CONCERN__REFERRING_CONCERNS:
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
			case ManagementPackage.CONCERN__SUB_CONCERNS:
				return ((InternalEList<?>)getSubConcerns()).basicRemove(otherEnd, msgs);
			case ManagementPackage.CONCERN__RELATED_CONCERNS:
				return ((InternalEList<?>)getRelatedConcerns()).basicRemove(otherEnd, msgs);
			case ManagementPackage.CONCERN__REFERRING_CONCERNS:
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
			case ManagementPackage.CONCERN__TYPE:
				return getType();
			case ManagementPackage.CONCERN__SUB_CONCERNS:
				return getSubConcerns();
			case ManagementPackage.CONCERN__RELATED_CONCERNS:
				return getRelatedConcerns();
			case ManagementPackage.CONCERN__REFERRING_CONCERNS:
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
			case ManagementPackage.CONCERN__TYPE:
				setType((ConcernType)newValue);
				return;
			case ManagementPackage.CONCERN__SUB_CONCERNS:
				getSubConcerns().clear();
				getSubConcerns().addAll((Collection<? extends Concern>)newValue);
				return;
			case ManagementPackage.CONCERN__RELATED_CONCERNS:
				getRelatedConcerns().clear();
				getRelatedConcerns().addAll((Collection<? extends Concern>)newValue);
				return;
			case ManagementPackage.CONCERN__REFERRING_CONCERNS:
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
			case ManagementPackage.CONCERN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ManagementPackage.CONCERN__SUB_CONCERNS:
				getSubConcerns().clear();
				return;
			case ManagementPackage.CONCERN__RELATED_CONCERNS:
				getRelatedConcerns().clear();
				return;
			case ManagementPackage.CONCERN__REFERRING_CONCERNS:
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
			case ManagementPackage.CONCERN__TYPE:
				return getType() != TYPE_EDEFAULT;
			case ManagementPackage.CONCERN__SUB_CONCERNS:
				return !getSubConcerns().isEmpty();
			case ManagementPackage.CONCERN__RELATED_CONCERNS:
				return !getRelatedConcerns().isEmpty();
			case ManagementPackage.CONCERN__REFERRING_CONCERNS:
				return !getReferringConcerns().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConcernImpl
