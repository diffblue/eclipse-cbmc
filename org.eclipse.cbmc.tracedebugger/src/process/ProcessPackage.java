/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
/**
 */
package process;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see process.ProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/cbmc/debug/process";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "process";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessPackage eINSTANCE = process.impl.ProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link process.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.ProcessImpl
	 * @see process.impl.ProcessPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__THREADS = 0;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STARTED = 1;

	/**
	 * The feature id for the '<em><b>Group Thread Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__GROUP_THREAD_ID = 2;

	/**
	 * The feature id for the '<em><b>Process Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Active Threads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVE_THREADS = 4;

	/**
	 * The feature id for the '<em><b>Variable Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABLE_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Breakpoint Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BREAKPOINT_MANAGER = 6;

	/**
	 * The feature id for the '<em><b>Executable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXECUTABLE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MEMORY = 8;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___START = 0;

	/**
	 * The operation id for the '<em>Get Thread</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_THREAD__INT = 1;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link process.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.ThreadImpl
	 * @see process.impl.ProcessPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ID = 0;

	/**
	 * The feature id for the '<em><b>All Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ALL_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__STARTED = 2;

	/**
	 * The feature id for the '<em><b>Stack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__STACK = 3;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__RUNNING = 4;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Step To Execute Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__STEP_TO_EXECUTE_IDX = 6;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___STEP__STEPGOAL = 0;

	/**
	 * The operation id for the '<em>Get Stack Depth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_STACK_DEPTH = 1;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_FRAME__INT = 2;

	/**
	 * The operation id for the '<em>Get Step To Execute Or Last One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD___GET_STEP_TO_EXECUTE_OR_LAST_ONE = 3;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = 4;


	/**
	 * The meta object id for the '{@link process.impl.FunctionExecutionImpl <em>Function Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.FunctionExecutionImpl
	 * @see process.impl.ProcessPackageImpl#getFunctionExecution()
	 * @generated
	 */
	int FUNCTION_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Entry Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION__ENTRY_STEP = 2;

	/**
	 * The feature id for the '<em><b>Containing Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION__CONTAINING_THREAD = 3;

	/**
	 * The feature id for the '<em><b>Step Index Before Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION__STEP_INDEX_BEFORE_CHILD = 4;

	/**
	 * The feature id for the '<em><b>Local Name To Memory</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY = 5;

	/**
	 * The number of structural features of the '<em>Function Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION___GET_VARIABLE__STRING = 0;

	/**
	 * The operation id for the '<em>Get Function Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION___GET_FUNCTION_NAME = 1;

	/**
	 * The operation id for the '<em>Get File Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION___GET_FILE_NAME = 2;

	/**
	 * The operation id for the '<em>Get Current Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION___GET_CURRENT_STEP = 3;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION___GET_ALL_VARIABLES = 4;

	/**
	 * The number of operations of the '<em>Function Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_EXECUTION_OPERATION_COUNT = 5;


	/**
	 * The meta object id for the '{@link process.impl.VariableManagerImpl <em>Variable Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.VariableManagerImpl
	 * @see process.impl.ProcessPackageImpl#getVariableManager()
	 * @generated
	 */
	int VARIABLE_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MANAGER__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Previous Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MANAGER__PREVIOUS_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Variable Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Assignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MANAGER___GET_ASSIGNMENT__STRING = 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MANAGER___GET_VALUE__STRING = 1;

	/**
	 * The number of operations of the '<em>Variable Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MANAGER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link process.impl.StringToAssignmentEntryImpl <em>String To Assignment Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.StringToAssignmentEntryImpl
	 * @see process.impl.ProcessPackageImpl#getStringToAssignmentEntry()
	 * @generated
	 */
	int STRING_TO_ASSIGNMENT_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ASSIGNMENT_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ASSIGNMENT_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Assignment Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ASSIGNMENT_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Assignment Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ASSIGNMENT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.impl.BreakpointManagerImpl <em>Breakpoint Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.BreakpointManagerImpl
	 * @see process.impl.ProcessPackageImpl#getBreakpointManager()
	 * @generated
	 */
	int BREAKPOINT_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Breakpoints By Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Breakpoints By Id</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID = 1;

	/**
	 * The number of structural features of the '<em>Breakpoint Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Has Breakpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT_MANAGER___HAS_BREAKPOINT__FUNCTIONEXECUTION_STEP = 0;

	/**
	 * The number of operations of the '<em>Breakpoint Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link process.impl.StringToBreakpointEntryImpl <em>String To Breakpoint Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.StringToBreakpointEntryImpl
	 * @see process.impl.ProcessPackageImpl#getStringToBreakpointEntry()
	 * @generated
	 */
	int STRING_TO_BREAKPOINT_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BREAKPOINT_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BREAKPOINT_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Breakpoint Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BREAKPOINT_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Breakpoint Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BREAKPOINT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.impl.BreakpointImpl <em>Breakpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.BreakpointImpl
	 * @see process.impl.ProcessPackageImpl#getBreakpoint()
	 * @generated
	 */
	int BREAKPOINT = 7;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT__ID = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT__FILE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT__LINE = 3;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT__FUNCTION_NAME = 4;

	/**
	 * The number of structural features of the '<em>Breakpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Breakpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.impl.StepResultImpl <em>Step Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.StepResultImpl
	 * @see process.impl.ProcessPackageImpl#getStepResult()
	 * @generated
	 */
	int STEP_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_RESULT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Step Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_RESULT__STEP_DONE = 1;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_RESULT__BREAKPOINT = 2;

	/**
	 * The feature id for the '<em><b>Line Executed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_RESULT__LINE_EXECUTED = 3;

	/**
	 * The number of structural features of the '<em>Step Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_RESULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.ContextImpl
	 * @see process.impl.ProcessPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Containing Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTAINING_THREAD = 1;

	/**
	 * The feature id for the '<em><b>Step Being Executed Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__STEP_BEING_EXECUTED_IDX = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.MemoryImpl
	 * @see process.impl.ProcessPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 10;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__GLOBAL_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.impl.StringToStringEntryImpl <em>String To String Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.StringToStringEntryImpl
	 * @see process.impl.ProcessPackageImpl#getStringToStringEntry()
	 * @generated
	 */
	int STRING_TO_STRING_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.StepGoal <em>Step Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.StepGoal
	 * @see process.impl.ProcessPackageImpl#getStepGoal()
	 * @generated
	 */
	int STEP_GOAL = 12;

	/**
	 * The meta object id for the '{@link process.SteppingResult <em>Stepping Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.SteppingResult
	 * @see process.impl.ProcessPackageImpl#getSteppingResult()
	 * @generated
	 */
	int STEPPING_RESULT = 13;

	/**
	 * Returns the meta object for class '{@link process.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see process.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link process.Process#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threads</em>'.
	 * @see process.Process#getThreads()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Threads();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see process.Process#isStarted()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Started();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getGroupThreadId <em>Group Thread Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Thread Id</em>'.
	 * @see process.Process#getGroupThreadId()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_GroupThreadId();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getProcessNumber <em>Process Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Number</em>'.
	 * @see process.Process#getProcessNumber()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ProcessNumber();

	/**
	 * Returns the meta object for the reference list '{@link process.Process#getActiveThreads <em>Active Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Threads</em>'.
	 * @see process.Process#getActiveThreads()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ActiveThreads();

	/**
	 * Returns the meta object for the reference '{@link process.Process#getVariableManager <em>Variable Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Manager</em>'.
	 * @see process.Process#getVariableManager()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_VariableManager();

	/**
	 * Returns the meta object for the reference '{@link process.Process#getBreakpointManager <em>Breakpoint Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Breakpoint Manager</em>'.
	 * @see process.Process#getBreakpointManager()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_BreakpointManager();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getExecutableName <em>Executable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable Name</em>'.
	 * @see process.Process#getExecutableName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExecutableName();

	/**
	 * Returns the meta object for the reference '{@link process.Process#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory</em>'.
	 * @see process.Process#getMemory()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Memory();

	/**
	 * Returns the meta object for the '{@link process.Process#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see process.Process#start()
	 * @generated
	 */
	EOperation getProcess__Start();

	/**
	 * Returns the meta object for the '{@link process.Process#getThread(int) <em>Get Thread</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thread</em>' operation.
	 * @see process.Process#getThread(int)
	 * @generated
	 */
	EOperation getProcess__GetThread__int();

	/**
	 * Returns the meta object for class '{@link process.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see process.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the attribute '{@link process.Thread#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see process.Thread#getId()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Id();

	/**
	 * Returns the meta object for the reference list '{@link process.Thread#getAllSteps <em>All Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Steps</em>'.
	 * @see process.Thread#getAllSteps()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_AllSteps();

	/**
	 * Returns the meta object for the attribute '{@link process.Thread#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see process.Thread#isStarted()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Started();

	/**
	 * Returns the meta object for the reference '{@link process.Thread#getStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stack</em>'.
	 * @see process.Thread#getStack()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Stack();

	/**
	 * Returns the meta object for the attribute '{@link process.Thread#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see process.Thread#isRunning()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Running();

	/**
	 * Returns the meta object for the container reference '{@link process.Thread#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see process.Thread#getProcess()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Process();

	/**
	 * Returns the meta object for the attribute '{@link process.Thread#getStepToExecuteIdx <em>Step To Execute Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step To Execute Idx</em>'.
	 * @see process.Thread#getStepToExecuteIdx()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_StepToExecuteIdx();

	/**
	 * Returns the meta object for the '{@link process.Thread#step(process.StepGoal) <em>Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step</em>' operation.
	 * @see process.Thread#step(process.StepGoal)
	 * @generated
	 */
	EOperation getThread__Step__StepGoal();

	/**
	 * Returns the meta object for the '{@link process.Thread#getStackDepth() <em>Get Stack Depth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stack Depth</em>' operation.
	 * @see process.Thread#getStackDepth()
	 * @generated
	 */
	EOperation getThread__GetStackDepth();

	/**
	 * Returns the meta object for the '{@link process.Thread#getFrame(int) <em>Get Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Frame</em>' operation.
	 * @see process.Thread#getFrame(int)
	 * @generated
	 */
	EOperation getThread__GetFrame__int();

	/**
	 * Returns the meta object for the '{@link process.Thread#getStepToExecuteOrLastOne() <em>Get Step To Execute Or Last One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Step To Execute Or Last One</em>' operation.
	 * @see process.Thread#getStepToExecuteOrLastOne()
	 * @generated
	 */
	EOperation getThread__GetStepToExecuteOrLastOne();

	/**
	 * Returns the meta object for class '{@link process.FunctionExecution <em>Function Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Execution</em>'.
	 * @see process.FunctionExecution
	 * @generated
	 */
	EClass getFunctionExecution();

	/**
	 * Returns the meta object for the reference '{@link process.FunctionExecution#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see process.FunctionExecution#getChild()
	 * @see #getFunctionExecution()
	 * @generated
	 */
	EReference getFunctionExecution_Child();

	/**
	 * Returns the meta object for the reference '{@link process.FunctionExecution#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see process.FunctionExecution#getParent()
	 * @see #getFunctionExecution()
	 * @generated
	 */
	EReference getFunctionExecution_Parent();

	/**
	 * Returns the meta object for the attribute '{@link process.FunctionExecution#getStepIndexBeforeChild <em>Step Index Before Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Index Before Child</em>'.
	 * @see process.FunctionExecution#getStepIndexBeforeChild()
	 * @see #getFunctionExecution()
	 * @generated
	 */
	EAttribute getFunctionExecution_StepIndexBeforeChild();

	/**
	 * Returns the meta object for the map '{@link process.FunctionExecution#getLocalNameToMemory <em>Local Name To Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Local Name To Memory</em>'.
	 * @see process.FunctionExecution#getLocalNameToMemory()
	 * @see #getFunctionExecution()
	 * @generated
	 */
	EReference getFunctionExecution_LocalNameToMemory();

	/**
	 * Returns the meta object for the '{@link process.FunctionExecution#getVariable(java.lang.String) <em>Get Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable</em>' operation.
	 * @see process.FunctionExecution#getVariable(java.lang.String)
	 * @generated
	 */
	EOperation getFunctionExecution__GetVariable__String();

	/**
	 * Returns the meta object for the '{@link process.FunctionExecution#getFunctionName() <em>Get Function Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Function Name</em>' operation.
	 * @see process.FunctionExecution#getFunctionName()
	 * @generated
	 */
	EOperation getFunctionExecution__GetFunctionName();

	/**
	 * Returns the meta object for the '{@link process.FunctionExecution#getFileName() <em>Get File Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get File Name</em>' operation.
	 * @see process.FunctionExecution#getFileName()
	 * @generated
	 */
	EOperation getFunctionExecution__GetFileName();

	/**
	 * Returns the meta object for the '{@link process.FunctionExecution#getCurrentStep() <em>Get Current Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Step</em>' operation.
	 * @see process.FunctionExecution#getCurrentStep()
	 * @generated
	 */
	EOperation getFunctionExecution__GetCurrentStep();

	/**
	 * Returns the meta object for the '{@link process.FunctionExecution#getAllVariables() <em>Get All Variables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Variables</em>' operation.
	 * @see process.FunctionExecution#getAllVariables()
	 * @generated
	 */
	EOperation getFunctionExecution__GetAllVariables();

	/**
	 * Returns the meta object for class '{@link process.VariableManager <em>Variable Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Manager</em>'.
	 * @see process.VariableManager
	 * @generated
	 */
	EClass getVariableManager();

	/**
	 * Returns the meta object for the map '{@link process.VariableManager#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Variables</em>'.
	 * @see process.VariableManager#getVariables()
	 * @see #getVariableManager()
	 * @generated
	 */
	EReference getVariableManager_Variables();

	/**
	 * Returns the meta object for the map '{@link process.VariableManager#getPreviousValues <em>Previous Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Previous Values</em>'.
	 * @see process.VariableManager#getPreviousValues()
	 * @see #getVariableManager()
	 * @generated
	 */
	EReference getVariableManager_PreviousValues();

	/**
	 * Returns the meta object for the '{@link process.VariableManager#getAssignment(java.lang.String) <em>Get Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Assignment</em>' operation.
	 * @see process.VariableManager#getAssignment(java.lang.String)
	 * @generated
	 */
	EOperation getVariableManager__GetAssignment__String();

	/**
	 * Returns the meta object for the '{@link process.VariableManager#getValue(java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see process.VariableManager#getValue(java.lang.String)
	 * @generated
	 */
	EOperation getVariableManager__GetValue__String();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Assignment Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Assignment Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueType="trace.Assignment"
	 * @generated
	 */
	EClass getStringToAssignmentEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToAssignmentEntry()
	 * @generated
	 */
	EAttribute getStringToAssignmentEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToAssignmentEntry()
	 * @generated
	 */
	EReference getStringToAssignmentEntry_Value();

	/**
	 * Returns the meta object for class '{@link process.BreakpointManager <em>Breakpoint Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breakpoint Manager</em>'.
	 * @see process.BreakpointManager
	 * @generated
	 */
	EClass getBreakpointManager();

	/**
	 * Returns the meta object for the map '{@link process.BreakpointManager#getBreakpointsByLocation <em>Breakpoints By Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Breakpoints By Location</em>'.
	 * @see process.BreakpointManager#getBreakpointsByLocation()
	 * @see #getBreakpointManager()
	 * @generated
	 */
	EReference getBreakpointManager_BreakpointsByLocation();

	/**
	 * Returns the meta object for the map '{@link process.BreakpointManager#getBreakpointsById <em>Breakpoints By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Breakpoints By Id</em>'.
	 * @see process.BreakpointManager#getBreakpointsById()
	 * @see #getBreakpointManager()
	 * @generated
	 */
	EReference getBreakpointManager_BreakpointsById();

	/**
	 * Returns the meta object for the '{@link process.BreakpointManager#hasBreakpoint(process.FunctionExecution, trace.Step) <em>Has Breakpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Breakpoint</em>' operation.
	 * @see process.BreakpointManager#hasBreakpoint(process.FunctionExecution, trace.Step)
	 * @generated
	 */
	EOperation getBreakpointManager__HasBreakpoint__FunctionExecution_Step();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Breakpoint Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Breakpoint Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueType="process.Breakpoint"
	 * @generated
	 */
	EClass getStringToBreakpointEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBreakpointEntry()
	 * @generated
	 */
	EAttribute getStringToBreakpointEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBreakpointEntry()
	 * @generated
	 */
	EReference getStringToBreakpointEntry_Value();

	/**
	 * Returns the meta object for class '{@link process.Breakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breakpoint</em>'.
	 * @see process.Breakpoint
	 * @generated
	 */
	EClass getBreakpoint();

	/**
	 * Returns the meta object for the attribute '{@link process.Breakpoint#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see process.Breakpoint#isEnabled()
	 * @see #getBreakpoint()
	 * @generated
	 */
	EAttribute getBreakpoint_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link process.Breakpoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see process.Breakpoint#getId()
	 * @see #getBreakpoint()
	 * @generated
	 */
	EAttribute getBreakpoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link process.Breakpoint#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see process.Breakpoint#getFile()
	 * @see #getBreakpoint()
	 * @generated
	 */
	EAttribute getBreakpoint_File();

	/**
	 * Returns the meta object for the attribute '{@link process.Breakpoint#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see process.Breakpoint#getLine()
	 * @see #getBreakpoint()
	 * @generated
	 */
	EAttribute getBreakpoint_Line();

	/**
	 * Returns the meta object for the attribute '{@link process.Breakpoint#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see process.Breakpoint#getFunctionName()
	 * @see #getBreakpoint()
	 * @generated
	 */
	EAttribute getBreakpoint_FunctionName();

	/**
	 * Returns the meta object for class '{@link process.StepResult <em>Step Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Result</em>'.
	 * @see process.StepResult
	 * @generated
	 */
	EClass getStepResult();

	/**
	 * Returns the meta object for the attribute '{@link process.StepResult#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see process.StepResult#getCode()
	 * @see #getStepResult()
	 * @generated
	 */
	EAttribute getStepResult_Code();

	/**
	 * Returns the meta object for the attribute '{@link process.StepResult#getStepDone <em>Step Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Done</em>'.
	 * @see process.StepResult#getStepDone()
	 * @see #getStepResult()
	 * @generated
	 */
	EAttribute getStepResult_StepDone();

	/**
	 * Returns the meta object for the reference '{@link process.StepResult#getLineExecuted <em>Line Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Executed</em>'.
	 * @see process.StepResult#getLineExecuted()
	 * @see #getStepResult()
	 * @generated
	 */
	EReference getStepResult_LineExecuted();

	/**
	 * Returns the meta object for the reference '{@link process.StepResult#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Breakpoint</em>'.
	 * @see process.StepResult#getBreakpoint()
	 * @see #getStepResult()
	 * @generated
	 */
	EReference getStepResult_Breakpoint();

	/**
	 * Returns the meta object for class '{@link process.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see process.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference '{@link process.Context#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see process.Context#getFunction()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Function();

	/**
	 * Returns the meta object for the reference '{@link process.Context#getContainingThread <em>Containing Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Thread</em>'.
	 * @see process.Context#getContainingThread()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContainingThread();

	/**
	 * Returns the meta object for the attribute '{@link process.Context#getStepBeingExecutedIdx <em>Step Being Executed Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Being Executed Idx</em>'.
	 * @see process.Context#getStepBeingExecutedIdx()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_StepBeingExecutedIdx();

	/**
	 * Returns the meta object for class '{@link process.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see process.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the map '{@link process.Memory#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Cells</em>'.
	 * @see process.Memory#getCells()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Cells();

	/**
	 * Returns the meta object for the map '{@link process.Memory#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Global Variables</em>'.
	 * @see process.Memory#getGlobalVariables()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_GlobalVariables();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EClass getStringToStringEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringEntry()
	 * @generated
	 */
	EAttribute getStringToStringEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringEntry()
	 * @generated
	 */
	EAttribute getStringToStringEntry_Value();

	/**
	 * Returns the meta object for enum '{@link process.StepGoal <em>Step Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step Goal</em>'.
	 * @see process.StepGoal
	 * @generated
	 */
	EEnum getStepGoal();

	/**
	 * Returns the meta object for enum '{@link process.SteppingResult <em>Stepping Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stepping Result</em>'.
	 * @see process.SteppingResult
	 * @generated
	 */
	EEnum getSteppingResult();

	/**
	 * Returns the meta object for the reference '{@link process.FunctionExecution#getEntryStep <em>Entry Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Step</em>'.
	 * @see process.FunctionExecution#getEntryStep()
	 * @see #getFunctionExecution()
	 * @generated
	 */
	EReference getFunctionExecution_EntryStep();

	/**
	 * Returns the meta object for the reference '{@link process.FunctionExecution#getContainingThread <em>Containing Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Thread</em>'.
	 * @see process.FunctionExecution#getContainingThread()
	 * @see #getFunctionExecution()
	 * @generated
	 */
	EReference getFunctionExecution_ContainingThread();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessFactory getProcessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link process.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.ProcessImpl
		 * @see process.impl.ProcessPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__THREADS = eINSTANCE.getProcess_Threads();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STARTED = eINSTANCE.getProcess_Started();

		/**
		 * The meta object literal for the '<em><b>Group Thread Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__GROUP_THREAD_ID = eINSTANCE.getProcess_GroupThreadId();

		/**
		 * The meta object literal for the '<em><b>Process Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PROCESS_NUMBER = eINSTANCE.getProcess_ProcessNumber();

		/**
		 * The meta object literal for the '<em><b>Active Threads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTIVE_THREADS = eINSTANCE.getProcess_ActiveThreads();

		/**
		 * The meta object literal for the '<em><b>Variable Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__VARIABLE_MANAGER = eINSTANCE.getProcess_VariableManager();

		/**
		 * The meta object literal for the '<em><b>Breakpoint Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__BREAKPOINT_MANAGER = eINSTANCE.getProcess_BreakpointManager();

		/**
		 * The meta object literal for the '<em><b>Executable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__EXECUTABLE_NAME = eINSTANCE.getProcess_ExecutableName();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__MEMORY = eINSTANCE.getProcess_Memory();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___START = eINSTANCE.getProcess__Start();

		/**
		 * The meta object literal for the '<em><b>Get Thread</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___GET_THREAD__INT = eINSTANCE.getProcess__GetThread__int();

		/**
		 * The meta object literal for the '{@link process.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.ThreadImpl
		 * @see process.impl.ProcessPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__ID = eINSTANCE.getThread_Id();

		/**
		 * The meta object literal for the '<em><b>All Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__ALL_STEPS = eINSTANCE.getThread_AllSteps();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__STARTED = eINSTANCE.getThread_Started();

		/**
		 * The meta object literal for the '<em><b>Stack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__STACK = eINSTANCE.getThread_Stack();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__RUNNING = eINSTANCE.getThread_Running();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__PROCESS = eINSTANCE.getThread_Process();

		/**
		 * The meta object literal for the '<em><b>Step To Execute Idx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__STEP_TO_EXECUTE_IDX = eINSTANCE.getThread_StepToExecuteIdx();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___STEP__STEPGOAL = eINSTANCE.getThread__Step__StepGoal();

		/**
		 * The meta object literal for the '<em><b>Get Stack Depth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_STACK_DEPTH = eINSTANCE.getThread__GetStackDepth();

		/**
		 * The meta object literal for the '<em><b>Get Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_FRAME__INT = eINSTANCE.getThread__GetFrame__int();

		/**
		 * The meta object literal for the '<em><b>Get Step To Execute Or Last One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAD___GET_STEP_TO_EXECUTE_OR_LAST_ONE = eINSTANCE.getThread__GetStepToExecuteOrLastOne();

		/**
		 * The meta object literal for the '{@link process.impl.FunctionExecutionImpl <em>Function Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.FunctionExecutionImpl
		 * @see process.impl.ProcessPackageImpl#getFunctionExecution()
		 * @generated
		 */
		EClass FUNCTION_EXECUTION = eINSTANCE.getFunctionExecution();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_EXECUTION__CHILD = eINSTANCE.getFunctionExecution_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_EXECUTION__PARENT = eINSTANCE.getFunctionExecution_Parent();

		/**
		 * The meta object literal for the '<em><b>Step Index Before Child</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_EXECUTION__STEP_INDEX_BEFORE_CHILD = eINSTANCE.getFunctionExecution_StepIndexBeforeChild();

		/**
		 * The meta object literal for the '<em><b>Local Name To Memory</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_EXECUTION__LOCAL_NAME_TO_MEMORY = eINSTANCE.getFunctionExecution_LocalNameToMemory();

		/**
		 * The meta object literal for the '<em><b>Get Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_EXECUTION___GET_VARIABLE__STRING = eINSTANCE.getFunctionExecution__GetVariable__String();

		/**
		 * The meta object literal for the '<em><b>Get Function Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_EXECUTION___GET_FUNCTION_NAME = eINSTANCE.getFunctionExecution__GetFunctionName();

		/**
		 * The meta object literal for the '<em><b>Get File Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_EXECUTION___GET_FILE_NAME = eINSTANCE.getFunctionExecution__GetFileName();

		/**
		 * The meta object literal for the '<em><b>Get Current Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_EXECUTION___GET_CURRENT_STEP = eINSTANCE.getFunctionExecution__GetCurrentStep();

		/**
		 * The meta object literal for the '<em><b>Get All Variables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_EXECUTION___GET_ALL_VARIABLES = eINSTANCE.getFunctionExecution__GetAllVariables();

		/**
		 * The meta object literal for the '{@link process.impl.VariableManagerImpl <em>Variable Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.VariableManagerImpl
		 * @see process.impl.ProcessPackageImpl#getVariableManager()
		 * @generated
		 */
		EClass VARIABLE_MANAGER = eINSTANCE.getVariableManager();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_MANAGER__VARIABLES = eINSTANCE.getVariableManager_Variables();

		/**
		 * The meta object literal for the '<em><b>Previous Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_MANAGER__PREVIOUS_VALUES = eINSTANCE.getVariableManager_PreviousValues();

		/**
		 * The meta object literal for the '<em><b>Get Assignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_MANAGER___GET_ASSIGNMENT__STRING = eINSTANCE.getVariableManager__GetAssignment__String();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_MANAGER___GET_VALUE__STRING = eINSTANCE.getVariableManager__GetValue__String();

		/**
		 * The meta object literal for the '{@link process.impl.StringToAssignmentEntryImpl <em>String To Assignment Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.StringToAssignmentEntryImpl
		 * @see process.impl.ProcessPackageImpl#getStringToAssignmentEntry()
		 * @generated
		 */
		EClass STRING_TO_ASSIGNMENT_ENTRY = eINSTANCE.getStringToAssignmentEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_ASSIGNMENT_ENTRY__KEY = eINSTANCE.getStringToAssignmentEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_ASSIGNMENT_ENTRY__VALUE = eINSTANCE.getStringToAssignmentEntry_Value();

		/**
		 * The meta object literal for the '{@link process.impl.BreakpointManagerImpl <em>Breakpoint Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.BreakpointManagerImpl
		 * @see process.impl.ProcessPackageImpl#getBreakpointManager()
		 * @generated
		 */
		EClass BREAKPOINT_MANAGER = eINSTANCE.getBreakpointManager();

		/**
		 * The meta object literal for the '<em><b>Breakpoints By Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION = eINSTANCE.getBreakpointManager_BreakpointsByLocation();

		/**
		 * The meta object literal for the '<em><b>Breakpoints By Id</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID = eINSTANCE.getBreakpointManager_BreakpointsById();

		/**
		 * The meta object literal for the '<em><b>Has Breakpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BREAKPOINT_MANAGER___HAS_BREAKPOINT__FUNCTIONEXECUTION_STEP = eINSTANCE.getBreakpointManager__HasBreakpoint__FunctionExecution_Step();

		/**
		 * The meta object literal for the '{@link process.impl.StringToBreakpointEntryImpl <em>String To Breakpoint Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.StringToBreakpointEntryImpl
		 * @see process.impl.ProcessPackageImpl#getStringToBreakpointEntry()
		 * @generated
		 */
		EClass STRING_TO_BREAKPOINT_ENTRY = eINSTANCE.getStringToBreakpointEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_BREAKPOINT_ENTRY__KEY = eINSTANCE.getStringToBreakpointEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_BREAKPOINT_ENTRY__VALUE = eINSTANCE.getStringToBreakpointEntry_Value();

		/**
		 * The meta object literal for the '{@link process.impl.BreakpointImpl <em>Breakpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.BreakpointImpl
		 * @see process.impl.ProcessPackageImpl#getBreakpoint()
		 * @generated
		 */
		EClass BREAKPOINT = eINSTANCE.getBreakpoint();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINT__ENABLED = eINSTANCE.getBreakpoint_Enabled();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINT__ID = eINSTANCE.getBreakpoint_Id();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINT__FILE = eINSTANCE.getBreakpoint_File();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINT__LINE = eINSTANCE.getBreakpoint_Line();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINT__FUNCTION_NAME = eINSTANCE.getBreakpoint_FunctionName();

		/**
		 * The meta object literal for the '{@link process.impl.StepResultImpl <em>Step Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.StepResultImpl
		 * @see process.impl.ProcessPackageImpl#getStepResult()
		 * @generated
		 */
		EClass STEP_RESULT = eINSTANCE.getStepResult();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_RESULT__CODE = eINSTANCE.getStepResult_Code();

		/**
		 * The meta object literal for the '<em><b>Step Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_RESULT__STEP_DONE = eINSTANCE.getStepResult_StepDone();

		/**
		 * The meta object literal for the '<em><b>Line Executed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_RESULT__LINE_EXECUTED = eINSTANCE.getStepResult_LineExecuted();

		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_RESULT__BREAKPOINT = eINSTANCE.getStepResult_Breakpoint();

		/**
		 * The meta object literal for the '{@link process.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.ContextImpl
		 * @see process.impl.ProcessPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__FUNCTION = eINSTANCE.getContext_Function();

		/**
		 * The meta object literal for the '<em><b>Containing Thread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTAINING_THREAD = eINSTANCE.getContext_ContainingThread();

		/**
		 * The meta object literal for the '<em><b>Step Being Executed Idx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__STEP_BEING_EXECUTED_IDX = eINSTANCE.getContext_StepBeingExecutedIdx();

		/**
		 * The meta object literal for the '{@link process.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.MemoryImpl
		 * @see process.impl.ProcessPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__CELLS = eINSTANCE.getMemory_Cells();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__GLOBAL_VARIABLES = eINSTANCE.getMemory_GlobalVariables();

		/**
		 * The meta object literal for the '{@link process.impl.StringToStringEntryImpl <em>String To String Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.StringToStringEntryImpl
		 * @see process.impl.ProcessPackageImpl#getStringToStringEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_ENTRY = eINSTANCE.getStringToStringEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_ENTRY__KEY = eINSTANCE.getStringToStringEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_ENTRY__VALUE = eINSTANCE.getStringToStringEntry_Value();

		/**
		 * The meta object literal for the '{@link process.StepGoal <em>Step Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.StepGoal
		 * @see process.impl.ProcessPackageImpl#getStepGoal()
		 * @generated
		 */
		EEnum STEP_GOAL = eINSTANCE.getStepGoal();

		/**
		 * The meta object literal for the '{@link process.SteppingResult <em>Stepping Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.SteppingResult
		 * @see process.impl.ProcessPackageImpl#getSteppingResult()
		 * @generated
		 */
		EEnum STEPPING_RESULT = eINSTANCE.getSteppingResult();

		/**
		 * The meta object literal for the '<em><b>Entry Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_EXECUTION__ENTRY_STEP = eINSTANCE.getFunctionExecution_EntryStep();

		/**
		 * The meta object literal for the '<em><b>Containing Thread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_EXECUTION__CONTAINING_THREAD = eINSTANCE.getFunctionExecution_ContainingThread();

	}

} //ProcessPackage
