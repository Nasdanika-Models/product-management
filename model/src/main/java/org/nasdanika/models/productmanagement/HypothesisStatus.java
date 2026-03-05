/**
 */
package org.nasdanika.models.productmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hypothesis Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Validation status of a hypothesis.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getHypothesisStatus()
 * @model
 * @generated
 */
public enum HypothesisStatus implements Enumerator {
	/**
	 * The '<em><b>Unvalidated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis has not yet been tested.
	 * <!-- end-model-doc -->
	 * @see #UNVALIDATED_VALUE
	 * @generated
	 * @ordered
	 */
	UNVALIDATED(0, "Unvalidated", "Unvalidated"),

	/**
	 * The '<em><b>Validated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis has been validated by evidence.
	 * <!-- end-model-doc -->
	 * @see #VALIDATED_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATED(1, "Validated", "Validated"),

	/**
	 * The '<em><b>Invalidated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis has been invalidated by evidence.
	 * <!-- end-model-doc -->
	 * @see #INVALIDATED_VALUE
	 * @generated
	 * @ordered
	 */
	INVALIDATED(2, "Invalidated", "Invalidated"),

	/**
	 * The '<em><b>Deprecated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis is no longer relevant.
	 * <!-- end-model-doc -->
	 * @see #DEPRECATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATED(3, "Deprecated", "Deprecated");

	/**
	 * The '<em><b>Unvalidated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis has not yet been tested.
	 * <!-- end-model-doc -->
	 * @see #UNVALIDATED
	 * @model name="Unvalidated"
	 * @generated
	 * @ordered
	 */
	public static final int UNVALIDATED_VALUE = 0;

	/**
	 * The '<em><b>Validated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis has been validated by evidence.
	 * <!-- end-model-doc -->
	 * @see #VALIDATED
	 * @model name="Validated"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATED_VALUE = 1;

	/**
	 * The '<em><b>Invalidated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis has been invalidated by evidence.
	 * <!-- end-model-doc -->
	 * @see #INVALIDATED
	 * @model name="Invalidated"
	 * @generated
	 * @ordered
	 */
	public static final int INVALIDATED_VALUE = 2;

	/**
	 * The '<em><b>Deprecated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hypothesis is no longer relevant.
	 * <!-- end-model-doc -->
	 * @see #DEPRECATED
	 * @model name="Deprecated"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hypothesis Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HypothesisStatus[] VALUES_ARRAY =
		new HypothesisStatus[] {
			UNVALIDATED,
			VALIDATED,
			INVALIDATED,
			DEPRECATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Hypothesis Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HypothesisStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hypothesis Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HypothesisStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HypothesisStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hypothesis Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HypothesisStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HypothesisStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hypothesis Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HypothesisStatus get(int value) {
		switch (value) {
			case UNVALIDATED_VALUE: return UNVALIDATED;
			case VALIDATED_VALUE: return VALIDATED;
			case INVALIDATED_VALUE: return INVALIDATED;
			case DEPRECATED_VALUE: return DEPRECATED;
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
	private HypothesisStatus(int value, String name, String literal) {
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
	
} //HypothesisStatus
