/**
 */
package trace.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import process.ProcessPackage;
import process.impl.ProcessPackageImpl;
import trace.ArrayValue;
import trace.Assignment;
import trace.Failure;
import trace.FunctionCall;
import trace.FunctionReturn;
import trace.Location;
import trace.LocationOnly;
import trace.SimpleValue;
import trace.Step;
import trace.StructValue;
import trace.Trace;
import trace.TraceFactory;
import trace.TracePackage;
import trace.UnionValue;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracePackageImpl extends EPackageImpl implements TracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationOnlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameToValueMapEClass = null;

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
	 * @see trace.TracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracePackageImpl() {
		super(eNS_URI, TraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracePackage init() {
		if (isInited) return (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

		// Obtain or create and register package
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI) : ProcessPackage.eINSTANCE);

		// Create package meta-data objects
		theTracePackage.createPackageContents();
		theProcessPackage.createPackageContents();

		// Initialize created meta-data
		theTracePackage.initializePackageContents();
		theProcessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, theTracePackage);
		return theTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Id() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_DisplayName() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_BaseName() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Value() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Parameter() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssignment__GetValue__String() {
		return assignmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssignment__GetType() {
		return assignmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure() {
		return failureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailure_Reason() {
		return (EAttribute)failureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionCall_Id() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionCall_DisplayName() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionReturn() {
		return functionReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionReturn_Id() {
		return (EAttribute)functionReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionReturn_DisplayName() {
		return (EAttribute)functionReturnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_File() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Function() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Line() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationOnly() {
		return locationOnlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Number() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Location() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Thread() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStep__Interpret__Context() {
		return stepEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Steps() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Type() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__GetValue__String() {
		return valueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__GetChildrenCount() {
		return valueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__GetUserFriendlyRepresentation__boolean() {
		return valueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__Compare__String_Value() {
		return valueEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__ListChildren__String() {
		return valueEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionValue() {
		return unionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructValue() {
		return structValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructValue_Values() {
		return (EReference)structValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValue_Values() {
		return (EReference)arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleValue() {
		return simpleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleValue_Value() {
		return (EAttribute)simpleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameToValueMap() {
		return nameToValueMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameToValueMap_Key() {
		return (EAttribute)nameToValueMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameToValueMap_Value() {
		return (EReference)nameToValueMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFactory getTraceFactory() {
		return (TraceFactory)getEFactoryInstance();
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
		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__VALUES);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__ID);
		createEAttribute(assignmentEClass, ASSIGNMENT__DISPLAY_NAME);
		createEAttribute(assignmentEClass, ASSIGNMENT__BASE_NAME);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);
		createEAttribute(assignmentEClass, ASSIGNMENT__PARAMETER);
		createEOperation(assignmentEClass, ASSIGNMENT___GET_VALUE__STRING);
		createEOperation(assignmentEClass, ASSIGNMENT___GET_TYPE);

		failureEClass = createEClass(FAILURE);
		createEAttribute(failureEClass, FAILURE__REASON);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEAttribute(functionCallEClass, FUNCTION_CALL__ID);
		createEAttribute(functionCallEClass, FUNCTION_CALL__DISPLAY_NAME);

		functionReturnEClass = createEClass(FUNCTION_RETURN);
		createEAttribute(functionReturnEClass, FUNCTION_RETURN__ID);
		createEAttribute(functionReturnEClass, FUNCTION_RETURN__DISPLAY_NAME);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__FILE);
		createEAttribute(locationEClass, LOCATION__FUNCTION);
		createEAttribute(locationEClass, LOCATION__LINE);

		locationOnlyEClass = createEClass(LOCATION_ONLY);

		nameToValueMapEClass = createEClass(NAME_TO_VALUE_MAP);
		createEReference(nameToValueMapEClass, NAME_TO_VALUE_MAP__VALUE);
		createEAttribute(nameToValueMapEClass, NAME_TO_VALUE_MAP__KEY);

		simpleValueEClass = createEClass(SIMPLE_VALUE);
		createEAttribute(simpleValueEClass, SIMPLE_VALUE__VALUE);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__NUMBER);
		createEReference(stepEClass, STEP__LOCATION);
		createEAttribute(stepEClass, STEP__THREAD);
		createEOperation(stepEClass, STEP___INTERPRET__CONTEXT);

		structValueEClass = createEClass(STRUCT_VALUE);
		createEReference(structValueEClass, STRUCT_VALUE__VALUES);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__STEPS);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__TYPE);
		createEOperation(valueEClass, VALUE___GET_VALUE__STRING);
		createEOperation(valueEClass, VALUE___GET_CHILDREN_COUNT);
		createEOperation(valueEClass, VALUE___GET_USER_FRIENDLY_REPRESENTATION__BOOLEAN);
		createEOperation(valueEClass, VALUE___COMPARE__STRING_VALUE);
		createEOperation(valueEClass, VALUE___LIST_CHILDREN__STRING);

		unionValueEClass = createEClass(UNION_VALUE);
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
		ProcessPackage theProcessPackage = (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrayValueEClass.getESuperTypes().add(this.getValue());
		assignmentEClass.getESuperTypes().add(this.getStep());
		failureEClass.getESuperTypes().add(this.getStep());
		functionCallEClass.getESuperTypes().add(this.getStep());
		functionReturnEClass.getESuperTypes().add(this.getStep());
		locationOnlyEClass.getESuperTypes().add(this.getStep());
		simpleValueEClass.getESuperTypes().add(this.getValue());
		structValueEClass.getESuperTypes().add(this.getValue());
		unionValueEClass.getESuperTypes().add(this.getStructValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Values(), this.getValue(), null, "values", null, 0, -1, ArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_BaseName(), theXMLTypePackage.getString(), "baseName", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), this.getValue(), null, "value", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_Parameter(), theXMLTypePackage.getBoolean(), "parameter", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAssignment__GetValue__String(), this.getValue(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssignment__GetType(), theXMLTypePackage.getString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(failureEClass, Failure.class, "Failure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailure_Reason(), theXMLTypePackage.getString(), "reason", null, 1, 1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionCall_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionCall_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionReturnEClass, FunctionReturn.class, "FunctionReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionReturn_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, FunctionReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionReturn_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 1, 1, FunctionReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_File(), theXMLTypePackage.getString(), "file", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Function(), theXMLTypePackage.getString(), "function", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Line(), theXMLTypePackage.getInt(), "line", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationOnlyEClass, LocationOnly.class, "LocationOnly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameToValueMapEClass, Map.Entry.class, "NameToValueMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameToValueMap_Value(), this.getValue(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameToValueMap_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleValueEClass, SimpleValue.class, "SimpleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleValue_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, SimpleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Number(), theXMLTypePackage.getInt(), "number", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Location(), this.getLocation(), null, "location", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Thread(), theXMLTypePackage.getInt(), "thread", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStep__Interpret__Context(), theProcessPackage.getStepResult(), "interpret", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theProcessPackage.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(structValueEClass, StructValue.class, "StructValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructValue_Values(), this.getNameToValueMap(), null, "values", null, 0, -1, StructValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Steps(), this.getStep(), null, "steps", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getValue__GetValue__String(), this.getValue(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getValue__GetChildrenCount(), theXMLTypePackage.getInt(), "getChildrenCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValue__GetUserFriendlyRepresentation__boolean(), theXMLTypePackage.getString(), "getUserFriendlyRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getBoolean(), "abridged", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValue__Compare__String_Value(), null, "compare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "parentPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValue(), "old", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getValue__ListChildren__String(), null, "listChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "requestedExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(unionValueEClass, UnionValue.class, "UnionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (arrayValueEClass, 
		   source, 
		   new String[] {
			 "name", "ArrayValue",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getArrayValue_Values(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "values"
		   });	
		addAnnotation
		  (assignmentEClass, 
		   source, 
		   new String[] {
			 "name", "Assignment",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAssignment_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });	
		addAnnotation
		  (getAssignment_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "displayName"
		   });	
		addAnnotation
		  (getAssignment_BaseName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "baseName"
		   });	
		addAnnotation
		  (getAssignment_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });	
		addAnnotation
		  (failureEClass, 
		   source, 
		   new String[] {
			 "name", "Failure",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFailure_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reason"
		   });	
		addAnnotation
		  (functionCallEClass, 
		   source, 
		   new String[] {
			 "name", "FunctionCall",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFunctionCall_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });	
		addAnnotation
		  (getFunctionCall_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "displayName"
		   });	
		addAnnotation
		  (functionReturnEClass, 
		   source, 
		   new String[] {
			 "name", "FunctionReturn",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFunctionReturn_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });	
		addAnnotation
		  (getFunctionReturn_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "displayName"
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "name", "Location",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLocation_File(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file"
		   });	
		addAnnotation
		  (getLocation_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function"
		   });	
		addAnnotation
		  (getLocation_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "line"
		   });	
		addAnnotation
		  (locationOnlyEClass, 
		   source, 
		   new String[] {
			 "name", "LocationOnly",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (nameToValueMapEClass, 
		   source, 
		   new String[] {
			 "name", "NameToValueMap",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNameToValueMap_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });	
		addAnnotation
		  (getNameToValueMap_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key"
		   });	
		addAnnotation
		  (simpleValueEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleValue",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSimpleValue_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });	
		addAnnotation
		  (stepEClass, 
		   source, 
		   new String[] {
			 "name", "Step",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStep_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number"
		   });	
		addAnnotation
		  (getStep_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location"
		   });	
		addAnnotation
		  (getStep_Thread(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thread"
		   });	
		addAnnotation
		  (structValueEClass, 
		   source, 
		   new String[] {
			 "name", "StructValue",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStructValue_Values(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "values"
		   });	
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "name", "Trace",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTrace_Steps(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "steps"
		   });	
		addAnnotation
		  (valueEClass, 
		   source, 
		   new String[] {
			 "name", "Value",
			 "kind", "empty"
		   });	
		addAnnotation
		  (unionValueEClass, 
		   source, 
		   new String[] {
			 "name", "UnionValue",
			 "kind", "elementOnly"
		   });
	}

} //TracePackageImpl
