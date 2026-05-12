/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Actor;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ActorImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ActorImpl#getOwnedRoles <em>Owned Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ActorImpl#getSubActors <em>Sub Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ActorImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends ModelElementImpl implements Actor {
	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ProductmanagementPackage.ACTOR__ROLES, ProductmanagementPackage.Literals.ACTOR__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getOwnedRoles() {
		return (EList<Role>)eDynamicGet(ProductmanagementPackage.ACTOR__OWNED_ROLES, ProductmanagementPackage.Literals.ACTOR__OWNED_ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Actor> getSubActors() {
		return (EList<Actor>)eDynamicGet(ProductmanagementPackage.ACTOR__SUB_ACTORS, ProductmanagementPackage.Literals.ACTOR__SUB_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eDynamicGet(ProductmanagementPackage.ACTOR__PARTY_ID, ProductmanagementPackage.Literals.ACTOR__PARTY_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eDynamicSet(ProductmanagementPackage.ACTOR__PARTY_ID, ProductmanagementPackage.Literals.ACTOR__PARTY_ID, newPartyId);
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
			case ProductmanagementPackage.ACTOR__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
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
			case ProductmanagementPackage.ACTOR__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.ACTOR__OWNED_ROLES:
				return ((InternalEList<?>)getOwnedRoles()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.ACTOR__SUB_ACTORS:
				return ((InternalEList<?>)getSubActors()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.ACTOR__ROLES:
				return getRoles();
			case ProductmanagementPackage.ACTOR__OWNED_ROLES:
				return getOwnedRoles();
			case ProductmanagementPackage.ACTOR__SUB_ACTORS:
				return getSubActors();
			case ProductmanagementPackage.ACTOR__PARTY_ID:
				return getPartyId();
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
			case ProductmanagementPackage.ACTOR__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ProductmanagementPackage.ACTOR__OWNED_ROLES:
				getOwnedRoles().clear();
				getOwnedRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ProductmanagementPackage.ACTOR__SUB_ACTORS:
				getSubActors().clear();
				getSubActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ProductmanagementPackage.ACTOR__PARTY_ID:
				setPartyId((String)newValue);
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
			case ProductmanagementPackage.ACTOR__ROLES:
				getRoles().clear();
				return;
			case ProductmanagementPackage.ACTOR__OWNED_ROLES:
				getOwnedRoles().clear();
				return;
			case ProductmanagementPackage.ACTOR__SUB_ACTORS:
				getSubActors().clear();
				return;
			case ProductmanagementPackage.ACTOR__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
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
			case ProductmanagementPackage.ACTOR__ROLES:
				return !getRoles().isEmpty();
			case ProductmanagementPackage.ACTOR__OWNED_ROLES:
				return !getOwnedRoles().isEmpty();
			case ProductmanagementPackage.ACTOR__SUB_ACTORS:
				return !getSubActors().isEmpty();
			case ProductmanagementPackage.ACTOR__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? getPartyId() != null : !PARTY_ID_EDEFAULT.equals(getPartyId());
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
