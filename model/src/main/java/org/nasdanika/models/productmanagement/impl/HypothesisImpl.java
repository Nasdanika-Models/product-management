/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Hypothesis;
import org.nasdanika.models.productmanagement.HypothesisStatus;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.OutcomeMetric;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.ValueProposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getLastUpdatedAt <em>Last Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getLinkedNeeds <em>Linked Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getLinkedGoals <em>Linked Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getLinkedPainPoints <em>Linked Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getEnabledByCapabilities <em>Enabled By Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getSupportsValuePropositions <em>Supports Value Propositions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.HypothesisImpl#getSuccessMetrics <em>Success Metrics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HypothesisImpl extends ModelElementImpl implements Hypothesis {
	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final HypothesisStatus STATUS_EDEFAULT = HypothesisStatus.UNVALIDATED;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastUpdatedAt() <em>Last Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_AT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypothesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.HYPOTHESIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatement() {
		return (String)eDynamicGet(ProductManagementPackage.HYPOTHESIS__STATEMENT, ProductManagementPackage.Literals.HYPOTHESIS__STATEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(String newStatement) {
		eDynamicSet(ProductManagementPackage.HYPOTHESIS__STATEMENT, ProductManagementPackage.Literals.HYPOTHESIS__STATEMENT, newStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HypothesisStatus getStatus() {
		return (HypothesisStatus)eDynamicGet(ProductManagementPackage.HYPOTHESIS__STATUS, ProductManagementPackage.Literals.HYPOTHESIS__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(HypothesisStatus newStatus) {
		eDynamicSet(ProductManagementPackage.HYPOTHESIS__STATUS, ProductManagementPackage.Literals.HYPOTHESIS__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getAssumptions() {
		return (EList<String>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__ASSUMPTIONS, ProductManagementPackage.Literals.HYPOTHESIS__ASSUMPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRisks() {
		return (EList<String>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__RISKS, ProductManagementPackage.Literals.HYPOTHESIS__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwner() {
		return (String)eDynamicGet(ProductManagementPackage.HYPOTHESIS__OWNER, ProductManagementPackage.Literals.HYPOTHESIS__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(String newOwner) {
		eDynamicSet(ProductManagementPackage.HYPOTHESIS__OWNER, ProductManagementPackage.Literals.HYPOTHESIS__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(ProductManagementPackage.HYPOTHESIS__CREATED_AT, ProductManagementPackage.Literals.HYPOTHESIS__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(ProductManagementPackage.HYPOTHESIS__CREATED_AT, ProductManagementPackage.Literals.HYPOTHESIS__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedAt() {
		return (Date)eDynamicGet(ProductManagementPackage.HYPOTHESIS__LAST_UPDATED_AT, ProductManagementPackage.Literals.HYPOTHESIS__LAST_UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedAt(Date newLastUpdatedAt) {
		eDynamicSet(ProductManagementPackage.HYPOTHESIS__LAST_UPDATED_AT, ProductManagementPackage.Literals.HYPOTHESIS__LAST_UPDATED_AT, newLastUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getTargetPersonas() {
		return (EList<Persona>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__TARGET_PERSONAS, ProductManagementPackage.Literals.HYPOTHESIS__TARGET_PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getLinkedNeeds() {
		return (EList<Need>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__LINKED_NEEDS, ProductManagementPackage.Literals.HYPOTHESIS__LINKED_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getLinkedGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__LINKED_GOALS, ProductManagementPackage.Literals.HYPOTHESIS__LINKED_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PainPoint> getLinkedPainPoints() {
		return (EList<PainPoint>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__LINKED_PAIN_POINTS, ProductManagementPackage.Literals.HYPOTHESIS__LINKED_PAIN_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getEnabledByCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__ENABLED_BY_CAPABILITIES, ProductManagementPackage.Literals.HYPOTHESIS__ENABLED_BY_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ValueProposition> getSupportsValuePropositions() {
		return (EList<ValueProposition>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS, ProductManagementPackage.Literals.HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getEvidence() {
		return (EList<Evidence>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__EVIDENCE, ProductManagementPackage.Literals.HYPOTHESIS__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OutcomeMetric> getSuccessMetrics() {
		return (EList<OutcomeMetric>)eDynamicGet(ProductManagementPackage.HYPOTHESIS__SUCCESS_METRICS, ProductManagementPackage.Literals.HYPOTHESIS__SUCCESS_METRICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.HYPOTHESIS__STATEMENT:
				return getStatement();
			case ProductManagementPackage.HYPOTHESIS__STATUS:
				return getStatus();
			case ProductManagementPackage.HYPOTHESIS__ASSUMPTIONS:
				return getAssumptions();
			case ProductManagementPackage.HYPOTHESIS__RISKS:
				return getRisks();
			case ProductManagementPackage.HYPOTHESIS__OWNER:
				return getOwner();
			case ProductManagementPackage.HYPOTHESIS__CREATED_AT:
				return getCreatedAt();
			case ProductManagementPackage.HYPOTHESIS__LAST_UPDATED_AT:
				return getLastUpdatedAt();
			case ProductManagementPackage.HYPOTHESIS__TARGET_PERSONAS:
				return getTargetPersonas();
			case ProductManagementPackage.HYPOTHESIS__LINKED_NEEDS:
				return getLinkedNeeds();
			case ProductManagementPackage.HYPOTHESIS__LINKED_GOALS:
				return getLinkedGoals();
			case ProductManagementPackage.HYPOTHESIS__LINKED_PAIN_POINTS:
				return getLinkedPainPoints();
			case ProductManagementPackage.HYPOTHESIS__ENABLED_BY_CAPABILITIES:
				return getEnabledByCapabilities();
			case ProductManagementPackage.HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS:
				return getSupportsValuePropositions();
			case ProductManagementPackage.HYPOTHESIS__EVIDENCE:
				return getEvidence();
			case ProductManagementPackage.HYPOTHESIS__SUCCESS_METRICS:
				return getSuccessMetrics();
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
			case ProductManagementPackage.HYPOTHESIS__STATEMENT:
				setStatement((String)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__STATUS:
				setStatus((HypothesisStatus)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends String>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends String>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__OWNER:
				setOwner((String)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__LAST_UPDATED_AT:
				setLastUpdatedAt((Date)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__TARGET_PERSONAS:
				getTargetPersonas().clear();
				getTargetPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__LINKED_NEEDS:
				getLinkedNeeds().clear();
				getLinkedNeeds().addAll((Collection<? extends Need>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__LINKED_GOALS:
				getLinkedGoals().clear();
				getLinkedGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__LINKED_PAIN_POINTS:
				getLinkedPainPoints().clear();
				getLinkedPainPoints().addAll((Collection<? extends PainPoint>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__ENABLED_BY_CAPABILITIES:
				getEnabledByCapabilities().clear();
				getEnabledByCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS:
				getSupportsValuePropositions().clear();
				getSupportsValuePropositions().addAll((Collection<? extends ValueProposition>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case ProductManagementPackage.HYPOTHESIS__SUCCESS_METRICS:
				getSuccessMetrics().clear();
				getSuccessMetrics().addAll((Collection<? extends OutcomeMetric>)newValue);
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
			case ProductManagementPackage.HYPOTHESIS__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case ProductManagementPackage.HYPOTHESIS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ProductManagementPackage.HYPOTHESIS__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__RISKS:
				getRisks().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case ProductManagementPackage.HYPOTHESIS__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case ProductManagementPackage.HYPOTHESIS__LAST_UPDATED_AT:
				setLastUpdatedAt(LAST_UPDATED_AT_EDEFAULT);
				return;
			case ProductManagementPackage.HYPOTHESIS__TARGET_PERSONAS:
				getTargetPersonas().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__LINKED_NEEDS:
				getLinkedNeeds().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__LINKED_GOALS:
				getLinkedGoals().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__LINKED_PAIN_POINTS:
				getLinkedPainPoints().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__ENABLED_BY_CAPABILITIES:
				getEnabledByCapabilities().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS:
				getSupportsValuePropositions().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__EVIDENCE:
				getEvidence().clear();
				return;
			case ProductManagementPackage.HYPOTHESIS__SUCCESS_METRICS:
				getSuccessMetrics().clear();
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
			case ProductManagementPackage.HYPOTHESIS__STATEMENT:
				return STATEMENT_EDEFAULT == null ? getStatement() != null : !STATEMENT_EDEFAULT.equals(getStatement());
			case ProductManagementPackage.HYPOTHESIS__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case ProductManagementPackage.HYPOTHESIS__ASSUMPTIONS:
				return !getAssumptions().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__RISKS:
				return !getRisks().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__OWNER:
				return OWNER_EDEFAULT == null ? getOwner() != null : !OWNER_EDEFAULT.equals(getOwner());
			case ProductManagementPackage.HYPOTHESIS__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case ProductManagementPackage.HYPOTHESIS__LAST_UPDATED_AT:
				return LAST_UPDATED_AT_EDEFAULT == null ? getLastUpdatedAt() != null : !LAST_UPDATED_AT_EDEFAULT.equals(getLastUpdatedAt());
			case ProductManagementPackage.HYPOTHESIS__TARGET_PERSONAS:
				return !getTargetPersonas().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__LINKED_NEEDS:
				return !getLinkedNeeds().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__LINKED_GOALS:
				return !getLinkedGoals().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__LINKED_PAIN_POINTS:
				return !getLinkedPainPoints().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__ENABLED_BY_CAPABILITIES:
				return !getEnabledByCapabilities().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__SUPPORTS_VALUE_PROPOSITIONS:
				return !getSupportsValuePropositions().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__EVIDENCE:
				return !getEvidence().isEmpty();
			case ProductManagementPackage.HYPOTHESIS__SUCCESS_METRICS:
				return !getSuccessMetrics().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HypothesisImpl
