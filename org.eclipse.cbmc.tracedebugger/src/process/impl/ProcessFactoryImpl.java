/**
 */
package process.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import process.Breakpoint;
import process.BreakpointManager;
import process.Context;
import process.FunctionExecution;
import process.ProcessFactory;
import process.ProcessPackage;
import process.StepGoal;
import process.StepResult;
import process.SteppingResult;
import process.VariableManager;
import trace.Assignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessFactoryImpl extends EFactoryImpl implements ProcessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessFactory init() {
		try {
			ProcessFactory theProcessFactory = (ProcessFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessPackage.eNS_URI);
			if (theProcessFactory != null) {
				return theProcessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessPackage.PROCESS: return createProcess();
			case ProcessPackage.THREAD: return createThread();
			case ProcessPackage.FUNCTION_EXECUTION: return createFunctionExecution();
			case ProcessPackage.VARIABLE_MANAGER: return createVariableManager();
			case ProcessPackage.STRING_TO_ASSIGNMENT_ENTRY: return (EObject)createStringToAssignmentEntry();
			case ProcessPackage.BREAKPOINT_MANAGER: return createBreakpointManager();
			case ProcessPackage.STRING_TO_BREAKPOINT_ENTRY: return (EObject)createStringToBreakpointEntry();
			case ProcessPackage.BREAKPOINT: return createBreakpoint();
			case ProcessPackage.STEP_RESULT: return createStepResult();
			case ProcessPackage.CONTEXT: return createContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessPackage.STEP_GOAL:
				return createStepGoalFromString(eDataType, initialValue);
			case ProcessPackage.STEPPING_RESULT:
				return createSteppingResultFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessPackage.STEP_GOAL:
				return convertStepGoalToString(eDataType, instanceValue);
			case ProcessPackage.STEPPING_RESULT:
				return convertSteppingResultToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExecution createFunctionExecution() {
		FunctionExecutionImpl functionExecution = new FunctionExecutionImpl();
		return functionExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableManager createVariableManager() {
		VariableManagerImpl variableManager = new VariableManagerImpl();
		return variableManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Assignment> createStringToAssignmentEntry() {
		StringToAssignmentEntryImpl stringToAssignmentEntry = new StringToAssignmentEntryImpl();
		return stringToAssignmentEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakpointManager createBreakpointManager() {
		BreakpointManagerImpl breakpointManager = new BreakpointManagerImpl();
		return breakpointManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Breakpoint> createStringToBreakpointEntry() {
		StringToBreakpointEntryImpl stringToBreakpointEntry = new StringToBreakpointEntryImpl();
		return stringToBreakpointEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint createBreakpoint() {
		BreakpointImpl breakpoint = new BreakpointImpl();
		return breakpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepResult createStepResult() {
		StepResultImpl stepResult = new StepResultImpl();
		return stepResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepGoal createStepGoalFromString(EDataType eDataType, String initialValue) {
		StepGoal result = StepGoal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepGoalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteppingResult createSteppingResultFromString(EDataType eDataType, String initialValue) {
		SteppingResult result = SteppingResult.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSteppingResultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage getProcessPackage() {
		return (ProcessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessPackage getPackage() {
		return ProcessPackage.eINSTANCE;
	}

} //ProcessFactoryImpl
