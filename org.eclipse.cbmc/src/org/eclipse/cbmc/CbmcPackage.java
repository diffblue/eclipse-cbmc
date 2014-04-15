/**
 */
package org.eclipse.cbmc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.cbmc.CbmcFactory
 * @model kind="package"
 * @generated
 */
public interface CbmcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cbmc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/cbmc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cbmc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CbmcPackage eINSTANCE = org.eclipse.cbmc.impl.CbmcPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.impl.FileImpl
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.impl.PropertyImpl
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FILE = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LINE = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Details File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DETAILS_FILE = 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.impl.PropertyCategoryImpl <em>Property Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.impl.PropertyCategoryImpl
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyCategory()
	 * @generated
	 */
	int PROPERTY_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Property Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.impl.ResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.impl.ResultsImpl
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getResults()
	 * @generated
	 */
	int RESULTS = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__FILES = 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__CATEGORIES = 2;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.CommandOption <em>Command Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.CommandOption
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getCommandOption()
	 * @generated
	 */
	int COMMAND_OPTION = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.PropertyStatus <em>Property Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyStatus()
	 * @generated
	 */
	int PROPERTY_STATUS = 5;

	/**
	 * The meta object id for the '<em>Command Option Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.CommandOption
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getCommandOptionObject()
	 * @generated
	 */
	int COMMAND_OPTION_OBJECT = 6;

	/**
	 * The meta object id for the '<em>Property Status Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyStatusObject()
	 * @generated
	 */
	int PROPERTY_STATUS_OBJECT = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cbmc.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.cbmc.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cbmc.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cbmc.File#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see org.eclipse.cbmc.File#getProperties()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cbmc.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.cbmc.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cbmc.Property#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.eclipse.cbmc.Property#getCategory()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Property#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.cbmc.Property#getNumber()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.cbmc.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cbmc.Property#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see org.eclipse.cbmc.Property#getFile()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_File();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Property#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.eclipse.cbmc.Property#getFunction()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Property#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.cbmc.Property#getLine()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Property#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.cbmc.Property#getStatus()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Property#getDetailsFile <em>Details File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details File</em>'.
	 * @see org.eclipse.cbmc.Property#getDetailsFile()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DetailsFile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cbmc.PropertyCategory <em>Property Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Category</em>'.
	 * @see org.eclipse.cbmc.PropertyCategory
	 * @generated
	 */
	EClass getPropertyCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.PropertyCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cbmc.PropertyCategory#getName()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EAttribute getPropertyCategory_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cbmc.PropertyCategory#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see org.eclipse.cbmc.PropertyCategory#getProperties()
	 * @see #getPropertyCategory()
	 * @generated
	 */
	EReference getPropertyCategory_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cbmc.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see org.eclipse.cbmc.Results
	 * @generated
	 */
	EClass getResults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cbmc.Results#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.cbmc.Results#getProperties()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cbmc.Results#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.eclipse.cbmc.Results#getFiles()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cbmc.Results#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.cbmc.Results#getCategories()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Categories();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cbmc.CommandOption <em>Command Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Option</em>'.
	 * @see org.eclipse.cbmc.CommandOption
	 * @generated
	 */
	EEnum getCommandOption();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cbmc.PropertyStatus <em>Property Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Status</em>'.
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @generated
	 */
	EEnum getPropertyStatus();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.cbmc.CommandOption <em>Command Option Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Command Option Object</em>'.
	 * @see org.eclipse.cbmc.CommandOption
	 * @model instanceClass="org.eclipse.cbmc.CommandOption"
	 *        extendedMetaData="name='CommandOption:Object' baseType='CommandOption'"
	 * @generated
	 */
	EDataType getCommandOptionObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.cbmc.PropertyStatus <em>Property Status Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Status Object</em>'.
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @model instanceClass="org.eclipse.cbmc.PropertyStatus"
	 *        extendedMetaData="name='PropertyStatus:Object' baseType='PropertyStatus'"
	 * @generated
	 */
	EDataType getPropertyStatusObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CbmcFactory getCbmcFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cbmc.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.impl.FileImpl
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__PROPERTIES = eINSTANCE.getFile_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.cbmc.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.impl.PropertyImpl
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CATEGORY = eINSTANCE.getProperty_Category();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NUMBER = eINSTANCE.getProperty_Number();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__FILE = eINSTANCE.getProperty_File();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__FUNCTION = eINSTANCE.getProperty_Function();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LINE = eINSTANCE.getProperty_Line();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__STATUS = eINSTANCE.getProperty_Status();

		/**
		 * The meta object literal for the '<em><b>Details File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DETAILS_FILE = eINSTANCE.getProperty_DetailsFile();

		/**
		 * The meta object literal for the '{@link org.eclipse.cbmc.impl.PropertyCategoryImpl <em>Property Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.impl.PropertyCategoryImpl
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyCategory()
		 * @generated
		 */
		EClass PROPERTY_CATEGORY = eINSTANCE.getPropertyCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CATEGORY__NAME = eINSTANCE.getPropertyCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CATEGORY__PROPERTIES = eINSTANCE.getPropertyCategory_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.cbmc.impl.ResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.impl.ResultsImpl
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getResults()
		 * @generated
		 */
		EClass RESULTS = eINSTANCE.getResults();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__PROPERTIES = eINSTANCE.getResults_Properties();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__FILES = eINSTANCE.getResults_Files();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__CATEGORIES = eINSTANCE.getResults_Categories();

		/**
		 * The meta object literal for the '{@link org.eclipse.cbmc.CommandOption <em>Command Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.CommandOption
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getCommandOption()
		 * @generated
		 */
		EEnum COMMAND_OPTION = eINSTANCE.getCommandOption();

		/**
		 * The meta object literal for the '{@link org.eclipse.cbmc.PropertyStatus <em>Property Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.PropertyStatus
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyStatus()
		 * @generated
		 */
		EEnum PROPERTY_STATUS = eINSTANCE.getPropertyStatus();

		/**
		 * The meta object literal for the '<em>Command Option Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.CommandOption
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getCommandOptionObject()
		 * @generated
		 */
		EDataType COMMAND_OPTION_OBJECT = eINSTANCE.getCommandOptionObject();

		/**
		 * The meta object literal for the '<em>Property Status Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.PropertyStatus
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyStatusObject()
		 * @generated
		 */
		EDataType PROPERTY_STATUS_OBJECT = eINSTANCE.getPropertyStatusObject();

	}

} //CbmcPackage
