/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.AbstractActor;
import org.nasdanika.models.productmanagement.AbstractCapability;
import org.nasdanika.models.productmanagement.AbstractCapabilityProvider;
import org.nasdanika.models.productmanagement.AbstractPersona;
import org.nasdanika.models.productmanagement.ActorDomain;
import org.nasdanika.models.productmanagement.CapabilityDomain;
import org.nasdanika.models.productmanagement.CapabilityProviderDomain;
import org.nasdanika.models.productmanagement.PersonaDomain;
import org.nasdanika.models.productmanagement.ProductModel;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

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
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductModelImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductModelImpl extends NamedPeriodImpl implements ProductModel {
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
	public EList<AbstractPersona> getPersonas() {
		return (EList<AbstractPersona>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__PERSONAS, ProductmanagementPackage.Literals.PERSONA_DOMAIN__PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getCapabilities() {
		return (EList<AbstractCapability>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES, ProductmanagementPackage.Literals.CAPABILITY_DOMAIN__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapabilityProvider> getCapabilityProviders() {
		return (EList<AbstractCapabilityProvider>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS, ProductmanagementPackage.Literals.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractActor> getActors() {
		return (EList<AbstractActor>)eDynamicGet(ProductmanagementPackage.PRODUCT_MODEL__ACTORS, ProductmanagementPackage.Literals.ACTOR_DOMAIN__ACTORS, true, true);
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
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				return getActors();
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
				getPersonas().addAll((Collection<? extends AbstractPersona>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends AbstractCapability>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS:
				getCapabilityProviders().clear();
				getCapabilityProviders().addAll((Collection<? extends AbstractCapabilityProvider>)newValue);
				return;
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends AbstractActor>)newValue);
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
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				getActors().clear();
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
			case ProductmanagementPackage.PRODUCT_MODEL__ACTORS:
				return !getActors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractPersona.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PersonaDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.PRODUCT_MODEL__PERSONAS: return ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapability.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES: return ProductmanagementPackage.CAPABILITY_DOMAIN__CAPABILITIES;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapabilityProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityProviderDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS: return ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS;
				default: return -1;
			}
		}
		if (baseClass == AbstractActor.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActorDomain.class) {
			switch (derivedFeatureID) {
				case ProductmanagementPackage.PRODUCT_MODEL__ACTORS: return ProductmanagementPackage.ACTOR_DOMAIN__ACTORS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractPersona.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PersonaDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.PERSONA_DOMAIN__PERSONAS: return ProductmanagementPackage.PRODUCT_MODEL__PERSONAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapability.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.CAPABILITY_DOMAIN__CAPABILITIES: return ProductmanagementPackage.PRODUCT_MODEL__CAPABILITIES;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapabilityProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityProviderDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS: return ProductmanagementPackage.PRODUCT_MODEL__CAPABILITY_PROVIDERS;
				default: return -1;
			}
		}
		if (baseClass == AbstractActor.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActorDomain.class) {
			switch (baseFeatureID) {
				case ProductmanagementPackage.ACTOR_DOMAIN__ACTORS: return ProductmanagementPackage.PRODUCT_MODEL__ACTORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProductModelImpl
