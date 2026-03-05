/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Alternative;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.CapabilityProvider;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.Hypothesis;
import org.nasdanika.models.productmanagement.MarketSegment;
import org.nasdanika.models.productmanagement.OutcomeMetric;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.Product;
import org.nasdanika.models.productmanagement.ProductManagementModel;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.ProductPortfolio;
import org.nasdanika.models.productmanagement.Subscription;
import org.nasdanika.models.productmanagement.ValueProposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getPortfolios <em>Portfolios</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getCapabilityProviders <em>Capability Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getValuePropositions <em>Value Propositions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getOutcomeMetrics <em>Outcome Metrics</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getMarketSegments <em>Market Segments</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ProductManagementModelImpl#getHypotheses <em>Hypotheses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductManagementModelImpl extends ModelElementImpl implements ProductManagementModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductManagementModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getPersonas() {
		return (EList<Persona>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PERSONAS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProductPortfolio> getPortfolios() {
		return (EList<ProductPortfolio>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Product> getProducts() {
		return (EList<Product>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PRODUCTS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITIES, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityProvider> getCapabilityProviders() {
		return (EList<CapabilityProvider>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subscription> getSubscriptions() {
		return (EList<Subscription>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ValueProposition> getValuePropositions() {
		return (EList<ValueProposition>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getEvidence() {
		return (EList<Evidence>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__EVIDENCE, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alternative> getAlternatives() {
		return (EList<Alternative>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OutcomeMetric> getOutcomeMetrics() {
		return (EList<OutcomeMetric>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MarketSegment> getMarketSegments() {
		return (EList<MarketSegment>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Hypothesis> getHypotheses() {
		return (EList<Hypothesis>)eDynamicGet(ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__HYPOTHESES, ProductManagementPackage.Literals.PRODUCT_MANAGEMENT_MODEL__HYPOTHESES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PERSONAS:
				return ((InternalEList<?>)getPersonas()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS:
				return ((InternalEList<?>)getPortfolios()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS:
				return ((InternalEList<?>)getCapabilityProviders()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS:
				return ((InternalEList<?>)getSubscriptions()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS:
				return ((InternalEList<?>)getValuePropositions()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS:
				return ((InternalEList<?>)getOutcomeMetrics()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS:
				return ((InternalEList<?>)getMarketSegments()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__HYPOTHESES:
				return ((InternalEList<?>)getHypotheses()).basicRemove(otherEnd, msgs);
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
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PERSONAS:
				return getPersonas();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS:
				return getPortfolios();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PRODUCTS:
				return getProducts();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITIES:
				return getCapabilities();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS:
				return getCapabilityProviders();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS:
				return getSubscriptions();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS:
				return getValuePropositions();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__EVIDENCE:
				return getEvidence();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES:
				return getAlternatives();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS:
				return getOutcomeMetrics();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS:
				return getMarketSegments();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__HYPOTHESES:
				return getHypotheses();
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
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PERSONAS:
				getPersonas().clear();
				getPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS:
				getPortfolios().clear();
				getPortfolios().addAll((Collection<? extends ProductPortfolio>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS:
				getCapabilityProviders().clear();
				getCapabilityProviders().addAll((Collection<? extends CapabilityProvider>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS:
				getSubscriptions().clear();
				getSubscriptions().addAll((Collection<? extends Subscription>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS:
				getValuePropositions().clear();
				getValuePropositions().addAll((Collection<? extends ValueProposition>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends Alternative>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS:
				getOutcomeMetrics().clear();
				getOutcomeMetrics().addAll((Collection<? extends OutcomeMetric>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS:
				getMarketSegments().clear();
				getMarketSegments().addAll((Collection<? extends MarketSegment>)newValue);
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__HYPOTHESES:
				getHypotheses().clear();
				getHypotheses().addAll((Collection<? extends Hypothesis>)newValue);
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
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PERSONAS:
				getPersonas().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS:
				getPortfolios().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PRODUCTS:
				getProducts().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITIES:
				getCapabilities().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS:
				getCapabilityProviders().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS:
				getSubscriptions().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS:
				getValuePropositions().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__EVIDENCE:
				getEvidence().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS:
				getOutcomeMetrics().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS:
				getMarketSegments().clear();
				return;
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__HYPOTHESES:
				getHypotheses().clear();
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
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PERSONAS:
				return !getPersonas().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PORTFOLIOS:
				return !getPortfolios().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__PRODUCTS:
				return !getProducts().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__CAPABILITY_PROVIDERS:
				return !getCapabilityProviders().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__SUBSCRIPTIONS:
				return !getSubscriptions().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__VALUE_PROPOSITIONS:
				return !getValuePropositions().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__EVIDENCE:
				return !getEvidence().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__ALTERNATIVES:
				return !getAlternatives().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__OUTCOME_METRICS:
				return !getOutcomeMetrics().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__MARKET_SEGMENTS:
				return !getMarketSegments().isEmpty();
			case ProductManagementPackage.PRODUCT_MANAGEMENT_MODEL__HYPOTHESES:
				return !getHypotheses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductManagementModelImpl
