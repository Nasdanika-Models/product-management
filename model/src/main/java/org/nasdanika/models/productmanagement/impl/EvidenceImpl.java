/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.productmanagement.Evidence;
import org.nasdanika.models.productmanagement.MarketSegment;
import org.nasdanika.models.productmanagement.OutcomeMetric;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl#getEvidenceType <em>Evidence Type</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl#getMeasuredMetrics <em>Measured Metrics</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.EvidenceImpl#getCollectedInSegments <em>Collected In Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends ModelElementImpl implements Evidence {
	/**
	 * The default value of the '{@link #getEvidenceType() <em>Evidence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceType()
	 * @generated
	 * @ordered
	 */
	protected static final String EVIDENCE_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEvidenceType() {
		return (String)eDynamicGet(ProductManagementPackage.EVIDENCE__EVIDENCE_TYPE, ProductManagementPackage.Literals.EVIDENCE__EVIDENCE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvidenceType(String newEvidenceType) {
		eDynamicSet(ProductManagementPackage.EVIDENCE__EVIDENCE_TYPE, ProductManagementPackage.Literals.EVIDENCE__EVIDENCE_TYPE, newEvidenceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(ProductManagementPackage.EVIDENCE__SOURCE, ProductManagementPackage.Literals.EVIDENCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(ProductManagementPackage.EVIDENCE__SOURCE, ProductManagementPackage.Literals.EVIDENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OutcomeMetric> getMeasuredMetrics() {
		return (EList<OutcomeMetric>)eDynamicGet(ProductManagementPackage.EVIDENCE__MEASURED_METRICS, ProductManagementPackage.Literals.EVIDENCE__MEASURED_METRICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MarketSegment> getCollectedInSegments() {
		return (EList<MarketSegment>)eDynamicGet(ProductManagementPackage.EVIDENCE__COLLECTED_IN_SEGMENTS, ProductManagementPackage.Literals.EVIDENCE__COLLECTED_IN_SEGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductManagementPackage.EVIDENCE__EVIDENCE_TYPE:
				return getEvidenceType();
			case ProductManagementPackage.EVIDENCE__SOURCE:
				return getSource();
			case ProductManagementPackage.EVIDENCE__MEASURED_METRICS:
				return getMeasuredMetrics();
			case ProductManagementPackage.EVIDENCE__COLLECTED_IN_SEGMENTS:
				return getCollectedInSegments();
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
			case ProductManagementPackage.EVIDENCE__EVIDENCE_TYPE:
				setEvidenceType((String)newValue);
				return;
			case ProductManagementPackage.EVIDENCE__SOURCE:
				setSource((String)newValue);
				return;
			case ProductManagementPackage.EVIDENCE__MEASURED_METRICS:
				getMeasuredMetrics().clear();
				getMeasuredMetrics().addAll((Collection<? extends OutcomeMetric>)newValue);
				return;
			case ProductManagementPackage.EVIDENCE__COLLECTED_IN_SEGMENTS:
				getCollectedInSegments().clear();
				getCollectedInSegments().addAll((Collection<? extends MarketSegment>)newValue);
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
			case ProductManagementPackage.EVIDENCE__EVIDENCE_TYPE:
				setEvidenceType(EVIDENCE_TYPE_EDEFAULT);
				return;
			case ProductManagementPackage.EVIDENCE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ProductManagementPackage.EVIDENCE__MEASURED_METRICS:
				getMeasuredMetrics().clear();
				return;
			case ProductManagementPackage.EVIDENCE__COLLECTED_IN_SEGMENTS:
				getCollectedInSegments().clear();
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
			case ProductManagementPackage.EVIDENCE__EVIDENCE_TYPE:
				return EVIDENCE_TYPE_EDEFAULT == null ? getEvidenceType() != null : !EVIDENCE_TYPE_EDEFAULT.equals(getEvidenceType());
			case ProductManagementPackage.EVIDENCE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case ProductManagementPackage.EVIDENCE__MEASURED_METRICS:
				return !getMeasuredMetrics().isEmpty();
			case ProductManagementPackage.EVIDENCE__COLLECTED_IN_SEGMENTS:
				return !getCollectedInSegments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceImpl
