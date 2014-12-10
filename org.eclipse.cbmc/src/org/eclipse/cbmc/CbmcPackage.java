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
	 * The meta object id for the '{@link org.eclipse.cbmc.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.impl.LoopImpl
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ID = 0;

	/**
	 * The feature id for the '<em><b>Unwind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__UNWIND = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__PATH = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__FILENAME = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LINE = 5;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.impl.LoopResultsImpl <em>Loop Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.impl.LoopResultsImpl
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getLoopResults()
	 * @generated
	 */
	int LOOP_RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_RESULTS__ERROR_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Loops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_RESULTS__LOOPS = 1;

	/**
	 * The number of structural features of the '<em>Loop Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_RESULTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Loop Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.impl.PropertyImpl
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

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
	int PROPERTY_CATEGORY = 4;

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
	int RESULTS = 5;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__ERROR_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Succeeded Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__SUCCEEDED_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Failed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__FAILED_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__ERROR_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Run Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__RUN_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Loop Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__LOOP_RESULTS = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__FILES = 7;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__CATEGORIES = 8;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cbmc.PropertyStatus <em>Property Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyStatus()
	 * @generated
	 */
	int PROPERTY_STATUS = 6;

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
	 * Returns the meta object for class '{@link org.eclipse.cbmc.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see org.eclipse.cbmc.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Loop#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.cbmc.Loop#getId()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Loop#getUnwind <em>Unwind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unwind</em>'.
	 * @see org.eclipse.cbmc.Loop#getUnwind()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Unwind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Loop#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.cbmc.Loop#getPath()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Loop#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.eclipse.cbmc.Loop#getFilename()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Filename();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Loop#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.eclipse.cbmc.Loop#getFunction()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Loop#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.cbmc.Loop#getLine()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Line();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cbmc.LoopResults <em>Loop Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Results</em>'.
	 * @see org.eclipse.cbmc.LoopResults
	 * @generated
	 */
	EClass getLoopResults();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.LoopResults#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.eclipse.cbmc.LoopResults#getErrorMessage()
	 * @see #getLoopResults()
	 * @generated
	 */
	EAttribute getLoopResults_ErrorMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cbmc.LoopResults#getLoops <em>Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loops</em>'.
	 * @see org.eclipse.cbmc.LoopResults#getLoops()
	 * @see #getLoopResults()
	 * @generated
	 */
	EReference getLoopResults_Loops();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Results#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.eclipse.cbmc.Results#getErrorMessage()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_ErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Results#getSucceededCount <em>Succeeded Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Succeeded Count</em>'.
	 * @see org.eclipse.cbmc.Results#getSucceededCount()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_SucceededCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Results#getFailedCount <em>Failed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failed Count</em>'.
	 * @see org.eclipse.cbmc.Results#getFailedCount()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_FailedCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Results#getErrorCount <em>Error Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Count</em>'.
	 * @see org.eclipse.cbmc.Results#getErrorCount()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_ErrorCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cbmc.Results#getRunCount <em>Run Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Count</em>'.
	 * @see org.eclipse.cbmc.Results#getRunCount()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_RunCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cbmc.Results#getLoopResults <em>Loop Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Results</em>'.
	 * @see org.eclipse.cbmc.Results#getLoopResults()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_LoopResults();

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
	 * Returns the meta object for enum '{@link org.eclipse.cbmc.PropertyStatus <em>Property Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Status</em>'.
	 * @see org.eclipse.cbmc.PropertyStatus
	 * @generated
	 */
	EEnum getPropertyStatus();

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
		 * The meta object literal for the '{@link org.eclipse.cbmc.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.impl.LoopImpl
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__ID = eINSTANCE.getLoop_Id();

		/**
		 * The meta object literal for the '<em><b>Unwind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__UNWIND = eINSTANCE.getLoop_Unwind();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__PATH = eINSTANCE.getLoop_Path();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__FILENAME = eINSTANCE.getLoop_Filename();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__FUNCTION = eINSTANCE.getLoop_Function();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__LINE = eINSTANCE.getLoop_Line();

		/**
		 * The meta object literal for the '{@link org.eclipse.cbmc.impl.LoopResultsImpl <em>Loop Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.impl.LoopResultsImpl
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getLoopResults()
		 * @generated
		 */
		EClass LOOP_RESULTS = eINSTANCE.getLoopResults();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_RESULTS__ERROR_MESSAGE = eINSTANCE.getLoopResults_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Loops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_RESULTS__LOOPS = eINSTANCE.getLoopResults_Loops();

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
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__ERROR_MESSAGE = eINSTANCE.getResults_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Succeeded Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__SUCCEEDED_COUNT = eINSTANCE.getResults_SucceededCount();

		/**
		 * The meta object literal for the '<em><b>Failed Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__FAILED_COUNT = eINSTANCE.getResults_FailedCount();

		/**
		 * The meta object literal for the '<em><b>Error Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__ERROR_COUNT = eINSTANCE.getResults_ErrorCount();

		/**
		 * The meta object literal for the '<em><b>Run Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__RUN_COUNT = eINSTANCE.getResults_RunCount();

		/**
		 * The meta object literal for the '<em><b>Loop Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__LOOP_RESULTS = eINSTANCE.getResults_LoopResults();

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
		 * The meta object literal for the '{@link org.eclipse.cbmc.PropertyStatus <em>Property Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cbmc.PropertyStatus
		 * @see org.eclipse.cbmc.impl.CbmcPackageImpl#getPropertyStatus()
		 * @generated
		 */
		EEnum PROPERTY_STATUS = eINSTANCE.getPropertyStatus();

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
