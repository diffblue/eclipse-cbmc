/**
 */
package org.eclipse.cbmc.impl;

import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.cbmc.Loop;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cbmc.impl.LoopImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.LoopImpl#getUnwind <em>Unwind</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.LoopImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.LoopImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.LoopImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.cbmc.impl.LoopImpl#getLine <em>Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopImpl extends MinimalEObjectImpl.Container implements Loop {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnwind() <em>Unwind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwind()
	 * @generated
	 * @ordered
	 */
	protected static final String UNWIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnwind() <em>Unwind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnwind()
	 * @generated
	 * @ordered
	 */
	protected String unwind = UNWIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbmcPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.LOOP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnwind() {
		return unwind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUnwind(String newUnwind) {
		try {
			if (newUnwind.isEmpty() || Integer.parseInt(newUnwind) >= 0) {
				String oldUnwind = unwind;
				unwind = newUnwind;
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.LOOP__UNWIND, oldUnwind, unwind));
			}
		} catch (NumberFormatException e) {
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.LOOP__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.LOOP__FILENAME, oldFilename, filename));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.LOOP__FUNCTION, oldFunction, function));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbmcPackage.LOOP__LINE, oldLine, line, !oldLineESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CbmcPackage.LOOP__LINE, oldLine, LINE_EDEFAULT, oldLineESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbmcPackage.LOOP__ID :
				return getId();
			case CbmcPackage.LOOP__UNWIND :
				return getUnwind();
			case CbmcPackage.LOOP__PATH :
				return getPath();
			case CbmcPackage.LOOP__FILENAME :
				return getFilename();
			case CbmcPackage.LOOP__FUNCTION :
				return getFunction();
			case CbmcPackage.LOOP__LINE :
				return getLine();
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
			case CbmcPackage.LOOP__ID :
				setId((String) newValue);
				return;
			case CbmcPackage.LOOP__UNWIND :
				setUnwind((String) newValue);
				return;
			case CbmcPackage.LOOP__PATH :
				setPath((String) newValue);
				return;
			case CbmcPackage.LOOP__FILENAME :
				setFilename((String) newValue);
				return;
			case CbmcPackage.LOOP__FUNCTION :
				setFunction((String) newValue);
				return;
			case CbmcPackage.LOOP__LINE :
				setLine((Integer) newValue);
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
			case CbmcPackage.LOOP__ID :
				setId(ID_EDEFAULT);
				return;
			case CbmcPackage.LOOP__UNWIND :
				setUnwind(UNWIND_EDEFAULT);
				return;
			case CbmcPackage.LOOP__PATH :
				setPath(PATH_EDEFAULT);
				return;
			case CbmcPackage.LOOP__FILENAME :
				setFilename(FILENAME_EDEFAULT);
				return;
			case CbmcPackage.LOOP__FUNCTION :
				setFunction(FUNCTION_EDEFAULT);
				return;
			case CbmcPackage.LOOP__LINE :
				unsetLine();
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
			case CbmcPackage.LOOP__ID :
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CbmcPackage.LOOP__UNWIND :
				return UNWIND_EDEFAULT == null ? unwind != null : !UNWIND_EDEFAULT.equals(unwind);
			case CbmcPackage.LOOP__PATH :
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CbmcPackage.LOOP__FILENAME :
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case CbmcPackage.LOOP__FUNCTION :
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case CbmcPackage.LOOP__LINE :
				return isSetLine();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", unwind: ");
		result.append(unwind);
		result.append(", path: ");
		result.append(path);
		result.append(", filename: ");
		result.append(filename);
		result.append(", function: ");
		result.append(function);
		result.append(", line: ");
		if (lineESet)
			result.append(line);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LoopImpl
