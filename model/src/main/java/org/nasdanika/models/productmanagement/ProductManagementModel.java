/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root container for the product management model. Contains all top-level entities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getPersonas <em>Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getPortfolios <em>Portfolios</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getCapabilityProviders <em>Capability Providers</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getValuePropositions <em>Value Propositions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getOutcomeMetrics <em>Outcome Metrics</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getMarketSegments <em>Market Segments</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ProductManagementModel#getHypotheses <em>Hypotheses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel()
 * @model
 * @generated
 */
public interface ProductManagementModel extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Personas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All personas defined in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personas</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Personas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Persona> getPersonas();

	/**
	 * Returns the value of the '<em><b>Portfolios</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ProductPortfolio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product portfolios in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portfolios</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Portfolios()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductPortfolio> getPortfolios();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standalone products not part of a portfolio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standalone capabilities not owned by a specific product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.CapabilityProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capability providers in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Providers</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_CapabilityProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityProvider> getCapabilityProviders();

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Subscription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscription plans in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriptions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Subscriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscription> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Value Propositions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ValueProposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value propositions defined in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Propositions</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_ValuePropositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueProposition> getValuePropositions();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence items in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evidence> getEvidence();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Alternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Competitor and alternative solutions tracked in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alternative> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Outcome Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.OutcomeMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outcome metrics defined in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome Metrics</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_OutcomeMetrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutcomeMetric> getOutcomeMetrics();

	/**
	 * Returns the value of the '<em><b>Market Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.MarketSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market segments defined in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Market Segments</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_MarketSegments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarketSegment> getMarketSegments();

	/**
	 * Returns the value of the '<em><b>Hypotheses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Hypothesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hypotheses defined in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hypotheses</em>' containment reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getProductManagementModel_Hypotheses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hypothesis> getHypotheses();

} // ProductManagementModel
