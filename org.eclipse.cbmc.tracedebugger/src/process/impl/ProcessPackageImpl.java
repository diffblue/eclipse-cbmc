/**
 */
package process.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import process.Breakpoint;
import process.BreakpointManager;
import process.FunctionExecution;
import process.ProcessFactory;
import process.ProcessPackage;
import process.StepGoal;
import process.StepResult;
import process.SteppingResult;
import process.VariableManager;
import trace.TracePackage;
import trace.impl.TracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPackageImpl extends EPackageImpl implements ProcessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToAssignmentMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakpointManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToBreakpointMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepGoalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum steppingResultEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see process.ProcessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessPackageImpl() {
		super(eNS_URI, ProcessFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProcessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessPackage init() {
		if (isInited) return (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);

		// Obtain or create and register package
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) : TracePackage.eINSTANCE);

		// Create package meta-data objects
		theProcessPackage.createPackageContents();
		theTracePackage.createPackageContents();

		// Initialize created meta-data
		theProcessPackage.initializePackageContents();
		theTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessPackage.eNS_URI, theProcessPackage);
		return theProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Threads() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Started() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_GroupThreadId() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_ProcessNumber() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ActiveThreads() {
		return (EReference)processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Pid() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_VariableManager() {
		return (EReference)processEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_BreakpointManager() {
		return (EReference)processEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_ExecutableName() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess__Start() {
		return processEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess__GetThread__int() {
		return processEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_Id() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_AllSteps() {
		return (EReference)threadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_Started() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Stack() {
		return (EReference)threadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_Running() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Process() {
		return (EReference)threadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThread__Step__int() {
		return threadEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThread__GetStackDepth() {
		return threadEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThread__GetFrame__int() {
		return threadEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionExecution() {
		return functionExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionExecution_Child() {
		return (EReference)functionExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionExecution_Parent() {
		return (EReference)functionExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionExecution_Variables() {
		return (EReference)functionExecutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionExecution_CurrentStep() {
		return (EReference)functionExecutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionExecution_CurrentStepNumber() {
		return (EAttribute)functionExecutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionExecution_CurrentGoal() {
		return (EAttribute)functionExecutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionExecution__GetVariable__String() {
		return functionExecutionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionExecution__GetFunctionName() {
		return functionExecutionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionExecution__Step__int_boolean() {
		return functionExecutionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionExecution__GetFileName() {
		return functionExecutionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableManager() {
		return variableManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableManager_Variables() {
		return (EReference)variableManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableManager_PreviousValues() {
		return (EReference)variableManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToAssignmentMap() {
		return stringToAssignmentMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToAssignmentMap_Key() {
		return (EAttribute)stringToAssignmentMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToAssignmentMap_Value() {
		return (EReference)stringToAssignmentMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakpointManager() {
		return breakpointManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakpointManager_BreakpointsByLocation() {
		return (EReference)breakpointManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakpointManager_BreakpointsById() {
		return (EReference)breakpointManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBreakpointManager__HasBreakpoint__FunctionExecution_Step() {
		return breakpointManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToBreakpointMap() {
		return stringToBreakpointMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToBreakpointMap_Key() {
		return (EAttribute)stringToBreakpointMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToBreakpointMap_Value() {
		return (EReference)stringToBreakpointMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakpoint() {
		return breakpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoint_Enabled() {
		return (EAttribute)breakpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoint_Id() {
		return (EAttribute)breakpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoint_File() {
		return (EAttribute)breakpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoint_Line() {
		return (EAttribute)breakpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoint_FunctionName() {
		return (EAttribute)breakpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepResult() {
		return stepResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepResult_Object() {
		return (EAttribute)stepResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepResult_Code() {
		return (EAttribute)stepResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepResult_StepDone() {
		return (EAttribute)stepResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepGoal() {
		return stepGoalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSteppingResult() {
		return steppingResultEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionExecution_EntryStep() {
		return (EReference)functionExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionExecution_ContainingThread() {
		return (EReference)functionExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactory getProcessFactory() {
		return (ProcessFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__THREADS);
		createEAttribute(processEClass, PROCESS__STARTED);
		createEAttribute(processEClass, PROCESS__GROUP_THREAD_ID);
		createEAttribute(processEClass, PROCESS__PROCESS_NUMBER);
		createEReference(processEClass, PROCESS__ACTIVE_THREADS);
		createEAttribute(processEClass, PROCESS__PID);
		createEReference(processEClass, PROCESS__VARIABLE_MANAGER);
		createEReference(processEClass, PROCESS__BREAKPOINT_MANAGER);
		createEAttribute(processEClass, PROCESS__EXECUTABLE_NAME);
		createEOperation(processEClass, PROCESS___START);
		createEOperation(processEClass, PROCESS___GET_THREAD__INT);

		threadEClass = createEClass(THREAD);
		createEAttribute(threadEClass, THREAD__ID);
		createEReference(threadEClass, THREAD__ALL_STEPS);
		createEAttribute(threadEClass, THREAD__STARTED);
		createEReference(threadEClass, THREAD__STACK);
		createEAttribute(threadEClass, THREAD__RUNNING);
		createEReference(threadEClass, THREAD__PROCESS);
		createEOperation(threadEClass, THREAD___STEP__INT);
		createEOperation(threadEClass, THREAD___GET_STACK_DEPTH);
		createEOperation(threadEClass, THREAD___GET_FRAME__INT);

		functionExecutionEClass = createEClass(FUNCTION_EXECUTION);
		createEReference(functionExecutionEClass, FUNCTION_EXECUTION__CHILD);
		createEReference(functionExecutionEClass, FUNCTION_EXECUTION__ENTRY_STEP);
		createEReference(functionExecutionEClass, FUNCTION_EXECUTION__CONTAINING_THREAD);
		createEReference(functionExecutionEClass, FUNCTION_EXECUTION__PARENT);
		createEReference(functionExecutionEClass, FUNCTION_EXECUTION__VARIABLES);
		createEReference(functionExecutionEClass, FUNCTION_EXECUTION__CURRENT_STEP);
		createEAttribute(functionExecutionEClass, FUNCTION_EXECUTION__CURRENT_STEP_NUMBER);
		createEAttribute(functionExecutionEClass, FUNCTION_EXECUTION__CURRENT_GOAL);
		createEOperation(functionExecutionEClass, FUNCTION_EXECUTION___GET_VARIABLE__STRING);
		createEOperation(functionExecutionEClass, FUNCTION_EXECUTION___GET_FUNCTION_NAME);
		createEOperation(functionExecutionEClass, FUNCTION_EXECUTION___STEP__INT_BOOLEAN);
		createEOperation(functionExecutionEClass, FUNCTION_EXECUTION___GET_FILE_NAME);

		variableManagerEClass = createEClass(VARIABLE_MANAGER);
		createEReference(variableManagerEClass, VARIABLE_MANAGER__VARIABLES);
		createEReference(variableManagerEClass, VARIABLE_MANAGER__PREVIOUS_VALUES);

		stringToAssignmentMapEClass = createEClass(STRING_TO_ASSIGNMENT_MAP);
		createEAttribute(stringToAssignmentMapEClass, STRING_TO_ASSIGNMENT_MAP__KEY);
		createEReference(stringToAssignmentMapEClass, STRING_TO_ASSIGNMENT_MAP__VALUE);

		breakpointManagerEClass = createEClass(BREAKPOINT_MANAGER);
		createEReference(breakpointManagerEClass, BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION);
		createEReference(breakpointManagerEClass, BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID);
		createEOperation(breakpointManagerEClass, BREAKPOINT_MANAGER___HAS_BREAKPOINT__FUNCTIONEXECUTION_STEP);

		stringToBreakpointMapEClass = createEClass(STRING_TO_BREAKPOINT_MAP);
		createEAttribute(stringToBreakpointMapEClass, STRING_TO_BREAKPOINT_MAP__KEY);
		createEReference(stringToBreakpointMapEClass, STRING_TO_BREAKPOINT_MAP__VALUE);

		breakpointEClass = createEClass(BREAKPOINT);
		createEAttribute(breakpointEClass, BREAKPOINT__ENABLED);
		createEAttribute(breakpointEClass, BREAKPOINT__ID);
		createEAttribute(breakpointEClass, BREAKPOINT__FILE);
		createEAttribute(breakpointEClass, BREAKPOINT__LINE);
		createEAttribute(breakpointEClass, BREAKPOINT__FUNCTION_NAME);

		stepResultEClass = createEClass(STEP_RESULT);
		createEAttribute(stepResultEClass, STEP_RESULT__OBJECT);
		createEAttribute(stepResultEClass, STEP_RESULT__CODE);
		createEAttribute(stepResultEClass, STEP_RESULT__STEP_DONE);

		// Create enums
		stepGoalEEnum = createEEnum(STEP_GOAL);
		steppingResultEEnum = createEEnum(STEPPING_RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(processEClass, process.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Threads(), this.getThread(), this.getThread_Process(), "threads", null, 0, -1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Started(), theXMLTypePackage.getBoolean(), "started", null, 0, 1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_GroupThreadId(), theXMLTypePackage.getString(), "groupThreadId", null, 0, 1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_ProcessNumber(), theXMLTypePackage.getString(), "processNumber", null, 0, 1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ActiveThreads(), this.getThread(), null, "activeThreads", null, 0, -1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Pid(), theXMLTypePackage.getString(), "pid", null, 0, 1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_VariableManager(), this.getVariableManager(), null, "variableManager", null, 1, 1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_BreakpointManager(), this.getBreakpointManager(), null, "breakpointManager", null, 1, 1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_ExecutableName(), theXMLTypePackage.getString(), "executableName", null, 0, 1, process.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcess__Start(), this.getStepResult(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getProcess__GetThread__int(), this.getThread(), "getThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "threadId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threadEClass, process.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThread_Id(), theXMLTypePackage.getInt(), "id", null, 0, 1, process.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_AllSteps(), theTracePackage.getStep(), null, "allSteps", null, 0, -1, process.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_Started(), theXMLTypePackage.getBoolean(), "started", null, 0, 1, process.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_Stack(), this.getFunctionExecution(), null, "stack", null, 0, 1, process.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_Running(), theXMLTypePackage.getBoolean(), "running", null, 0, 1, process.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_Process(), this.getProcess(), this.getProcess_Threads(), "process", null, 0, 1, process.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getThread__Step__int(), this.getStepResult(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "goal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getThread__GetStackDepth(), theXMLTypePackage.getInt(), "getStackDepth", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getThread__GetFrame__int(), this.getFunctionExecution(), "getFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getInt(), "depth", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(functionExecutionEClass, FunctionExecution.class, "FunctionExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionExecution_Child(), this.getFunctionExecution(), this.getFunctionExecution_Parent(), "child", null, 0, 1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionExecution_EntryStep(), theTracePackage.getFunctionCall(), null, "entryStep", null, 0, 1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionExecution_ContainingThread(), this.getThread(), null, "containingThread", null, 0, 1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionExecution_Parent(), this.getFunctionExecution(), this.getFunctionExecution_Child(), "parent", null, 0, 1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionExecution_Variables(), theTracePackage.getAssignment(), null, "variables", null, 0, -1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getFunctionExecution_Variables().getEKeys().add(theTracePackage.getAssignment_BaseName());
		initEReference(getFunctionExecution_CurrentStep(), theTracePackage.getStep(), null, "currentStep", null, 0, 1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionExecution_CurrentStepNumber(), theXMLTypePackage.getInt(), "currentStepNumber", null, 0, 1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionExecution_CurrentGoal(), theXMLTypePackage.getInt(), "currentGoal", null, 0, 1, FunctionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFunctionExecution__GetVariable__String(), theTracePackage.getAssignment(), "getVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFunctionExecution__GetFunctionName(), theXMLTypePackage.getString(), "getFunctionName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFunctionExecution__Step__int_boolean(), this.getStepResult(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getBoolean(), "enableBreakpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFunctionExecution__GetFileName(), theXMLTypePackage.getString(), "getFileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableManagerEClass, VariableManager.class, "VariableManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableManager_Variables(), this.getStringToAssignmentMap(), null, "variables", null, 0, -1, VariableManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableManager_PreviousValues(), this.getStringToAssignmentMap(), null, "previousValues", null, 0, -1, VariableManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToAssignmentMapEClass, Map.Entry.class, "StringToAssignmentMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToAssignmentMap_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToAssignmentMap_Value(), theTracePackage.getAssignment(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakpointManagerEClass, BreakpointManager.class, "BreakpointManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBreakpointManager_BreakpointsByLocation(), this.getStringToBreakpointMap(), null, "breakpointsByLocation", null, 1, -1, BreakpointManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreakpointManager_BreakpointsById(), this.getStringToBreakpointMap(), null, "breakpointsById", null, 1, -1, BreakpointManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBreakpointManager__HasBreakpoint__FunctionExecution_Step(), this.getBreakpoint(), "hasBreakpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFunctionExecution(), "function", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTracePackage.getStep(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringToBreakpointMapEClass, Map.Entry.class, "StringToBreakpointMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToBreakpointMap_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToBreakpointMap_Value(), this.getBreakpoint(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakpointEClass, Breakpoint.class, "Breakpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreakpoint_Enabled(), theXMLTypePackage.getBoolean(), "enabled", null, 0, 1, Breakpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreakpoint_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Breakpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreakpoint_File(), theXMLTypePackage.getString(), "file", null, 0, 1, Breakpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreakpoint_Line(), theXMLTypePackage.getString(), "line", null, 0, 1, Breakpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreakpoint_FunctionName(), theXMLTypePackage.getString(), "functionName", null, 0, 1, Breakpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepResultEClass, StepResult.class, "StepResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStepResult_Object(), ecorePackage.getEJavaObject(), "object", null, 0, 1, StepResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepResult_Code(), this.getSteppingResult(), "code", null, 0, 1, StepResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepResult_StepDone(), theXMLTypePackage.getInt(), "stepDone", null, 0, 1, StepResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stepGoalEEnum, StepGoal.class, "StepGoal");
		addEEnumLiteral(stepGoalEEnum, StepGoal.FIRST_INSTRUCTION);
		addEEnumLiteral(stepGoalEEnum, StepGoal.FUNCTION_ENTER);
		addEEnumLiteral(stepGoalEEnum, StepGoal.FUNCTION_EXIT);
		addEEnumLiteral(stepGoalEEnum, StepGoal.NEXT_LINE);

		initEEnum(steppingResultEEnum, SteppingResult.class, "SteppingResult");
		addEEnumLiteral(steppingResultEEnum, SteppingResult.BREAKPOINT_HIT);
		addEEnumLiteral(steppingResultEEnum, SteppingResult.STEP_COMPLETE);

		// Create resource
		createResource(eNS_URI);
	}

} //ProcessPackageImpl
