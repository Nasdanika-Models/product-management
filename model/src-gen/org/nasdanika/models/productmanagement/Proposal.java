/**
 */
package org.nasdanika.models.productmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A bid to build a capability or complete a work package.
 * 'I can build this by date X at cost Y.' Cost may be zero but must acknowledge
 * implicit ownership costs. Is a Period (delivery window). The 'author' reference
 * captures who made the proposal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.Proposal#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Proposal#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Proposal#getWorkPackage <em>Work Package</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Proposal#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.Proposal#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProposal()
 * @model
 * @generated
 */
public interface Proposal extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposed monetary cost. Zero is allowed but must
	 * acknowledge implicit acceptance and ongoing ownership costs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProposal_Cost()
	 * @model unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Proposal#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISO 4217 currency code for the cost, e.g. 'USD', 'EUR'.
	 * If not set, defaults to the model's currency context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProposal_Currency()
	 * @model unique="false"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Proposal#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Work Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The work package this proposal addresses. At least one
	 * of workPackage or capability must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Package</em>' reference.
	 * @see #setWorkPackage(WorkPackage)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProposal_WorkPackage()
	 * @model
	 * @generated
	 */
	WorkPackage getWorkPackage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Proposal#getWorkPackage <em>Work Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Package</em>' reference.
	 * @see #getWorkPackage()
	 * @generated
	 */
	void setWorkPackage(WorkPackage value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capability this proposal proposes to build. At least
	 * one of workPackage or capability must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(Capability)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProposal_Capability()
	 * @model
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Proposal#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actor who authored this proposal. Records decision
	 * provenance: who made the bid. The 'when' is captured by ModelElement.start or
	 * documented in the proposal's documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Actor)
	 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getProposal_Author()
	 * @model
	 * @generated
	 */
	Actor getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.productmanagement.Proposal#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Actor value);

} // Proposal
