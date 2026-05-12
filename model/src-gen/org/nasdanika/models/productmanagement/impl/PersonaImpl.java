/**
 */
package org.nasdanika.models.productmanagement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.productmanagement.Concern;
import org.nasdanika.models.productmanagement.Persona;
import org.nasdanika.models.productmanagement.ProductmanagementPackage;
import org.nasdanika.models.productmanagement.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getSubPersonas <em>Sub Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getSuperPersonas <em>Super Personas</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.nasdanika.models.productmanagement.impl.PersonaImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends ModelElementImpl implements Persona {
	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_EDEFAULT = 0;

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
		return ProductmanagementPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Concern> getConcerns() {
		return (EList<Concern>)eDynamicGet(ProductmanagementPackage.PERSONA__CONCERNS, ProductmanagementPackage.Literals.PERSONA__CONCERNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getSubPersonas() {
		return (EList<Persona>)eDynamicGet(ProductmanagementPackage.PERSONA__SUB_PERSONAS, ProductmanagementPackage.Literals.PERSONA__SUB_PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Persona> getSuperPersonas() {
		return (EList<Persona>)eDynamicGet(ProductmanagementPackage.PERSONA__SUPER_PERSONAS, ProductmanagementPackage.Literals.PERSONA__SUPER_PERSONAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPopulation() {
		return (Integer)eDynamicGet(ProductmanagementPackage.PERSONA__POPULATION, ProductmanagementPackage.Literals.PERSONA__POPULATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPopulation(int newPopulation) {
		eDynamicSet(ProductmanagementPackage.PERSONA__POPULATION, ProductmanagementPackage.Literals.PERSONA__POPULATION, newPopulation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ProductmanagementPackage.PERSONA__ROLES, ProductmanagementPackage.Literals.PERSONA__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductmanagementPackage.PERSONA__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PERSONA__SUB_PERSONAS:
				return ((InternalEList<?>)getSubPersonas()).basicRemove(otherEnd, msgs);
			case ProductmanagementPackage.PERSONA__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				return getConcerns();
			case ProductmanagementPackage.PERSONA__SUB_PERSONAS:
				return getSubPersonas();
			case ProductmanagementPackage.PERSONA__SUPER_PERSONAS:
				return getSuperPersonas();
			case ProductmanagementPackage.PERSONA__POPULATION:
				return getPopulation();
			case ProductmanagementPackage.PERSONA__ROLES:
				return getRoles();
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends Concern>)newValue);
				return;
			case ProductmanagementPackage.PERSONA__SUB_PERSONAS:
				getSubPersonas().clear();
				getSubPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductmanagementPackage.PERSONA__SUPER_PERSONAS:
				getSuperPersonas().clear();
				getSuperPersonas().addAll((Collection<? extends Persona>)newValue);
				return;
			case ProductmanagementPackage.PERSONA__POPULATION:
				setPopulation((Integer)newValue);
				return;
			case ProductmanagementPackage.PERSONA__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				getConcerns().clear();
				return;
			case ProductmanagementPackage.PERSONA__SUB_PERSONAS:
				getSubPersonas().clear();
				return;
			case ProductmanagementPackage.PERSONA__SUPER_PERSONAS:
				getSuperPersonas().clear();
				return;
			case ProductmanagementPackage.PERSONA__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case ProductmanagementPackage.PERSONA__ROLES:
				getRoles().clear();
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
			case ProductmanagementPackage.PERSONA__CONCERNS:
				return !getConcerns().isEmpty();
			case ProductmanagementPackage.PERSONA__SUB_PERSONAS:
				return !getSubPersonas().isEmpty();
			case ProductmanagementPackage.PERSONA__SUPER_PERSONAS:
				return !getSuperPersonas().isEmpty();
			case ProductmanagementPackage.PERSONA__POPULATION:
				return getPopulation() != POPULATION_EDEFAULT;
			case ProductmanagementPackage.PERSONA__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonaImpl
