/**
 */
package org.nasdanika.models.productmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Goal Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Classification of goal types.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getGoalType()
 * @model
 * @generated
 */
public enum GoalType implements Enumerator {
	/**
	 * The '<em><b>Functional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concrete, task-oriented outcome, e.g. 'ship releases faster'.
	 * <!-- end-model-doc -->
	 * @see #FUNCTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL(0, "Functional", "Functional"),

	/**
	 * The '<em><b>Emotional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A feeling-oriented outcome, e.g. 'feel confident in a deployment'.
	 * <!-- end-model-doc -->
	 * @see #EMOTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	EMOTIONAL(1, "Emotional", "Emotional"),

	/**
	 * The '<em><b>Aspirational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A long-term, strategic outcome, e.g. 'reduce on-call burden over time'.
	 * <!-- end-model-doc -->
	 * @see #ASPIRATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ASPIRATIONAL(2, "Aspirational", "Aspirational");

	/**
	 * The '<em><b>Functional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concrete, task-oriented outcome, e.g. 'ship releases faster'.
	 * <!-- end-model-doc -->
	 * @see #FUNCTIONAL
	 * @model name="Functional"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Emotional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A feeling-oriented outcome, e.g. 'feel confident in a deployment'.
	 * <!-- end-model-doc -->
	 * @see #EMOTIONAL
	 * @model name="Emotional"
	 * @generated
	 * @ordered
	 */
	public static final int EMOTIONAL_VALUE = 1;

	/**
	 * The '<em><b>Aspirational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A long-term, strategic outcome, e.g. 'reduce on-call burden over time'.
	 * <!-- end-model-doc -->
	 * @see #ASPIRATIONAL
	 * @model name="Aspirational"
	 * @generated
	 * @ordered
	 */
	public static final int ASPIRATIONAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Goal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalType[] VALUES_ARRAY =
		new GoalType[] {
			FUNCTIONAL,
			EMOTIONAL,
			ASPIRATIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalType get(int value) {
		switch (value) {
			case FUNCTIONAL_VALUE: return FUNCTIONAL;
			case EMOTIONAL_VALUE: return EMOTIONAL;
			case ASPIRATIONAL_VALUE: return ASPIRATIONAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GoalType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GoalType
