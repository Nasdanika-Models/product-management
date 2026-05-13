/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.productmanagement.AbstractActor;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.RoleAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.RoleAssignmentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.RoleAssignmentImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleAssignmentImpl extends PeriodImpl implements RoleAssignment {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.ROLE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(ProductmanagementPackage.ROLE_ASSIGNMENT__COMMENT, ProductmanagementPackage.Literals.ROLE_ASSIGNMENT__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(ProductmanagementPackage.ROLE_ASSIGNMENT__COMMENT, ProductmanagementPackage.Literals.ROLE_ASSIGNMENT__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractActor getActors() {
		return (AbstractActor)eDynamicGet(ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS, ProductmanagementPackage.Literals.ROLE_ASSIGNMENT__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActors(AbstractActor newActors, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newActors, ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActors(AbstractActor newActors) {
		eDynamicSet(ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS, ProductmanagementPackage.Literals.ROLE_ASSIGNMENT__ACTORS, newActors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS:
				return basicSetActors(null, msgs);
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
			case ProductmanagementPackage.ROLE_ASSIGNMENT__COMMENT:
				return getComment();
			case ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS:
				return getActors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductmanagementPackage.ROLE_ASSIGNMENT__COMMENT:
				setComment((String)newValue);
				return;
			case ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS:
				setActors((AbstractActor)newValue);
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
			case ProductmanagementPackage.ROLE_ASSIGNMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS:
				setActors((AbstractActor)null);
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
			case ProductmanagementPackage.ROLE_ASSIGNMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case ProductmanagementPackage.ROLE_ASSIGNMENT__ACTORS:
				return getActors() != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleAssignmentImpl
