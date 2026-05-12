/**
 */
package org.nasdanika.models.productmanagement.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.productmanagement.ModelElement;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl#getD <em>D</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.ModelElementImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductmanagementPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getD() {
		return (String)eDynamicGet(ProductmanagementPackage.MODEL_ELEMENT__D, ProductmanagementPackage.Literals.MODEL_ELEMENT__D, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setD(String newD) {
		eDynamicSet(ProductmanagementPackage.MODEL_ELEMENT__D, ProductmanagementPackage.Literals.MODEL_ELEMENT__D, newD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(ProductmanagementPackage.MODEL_ELEMENT__NAME, ProductmanagementPackage.Literals.MODEL_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ProductmanagementPackage.MODEL_ELEMENT__NAME, ProductmanagementPackage.Literals.MODEL_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String)eDynamicGet(ProductmanagementPackage.MODEL_ELEMENT__DOCUMENTATION, ProductmanagementPackage.Literals.MODEL_ELEMENT__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(ProductmanagementPackage.MODEL_ELEMENT__DOCUMENTATION, ProductmanagementPackage.Literals.MODEL_ELEMENT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStart() {
		return (String)eDynamicGet(ProductmanagementPackage.MODEL_ELEMENT__START, ProductmanagementPackage.Literals.MODEL_ELEMENT__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(String newStart) {
		eDynamicSet(ProductmanagementPackage.MODEL_ELEMENT__START, ProductmanagementPackage.Literals.MODEL_ELEMENT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnd() {
		return (String)eDynamicGet(ProductmanagementPackage.MODEL_ELEMENT__END, ProductmanagementPackage.Literals.MODEL_ELEMENT__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(String newEnd) {
		eDynamicSet(ProductmanagementPackage.MODEL_ELEMENT__END, ProductmanagementPackage.Literals.MODEL_ELEMENT__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDuration() {
		return (String)eDynamicGet(ProductmanagementPackage.MODEL_ELEMENT__DURATION, ProductmanagementPackage.Literals.MODEL_ELEMENT__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(String newDuration) {
		eDynamicSet(ProductmanagementPackage.MODEL_ELEMENT__DURATION, ProductmanagementPackage.Literals.MODEL_ELEMENT__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double)eDynamicGet(ProductmanagementPackage.MODEL_ELEMENT__WEIGHT, ProductmanagementPackage.Literals.MODEL_ELEMENT__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eDynamicSet(ProductmanagementPackage.MODEL_ELEMENT__WEIGHT, ProductmanagementPackage.Literals.MODEL_ELEMENT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductmanagementPackage.MODEL_ELEMENT__D:
				return getD();
			case ProductmanagementPackage.MODEL_ELEMENT__NAME:
				return getName();
			case ProductmanagementPackage.MODEL_ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case ProductmanagementPackage.MODEL_ELEMENT__START:
				return getStart();
			case ProductmanagementPackage.MODEL_ELEMENT__END:
				return getEnd();
			case ProductmanagementPackage.MODEL_ELEMENT__DURATION:
				return getDuration();
			case ProductmanagementPackage.MODEL_ELEMENT__WEIGHT:
				return getWeight();
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
			case ProductmanagementPackage.MODEL_ELEMENT__D:
				setD((String)newValue);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__START:
				setStart((String)newValue);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__END:
				setEnd((String)newValue);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__DURATION:
				setDuration((String)newValue);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__WEIGHT:
				setWeight((Double)newValue);
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
			case ProductmanagementPackage.MODEL_ELEMENT__D:
				setD(D_EDEFAULT);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__START:
				setStart(START_EDEFAULT);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__END:
				setEnd(END_EDEFAULT);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ProductmanagementPackage.MODEL_ELEMENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case ProductmanagementPackage.MODEL_ELEMENT__D:
				return D_EDEFAULT == null ? getD() != null : !D_EDEFAULT.equals(getD());
			case ProductmanagementPackage.MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProductmanagementPackage.MODEL_ELEMENT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case ProductmanagementPackage.MODEL_ELEMENT__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case ProductmanagementPackage.MODEL_ELEMENT__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case ProductmanagementPackage.MODEL_ELEMENT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case ProductmanagementPackage.MODEL_ELEMENT__WEIGHT:
				return getWeight() != WEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
