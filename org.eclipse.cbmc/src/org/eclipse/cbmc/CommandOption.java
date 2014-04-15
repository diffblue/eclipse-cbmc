/**
 */
package org.eclipse.cbmc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Command Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.cbmc.CbmcPackage#getCommandOption()
 * @model extendedMetaData="name='CommandOption'"
 * @generated
 */
public enum CommandOption implements Enumerator {
	/**
	 * The '<em><b>No Assertions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ASSERTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ASSERTIONS(0, "noAssertions", "no-assertions"),

	/**
	 * The '<em><b>No Assumptions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ASSUMPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ASSUMPTIONS(1, "noAssumptions", "no-assumptions"), /**
	 * The '<em><b>Div By Zero Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_BY_ZERO_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	DIV_BY_ZERO_CHECK(2, "divByZeroCheck", "div-by-zero-check"),

	/**
	 * The '<em><b>Pointer Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTER_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	POINTER_CHECK(3, "pointerCheck", "pointer-check"),

	/**
	 * The '<em><b>Signed Overflow Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNED_OVERFLOW_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNED_OVERFLOW_CHECK(4, "signedOverflowCheck", "signed-overflow-check"),

	/**
	 * The '<em><b>Unsigned Overflow Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_OVERFLOW_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_OVERFLOW_CHECK(5, "unsignedOverflowCheck", "unsigned-overflow-check"),

	/**
	 * The '<em><b>Nan Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAN_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	NAN_CHECK(6, "nanCheck", "nan-check"),

	/**
	 * The '<em><b>Bounds Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDS_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	BOUNDS_CHECK(7, "boundsCheck", "bounds-check"), /**
	 * The '<em><b>Undefined Shift Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_SHIFT_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED_SHIFT_CHECK(8, "undefinedShiftCheck", "undefined-shift-check"),

	/**
	 * The '<em><b>Memory Leak Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_LEAK_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_LEAK_CHECK(9, "memoryLeakCheck", "memory-leak-check"), /**
	 * The '<em><b>Float Overflow Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_OVERFLOW_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT_OVERFLOW_CHECK(10, "floatOverflowCheck", "float-overflow-check"), /**
	 * The '<em><b>Cover Assertions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVER_ASSERTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	COVER_ASSERTIONS(11, "coverAssertions", "cover-assertions");

	/**
	 * The '<em><b>No Assertions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Assertions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ASSERTIONS
	 * @model name="noAssertions" literal="no-assertions"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ASSERTIONS_VALUE = 0;

	/**
	 * The '<em><b>No Assumptions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Assumptions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ASSUMPTIONS
	 * @model name="noAssumptions" literal="no-assumptions"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ASSUMPTIONS_VALUE = 1;

	/**
	 * The '<em><b>Div By Zero Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Div By Zero Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIV_BY_ZERO_CHECK
	 * @model name="divByZeroCheck" literal="div-by-zero-check"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_BY_ZERO_CHECK_VALUE = 2;

	/**
	 * The '<em><b>Pointer Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pointer Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTER_CHECK
	 * @model name="pointerCheck" literal="pointer-check"
	 * @generated
	 * @ordered
	 */
	public static final int POINTER_CHECK_VALUE = 3;

	/**
	 * The '<em><b>Signed Overflow Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signed Overflow Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNED_OVERFLOW_CHECK
	 * @model name="signedOverflowCheck" literal="signed-overflow-check"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNED_OVERFLOW_CHECK_VALUE = 4;

	/**
	 * The '<em><b>Unsigned Overflow Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Overflow Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_OVERFLOW_CHECK
	 * @model name="unsignedOverflowCheck" literal="unsigned-overflow-check"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_OVERFLOW_CHECK_VALUE = 5;

	/**
	 * The '<em><b>Nan Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nan Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAN_CHECK
	 * @model name="nanCheck" literal="nan-check"
	 * @generated
	 * @ordered
	 */
	public static final int NAN_CHECK_VALUE = 6;

	/**
	 * The '<em><b>Bounds Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bounds Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOUNDS_CHECK
	 * @model name="boundsCheck" literal="bounds-check"
	 * @generated
	 * @ordered
	 */
	public static final int BOUNDS_CHECK_VALUE = 7;

	/**
	 * The '<em><b>Undefined Shift Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined Shift Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_SHIFT_CHECK
	 * @model name="undefinedShiftCheck" literal="undefined-shift-check"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_SHIFT_CHECK_VALUE = 8;

	/**
	 * The '<em><b>Memory Leak Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory Leak Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY_LEAK_CHECK
	 * @model name="memoryLeakCheck" literal="memory-leak-check"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_LEAK_CHECK_VALUE = 9;

	/**
	 * The '<em><b>Float Overflow Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float Overflow Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT_OVERFLOW_CHECK
	 * @model name="floatOverflowCheck" literal="float-overflow-check"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_OVERFLOW_CHECK_VALUE = 10;

	/**
	 * The '<em><b>Cover Assertions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cover Assertions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVER_ASSERTIONS
	 * @model name="coverAssertions" literal="cover-assertions"
	 * @generated
	 * @ordered
	 */
	public static final int COVER_ASSERTIONS_VALUE = 11;

	/**
	 * An array of all the '<em><b>Command Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CommandOption[] VALUES_ARRAY =
		new CommandOption[] {
			NO_ASSERTIONS,
			NO_ASSUMPTIONS,
			DIV_BY_ZERO_CHECK,
			POINTER_CHECK,
			SIGNED_OVERFLOW_CHECK,
			UNSIGNED_OVERFLOW_CHECK,
			NAN_CHECK,
			BOUNDS_CHECK,
			UNDEFINED_SHIFT_CHECK,
			MEMORY_LEAK_CHECK,
			FLOAT_OVERFLOW_CHECK,
			COVER_ASSERTIONS,
		};

	/**
	 * A public read-only list of all the '<em><b>Command Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CommandOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Command Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommandOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Command Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommandOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Command Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandOption get(int value) {
		switch (value) {
			case NO_ASSERTIONS_VALUE: return NO_ASSERTIONS;
			case NO_ASSUMPTIONS_VALUE: return NO_ASSUMPTIONS;
			case DIV_BY_ZERO_CHECK_VALUE: return DIV_BY_ZERO_CHECK;
			case POINTER_CHECK_VALUE: return POINTER_CHECK;
			case SIGNED_OVERFLOW_CHECK_VALUE: return SIGNED_OVERFLOW_CHECK;
			case UNSIGNED_OVERFLOW_CHECK_VALUE: return UNSIGNED_OVERFLOW_CHECK;
			case NAN_CHECK_VALUE: return NAN_CHECK;
			case BOUNDS_CHECK_VALUE: return BOUNDS_CHECK;
			case UNDEFINED_SHIFT_CHECK_VALUE: return UNDEFINED_SHIFT_CHECK;
			case MEMORY_LEAK_CHECK_VALUE: return MEMORY_LEAK_CHECK;
			case FLOAT_OVERFLOW_CHECK_VALUE: return FLOAT_OVERFLOW_CHECK;
			case COVER_ASSERTIONS_VALUE: return COVER_ASSERTIONS;
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
	private CommandOption(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //CommandOption
