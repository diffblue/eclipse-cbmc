/**
 */
package org.eclipse.cbmc.impl;

import org.eclipse.cbmc.CbmcFactory;
import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.cbmc.CommandOption;
import org.eclipse.cbmc.File;
import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyCategory;
import org.eclipse.cbmc.PropertyStatus;
import org.eclipse.cbmc.Results;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CbmcPackageImpl extends EPackageImpl implements CbmcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commandOptionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyStatusObjectEDataType = null;

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
	 * @see org.eclipse.cbmc.CbmcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CbmcPackageImpl() {
		super(eNS_URI, CbmcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CbmcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CbmcPackage init() {
		if (isInited) return (CbmcPackage)EPackage.Registry.INSTANCE.getEPackage(CbmcPackage.eNS_URI);

		// Obtain or create and register package
		CbmcPackageImpl theCbmcPackage = (CbmcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CbmcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CbmcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCbmcPackage.createPackageContents();

		// Initialize created meta-data
		theCbmcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCbmcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CbmcPackage.eNS_URI, theCbmcPackage);
		return theCbmcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Name() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Properties() {
		return (EReference)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Category() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Number() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Description() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_File() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Function() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Line() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Status() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_DetailsFile() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCategory() {
		return propertyCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCategory_Name() {
		return (EAttribute)propertyCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCategory_Properties() {
		return (EReference)propertyCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResults() {
		return resultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResults_Properties() {
		return (EReference)resultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResults_Files() {
		return (EReference)resultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResults_Categories() {
		return (EReference)resultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandOption() {
		return commandOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyStatus() {
		return propertyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommandOptionObject() {
		return commandOptionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyStatusObject() {
		return propertyStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbmcFactory getCbmcFactory() {
		return (CbmcFactory)getEFactoryInstance();
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
		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__NAME);
		createEReference(fileEClass, FILE__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__CATEGORY);
		createEAttribute(propertyEClass, PROPERTY__NUMBER);
		createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);
		createEReference(propertyEClass, PROPERTY__FILE);
		createEAttribute(propertyEClass, PROPERTY__FUNCTION);
		createEAttribute(propertyEClass, PROPERTY__LINE);
		createEAttribute(propertyEClass, PROPERTY__STATUS);
		createEAttribute(propertyEClass, PROPERTY__DETAILS_FILE);

		propertyCategoryEClass = createEClass(PROPERTY_CATEGORY);
		createEAttribute(propertyCategoryEClass, PROPERTY_CATEGORY__NAME);
		createEReference(propertyCategoryEClass, PROPERTY_CATEGORY__PROPERTIES);

		resultsEClass = createEClass(RESULTS);
		createEReference(resultsEClass, RESULTS__PROPERTIES);
		createEReference(resultsEClass, RESULTS__FILES);
		createEReference(resultsEClass, RESULTS__CATEGORIES);

		// Create enums
		commandOptionEEnum = createEEnum(COMMAND_OPTION);
		propertyStatusEEnum = createEEnum(PROPERTY_STATUS);

		// Create data types
		commandOptionObjectEDataType = createEDataType(COMMAND_OPTION_OBJECT);
		propertyStatusObjectEDataType = createEDataType(PROPERTY_STATUS_OBJECT);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_Properties(), this.getProperty(), this.getProperty_File(), "properties", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Category(), this.getPropertyCategory(), this.getPropertyCategory_Properties(), "category", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Number(), theXMLTypePackage.getString(), "number", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_File(), this.getFile(), this.getFile_Properties(), "file", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Function(), theXMLTypePackage.getString(), "function", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Line(), theXMLTypePackage.getInt(), "line", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Status(), this.getPropertyStatus(), "status", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_DetailsFile(), theXMLTypePackage.getString(), "detailsFile", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCategoryEClass, PropertyCategory.class, "PropertyCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyCategory_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCategory_Properties(), this.getProperty(), this.getProperty_Category(), "properties", null, 0, -1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsEClass, Results.class, "Results", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResults_Properties(), this.getProperty(), null, "properties", null, 0, -1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResults_Files(), this.getFile(), null, "files", null, 0, -1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResults_Categories(), this.getPropertyCategory(), null, "categories", null, 0, -1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(commandOptionEEnum, CommandOption.class, "CommandOption");
		addEEnumLiteral(commandOptionEEnum, CommandOption.NO_ASSERTIONS);
		addEEnumLiteral(commandOptionEEnum, CommandOption.NO_ASSUMPTIONS);
		addEEnumLiteral(commandOptionEEnum, CommandOption.DIV_BY_ZERO_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.POINTER_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.SIGNED_OVERFLOW_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.UNSIGNED_OVERFLOW_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.NAN_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.BOUNDS_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.UNDEFINED_SHIFT_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.MEMORY_LEAK_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.FLOAT_OVERFLOW_CHECK);
		addEEnumLiteral(commandOptionEEnum, CommandOption.COVER_ASSERTIONS);

		initEEnum(propertyStatusEEnum, PropertyStatus.class, "PropertyStatus");
		addEEnumLiteral(propertyStatusEEnum, PropertyStatus.PENDING);
		addEEnumLiteral(propertyStatusEEnum, PropertyStatus.RUNNING);
		addEEnumLiteral(propertyStatusEEnum, PropertyStatus.SUCCEEDED);
		addEEnumLiteral(propertyStatusEEnum, PropertyStatus.FAILED);

		// Initialize data types
		initEDataType(commandOptionObjectEDataType, CommandOption.class, "CommandOptionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyStatusObjectEDataType, PropertyStatus.class, "PropertyStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (commandOptionEEnum, 
		   source, 
		   new String[] {
			 "name", "CommandOption"
		   });		
		addAnnotation
		  (commandOptionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CommandOption:Object",
			 "baseType", "CommandOption"
		   });		
		addAnnotation
		  (fileEClass, 
		   source, 
		   new String[] {
			 "name", "File",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFile_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getFile_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties"
		   });		
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "Property",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProperty_Category(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "category"
		   });		
		addAnnotation
		  (getProperty_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number"
		   });		
		addAnnotation
		  (getProperty_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getProperty_File(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "file"
		   });		
		addAnnotation
		  (getProperty_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function"
		   });		
		addAnnotation
		  (getProperty_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "line"
		   });		
		addAnnotation
		  (getProperty_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status"
		   });		
		addAnnotation
		  (getProperty_DetailsFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "detailsFile"
		   });		
		addAnnotation
		  (propertyCategoryEClass, 
		   source, 
		   new String[] {
			 "name", "PropertyCategory",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPropertyCategory_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getPropertyCategory_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties"
		   });		
		addAnnotation
		  (propertyStatusEEnum, 
		   source, 
		   new String[] {
			 "name", "PropertyStatus"
		   });		
		addAnnotation
		  (propertyStatusObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PropertyStatus:Object",
			 "baseType", "PropertyStatus"
		   });		
		addAnnotation
		  (resultsEClass, 
		   source, 
		   new String[] {
			 "name", "Results",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResults_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties"
		   });		
		addAnnotation
		  (getResults_Files(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "files"
		   });		
		addAnnotation
		  (getResults_Categories(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "categories"
		   });
	}

} //CbmcPackageImpl
