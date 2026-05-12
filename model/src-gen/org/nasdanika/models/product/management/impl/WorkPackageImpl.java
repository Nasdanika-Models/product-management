/**
 */
package org.nasdanika.models.product.management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.product.management.Capability;
import org.nasdanika.models.product.management.CapabilityProvider;
import org.nasdanika.models.product.management.ManagementPackage;
import org.nasdanika.models.product.management.Role;
import org.nasdanika.models.product.management.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.impl.WorkPackageImpl#getSubWorkPackages <em>Sub Work Packages</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.WorkPackageImpl#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.WorkPackageImpl#getContributes <em>Contributes</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.WorkPackageImpl#getTracker <em>Tracker</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.WorkPackageImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkPackageImpl extends ModelElementImpl implements WorkPackage {
	/**
	 * The default value of the '{@link #getTracker() <em>Tracker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracker()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementPackage.Literals.WORK_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkPackage> getSubWorkPackages() {
		return (EList<WorkPackage>)eDynamicGet(ManagementPackage.WORK_PACKAGE__SUB_WORK_PACKAGES, ManagementPackage.Literals.WORK_PACKAGE__SUB_WORK_PACKAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityProvider> getImpacts() {
		return (EList<CapabilityProvider>)eDynamicGet(ManagementPackage.WORK_PACKAGE__IMPACTS, ManagementPackage.Literals.WORK_PACKAGE__IMPACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getContributes() {
		return (EList<Capability>)eDynamicGet(ManagementPackage.WORK_PACKAGE__CONTRIBUTES, ManagementPackage.Literals.WORK_PACKAGE__CONTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTracker() {
		return (String)eDynamicGet(ManagementPackage.WORK_PACKAGE__TRACKER, ManagementPackage.Literals.WORK_PACKAGE__TRACKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTracker(String newTracker) {
		eDynamicSet(ManagementPackage.WORK_PACKAGE__TRACKER, ManagementPackage.Literals.WORK_PACKAGE__TRACKER, newTracker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ManagementPackage.WORK_PACKAGE__ROLES, ManagementPackage.Literals.WORK_PACKAGE__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementPackage.WORK_PACKAGE__SUB_WORK_PACKAGES:
				return ((InternalEList<?>)getSubWorkPackages()).basicRemove(otherEnd, msgs);
			case ManagementPackage.WORK_PACKAGE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case ManagementPackage.WORK_PACKAGE__SUB_WORK_PACKAGES:
				return getSubWorkPackages();
			case ManagementPackage.WORK_PACKAGE__IMPACTS:
				return getImpacts();
			case ManagementPackage.WORK_PACKAGE__CONTRIBUTES:
				return getContributes();
			case ManagementPackage.WORK_PACKAGE__TRACKER:
				return getTracker();
			case ManagementPackage.WORK_PACKAGE__ROLES:
				return getRoles();
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
			case ManagementPackage.WORK_PACKAGE__SUB_WORK_PACKAGES:
				getSubWorkPackages().clear();
				getSubWorkPackages().addAll((Collection<? extends WorkPackage>)newValue);
				return;
			case ManagementPackage.WORK_PACKAGE__IMPACTS:
				getImpacts().clear();
				getImpacts().addAll((Collection<? extends CapabilityProvider>)newValue);
				return;
			case ManagementPackage.WORK_PACKAGE__CONTRIBUTES:
				getContributes().clear();
				getContributes().addAll((Collection<? extends Capability>)newValue);
				return;
			case ManagementPackage.WORK_PACKAGE__TRACKER:
				setTracker((String)newValue);
				return;
			case ManagementPackage.WORK_PACKAGE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case ManagementPackage.WORK_PACKAGE__SUB_WORK_PACKAGES:
				getSubWorkPackages().clear();
				return;
			case ManagementPackage.WORK_PACKAGE__IMPACTS:
				getImpacts().clear();
				return;
			case ManagementPackage.WORK_PACKAGE__CONTRIBUTES:
				getContributes().clear();
				return;
			case ManagementPackage.WORK_PACKAGE__TRACKER:
				setTracker(TRACKER_EDEFAULT);
				return;
			case ManagementPackage.WORK_PACKAGE__ROLES:
				getRoles().clear();
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
			case ManagementPackage.WORK_PACKAGE__SUB_WORK_PACKAGES:
				return !getSubWorkPackages().isEmpty();
			case ManagementPackage.WORK_PACKAGE__IMPACTS:
				return !getImpacts().isEmpty();
			case ManagementPackage.WORK_PACKAGE__CONTRIBUTES:
				return !getContributes().isEmpty();
			case ManagementPackage.WORK_PACKAGE__TRACKER:
				return TRACKER_EDEFAULT == null ? getTracker() != null : !TRACKER_EDEFAULT.equals(getTracker());
			case ManagementPackage.WORK_PACKAGE__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkPackageImpl
