/**
 */
package org.nasdanika.models.productmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concise statement of who it is for, what it helps them achieve, and why it is better than alternatives.
 * 
 * Treating VP as data enables:
 * - Persona-specific messaging
 * - Edition/plan design tied to benefits
 * - Launch/experiment planning
 * - Outcome measurement and iteration
 * 
 * VP sits between user intent (needs/goals) and product packaging (editions/plans),
 * with capabilities as the bridge and evidence as validation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getAddressedNeeds <em>Addressed Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getSupportedGoals <em>Supported Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getMitigatedPainPoints <em>Mitigated Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getEnablingCapabilities <em>Enabling Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getPackagedInEditions <em>Packaged In Editions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getDifferentiatedFromAlternatives <em>Differentiated From Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.ValueProposition#getTargetSegments <em>Target Segments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition()
 * @model
 * @generated
 */
public interface ValueProposition extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concise value proposition statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.ValueProposition#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Target Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas this value proposition targets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Personas</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_TargetPersonas()
	 * @model
	 * @generated
	 */
	EList<Persona> getTargetPersonas();

	/**
	 * Returns the value of the '<em><b>Addressed Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Needs this value proposition addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressed Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_AddressedNeeds()
	 * @model
	 * @generated
	 */
	EList<Need> getAddressedNeeds();

	/**
	 * Returns the value of the '<em><b>Supported Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals this value proposition supports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_SupportedGoals()
	 * @model
	 * @generated
	 */
	EList<Goal> getSupportedGoals();

	/**
	 * Returns the value of the '<em><b>Mitigated Pain Points</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pain points this value proposition mitigates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigated Pain Points</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_MitigatedPainPoints()
	 * @model
	 * @generated
	 */
	EList<PainPoint> getMitigatedPainPoints();

	/**
	 * Returns the value of the '<em><b>Enabling Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities (including features) that enable this value proposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabling Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_EnablingCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getEnablingCapabilities();

	/**
	 * Returns the value of the '<em><b>Packaged In Editions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Editions in which this value proposition is packaged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged In Editions</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_PackagedInEditions()
	 * @model
	 * @generated
	 */
	EList<Edition> getPackagedInEditions();

	/**
	 * Returns the value of the '<em><b>Differentiated From Alternatives</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Alternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternatives (competitors/incumbents) from which this value proposition is differentiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Differentiated From Alternatives</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_DifferentiatedFromAlternatives()
	 * @model
	 * @generated
	 */
	EList<Alternative> getDifferentiatedFromAlternatives();

	/**
	 * Returns the value of the '<em><b>Supporting Evidence</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence supporting this value proposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Evidence</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_SupportingEvidence()
	 * @model
	 * @generated
	 */
	EList<Evidence> getSupportingEvidence();

	/**
	 * Returns the value of the '<em><b>Target Segments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.MarketSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market segments this value proposition targets (in addition to personas).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Segments</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getValueProposition_TargetSegments()
	 * @model
	 * @generated
	 */
	EList<MarketSegment> getTargetSegments();

} // ValueProposition
