/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Alternative;
import org.nasdanika.models.productmanagement.Capability;
import org.nasdanika.models.productmanagement.Edition;
import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.MarketSegment;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductManagementPackage;
import org.nasdanika.models.productmanagement.ValueProposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getTargetPersonas <em>Target Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getAddressedNeeds <em>Addressed Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getSupportedGoals <em>Supported Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getMitigatedPainPoints <em>Mitigated Pain Points</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getEnablingCapabilities <em>Enabling Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getPackagedInEditions <em>Packaged In Editions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getDifferentiatedFromAlternatives <em>Differentiated From Alternatives</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ValuePropositionImpl#getTargetSegments <em>Target Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePropositionImpl extends ModelElementImpl implements ValueProposition {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePropositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.VALUE_PROPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatement() {
		return (String)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__STATEMENT, ProductManagementPackage.Literals.VALUE_PROPOSITION__STATEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(String newStatement) {
		eDynamicSet(ProductManagementPackage.VALUE_PROPOSITION__STATEMENT, ProductManagementPackage.Literals.VALUE_PROPOSITION__STATEMENT, newStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getTargetPersonas() {
		return (EList<Persona>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__TARGET_PERSONAS, ProductManagementPackage.Literals.VALUE_PROPOSITION__TARGET_PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getAddressedNeeds() {
		return (EList<Need>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__ADDRESSED_NEEDS, ProductManagementPackage.Literals.VALUE_PROPOSITION__ADDRESSED_NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getSupportedGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__SUPPORTED_GOALS, ProductManagementPackage.Literals.VALUE_PROPOSITION__SUPPORTED_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PainPoint> getMitigatedPainPoints() {
		return (EList<PainPoint>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__MITIGATED_PAIN_POINTS, ProductManagementPackage.Literals.VALUE_PROPOSITION__MITIGATED_PAIN_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getEnablingCapabilities() {
		return (EList<Capability>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__ENABLING_CAPABILITIES, ProductManagementPackage.Literals.VALUE_PROPOSITION__ENABLING_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Edition> getPackagedInEditions() {
		return (EList<Edition>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__PACKAGED_IN_EDITIONS, ProductManagementPackage.Literals.VALUE_PROPOSITION__PACKAGED_IN_EDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Alternative> getDifferentiatedFromAlternatives() {
		return (EList<Alternative>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES, ProductManagementPackage.Literals.VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getSupportingEvidence() {
		return (EList<Evidence>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__SUPPORTING_EVIDENCE, ProductManagementPackage.Literals.VALUE_PROPOSITION__SUPPORTING_EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MarketSegment> getTargetSegments() {
		return (EList<MarketSegment>)eDynamicGet(ProductManagementPackage.VALUE_PROPOSITION__TARGET_SEGMENTS, ProductManagementPackage.Literals.VALUE_PROPOSITION__TARGET_SEGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.VALUE_PROPOSITION__STATEMENT:
				return getStatement();
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_PERSONAS:
				return getTargetPersonas();
			case ProductManagementPackage.VALUE_PROPOSITION__ADDRESSED_NEEDS:
				return getAddressedNeeds();
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTED_GOALS:
				return getSupportedGoals();
			case ProductManagementPackage.VALUE_PROPOSITION__MITIGATED_PAIN_POINTS:
				return getMitigatedPainPoints();
			case ProductManagementPackage.VALUE_PROPOSITION__ENABLING_CAPABILITIES:
				return getEnablingCapabilities();
			case ProductManagementPackage.VALUE_PROPOSITION__PACKAGED_IN_EDITIONS:
				return getPackagedInEditions();
			case ProductManagementPackage.VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES:
				return getDifferentiatedFromAlternatives();
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTING_EVIDENCE:
				return getSupportingEvidence();
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_SEGMENTS:
				return getTargetSegments();
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
			case ProductManagementPackage.VALUE_PROPOSITION__STATEMENT:
				setStatement((String)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_PERSONAS:
				getTargetPersonas().clear();
				getTargetPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__ADDRESSED_NEEDS:
				getAddressedNeeds().clear();
				getAddressedNeeds().addAll((Collection<? extends Need>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTED_GOALS:
				getSupportedGoals().clear();
				getSupportedGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__MITIGATED_PAIN_POINTS:
				getMitigatedPainPoints().clear();
				getMitigatedPainPoints().addAll((Collection<? extends PainPoint>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__ENABLING_CAPABILITIES:
				getEnablingCapabilities().clear();
				getEnablingCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__PACKAGED_IN_EDITIONS:
				getPackagedInEditions().clear();
				getPackagedInEditions().addAll((Collection<? extends Edition>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES:
				getDifferentiatedFromAlternatives().clear();
				getDifferentiatedFromAlternatives().addAll((Collection<? extends Alternative>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				getSupportingEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_SEGMENTS:
				getTargetSegments().clear();
				getTargetSegments().addAll((Collection<? extends MarketSegment>)newValue);
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
			case ProductManagementPackage.VALUE_PROPOSITION__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_PERSONAS:
				getTargetPersonas().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__ADDRESSED_NEEDS:
				getAddressedNeeds().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTED_GOALS:
				getSupportedGoals().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__MITIGATED_PAIN_POINTS:
				getMitigatedPainPoints().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__ENABLING_CAPABILITIES:
				getEnablingCapabilities().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__PACKAGED_IN_EDITIONS:
				getPackagedInEditions().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES:
				getDifferentiatedFromAlternatives().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTING_EVIDENCE:
				getSupportingEvidence().clear();
				return;
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_SEGMENTS:
				getTargetSegments().clear();
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
			case ProductManagementPackage.VALUE_PROPOSITION__STATEMENT:
				return STATEMENT_EDEFAULT == null ? getStatement() != null : !STATEMENT_EDEFAULT.equals(getStatement());
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_PERSONAS:
				return !getTargetPersonas().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__ADDRESSED_NEEDS:
				return !getAddressedNeeds().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTED_GOALS:
				return !getSupportedGoals().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__MITIGATED_PAIN_POINTS:
				return !getMitigatedPainPoints().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__ENABLING_CAPABILITIES:
				return !getEnablingCapabilities().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__PACKAGED_IN_EDITIONS:
				return !getPackagedInEditions().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__DIFFERENTIATED_FROM_ALTERNATIVES:
				return !getDifferentiatedFromAlternatives().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__SUPPORTING_EVIDENCE:
				return !getSupportingEvidence().isEmpty();
			case ProductManagementPackage.VALUE_PROPOSITION__TARGET_SEGMENTS:
				return !getTargetSegments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValuePropositionImpl
