/**
 */
package org.eclipse.cbmc.impl;

import java.util.Collection;

import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.cbmc.File;
import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyCategory;
import org.eclipse.cbmc.Results;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsImpl extends MinimalEObjectImpl.Container implements Results {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyCategory> categories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbmcPackage.Literals.RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CbmcPackage.RESULTS__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, CbmcPackage.RESULTS__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<PropertyCategory>(PropertyCategory.class, this, CbmcPackage.RESULTS__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbmcPackage.RESULTS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case CbmcPackage.RESULTS__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case CbmcPackage.RESULTS__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbmcPackage.RESULTS__PROPERTIES:
				return getProperties();
			case CbmcPackage.RESULTS__FILES:
				return getFiles();
			case CbmcPackage.RESULTS__CATEGORIES:
				return getCategories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbmcPackage.RESULTS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CbmcPackage.RESULTS__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case CbmcPackage.RESULTS__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends PropertyCategory>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CbmcPackage.RESULTS__PROPERTIES:
				getProperties().clear();
				return;
			case CbmcPackage.RESULTS__FILES:
				getFiles().clear();
				return;
			case CbmcPackage.RESULTS__CATEGORIES:
				getCategories().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CbmcPackage.RESULTS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CbmcPackage.RESULTS__FILES:
				return files != null && !files.isEmpty();
			case CbmcPackage.RESULTS__CATEGORIES:
				return categories != null && !categories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultsImpl
