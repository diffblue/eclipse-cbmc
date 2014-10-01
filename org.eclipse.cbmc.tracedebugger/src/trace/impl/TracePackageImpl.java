/**
 */
package trace.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import trace.Assignment;
import trace.Failure;
import trace.FunctionCall;
import trace.FunctionReturn;
import trace.Location;
import trace.LocationOnly;
import trace.Step;
import trace.Trace;
import trace.TraceFactory;
import trace.TracePackage;

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

		// Create package meta-data objects
		theTracePackage.createPackageContents();

		// Initialize created meta-data
		theTracePackage.initializePackageContents();

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
	public EAttribute getAssignment_Value() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_FullLhs() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_FullLhsValue() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Type() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_ValueExpression() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(7);
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
	public EReference getFunctionCall_FunctionLocation() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(2);
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
	public EReference getFunctionReturn_FunctionLocation() {
		return (EReference)functionReturnEClass.getEStructuralFeatures().get(2);
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
		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__ID);
		createEAttribute(assignmentEClass, ASSIGNMENT__DISPLAY_NAME);
		createEAttribute(assignmentEClass, ASSIGNMENT__BASE_NAME);
		createEAttribute(assignmentEClass, ASSIGNMENT__VALUE);
		createEAttribute(assignmentEClass, ASSIGNMENT__FULL_LHS);
		createEAttribute(assignmentEClass, ASSIGNMENT__FULL_LHS_VALUE);
		createEAttribute(assignmentEClass, ASSIGNMENT__TYPE);
		createEAttribute(assignmentEClass, ASSIGNMENT__VALUE_EXPRESSION);

		failureEClass = createEClass(FAILURE);
		createEAttribute(failureEClass, FAILURE__REASON);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEAttribute(functionCallEClass, FUNCTION_CALL__ID);
		createEAttribute(functionCallEClass, FUNCTION_CALL__DISPLAY_NAME);
		createEReference(functionCallEClass, FUNCTION_CALL__FUNCTION_LOCATION);

		functionReturnEClass = createEClass(FUNCTION_RETURN);
		createEAttribute(functionReturnEClass, FUNCTION_RETURN__ID);
		createEAttribute(functionReturnEClass, FUNCTION_RETURN__DISPLAY_NAME);
		createEReference(functionReturnEClass, FUNCTION_RETURN__FUNCTION_LOCATION);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__FILE);
		createEAttribute(locationEClass, LOCATION__FUNCTION);
		createEAttribute(locationEClass, LOCATION__LINE);

		locationOnlyEClass = createEClass(LOCATION_ONLY);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__NUMBER);
		createEReference(stepEClass, STEP__LOCATION);
		createEAttribute(stepEClass, STEP__THREAD);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__STEPS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assignmentEClass.getESuperTypes().add(this.getStep());
		failureEClass.getESuperTypes().add(this.getStep());
		functionCallEClass.getESuperTypes().add(this.getStep());
		functionReturnEClass.getESuperTypes().add(this.getStep());
		locationOnlyEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_BaseName(), theXMLTypePackage.getString(), "baseName", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_FullLhs(), theXMLTypePackage.getString(), "fullLhs", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_FullLhsValue(), theXMLTypePackage.getString(), "fullLhsValue", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_ValueExpression(), theXMLTypePackage.getString(), "valueExpression", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureEClass, Failure.class, "Failure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailure_Reason(), theXMLTypePackage.getString(), "reason", null, 1, 1, Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionCall_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionCall_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_FunctionLocation(), this.getLocation(), null, "functionLocation", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionReturnEClass, FunctionReturn.class, "FunctionReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionReturn_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, FunctionReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionReturn_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 1, 1, FunctionReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionReturn_FunctionLocation(), this.getLocation(), null, "functionLocation", null, 1, 1, FunctionReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_File(), theXMLTypePackage.getString(), "file", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Function(), theXMLTypePackage.getString(), "function", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Line(), theXMLTypePackage.getInt(), "line", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationOnlyEClass, LocationOnly.class, "LocationOnly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Number(), theXMLTypePackage.getInt(), "number", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Location(), this.getLocation(), null, "location", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Thread(), theXMLTypePackage.getInt(), "thread", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Steps(), this.getStep(), null, "steps", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getAssignment_FullLhs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fullLhs"
		   });	
		addAnnotation
		  (getAssignment_FullLhsValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fullLhsValue"
		   });	
		addAnnotation
		  (getAssignment_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });	
		addAnnotation
		  (getAssignment_ValueExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "valueExpression"
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
		  (getFunctionCall_FunctionLocation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location"
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
		  (getFunctionReturn_FunctionLocation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location"
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
	}

} //TracePackageImpl