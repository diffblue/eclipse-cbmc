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
package trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/cbmc/debug/trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracePackage eINSTANCE = trace.impl.TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link trace.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StepImpl
	 * @see trace.impl.TracePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 9;

	/**
	 * The meta object id for the '{@link trace.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.AssignmentImpl
	 * @see trace.impl.TracePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 1;

	/**
	 * The meta object id for the '{@link trace.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.FailureImpl
	 * @see trace.impl.TracePackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 2;

	/**
	 * The meta object id for the '{@link trace.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.FunctionCallImpl
	 * @see trace.impl.TracePackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 3;

	/**
	 * The meta object id for the '{@link trace.impl.FunctionReturnImpl <em>Function Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.FunctionReturnImpl
	 * @see trace.impl.TracePackageImpl#getFunctionReturn()
	 * @generated
	 */
	int FUNCTION_RETURN = 4;

	/**
	 * The meta object id for the '{@link trace.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LocationImpl
	 * @see trace.impl.TracePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The meta object id for the '{@link trace.impl.LocationOnlyImpl <em>Location Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.LocationOnlyImpl
	 * @see trace.impl.TracePackageImpl#getLocationOnly()
	 * @generated
	 */
	int LOCATION_ONLY = 6;

	/**
	 * The meta object id for the '{@link trace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TraceImpl
	 * @see trace.impl.TracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 11;

	/**
	 * The meta object id for the '{@link trace.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.ValueImpl
	 * @see trace.impl.TracePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_VALUE__STRING = 0;

	/**
	 * The operation id for the '<em>Get Children Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_CHILDREN_COUNT = 1;

	/**
	 * The operation id for the '<em>Get User Friendly Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___COMPARE__STRING_VALUE = 3;

	/**
	 * The operation id for the '<em>List Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___LIST_CHILDREN__STRING = 4;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link trace.impl.StructValueImpl <em>Struct Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.StructValueImpl
	 * @see trace.impl.TracePackageImpl#getStructValue()
	 * @generated
	 */
	int STRUCT_VALUE = 10;

	/**
	 * The meta object id for the '{@link trace.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.ArrayValueImpl
	 * @see trace.impl.TracePackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__TYPE = VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE___GET_VALUE__STRING = VALUE___GET_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Children Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE___GET_CHILDREN_COUNT = VALUE___GET_CHILDREN_COUNT;

	/**
	 * The operation id for the '<em>Get User Friendly Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN = VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE___COMPARE__STRING_VALUE = VALUE___COMPARE__STRING_VALUE;

	/**
	 * The operation id for the '<em>List Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE___LIST_CHILDREN__STRING = VALUE___LIST_CHILDREN__STRING;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__THREAD = 2;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__HIDDEN = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Interpret</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___INTERPRET__CONTEXT = 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NUMBER = STEP__NUMBER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__THREAD = STEP__THREAD;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__HIDDEN = STEP__HIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ID = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DISPLAY_NAME = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__BASE_NAME = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assignment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNMENT_TYPE = STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STEP_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Interpret</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___INTERPRET__CONTEXT = STEP___INTERPRET__CONTEXT;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_VALUE__STRING = STEP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_TYPE = STEP_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = STEP_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__NUMBER = STEP__NUMBER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__THREAD = STEP__THREAD;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__HIDDEN = STEP__HIDDEN;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__REASON = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Interpret</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE___INTERPRET__CONTEXT = STEP___INTERPRET__CONTEXT;

	/**
	 * The number of operations of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NUMBER = STEP__NUMBER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__THREAD = STEP__THREAD;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__HIDDEN = STEP__HIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ID = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DISPLAY_NAME = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Interpret</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL___INTERPRET__CONTEXT = STEP___INTERPRET__CONTEXT;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN__NUMBER = STEP__NUMBER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN__THREAD = STEP__THREAD;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN__HIDDEN = STEP__HIDDEN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN__ID = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN__DISPLAY_NAME = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Interpret</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN___INTERPRET__CONTEXT = STEP___INTERPRET__CONTEXT;

	/**
	 * The number of operations of the '<em>Function Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FILE = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LINE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ONLY__NUMBER = STEP__NUMBER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ONLY__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ONLY__THREAD = STEP__THREAD;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ONLY__HIDDEN = STEP__HIDDEN;

	/**
	 * The number of structural features of the '<em>Location Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ONLY_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Interpret</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ONLY___INTERPRET__CONTEXT = STEP___INTERPRET__CONTEXT;

	/**
	 * The number of operations of the '<em>Location Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ONLY_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.SimpleValueImpl <em>Simple Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.SimpleValueImpl
	 * @see trace.impl.TracePackageImpl#getSimpleValue()
	 * @generated
	 */
	int SIMPLE_VALUE = 8;

	/**
	 * The meta object id for the '{@link trace.impl.NameToValueMapImpl <em>Name To Value Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.NameToValueMapImpl
	 * @see trace.impl.TracePackageImpl#getNameToValueMap()
	 * @generated
	 */
	int NAME_TO_VALUE_MAP = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TO_VALUE_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TO_VALUE_MAP__KEY = 1;

	/**
	 * The number of structural features of the '<em>Name To Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TO_VALUE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Name To Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TO_VALUE_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE__TYPE = VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE___GET_VALUE__STRING = VALUE___GET_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Children Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE___GET_CHILDREN_COUNT = VALUE___GET_CHILDREN_COUNT;

	/**
	 * The operation id for the '<em>Get User Friendly Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN = VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE___COMPARE__STRING_VALUE = VALUE___COMPARE__STRING_VALUE;

	/**
	 * The operation id for the '<em>List Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE___LIST_CHILDREN__STRING = VALUE___LIST_CHILDREN__STRING;

	/**
	 * The number of operations of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE__TYPE = VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE__VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE___GET_VALUE__STRING = VALUE___GET_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Children Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE___GET_CHILDREN_COUNT = VALUE___GET_CHILDREN_COUNT;

	/**
	 * The operation id for the '<em>Get User Friendly Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN = VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE___COMPARE__STRING_VALUE = VALUE___COMPARE__STRING_VALUE;

	/**
	 * The operation id for the '<em>List Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE___LIST_CHILDREN__STRING = VALUE___LIST_CHILDREN__STRING;

	/**
	 * The number of operations of the '<em>Struct Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STEPS = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link trace.impl.UnionValueImpl <em>Union Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.UnionValueImpl
	 * @see trace.impl.TracePackageImpl#getUnionValue()
	 * @generated
	 */
	int UNION_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE__TYPE = STRUCT_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE__VALUES = STRUCT_VALUE__VALUES;

	/**
	 * The number of structural features of the '<em>Union Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE_FEATURE_COUNT = STRUCT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE___GET_VALUE__STRING = STRUCT_VALUE___GET_VALUE__STRING;

	/**
	 * The operation id for the '<em>Get Children Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE___GET_CHILDREN_COUNT = STRUCT_VALUE___GET_CHILDREN_COUNT;

	/**
	 * The operation id for the '<em>Get User Friendly Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN = STRUCT_VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE___COMPARE__STRING_VALUE = STRUCT_VALUE___COMPARE__STRING_VALUE;

	/**
	 * The operation id for the '<em>List Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE___LIST_CHILDREN__STRING = STRUCT_VALUE___LIST_CHILDREN__STRING;

	/**
	 * The number of operations of the '<em>Union Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_VALUE_OPERATION_COUNT = STRUCT_VALUE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link trace.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.OutputImpl
	 * @see trace.impl.TracePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 14;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NUMBER = STEP__NUMBER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__THREAD = STEP__THREAD;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HIDDEN = STEP__HIDDEN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TEXT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Interpret</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___INTERPRET__CONTEXT = STEP___INTERPRET__CONTEXT;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link trace.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see trace.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link trace.Assignment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see trace.Assignment#getId()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Id();

	/**
	 * Returns the meta object for the attribute '{@link trace.Assignment#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see trace.Assignment#getDisplayName()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link trace.Assignment#getBaseName <em>Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Name</em>'.
	 * @see trace.Assignment#getBaseName()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_BaseName();

	/**
	 * Returns the meta object for the reference '{@link trace.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see trace.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for the attribute '{@link trace.Assignment#getAssignmentType <em>Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Type</em>'.
	 * @see trace.Assignment#getAssignmentType()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_AssignmentType();

	/**
	 * Returns the meta object for the '{@link trace.Assignment#getValue(java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see trace.Assignment#getValue(java.lang.String)
	 * @generated
	 */
	EOperation getAssignment__GetValue__String();

	/**
	 * Returns the meta object for the '{@link trace.Assignment#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see trace.Assignment#getType()
	 * @generated
	 */
	EOperation getAssignment__GetType();

	/**
	 * Returns the meta object for class '{@link trace.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see trace.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the meta object for the attribute '{@link trace.Failure#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see trace.Failure#getReason()
	 * @see #getFailure()
	 * @generated
	 */
	EAttribute getFailure_Reason();

	/**
	 * Returns the meta object for class '{@link trace.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see trace.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link trace.FunctionCall#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see trace.FunctionCall#getId()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_Id();

	/**
	 * Returns the meta object for the attribute '{@link trace.FunctionCall#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see trace.FunctionCall#getDisplayName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_DisplayName();

	/**
	 * Returns the meta object for class '{@link trace.FunctionReturn <em>Function Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Return</em>'.
	 * @see trace.FunctionReturn
	 * @generated
	 */
	EClass getFunctionReturn();

	/**
	 * Returns the meta object for the attribute '{@link trace.FunctionReturn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see trace.FunctionReturn#getId()
	 * @see #getFunctionReturn()
	 * @generated
	 */
	EAttribute getFunctionReturn_Id();

	/**
	 * Returns the meta object for the attribute '{@link trace.FunctionReturn#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see trace.FunctionReturn#getDisplayName()
	 * @see #getFunctionReturn()
	 * @generated
	 */
	EAttribute getFunctionReturn_DisplayName();

	/**
	 * Returns the meta object for class '{@link trace.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see trace.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link trace.Location#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see trace.Location#getFile()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_File();

	/**
	 * Returns the meta object for the attribute '{@link trace.Location#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see trace.Location#getFunction()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Function();

	/**
	 * Returns the meta object for the attribute '{@link trace.Location#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see trace.Location#getLine()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Line();

	/**
	 * Returns the meta object for class '{@link trace.LocationOnly <em>Location Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Only</em>'.
	 * @see trace.LocationOnly
	 * @generated
	 */
	EClass getLocationOnly();

	/**
	 * Returns the meta object for class '{@link trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see trace.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link trace.Step#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see trace.Step#getNumber()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Number();

	/**
	 * Returns the meta object for the containment reference '{@link trace.Step#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see trace.Step#getLocation()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Location();

	/**
	 * Returns the meta object for the attribute '{@link trace.Step#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread</em>'.
	 * @see trace.Step#getThread()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Thread();

	/**
	 * Returns the meta object for the attribute '{@link trace.Step#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see trace.Step#isHidden()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Hidden();

	/**
	 * Returns the meta object for the '{@link trace.Step#interpret(process.Context) <em>Interpret</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interpret</em>' operation.
	 * @see trace.Step#interpret(process.Context)
	 * @generated
	 */
	EOperation getStep__Interpret__Context();

	/**
	 * Returns the meta object for class '{@link trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see trace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.Trace#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see trace.Trace#getSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Steps();

	/**
	 * Returns the meta object for class '{@link trace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see trace.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link trace.Value#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see trace.Value#getType()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Type();

	/**
	 * Returns the meta object for the '{@link trace.Value#getValue(java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see trace.Value#getValue(java.lang.String)
	 * @generated
	 */
	EOperation getValue__GetValue__String();

	/**
	 * Returns the meta object for the '{@link trace.Value#getChildrenCount() <em>Get Children Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Children Count</em>' operation.
	 * @see trace.Value#getChildrenCount()
	 * @generated
	 */
	EOperation getValue__GetChildrenCount();

	/**
	 * Returns the meta object for the '{@link trace.Value#getUserFriendlyRepresentation(boolean) <em>Get User Friendly Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get User Friendly Representation</em>' operation.
	 * @see trace.Value#getUserFriendlyRepresentation(boolean)
	 * @generated
	 */
	EOperation getValue__GetUserFriendlyRepresentation__boolean();

	/**
	 * Returns the meta object for the '{@link trace.Value#compare(java.lang.String, trace.Value) <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see trace.Value#compare(java.lang.String, trace.Value)
	 * @generated
	 */
	EOperation getValue__Compare__String_Value();

	/**
	 * Returns the meta object for the '{@link trace.Value#listChildren(java.lang.String) <em>List Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Children</em>' operation.
	 * @see trace.Value#listChildren(java.lang.String)
	 * @generated
	 */
	EOperation getValue__ListChildren__String();

	/**
	 * Returns the meta object for class '{@link trace.UnionValue <em>Union Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Value</em>'.
	 * @see trace.UnionValue
	 * @generated
	 */
	EClass getUnionValue();

	/**
	 * Returns the meta object for class '{@link trace.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see trace.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link trace.Output#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see trace.Output#getText()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Text();

	/**
	 * Returns the meta object for class '{@link trace.StructValue <em>Struct Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Value</em>'.
	 * @see trace.StructValue
	 * @generated
	 */
	EClass getStructValue();

	/**
	 * Returns the meta object for the map '{@link trace.StructValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Values</em>'.
	 * @see trace.StructValue#getValues()
	 * @see #getStructValue()
	 * @generated
	 */
	EReference getStructValue_Values();

	/**
	 * Returns the meta object for class '{@link trace.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see trace.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the reference list '{@link trace.ArrayValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see trace.ArrayValue#getValues()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Values();

	/**
	 * Returns the meta object for class '{@link trace.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value</em>'.
	 * @see trace.SimpleValue
	 * @generated
	 */
	EClass getSimpleValue();

	/**
	 * Returns the meta object for the attribute '{@link trace.SimpleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see trace.SimpleValue#getValue()
	 * @see #getSimpleValue()
	 * @generated
	 */
	EAttribute getSimpleValue_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Name To Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name To Value Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="trace.Value" valueContainment="true" valueRequired="true"
	 *        valueExtendedMetaData="kind='element' name='value'"
	 *        keyDataType="org.eclipse.emf.ecore.xml.type.String" keyRequired="true"
	 *        keyExtendedMetaData="kind='element' name='key'"
	 *        extendedMetaData="name='NameToValueMap' kind='elementOnly'"
	 * @generated
	 */
	EClass getNameToValueMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNameToValueMap()
	 * @generated
	 */
	EAttribute getNameToValueMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNameToValueMap()
	 * @generated
	 */
	EReference getNameToValueMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceFactory getTraceFactory();

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
		 * The meta object literal for the '{@link trace.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.AssignmentImpl
		 * @see trace.impl.TracePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__ID = eINSTANCE.getAssignment_Id();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__DISPLAY_NAME = eINSTANCE.getAssignment_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__BASE_NAME = eINSTANCE.getAssignment_BaseName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Assignment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__ASSIGNMENT_TYPE = eINSTANCE.getAssignment_AssignmentType();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIGNMENT___GET_VALUE__STRING = eINSTANCE.getAssignment__GetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSIGNMENT___GET_TYPE = eINSTANCE.getAssignment__GetType();

		/**
		 * The meta object literal for the '{@link trace.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.FailureImpl
		 * @see trace.impl.TracePackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE__REASON = eINSTANCE.getFailure_Reason();

		/**
		 * The meta object literal for the '{@link trace.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.FunctionCallImpl
		 * @see trace.impl.TracePackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__ID = eINSTANCE.getFunctionCall_Id();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__DISPLAY_NAME = eINSTANCE.getFunctionCall_DisplayName();

		/**
		 * The meta object literal for the '{@link trace.impl.FunctionReturnImpl <em>Function Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.FunctionReturnImpl
		 * @see trace.impl.TracePackageImpl#getFunctionReturn()
		 * @generated
		 */
		EClass FUNCTION_RETURN = eINSTANCE.getFunctionReturn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RETURN__ID = eINSTANCE.getFunctionReturn_Id();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RETURN__DISPLAY_NAME = eINSTANCE.getFunctionReturn_DisplayName();

		/**
		 * The meta object literal for the '{@link trace.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LocationImpl
		 * @see trace.impl.TracePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__FILE = eINSTANCE.getLocation_File();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__FUNCTION = eINSTANCE.getLocation_Function();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LINE = eINSTANCE.getLocation_Line();

		/**
		 * The meta object literal for the '{@link trace.impl.LocationOnlyImpl <em>Location Only</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.LocationOnlyImpl
		 * @see trace.impl.TracePackageImpl#getLocationOnly()
		 * @generated
		 */
		EClass LOCATION_ONLY = eINSTANCE.getLocationOnly();

		/**
		 * The meta object literal for the '{@link trace.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StepImpl
		 * @see trace.impl.TracePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NUMBER = eINSTANCE.getStep_Number();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__LOCATION = eINSTANCE.getStep_Location();

		/**
		 * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__THREAD = eINSTANCE.getStep_Thread();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__HIDDEN = eINSTANCE.getStep_Hidden();

		/**
		 * The meta object literal for the '<em><b>Interpret</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STEP___INTERPRET__CONTEXT = eINSTANCE.getStep__Interpret__Context();

		/**
		 * The meta object literal for the '{@link trace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TraceImpl
		 * @see trace.impl.TracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STEPS = eINSTANCE.getTrace_Steps();

		/**
		 * The meta object literal for the '{@link trace.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.ValueImpl
		 * @see trace.impl.TracePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__TYPE = eINSTANCE.getValue_Type();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___GET_VALUE__STRING = eINSTANCE.getValue__GetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Children Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___GET_CHILDREN_COUNT = eINSTANCE.getValue__GetChildrenCount();

		/**
		 * The meta object literal for the '<em><b>Get User Friendly Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN = eINSTANCE.getValue__GetUserFriendlyRepresentation__boolean();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___COMPARE__STRING_VALUE = eINSTANCE.getValue__Compare__String_Value();

		/**
		 * The meta object literal for the '<em><b>List Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___LIST_CHILDREN__STRING = eINSTANCE.getValue__ListChildren__String();

		/**
		 * The meta object literal for the '{@link trace.impl.UnionValueImpl <em>Union Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.UnionValueImpl
		 * @see trace.impl.TracePackageImpl#getUnionValue()
		 * @generated
		 */
		EClass UNION_VALUE = eINSTANCE.getUnionValue();

		/**
		 * The meta object literal for the '{@link trace.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.OutputImpl
		 * @see trace.impl.TracePackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TEXT = eINSTANCE.getOutput_Text();

		/**
		 * The meta object literal for the '{@link trace.impl.StructValueImpl <em>Struct Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.StructValueImpl
		 * @see trace.impl.TracePackageImpl#getStructValue()
		 * @generated
		 */
		EClass STRUCT_VALUE = eINSTANCE.getStructValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_VALUE__VALUES = eINSTANCE.getStructValue_Values();

		/**
		 * The meta object literal for the '{@link trace.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.ArrayValueImpl
		 * @see trace.impl.TracePackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__VALUES = eINSTANCE.getArrayValue_Values();

		/**
		 * The meta object literal for the '{@link trace.impl.SimpleValueImpl <em>Simple Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.SimpleValueImpl
		 * @see trace.impl.TracePackageImpl#getSimpleValue()
		 * @generated
		 */
		EClass SIMPLE_VALUE = eINSTANCE.getSimpleValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VALUE__VALUE = eINSTANCE.getSimpleValue_Value();

		/**
		 * The meta object literal for the '{@link trace.impl.NameToValueMapImpl <em>Name To Value Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.NameToValueMapImpl
		 * @see trace.impl.TracePackageImpl#getNameToValueMap()
		 * @generated
		 */
		EClass NAME_TO_VALUE_MAP = eINSTANCE.getNameToValueMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TO_VALUE_MAP__KEY = eINSTANCE.getNameToValueMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_TO_VALUE_MAP__VALUE = eINSTANCE.getNameToValueMap_Value();

	}

} //TracePackage
