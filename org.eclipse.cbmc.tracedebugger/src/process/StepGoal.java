/**
 */
package process;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Step Goal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see process.ProcessPackage#getStepGoal()
 * @model
 * @generated
 */
public enum StepGoal implements Enumerator {
	/**
	 * The '<em><b>Function Enter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_ENTER(1, "FunctionEnter", "FunctionEnter"),

	/**
	 * The '<em><b>Function Exit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_EXIT(2, "FunctionExit", "FunctionExit"),

	/**
	 * The '<em><b>Next Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_LINE(4, "NextLine", "NextLine"), /**
	 * The '<em><b>Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUE(8, "Continue", "Continue"), /**
	 * The '<em><b>Enter Or Next Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER_OR_NEXT_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	ENTER_OR_NEXT_LINE(6, "EnterOrNextLine", "EnterOrNextLine");

	/**
	 * The '<em><b>Function Enter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Enter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_ENTER
	 * @model name="FunctionEnter"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_ENTER_VALUE = 1;

	/**
	 * The '<em><b>Function Exit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Exit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_EXIT
	 * @model name="FunctionExit"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_EXIT_VALUE = 2;

	/**
	 * The '<em><b>Next Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT_LINE
	 * @model name="NextLine"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_LINE_VALUE = 4;

	/**
	 * The '<em><b>Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Continue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUE
	 * @model name="Continue"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUE_VALUE = 8;

	/**
	 * The '<em><b>Enter Or Next Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enter Or Next Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTER_OR_NEXT_LINE
	 * @model name="EnterOrNextLine"
	 * @generated
	 * @ordered
	 */
	public static final int ENTER_OR_NEXT_LINE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Step Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StepGoal[] VALUES_ARRAY =
		new StepGoal[] {
			FUNCTION_ENTER,
			FUNCTION_EXIT,
			NEXT_LINE,
			CONTINUE,
			ENTER_OR_NEXT_LINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Step Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StepGoal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Step Goal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepGoal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepGoal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Goal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepGoal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepGoal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Goal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepGoal get(int value) {
		switch (value) {
			case FUNCTION_ENTER_VALUE: return FUNCTION_ENTER;
			case FUNCTION_EXIT_VALUE: return FUNCTION_EXIT;
			case NEXT_LINE_VALUE: return NEXT_LINE;
			case CONTINUE_VALUE: return CONTINUE;
			case ENTER_OR_NEXT_LINE_VALUE: return ENTER_OR_NEXT_LINE;
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
	private StepGoal(int value, String name, String literal) {
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
	
} //StepGoal
