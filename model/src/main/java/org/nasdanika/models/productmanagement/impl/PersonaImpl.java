/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Action;
import org.nasdanika.models.productmanagement.Behavior;
import org.nasdanika.models.productmanagement.Goal;
import org.nasdanika.models.productmanagement.Need;
import org.nasdanika.models.productmanagement.PainPoint;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductManagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getExperienceLevel <em>Experience Level</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getWorkEnvironment <em>Work Environment</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getToolsUsed <em>Tools Used</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getAttitudes <em>Attitudes</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getPainPoints <em>Pain Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends ModelElementImpl implements Persona {
	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExperienceLevel() <em>Experience Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPERIENCE_LEVEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWorkEnvironment() <em>Work Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_ENVIRONMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductManagementPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAge() {
		return (Integer)eDynamicGet(ProductManagementPackage.PERSONA__AGE, ProductManagementPackage.Literals.PERSONA__AGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(Integer newAge) {
		eDynamicSet(ProductManagementPackage.PERSONA__AGE, ProductManagementPackage.Literals.PERSONA__AGE, newAge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return (String)eDynamicGet(ProductManagementPackage.PERSONA__ROLE, ProductManagementPackage.Literals.PERSONA__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		eDynamicSet(ProductManagementPackage.PERSONA__ROLE, ProductManagementPackage.Literals.PERSONA__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExperienceLevel() {
		return (String)eDynamicGet(ProductManagementPackage.PERSONA__EXPERIENCE_LEVEL, ProductManagementPackage.Literals.PERSONA__EXPERIENCE_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperienceLevel(String newExperienceLevel) {
		eDynamicSet(ProductManagementPackage.PERSONA__EXPERIENCE_LEVEL, ProductManagementPackage.Literals.PERSONA__EXPERIENCE_LEVEL, newExperienceLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEnvironment() {
		return (String)eDynamicGet(ProductManagementPackage.PERSONA__WORK_ENVIRONMENT, ProductManagementPackage.Literals.PERSONA__WORK_ENVIRONMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEnvironment(String newWorkEnvironment) {
		eDynamicSet(ProductManagementPackage.PERSONA__WORK_ENVIRONMENT, ProductManagementPackage.Literals.PERSONA__WORK_ENVIRONMENT, newWorkEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getToolsUsed() {
		return (EList<String>)eDynamicGet(ProductManagementPackage.PERSONA__TOOLS_USED, ProductManagementPackage.Literals.PERSONA__TOOLS_USED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getAttitudes() {
		return (EList<String>)eDynamicGet(ProductManagementPackage.PERSONA__ATTITUDES, ProductManagementPackage.Literals.PERSONA__ATTITUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Behavior> getBehaviors() {
		return (EList<Behavior>)eDynamicGet(ProductManagementPackage.PERSONA__BEHAVIORS, ProductManagementPackage.Literals.PERSONA__BEHAVIORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Action> getActions() {
		return (EList<Action>)eDynamicGet(ProductManagementPackage.PERSONA__ACTIONS, ProductManagementPackage.Literals.PERSONA__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Need> getNeeds() {
		return (EList<Need>)eDynamicGet(ProductManagementPackage.PERSONA__NEEDS, ProductManagementPackage.Literals.PERSONA__NEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Goal> getGoals() {
		return (EList<Goal>)eDynamicGet(ProductManagementPackage.PERSONA__GOALS, ProductManagementPackage.Literals.PERSONA__GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PainPoint> getPainPoints() {
		return (EList<PainPoint>)eDynamicGet(ProductManagementPackage.PERSONA__PAIN_POINTS, ProductManagementPackage.Literals.PERSONA__PAIN_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductManagementPackage.PERSONA__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PERSONA__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PERSONA__NEEDS:
				return ((InternalEList<?>)getNeeds()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PERSONA__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case ProductManagementPackage.PERSONA__PAIN_POINTS:
				return ((InternalEList<?>)getPainPoints()).basicRemove(otherEnd, msgs);
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
			case ProductManagementPackage.PERSONA__AGE:
				return getAge();
			case ProductManagementPackage.PERSONA__ROLE:
				return getRole();
			case ProductManagementPackage.PERSONA__EXPERIENCE_LEVEL:
				return getExperienceLevel();
			case ProductManagementPackage.PERSONA__WORK_ENVIRONMENT:
				return getWorkEnvironment();
			case ProductManagementPackage.PERSONA__TOOLS_USED:
				return getToolsUsed();
			case ProductManagementPackage.PERSONA__ATTITUDES:
				return getAttitudes();
			case ProductManagementPackage.PERSONA__BEHAVIORS:
				return getBehaviors();
			case ProductManagementPackage.PERSONA__ACTIONS:
				return getActions();
			case ProductManagementPackage.PERSONA__NEEDS:
				return getNeeds();
			case ProductManagementPackage.PERSONA__GOALS:
				return getGoals();
			case ProductManagementPackage.PERSONA__PAIN_POINTS:
				return getPainPoints();
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
			case ProductManagementPackage.PERSONA__AGE:
				setAge((Integer)newValue);
				return;
			case ProductManagementPackage.PERSONA__ROLE:
				setRole((String)newValue);
				return;
			case ProductManagementPackage.PERSONA__EXPERIENCE_LEVEL:
				setExperienceLevel((String)newValue);
				return;
			case ProductManagementPackage.PERSONA__WORK_ENVIRONMENT:
				setWorkEnvironment((String)newValue);
				return;
			case ProductManagementPackage.PERSONA__TOOLS_USED:
				getToolsUsed().clear();
				getToolsUsed().addAll((Collection<? extends String>)newValue);
				return;
			case ProductManagementPackage.PERSONA__ATTITUDES:
				getAttitudes().clear();
				getAttitudes().addAll((Collection<? extends String>)newValue);
				return;
			case ProductManagementPackage.PERSONA__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case ProductManagementPackage.PERSONA__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case ProductManagementPackage.PERSONA__NEEDS:
				getNeeds().clear();
				getNeeds().addAll((Collection<? extends Need>)newValue);
				return;
			case ProductManagementPackage.PERSONA__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ProductManagementPackage.PERSONA__PAIN_POINTS:
				getPainPoints().clear();
				getPainPoints().addAll((Collection<? extends PainPoint>)newValue);
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
			case ProductManagementPackage.PERSONA__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case ProductManagementPackage.PERSONA__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ProductManagementPackage.PERSONA__EXPERIENCE_LEVEL:
				setExperienceLevel(EXPERIENCE_LEVEL_EDEFAULT);
				return;
			case ProductManagementPackage.PERSONA__WORK_ENVIRONMENT:
				setWorkEnvironment(WORK_ENVIRONMENT_EDEFAULT);
				return;
			case ProductManagementPackage.PERSONA__TOOLS_USED:
				getToolsUsed().clear();
				return;
			case ProductManagementPackage.PERSONA__ATTITUDES:
				getAttitudes().clear();
				return;
			case ProductManagementPackage.PERSONA__BEHAVIORS:
				getBehaviors().clear();
				return;
			case ProductManagementPackage.PERSONA__ACTIONS:
				getActions().clear();
				return;
			case ProductManagementPackage.PERSONA__NEEDS:
				getNeeds().clear();
				return;
			case ProductManagementPackage.PERSONA__GOALS:
				getGoals().clear();
				return;
			case ProductManagementPackage.PERSONA__PAIN_POINTS:
				getPainPoints().clear();
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
			case ProductManagementPackage.PERSONA__AGE:
				return AGE_EDEFAULT == null ? getAge() != null : !AGE_EDEFAULT.equals(getAge());
			case ProductManagementPackage.PERSONA__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
			case ProductManagementPackage.PERSONA__EXPERIENCE_LEVEL:
				return EXPERIENCE_LEVEL_EDEFAULT == null ? getExperienceLevel() != null : !EXPERIENCE_LEVEL_EDEFAULT.equals(getExperienceLevel());
			case ProductManagementPackage.PERSONA__WORK_ENVIRONMENT:
				return WORK_ENVIRONMENT_EDEFAULT == null ? getWorkEnvironment() != null : !WORK_ENVIRONMENT_EDEFAULT.equals(getWorkEnvironment());
			case ProductManagementPackage.PERSONA__TOOLS_USED:
				return !getToolsUsed().isEmpty();
			case ProductManagementPackage.PERSONA__ATTITUDES:
				return !getAttitudes().isEmpty();
			case ProductManagementPackage.PERSONA__BEHAVIORS:
				return !getBehaviors().isEmpty();
			case ProductManagementPackage.PERSONA__ACTIONS:
				return !getActions().isEmpty();
			case ProductManagementPackage.PERSONA__NEEDS:
				return !getNeeds().isEmpty();
			case ProductManagementPackage.PERSONA__GOALS:
				return !getGoals().isEmpty();
			case ProductManagementPackage.PERSONA__PAIN_POINTS:
				return !getPainPoints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonaImpl
