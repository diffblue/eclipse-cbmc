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
package org.eclipse.cbmc.impl;

import java.util.Collection;
import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.cbmc.File;
import org.eclipse.cbmc.LoopResults;
import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyCategory;
import org.eclipse.cbmc.Results;
import org.eclipse.cbmc.*;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getSucceededCount <em>Succeeded Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getFailedCount <em>Failed Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getRunCount <em>Run Count</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.ResultsImpl#getLoopResults <em>Loop Results</em>}</li>
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
	 * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String errorMessage = ERROR_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSucceededCount() <em>Succeeded Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucceededCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SUCCEEDED_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSucceededCount() <em>Succeeded Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucceededCount()
	 * @generated
	 * @ordered
	 */
	protected int succeededCount = SUCCEEDED_COUNT_EDEFAULT;

	/**
	 * This is true if the Succeeded Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean succeededCountESet;

	/**
	 * The default value of the '{@link #getFailedCount() <em>Failed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedCount()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILED_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailedCount() <em>Failed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedCount()
	 * @generated
	 * @ordered
	 */
	protected int failedCount = FAILED_COUNT_EDEFAULT;

	/**
	 * This is true if the Failed Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failedCountESet;

	/**
	 * The default value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ERROR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected int errorCount = ERROR_COUNT_EDEFAULT;

	/**
	 * This is true if the Error Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorCountESet;

	/**
	 * The default value of the '{@link #getRunCount() <em>Run Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RUN_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRunCount() <em>Run Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunCount()
	 * @generated
	 * @ordered
	 */
	protected int runCount = RUN_COUNT_EDEFAULT;

	/**
	 * This is true if the Run Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean runCountESet;

	/**
	 * The cached value of the '{@link #getLoopResults() <em>Loop Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopResults()
	 * @generated
	 * @ordered
	 */
	protected LoopResults loopResults;

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
	 * @generated NOT
	 */
	protected ResultsImpl() {
		super();
		addCountersListener();
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
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMessage(String newErrorMessage) {
		String oldErrorMessage = errorMessage;
		errorMessage = newErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.RESULTS__ERROR_MESSAGE, oldErrorMessage, errorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSucceededCount() {
		return succeededCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSucceededCount(int newSucceededCount) {
		int oldSucceededCount = succeededCount;
		succeededCount = newSucceededCount;
		boolean oldSucceededCountESet = succeededCountESet;
		succeededCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.RESULTS__SUCCEEDED_COUNT, oldSucceededCount, succeededCount, !oldSucceededCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSucceededCount() {
		int oldSucceededCount = succeededCount;
		boolean oldSucceededCountESet = succeededCountESet;
		succeededCount = SUCCEEDED_COUNT_EDEFAULT;
		succeededCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CbmcPackage.RESULTS__SUCCEEDED_COUNT, oldSucceededCount, SUCCEEDED_COUNT_EDEFAULT, oldSucceededCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSucceededCount() {
		return succeededCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailedCount() {
		return failedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedCount(int newFailedCount) {
		int oldFailedCount = failedCount;
		failedCount = newFailedCount;
		boolean oldFailedCountESet = failedCountESet;
		failedCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.RESULTS__FAILED_COUNT, oldFailedCount, failedCount, !oldFailedCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFailedCount() {
		int oldFailedCount = failedCount;
		boolean oldFailedCountESet = failedCountESet;
		failedCount = FAILED_COUNT_EDEFAULT;
		failedCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CbmcPackage.RESULTS__FAILED_COUNT, oldFailedCount, FAILED_COUNT_EDEFAULT, oldFailedCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFailedCount() {
		return failedCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getErrorCount() {
		return errorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCount(int newErrorCount) {
		int oldErrorCount = errorCount;
		errorCount = newErrorCount;
		boolean oldErrorCountESet = errorCountESet;
		errorCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.RESULTS__ERROR_COUNT, oldErrorCount, errorCount, !oldErrorCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorCount() {
		int oldErrorCount = errorCount;
		boolean oldErrorCountESet = errorCountESet;
		errorCount = ERROR_COUNT_EDEFAULT;
		errorCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CbmcPackage.RESULTS__ERROR_COUNT, oldErrorCount, ERROR_COUNT_EDEFAULT, oldErrorCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorCount() {
		return errorCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRunCount() {
		return runCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunCount(int newRunCount) {
		int oldRunCount = runCount;
		runCount = newRunCount;
		boolean oldRunCountESet = runCountESet;
		runCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.RESULTS__RUN_COUNT, oldRunCount, runCount, !oldRunCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRunCount() {
		int oldRunCount = runCount;
		boolean oldRunCountESet = runCountESet;
		runCount = RUN_COUNT_EDEFAULT;
		runCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CbmcPackage.RESULTS__RUN_COUNT, oldRunCount, RUN_COUNT_EDEFAULT, oldRunCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRunCount() {
		return runCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopResults getLoopResults() {
		return loopResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopResults(LoopResults newLoopResults, NotificationChain msgs) {
		LoopResults oldLoopResults = loopResults;
		loopResults = newLoopResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbmcPackage.RESULTS__LOOP_RESULTS, oldLoopResults, newLoopResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopResults(LoopResults newLoopResults) {
		if (newLoopResults != loopResults) {
			NotificationChain msgs = null;
			if (loopResults != null)
				msgs = ((InternalEObject)loopResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CbmcPackage.RESULTS__LOOP_RESULTS, null, msgs);
			if (newLoopResults != null)
				msgs = ((InternalEObject)newLoopResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CbmcPackage.RESULTS__LOOP_RESULTS, null, msgs);
			msgs = basicSetLoopResults(newLoopResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.RESULTS__LOOP_RESULTS, newLoopResults, newLoopResults));
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
			case CbmcPackage.RESULTS__LOOP_RESULTS:
				return basicSetLoopResults(null, msgs);
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
			case CbmcPackage.RESULTS__ERROR_MESSAGE:
				return getErrorMessage();
			case CbmcPackage.RESULTS__SUCCEEDED_COUNT:
				return getSucceededCount();
			case CbmcPackage.RESULTS__FAILED_COUNT:
				return getFailedCount();
			case CbmcPackage.RESULTS__ERROR_COUNT:
				return getErrorCount();
			case CbmcPackage.RESULTS__RUN_COUNT:
				return getRunCount();
			case CbmcPackage.RESULTS__LOOP_RESULTS:
				return getLoopResults();
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
			case CbmcPackage.RESULTS__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
				return;
			case CbmcPackage.RESULTS__SUCCEEDED_COUNT:
				setSucceededCount((Integer)newValue);
				return;
			case CbmcPackage.RESULTS__FAILED_COUNT:
				setFailedCount((Integer)newValue);
				return;
			case CbmcPackage.RESULTS__ERROR_COUNT:
				setErrorCount((Integer)newValue);
				return;
			case CbmcPackage.RESULTS__RUN_COUNT:
				setRunCount((Integer)newValue);
				return;
			case CbmcPackage.RESULTS__LOOP_RESULTS:
				setLoopResults((LoopResults)newValue);
				return;
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
			case CbmcPackage.RESULTS__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
				return;
			case CbmcPackage.RESULTS__SUCCEEDED_COUNT:
				unsetSucceededCount();
				return;
			case CbmcPackage.RESULTS__FAILED_COUNT:
				unsetFailedCount();
				return;
			case CbmcPackage.RESULTS__ERROR_COUNT:
				unsetErrorCount();
				return;
			case CbmcPackage.RESULTS__RUN_COUNT:
				unsetRunCount();
				return;
			case CbmcPackage.RESULTS__LOOP_RESULTS:
				setLoopResults((LoopResults)null);
				return;
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
			case CbmcPackage.RESULTS__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? errorMessage != null : !ERROR_MESSAGE_EDEFAULT.equals(errorMessage);
			case CbmcPackage.RESULTS__SUCCEEDED_COUNT:
				return isSetSucceededCount();
			case CbmcPackage.RESULTS__FAILED_COUNT:
				return isSetFailedCount();
			case CbmcPackage.RESULTS__ERROR_COUNT:
				return isSetErrorCount();
			case CbmcPackage.RESULTS__RUN_COUNT:
				return isSetRunCount();
			case CbmcPackage.RESULTS__LOOP_RESULTS:
				return loopResults != null;
			case CbmcPackage.RESULTS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CbmcPackage.RESULTS__FILES:
				return files != null && !files.isEmpty();
			case CbmcPackage.RESULTS__CATEGORIES:
				return categories != null && !categories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (errorMessage: ");
		result.append(errorMessage);
		result.append(", succeededCount: ");
		if (succeededCountESet) result.append(succeededCount); else result.append("<unset>");
		result.append(", failedCount: ");
		if (failedCountESet) result.append(failedCount); else result.append("<unset>");
		result.append(", errorCount: ");
		if (errorCountESet) result.append(errorCount); else result.append("<unset>");
		result.append(", runCount: ");
		if (runCountESet) result.append(runCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void addCountersListener() {
		EContentAdapter adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				if (notification.getNewValue() != null && notification.getNewValue() instanceof PropertyStatus) {
					PropertyStatus propertyStatus = (PropertyStatus) notification.getNewValue();
					switch (propertyStatus.getValue()) {
						case PropertyStatus.ERROR_VALUE :
							setErrorCount(getErrorCount() + 1);
							setRunCount(getRunCount() + 1);
							break;
						case PropertyStatus.FAILED_VALUE :
							setFailedCount(getFailedCount() + 1);
							setRunCount(getRunCount() + 1);
							break;
						case PropertyStatus.SUCCEEDED_VALUE :
							setSucceededCount(getSucceededCount() + 1);
							setRunCount(getRunCount() + 1);
							break;
						default :
							break;
					}
				}
			}
		};
		eAdapters().add(adapter);
	}

	private CBMCCliHelper cbmcHelper;

	public CBMCCliHelper getCBMCHelper() {
		return cbmcHelper;
	}

	public void setCBMCHelper(CBMCCliHelper helper) {
		cbmcHelper = helper;
	}

} //ResultsImpl
