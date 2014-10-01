/**
 */
package org.eclipse.cbmc.impl;

import org.eclipse.cbmc.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.PropertyImpl#getDetailsFile <em>Details File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected PropertyCategory category;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * This is true if the Line attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineESet;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyStatus STATUS_EDEFAULT = PropertyStatus.PENDING;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PropertyStatus status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The default value of the '{@link #getDetailsFile() <em>Details File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsFile()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailsFile() <em>Details File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailsFile()
	 * @generated
	 * @ordered
	 */
	protected String detailsFile = DETAILS_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbmcPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCategory getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject) category;
			category = (PropertyCategory) eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbmcPackage.PROPERTY__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCategory basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(PropertyCategory newCategory, NotificationChain msgs) {
		PropertyCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__CATEGORY, oldCategory, newCategory);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(PropertyCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject) category).eInverseRemove(this, CbmcPackage.PROPERTY_CATEGORY__PROPERTIES, PropertyCategory.class, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject) newCategory).eInverseAdd(this, CbmcPackage.PROPERTY_CATEGORY__PROPERTIES, PropertyCategory.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject) file;
			file = (File) eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbmcPackage.PROPERTY__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(File newFile, NotificationChain msgs) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__FILE, oldFile, newFile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		if (newFile != file) {
			NotificationChain msgs = null;
			if (file != null)
				msgs = ((InternalEObject) file).eInverseRemove(this, CbmcPackage.FILE__PROPERTIES, File.class, msgs);
			if (newFile != null)
				msgs = ((InternalEObject) newFile).eInverseAdd(this, CbmcPackage.FILE__PROPERTIES, File.class, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		boolean oldLineESet = lineESet;
		lineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__LINE, oldLine, line, !oldLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLine() {
		int oldLine = line;
		boolean oldLineESet = lineESet;
		line = LINE_EDEFAULT;
		lineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CbmcPackage.PROPERTY__LINE, oldLine, LINE_EDEFAULT, oldLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLine() {
		return lineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PropertyStatus newStatus) {
		PropertyStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		PropertyStatus oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CbmcPackage.PROPERTY__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailsFile() {
		return detailsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailsFile(String newDetailsFile) {
		String oldDetailsFile = detailsFile;
		detailsFile = newDetailsFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.PROPERTY__DETAILS_FILE, oldDetailsFile, detailsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbmcPackage.PROPERTY__CATEGORY :
				if (category != null)
					msgs = ((InternalEObject) category).eInverseRemove(this, CbmcPackage.PROPERTY_CATEGORY__PROPERTIES, PropertyCategory.class, msgs);
				return basicSetCategory((PropertyCategory) otherEnd, msgs);
			case CbmcPackage.PROPERTY__FILE :
				if (file != null)
					msgs = ((InternalEObject) file).eInverseRemove(this, CbmcPackage.FILE__PROPERTIES, File.class, msgs);
				return basicSetFile((File) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbmcPackage.PROPERTY__CATEGORY :
				return basicSetCategory(null, msgs);
			case CbmcPackage.PROPERTY__FILE :
				return basicSetFile(null, msgs);
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
			case CbmcPackage.PROPERTY__CATEGORY :
				if (resolve)
					return getCategory();
				return basicGetCategory();
			case CbmcPackage.PROPERTY__NUMBER :
				return getNumber();
			case CbmcPackage.PROPERTY__DESCRIPTION :
				return getDescription();
			case CbmcPackage.PROPERTY__FILE :
				if (resolve)
					return getFile();
				return basicGetFile();
			case CbmcPackage.PROPERTY__FUNCTION :
				return getFunction();
			case CbmcPackage.PROPERTY__LINE :
				return getLine();
			case CbmcPackage.PROPERTY__STATUS :
				return getStatus();
			case CbmcPackage.PROPERTY__DETAILS_FILE :
				return getDetailsFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbmcPackage.PROPERTY__CATEGORY :
				setCategory((PropertyCategory) newValue);
				return;
			case CbmcPackage.PROPERTY__NUMBER :
				setNumber((String) newValue);
				return;
			case CbmcPackage.PROPERTY__DESCRIPTION :
				setDescription((String) newValue);
				return;
			case CbmcPackage.PROPERTY__FILE :
				setFile((File) newValue);
				return;
			case CbmcPackage.PROPERTY__FUNCTION :
				setFunction((String) newValue);
				return;
			case CbmcPackage.PROPERTY__LINE :
				setLine((Integer) newValue);
				return;
			case CbmcPackage.PROPERTY__STATUS :
				setStatus((PropertyStatus) newValue);
				return;
			case CbmcPackage.PROPERTY__DETAILS_FILE :
				setDetailsFile((String) newValue);
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
			case CbmcPackage.PROPERTY__CATEGORY :
				setCategory((PropertyCategory) null);
				return;
			case CbmcPackage.PROPERTY__NUMBER :
				setNumber(NUMBER_EDEFAULT);
				return;
			case CbmcPackage.PROPERTY__DESCRIPTION :
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CbmcPackage.PROPERTY__FILE :
				setFile((File) null);
				return;
			case CbmcPackage.PROPERTY__FUNCTION :
				setFunction(FUNCTION_EDEFAULT);
				return;
			case CbmcPackage.PROPERTY__LINE :
				unsetLine();
				return;
			case CbmcPackage.PROPERTY__STATUS :
				unsetStatus();
				return;
			case CbmcPackage.PROPERTY__DETAILS_FILE :
				setDetailsFile(DETAILS_FILE_EDEFAULT);
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
			case CbmcPackage.PROPERTY__CATEGORY :
				return category != null;
			case CbmcPackage.PROPERTY__NUMBER :
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case CbmcPackage.PROPERTY__DESCRIPTION :
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CbmcPackage.PROPERTY__FILE :
				return file != null;
			case CbmcPackage.PROPERTY__FUNCTION :
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case CbmcPackage.PROPERTY__LINE :
				return isSetLine();
			case CbmcPackage.PROPERTY__STATUS :
				return isSetStatus();
			case CbmcPackage.PROPERTY__DETAILS_FILE :
				return DETAILS_FILE_EDEFAULT == null ? detailsFile != null : !DETAILS_FILE_EDEFAULT.equals(detailsFile);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(", description: ");
		result.append(description);
		result.append(", function: ");
		result.append(function);
		result.append(", line: ");
		if (lineESet)
			result.append(line);
		else
			result.append("<unset>");
		result.append(", status: ");
		if (statusESet)
			result.append(status);
		else
			result.append("<unset>");
		result.append(", detailsFile: ");
		result.append(detailsFile);
		result.append(')');
		return result.toString();
	}

	private Job job;

	public void setJob(Job value) {
		job = value;
	}

	public Job getJob() {
		return job;
	}
} //PropertyImpl
