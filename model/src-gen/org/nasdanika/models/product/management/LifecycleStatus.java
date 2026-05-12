/**
 */
package org.nasdanika.models.product.management;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lifecycle Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Lifecycle status of a Version. Models the progression from
 * planned through general availability to eventual retirement.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.product.management.ManagementPackage#getLifecycleStatus()
 * @model
 * @generated
 */
public enum LifecycleStatus implements Enumerator {
	/**
	 * The '<em><b>PLANNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planned but not yet released; work is scheduled or in progress.
	 * <!-- end-model-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(0, "PLANNED", "Planned"),

	/**
	 * The '<em><b>GA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generally available; production-ready and fully supported.
	 * <!-- end-model-doc -->
	 * @see #GA_VALUE
	 * @generated
	 * @ordered
	 */
	GA(1, "GA", "GA"),

	/**
	 * The '<em><b>DEPRECATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated; still available but scheduled for retirement.
	 * <!-- end-model-doc -->
	 * @see #DEPRECATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATED(2, "DEPRECATED", "Deprecated"),

	/**
	 * The '<em><b>RETIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retired; no longer available or supported.
	 * <!-- end-model-doc -->
	 * @see #RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	RETIRED(3, "RETIRED", "Retired");

	/**
	 * The '<em><b>PLANNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planned but not yet released; work is scheduled or in progress.
	 * <!-- end-model-doc -->
	 * @see #PLANNED
	 * @model literal="Planned"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 0;

	/**
	 * The '<em><b>GA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generally available; production-ready and fully supported.
	 * <!-- end-model-doc -->
	 * @see #GA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GA_VALUE = 1;

	/**
	 * The '<em><b>DEPRECATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated; still available but scheduled for retirement.
	 * <!-- end-model-doc -->
	 * @see #DEPRECATED
	 * @model literal="Deprecated"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED_VALUE = 2;

	/**
	 * The '<em><b>RETIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retired; no longer available or supported.
	 * <!-- end-model-doc -->
	 * @see #RETIRED
	 * @model literal="Retired"
	 * @generated
	 * @ordered
	 */
	public static final int RETIRED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Lifecycle Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LifecycleStatus[] VALUES_ARRAY =
		new LifecycleStatus[] {
			PLANNED,
			GA,
			DEPRECATED,
			RETIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Lifecycle Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LifecycleStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lifecycle Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStatus get(int value) {
		switch (value) {
			case PLANNED_VALUE: return PLANNED;
			case GA_VALUE: return GA;
			case DEPRECATED_VALUE: return DEPRECATED;
			case RETIRED_VALUE: return RETIRED;
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
	private LifecycleStatus(int value, String name, String literal) {
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
	
} //LifecycleStatus
