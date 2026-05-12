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
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.Offering;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.Proposal;
import org.nasdanika.models.productmanagement.Role;
import org.nasdanika.models.productmanagement.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getCapabilityProviders <em>Capability Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getWorkPackages <em>Work Packages</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getOfferings <em>Offerings</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getProposals <em>Proposals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductModelImpl extends ModelElementImpl implements ProductModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.PRODUCT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getPersonas() {
		return (EList<Persona>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__PERSONAS, ProductmanagementPackage.Literals.PRODUCT_MODEL__PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES, ProductmanagementPackage.Literals.PRODUCT_MODEL__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityProvider> getCapabilityProviders() {
		return (EList<CapabilityProvider>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS, ProductmanagementPackage.Literals.PRODUCT_MODEL__CAPABILITY_PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkPackage> getWorkPackages() {
		return (EList<WorkPackage>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__WORK_PACKAGES, ProductmanagementPackage.Literals.PRODUCT_MODEL__WORK_PACKAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Offering> getOfferings() {
		return (EList<Offering>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__OFFERINGS, ProductmanagementPackage.Literals.PRODUCT_MODEL__OFFERINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Actor> getActors() {
		return (EList<Actor>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__ACTORS, ProductmanagementPackage.Literals.PRODUCT_MODEL__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Proposal> getProposals() {
		return (EList<Proposal>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__PROPOSALS, ProductmanagementPackage.Literals.PRODUCT_MODEL__PROPOSALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__ROLES, ProductmanagementPackage.Literals.PRODUCT_MODEL__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.PRODUCT_MODEL__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS:
				return ((InternalEList<?>)getCapabilityProviders()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PRODUCT_MODEL__WORK_PACKAGES:
				return ((InternalEList<?>)getWorkPackages()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PRODUCT_MODEL__OFFERINGS:
				return ((InternalEList<?>)getOfferings()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PRODUCT_MODEL__PROPOSALS:
				return ((InternalEList<?>)getProposals()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PRODUCT_MODEL__ROLES:
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
			case ProductmanagementPackage.PRODUCT_MODEL__PERSONAS:
				return getPersonas();
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES:
				return getCapabilities();
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS:
				return getCapabilityProviders();
			case ProductmanagementPackage.PRODUCT_MODEL__WORK_PACKAGES:
				return getWorkPackages();
			case ProductmanagementPackage.PRODUCT_MODEL__OFFERINGS:
				return getOfferings();
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				return getActors();
			case ProductmanagementPackage.PRODUCT_MODEL__PROPOSALS:
				return getProposals();
			case ProductmanagementPackage.PRODUCT_MODEL__ROLES:
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
			case ProductmanagementPackage.PRODUCT_MODEL__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS:
				getCapabilityProviders().clear();
				getCapabilityProviders().addAll((Collection<? extends CapabilityProvider>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__WORK_PACKAGES:
				getWorkPackages().clear();
				getWorkPackages().addAll((Collection<? extends WorkPackage>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__OFFERINGS:
				getOfferings().clear();
				getOfferings().addAll((Collection<? extends Offering>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__PROPOSALS:
				getProposals().clear();
				getProposals().addAll((Collection<? extends Proposal>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__ROLES:
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
			case ProductmanagementPackage.PRODUCT_MODEL__PERSONAS:
				getPersonas().clear();
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES:
				getCapabilities().clear();
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS:
				getCapabilityProviders().clear();
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__WORK_PACKAGES:
				getWorkPackages().clear();
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__OFFERINGS:
				getOfferings().clear();
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				getActors().clear();
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__PROPOSALS:
				getProposals().clear();
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__ROLES:
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
			case ProductmanagementPackage.PRODUCT_MODEL__PERSONAS:
				return !getPersonas().isEmpty();
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS:
				return !getCapabilityProviders().isEmpty();
			case ProductmanagementPackage.PRODUCT_MODEL__WORK_PACKAGES:
				return !getWorkPackages().isEmpty();
			case ProductmanagementPackage.PRODUCT_MODEL__OFFERINGS:
				return !getOfferings().isEmpty();
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				return !getActors().isEmpty();
			case ProductmanagementPackage.PRODUCT_MODEL__PROPOSALS:
				return !getProposals().isEmpty();
			case ProductmanagementPackage.PRODUCT_MODEL__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductModelImpl
