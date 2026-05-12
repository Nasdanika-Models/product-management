/**
 */
package org.nasdanika.models.product.management;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Concern Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Classifies the nature of a Concern.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.product.management.ManagementPackage#getConcernType()
 * @model
 * @generated
 */
public enum ConcernType implements Enumerator {
	/**
	 * The '<em><b>GOAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A desired outcome or objective the persona is working toward.
	 * <!-- end-model-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(0, "GOAL", "Goal"),

	/**
	 * The '<em><b>NEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A functional or non-functional need the persona requires.
	 * <!-- end-model-doc -->
	 * @see #NEED_VALUE
	 * @generated
	 * @ordered
	 */
	NEED(1, "NEED", "Need"),

	/**
	 * The '<em><b>PAIN POINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An existing problem, friction, or obstacle the persona experiences.
	 * <!-- end-model-doc -->
	 * @see #PAIN_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	PAIN_POINT(2, "PAIN_POINT", "Pain Point");

	/**
	 * The '<em><b>GOAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A desired outcome or objective the persona is working toward.
	 * <!-- end-model-doc -->
	 * @see #GOAL
	 * @model literal="Goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 0;

	/**
	 * The '<em><b>NEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A functional or non-functional need the persona requires.
	 * <!-- end-model-doc -->
	 * @see #NEED
	 * @model literal="Need"
	 * @generated
	 * @ordered
	 */
	public static final int NEED_VALUE = 1;

	/**
	 * The '<em><b>PAIN POINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An existing problem, friction, or obstacle the persona experiences.
	 * <!-- end-model-doc -->
	 * @see #PAIN_POINT
	 * @model literal="Pain Point"
	 * @generated
	 * @ordered
	 */
	public static final int PAIN_POINT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Concern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConcernType[] VALUES_ARRAY =
		new ConcernType[] {
			GOAL,
			NEED,
			PAIN_POINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Concern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConcernType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concern Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcernType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcernType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concern Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcernType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcernType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concern Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcernType get(int value) {
		switch (value) {
			case GOAL_VALUE: return GOAL;
			case NEED_VALUE: return NEED;
			case PAIN_POINT_VALUE: return PAIN_POINT;
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
	private ConcernType(int value, String name, String literal) {
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
	
} //ConcernType
