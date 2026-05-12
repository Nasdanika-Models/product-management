/**
 */
package org.nasdanika.models.product.management.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.product.management.Actor;
import org.nasdanika.models.product.management.Capability;
import org.nasdanika.models.product.management.ManagementPackage;
import org.nasdanika.models.product.management.Proposal;
import org.nasdanika.models.product.management.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.product.management.impl.ProposalImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.ProposalImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.ProposalImpl#getWorkPackage <em>Work Package</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.ProposalImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.nasdanika.models.product.management.impl.ProposalImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProposalImpl extends ModelElementImpl implements Proposal {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementPackage.Literals.PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCost() {
		return (Double)eDynamicGet(ManagementPackage.PROPOSAL__COST, ManagementPackage.Literals.PROPOSAL__COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(double newCost) {
		eDynamicSet(ManagementPackage.PROPOSAL__COST, ManagementPackage.Literals.PROPOSAL__COST, newCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrency() {
		return (String)eDynamicGet(ManagementPackage.PROPOSAL__CURRENCY, ManagementPackage.Literals.PROPOSAL__CURRENCY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(String newCurrency) {
		eDynamicSet(ManagementPackage.PROPOSAL__CURRENCY, ManagementPackage.Literals.PROPOSAL__CURRENCY, newCurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPackage getWorkPackage() {
		return (WorkPackage)eDynamicGet(ManagementPackage.PROPOSAL__WORK_PACKAGE, ManagementPackage.Literals.PROPOSAL__WORK_PACKAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage basicGetWorkPackage() {
		return (WorkPackage)eDynamicGet(ManagementPackage.PROPOSAL__WORK_PACKAGE, ManagementPackage.Literals.PROPOSAL__WORK_PACKAGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkPackage(WorkPackage newWorkPackage) {
		eDynamicSet(ManagementPackage.PROPOSAL__WORK_PACKAGE, ManagementPackage.Literals.PROPOSAL__WORK_PACKAGE, newWorkPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability getCapability() {
		return (Capability)eDynamicGet(ManagementPackage.PROPOSAL__CAPABILITY, ManagementPackage.Literals.PROPOSAL__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetCapability() {
		return (Capability)eDynamicGet(ManagementPackage.PROPOSAL__CAPABILITY, ManagementPackage.Literals.PROPOSAL__CAPABILITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability(Capability newCapability) {
		eDynamicSet(ManagementPackage.PROPOSAL__CAPABILITY, ManagementPackage.Literals.PROPOSAL__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor getAuthor() {
		return (Actor)eDynamicGet(ManagementPackage.PROPOSAL__AUTHOR, ManagementPackage.Literals.PROPOSAL__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetAuthor() {
		return (Actor)eDynamicGet(ManagementPackage.PROPOSAL__AUTHOR, ManagementPackage.Literals.PROPOSAL__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(Actor newAuthor) {
		eDynamicSet(ManagementPackage.PROPOSAL__AUTHOR, ManagementPackage.Literals.PROPOSAL__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagementPackage.PROPOSAL__COST:
				return getCost();
			case ManagementPackage.PROPOSAL__CURRENCY:
				return getCurrency();
			case ManagementPackage.PROPOSAL__WORK_PACKAGE:
				if (resolve) return getWorkPackage();
				return basicGetWorkPackage();
			case ManagementPackage.PROPOSAL__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case ManagementPackage.PROPOSAL__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManagementPackage.PROPOSAL__COST:
				setCost((Double)newValue);
				return;
			case ManagementPackage.PROPOSAL__CURRENCY:
				setCurrency((String)newValue);
				return;
			case ManagementPackage.PROPOSAL__WORK_PACKAGE:
				setWorkPackage((WorkPackage)newValue);
				return;
			case ManagementPackage.PROPOSAL__CAPABILITY:
				setCapability((Capability)newValue);
				return;
			case ManagementPackage.PROPOSAL__AUTHOR:
				setAuthor((Actor)newValue);
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
			case ManagementPackage.PROPOSAL__COST:
				setCost(COST_EDEFAULT);
				return;
			case ManagementPackage.PROPOSAL__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case ManagementPackage.PROPOSAL__WORK_PACKAGE:
				setWorkPackage((WorkPackage)null);
				return;
			case ManagementPackage.PROPOSAL__CAPABILITY:
				setCapability((Capability)null);
				return;
			case ManagementPackage.PROPOSAL__AUTHOR:
				setAuthor((Actor)null);
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
			case ManagementPackage.PROPOSAL__COST:
				return getCost() != COST_EDEFAULT;
			case ManagementPackage.PROPOSAL__CURRENCY:
				return CURRENCY_EDEFAULT == null ? getCurrency() != null : !CURRENCY_EDEFAULT.equals(getCurrency());
			case ManagementPackage.PROPOSAL__WORK_PACKAGE:
				return basicGetWorkPackage() != null;
			case ManagementPackage.PROPOSAL__CAPABILITY:
				return basicGetCapability() != null;
			case ManagementPackage.PROPOSAL__AUTHOR:
				return basicGetAuthor() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProposalImpl
