/**
 */
package org.nasdanika.models.productmanagement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A testable belief that drives product decisions.
 * 
 * Every value proposition, feature, capability, market bet, and pricing decision is ultimately
 * based on a belief that must be validated.
 * 
 * A Hypothesis is:
 * - Falsifiable
 * - Linked to a persona, need, goal, pain point, or value proposition
 * - Validated or invalidated by evidence
 * - Driving experiments and decisions
 * 
 * Example: 'We believe that enterprise hiring managers will reduce screening time by 50%
 * if we provide Premium Skill Signals.'
 * 
 * Hypotheses sit before Value Propositions in the order of abstraction:
 * Persona → Needs/Pain Points/Goals → Hypotheses → Value Propositions → Capabilities → Editions → Subscription Plans
 * 
 * You test hypotheses → some become validated → those support Value Props → those define packaging.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getLastUpdatedAt <em>Last Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getLinkedNeeds <em>Linked Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getLinkedGoals <em>Linked Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getLinkedPainPoints <em>Linked Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getEnabledByCapabilities <em>Enabled By Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getSupportsValuePropositions <em>Supports Value Propositions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Hypothesis#getSuccessMetrics <em>Success Metrics</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis()
 * @model
 * @generated
 */
public interface Hypothesis extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structured belief statement. Example: 'We believe that [persona] will [outcome] if we [action].'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Hypothesis#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.productmanagement.HypothesisStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current validation status of this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.HypothesisStatus
	 * @see #setStatus(HypothesisStatus)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_Status()
	 * @model
	 * @generated
	 */
	HypothesisStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Hypothesis#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.productmanagement.HypothesisStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(HypothesisStatus value);

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key assumptions underlying this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assumptions</em>' attribute list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_Assumptions()
	 * @model
	 * @generated
	 */
	EList<String> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Risks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risks associated with this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risks</em>' attribute list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_Risks()
	 * @model
	 * @generated
	 */
	EList<String> getRisks();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Owner of this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Hypothesis#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when this hypothesis was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Hypothesis#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Last Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when this hypothesis was last updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Updated At</em>' attribute.
	 * @see #setLastUpdatedAt(Date)
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_LastUpdatedAt()
	 * @model
	 * @generated
	 */
	Date getLastUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Hypothesis#getLastUpdatedAt <em>Last Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated At</em>' attribute.
	 * @see #getLastUpdatedAt()
	 * @generated
	 */
	void setLastUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Target Personas</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personas this hypothesis is about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Personas</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_TargetPersonas()
	 * @model
	 * @generated
	 */
	EList<Persona> getTargetPersonas();

	/**
	 * Returns the value of the '<em><b>Linked Needs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Needs linked to this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Needs</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_LinkedNeeds()
	 * @model
	 * @generated
	 */
	EList<Need> getLinkedNeeds();

	/**
	 * Returns the value of the '<em><b>Linked Goals</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goals linked to this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Goals</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_LinkedGoals()
	 * @model
	 * @generated
	 */
	EList<Goal> getLinkedGoals();

	/**
	 * Returns the value of the '<em><b>Linked Pain Points</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.PainPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pain points linked to this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Pain Points</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_LinkedPainPoints()
	 * @model
	 * @generated
	 */
	EList<PainPoint> getLinkedPainPoints();

	/**
	 * Returns the value of the '<em><b>Enabled By Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities that would enable validation of this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled By Capabilities</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_EnabledByCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getEnabledByCapabilities();

	/**
	 * Returns the value of the '<em><b>Supports Value Propositions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.ValueProposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value propositions that this hypothesis supports (once validated).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Value Propositions</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_SupportsValuePropositions()
	 * @model
	 * @generated
	 */
	EList<ValueProposition> getSupportsValuePropositions();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence that validates or invalidates this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_Evidence()
	 * @model
	 * @generated
	 */
	EList<Evidence> getEvidence();

	/**
	 * Returns the value of the '<em><b>Success Metrics</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.productmanagement.OutcomeMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metrics used to measure success of this hypothesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Success Metrics</em>' reference list.
	 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesis_SuccessMetrics()
	 * @model
	 * @generated
	 */
	EList<OutcomeMetric> getSuccessMetrics();

} // Hypothesis
