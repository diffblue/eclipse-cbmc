/**
 */
package org.eclipse.cbmc.impl;

import org.eclipse.cbmc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CbmcFactoryImpl extends EFactoryImpl implements CbmcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CbmcFactory init() {
		try {
			CbmcFactory theCbmcFactory = (CbmcFactory)EPackage.Registry.INSTANCE.getEFactory(CbmcPackage.eNS_URI);
			if (theCbmcFactory != null) {
				return theCbmcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CbmcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbmcFactoryImpl() {
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
			case CbmcPackage.FILE: return createFile();
			case CbmcPackage.LOOP: return createLoop();
			case CbmcPackage.LOOP_RESULTS: return createLoopResults();
			case CbmcPackage.PROPERTY: return createProperty();
			case CbmcPackage.PROPERTY_CATEGORY: return createPropertyCategory();
			case CbmcPackage.RESULTS: return createResults();
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
			case CbmcPackage.PROPERTY_STATUS:
				return createPropertyStatusFromString(eDataType, initialValue);
			case CbmcPackage.PROPERTY_STATUS_OBJECT:
				return createPropertyStatusObjectFromString(eDataType, initialValue);
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
			case CbmcPackage.PROPERTY_STATUS:
				return convertPropertyStatusToString(eDataType, instanceValue);
			case CbmcPackage.PROPERTY_STATUS_OBJECT:
				return convertPropertyStatusObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopResults createLoopResults() {
		LoopResultsImpl loopResults = new LoopResultsImpl();
		return loopResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCategory createPropertyCategory() {
		PropertyCategoryImpl propertyCategory = new PropertyCategoryImpl();
		return propertyCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyStatus createPropertyStatusFromString(EDataType eDataType, String initialValue) {
		PropertyStatus result = PropertyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyStatus createPropertyStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyStatusFromString(CbmcPackage.Literals.PROPERTY_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyStatusToString(CbmcPackage.Literals.PROPERTY_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbmcPackage getCbmcPackage() {
		return (CbmcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CbmcPackage getPackage() {
		return CbmcPackage.eINSTANCE;
	}

} //CbmcFactoryImpl
