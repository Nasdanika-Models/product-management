/**
 */
package org.nasdanika.models.productmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Release Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status of a release.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.productmanagement.ProductManagementPackage#getReleaseStatus()
 * @model
 * @generated
 */
public enum ReleaseStatus implements Enumerator {
	/**
	 * The '<em><b>Planned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(0, "Planned", "Planned"),

	/**
	 * The '<em><b>In Development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_DEVELOPMENT(1, "InDevelopment", "InDevelopment"),

	/**
	 * The '<em><b>Beta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETA_VALUE
	 * @generated
	 * @ordered
	 */
	BETA(2, "Beta", "Beta"),

	/**
	 * The '<em><b>GA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generally Available.
	 * <!-- end-model-doc -->
	 * @see #GA_VALUE
	 * @generated
	 * @ordered
	 */
	GA(3, "GA", "GA"),

	/**
	 * The '<em><b>Deprecated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATED(4, "Deprecated", "Deprecated"),

	/**
	 * The '<em><b>End Of Life</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_OF_LIFE_VALUE
	 * @generated
	 * @ordered
	 */
	END_OF_LIFE(5, "EndOfLife", "EndOfLife");

	/**
	 * The '<em><b>Planned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED
	 * @model name="Planned"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 0;

	/**
	 * The '<em><b>In Development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_DEVELOPMENT
	 * @model name="InDevelopment"
	 * @generated
	 * @ordered
	 */
	public static final int IN_DEVELOPMENT_VALUE = 1;

	/**
	 * The '<em><b>Beta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETA
	 * @model name="Beta"
	 * @generated
	 * @ordered
	 */
	public static final int BETA_VALUE = 2;

	/**
	 * The '<em><b>GA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generally Available.
	 * <!-- end-model-doc -->
	 * @see #GA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GA_VALUE = 3;

	/**
	 * The '<em><b>Deprecated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED
	 * @model name="Deprecated"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED_VALUE = 4;

	/**
	 * The '<em><b>End Of Life</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_OF_LIFE
	 * @model name="EndOfLife"
	 * @generated
	 * @ordered
	 */
	public static final int END_OF_LIFE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Release Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReleaseStatus[] VALUES_ARRAY =
		new ReleaseStatus[] {
			PLANNED,
			IN_DEVELOPMENT,
			BETA,
			GA,
			DEPRECATED,
			END_OF_LIFE,
		};

	/**
	 * A public read-only list of all the '<em><b>Release Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReleaseStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Release Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReleaseStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReleaseStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Release Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReleaseStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReleaseStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Release Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReleaseStatus get(int value) {
		switch (value) {
			case PLANNED_VALUE: return PLANNED;
			case IN_DEVELOPMENT_VALUE: return IN_DEVELOPMENT;
			case BETA_VALUE: return BETA;
			case GA_VALUE: return GA;
			case DEPRECATED_VALUE: return DEPRECATED;
			case END_OF_LIFE_VALUE: return END_OF_LIFE;
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
	private ReleaseStatus(int value, String name, String literal) {
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
	
} //ReleaseStatus
