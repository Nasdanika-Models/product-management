/**
 */
package org.nasdanika.models.productmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Built-in dependency types
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.productmanagement.ProductmanagementPackage#getDependencyKind()
 * @model
 * @generated
 */
public enum DependencyKind implements Enumerator {
	/**
	 * The '<em><b>REQUIRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * I cannot function without this
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES(0, "REQUIRES", "REQUIRES"),

	/**
	 * The '<em><b>ENHANCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * I work better when this is also present
	 * <!-- end-model-doc -->
	 * @see #ENHANCES_VALUE
	 * @generated
	 * @ordered
	 */
	ENHANCES(0, "ENHANCES", "ENHANCES"),

	/**
	 * The '<em><b>CONFLICTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * I cannot coexist with this
	 * <!-- end-model-doc -->
	 * @see #CONFLICTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICTS(0, "CONFLICTS", "CONFLICTS"),

	/**
	 * The '<em><b>CUSTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Custom dependency type
	 * <!-- end-model-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(0, "CUSTOM", "CUSTOM");

	/**
	 * The '<em><b>REQUIRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * I cannot function without this
	 * <!-- end-model-doc -->
	 * @see #REQUIRES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_VALUE = 0;

	/**
	 * The '<em><b>ENHANCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * I work better when this is also present
	 * <!-- end-model-doc -->
	 * @see #ENHANCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENHANCES_VALUE = 0;

	/**
	 * The '<em><b>CONFLICTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * I cannot coexist with this
	 * <!-- end-model-doc -->
	 * @see #CONFLICTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICTS_VALUE = 0;

	/**
	 * The '<em><b>CUSTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Custom dependency type
	 * <!-- end-model-doc -->
	 * @see #CUSTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 0;

	/**
	 * An array of all the '<em><b>Dependency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DependencyKind[] VALUES_ARRAY =
		new DependencyKind[] {
			REQUIRES,
			ENHANCES,
			CONFLICTS,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Dependency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DependencyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dependency Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DependencyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DependencyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DependencyKind get(int value) {
		switch (value) {
			case REQUIRES_VALUE: return REQUIRES;
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
	private DependencyKind(int value, String name, String literal) {
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
	
} //DependencyKind
