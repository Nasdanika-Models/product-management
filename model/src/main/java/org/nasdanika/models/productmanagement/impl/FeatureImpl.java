/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.Feature;
import org.nasdanika.models.productmanagement.FeaturePersonaAssociation;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.FeatureImpl#getAddressedNeeds <em>Addressed Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.FeatureImpl#getSupportedGoals <em>Supported Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.FeatureImpl#getAddressedPainPoints <em>Addressed Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.FeatureImpl#getPersonaAssociations <em>Persona Associations</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.FeatureImpl#getUsedCapabilities <em>Used Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends CapabilityImpl implements Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getAddressedNeeds() {
		return (EList<Need>)eDynamicGet(ProductManagementPackage.FEATURE__ADDRESSED_NEEDS, ProductManagementPackage.Literals.FEATURE__ADDRESSED_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getSupportedGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.FEATURE__SUPPORTED_GOALS, ProductManagementPackage.Literals.FEATURE__SUPPORTED_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PainPoint> getAddressedPainPoints() {
		return (EList<PainPoint>)eDynamicGet(ProductManagementPackage.FEATURE__ADDRESSED_PAIN_POINTS, ProductManagementPackage.Literals.FEATURE__ADDRESSED_PAIN_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeaturePersonaAssociation> getPersonaAssociations() {
		return (EList<FeaturePersonaAssociation>)eDynamicGet(ProductManagementPackage.FEATURE__PERSONA_ASSOCIATIONS, ProductManagementPackage.Literals.FEATURE__PERSONA_ASSOCIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getUsedCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.FEATURE__USED_CAPABILITIES, ProductManagementPackage.Literals.FEATURE__USED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.FEATURE__PERSONA_ASSOCIATIONS:
				return ((InternalEList<?>)getPersonaAssociations()).basicRemove(otherEnd, msgs);
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
			case ProductManagementPackage.FEATURE__ADDRESSED_NEEDS:
				return getAddressedNeeds();
			case ProductManagementPackage.FEATURE__SUPPORTED_GOALS:
				return getSupportedGoals();
			case ProductManagementPackage.FEATURE__ADDRESSED_PAIN_POINTS:
				return getAddressedPainPoints();
			case ProductManagementPackage.FEATURE__PERSONA_ASSOCIATIONS:
				return getPersonaAssociations();
			case ProductManagementPackage.FEATURE__USED_CAPABILITIES:
				return getUsedCapabilities();
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
			case ProductManagementPackage.FEATURE__ADDRESSED_NEEDS:
				getAddressedNeeds().clear();
				getAddressedNeeds().addAll((Collection<? extends Need>)newValue);
				return;
			case ProductManagementPackage.FEATURE__SUPPORTED_GOALS:
				getSupportedGoals().clear();
				getSupportedGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ProductManagementPackage.FEATURE__ADDRESSED_PAIN_POINTS:
				getAddressedPainPoints().clear();
				getAddressedPainPoints().addAll((Collection<? extends PainPoint>)newValue);
				return;
			case ProductManagementPackage.FEATURE__PERSONA_ASSOCIATIONS:
				getPersonaAssociations().clear();
				getPersonaAssociations().addAll((Collection<? extends FeaturePersonaAssociation>)newValue);
				return;
			case ProductManagementPackage.FEATURE__USED_CAPABILITIES:
				getUsedCapabilities().clear();
				getUsedCapabilities().addAll((Collection<? extends Capability>)newValue);
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
			case ProductManagementPackage.FEATURE__ADDRESSED_NEEDS:
				getAddressedNeeds().clear();
				return;
			case ProductManagementPackage.FEATURE__SUPPORTED_GOALS:
				getSupportedGoals().clear();
				return;
			case ProductManagementPackage.FEATURE__ADDRESSED_PAIN_POINTS:
				getAddressedPainPoints().clear();
				return;
			case ProductManagementPackage.FEATURE__PERSONA_ASSOCIATIONS:
				getPersonaAssociations().clear();
				return;
			case ProductManagementPackage.FEATURE__USED_CAPABILITIES:
				getUsedCapabilities().clear();
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
			case ProductManagementPackage.FEATURE__ADDRESSED_NEEDS:
				return !getAddressedNeeds().isEmpty();
			case ProductManagementPackage.FEATURE__SUPPORTED_GOALS:
				return !getSupportedGoals().isEmpty();
			case ProductManagementPackage.FEATURE__ADDRESSED_PAIN_POINTS:
				return !getAddressedPainPoints().isEmpty();
			case ProductManagementPackage.FEATURE__PERSONA_ASSOCIATIONS:
				return !getPersonaAssociations().isEmpty();
			case ProductManagementPackage.FEATURE__USED_CAPABILITIES:
				return !getUsedCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
