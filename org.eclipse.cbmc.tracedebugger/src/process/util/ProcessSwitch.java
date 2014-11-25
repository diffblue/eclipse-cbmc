/**
 */
package process.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import process.Breakpoint;
import process.BreakpointManager;
import process.FunctionExecution;
import process.ProcessPackage;
import process.StepResult;
import process.VariableManager;
import trace.Assignment;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see process.ProcessPackage
 * @generated
 */
public class ProcessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessPackage.PROCESS: {
				process.Process process = (process.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.THREAD: {
				process.Thread thread = (process.Thread)theEObject;
				T result = caseThread(thread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.FUNCTION_EXECUTION: {
				FunctionExecution functionExecution = (FunctionExecution)theEObject;
				T result = caseFunctionExecution(functionExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.VARIABLE_MANAGER: {
				VariableManager variableManager = (VariableManager)theEObject;
				T result = caseVariableManager(variableManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.STRING_TO_ASSIGNMENT_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Assignment> stringToAssignmentEntry = (Map.Entry<String, Assignment>)theEObject;
				T result = caseStringToAssignmentEntry(stringToAssignmentEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.BREAKPOINT_MANAGER: {
				BreakpointManager breakpointManager = (BreakpointManager)theEObject;
				T result = caseBreakpointManager(breakpointManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.STRING_TO_BREAKPOINT_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Breakpoint> stringToBreakpointEntry = (Map.Entry<String, Breakpoint>)theEObject;
				T result = caseStringToBreakpointEntry(stringToBreakpointEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.BREAKPOINT: {
				Breakpoint breakpoint = (Breakpoint)theEObject;
				T result = caseBreakpoint(breakpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.STEP_RESULT: {
				StepResult stepResult = (StepResult)theEObject;
				T result = caseStepResult(stepResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(process.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThread(process.Thread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionExecution(FunctionExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableManager(VariableManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Assignment Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Assignment Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToAssignmentEntry(Map.Entry<String, Assignment> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breakpoint Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breakpoint Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakpointManager(BreakpointManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Breakpoint Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Breakpoint Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToBreakpointEntry(Map.Entry<String, Breakpoint> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breakpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breakpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakpoint(Breakpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepResult(StepResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProcessSwitch
