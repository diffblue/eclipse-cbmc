/**
 */
package process.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import process.Breakpoint;
import process.ProcessPackage;
import process.StepResult;
import process.SteppingResult;
import trace.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.StepResultImpl#getCode <em>Code</em>}</li>
 *   <li>{@link process.impl.StepResultImpl#getStepDone <em>Step Done</em>}</li>
 *   <li>{@link process.impl.StepResultImpl#getBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link process.impl.StepResultImpl#getLineExecuted <em>Line Executed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepResultImpl extends MinimalEObjectImpl.Container implements StepResult {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final SteppingResult CODE_EDEFAULT = SteppingResult.BREAKPOINT_HIT;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected SteppingResult code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepDone() <em>Step Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDone()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_DONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepDone() <em>Step Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDone()
	 * @generated
	 * @ordered
	 */
	protected int stepDone = STEP_DONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBreakpoint() <em>Breakpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpoint()
	 * @generated
	 * @ordered
	 */
	protected Breakpoint breakpoint;

	/**
	 * The cached value of the '{@link #getLineExecuted() <em>Line Executed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineExecuted()
	 * @generated
	 * @ordered
	 */
	protected Location lineExecuted;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.STEP_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteppingResult getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(SteppingResult newCode) {
		SteppingResult oldCode = code;
		code = newCode == null ? CODE_EDEFAULT : newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.STEP_RESULT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepDone() {
		return stepDone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepDone(int newStepDone) {
		int oldStepDone = stepDone;
		stepDone = newStepDone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.STEP_RESULT__STEP_DONE, oldStepDone, stepDone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLineExecuted() {
		if (lineExecuted != null && lineExecuted.eIsProxy()) {
			InternalEObject oldLineExecuted = (InternalEObject)lineExecuted;
			lineExecuted = (Location)eResolveProxy(oldLineExecuted);
			if (lineExecuted != oldLineExecuted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.STEP_RESULT__LINE_EXECUTED, oldLineExecuted, lineExecuted));
			}
		}
		return lineExecuted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLineExecuted() {
		return lineExecuted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineExecuted(Location newLineExecuted) {
		Location oldLineExecuted = lineExecuted;
		lineExecuted = newLineExecuted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.STEP_RESULT__LINE_EXECUTED, oldLineExecuted, lineExecuted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint getBreakpoint() {
		if (breakpoint != null && breakpoint.eIsProxy()) {
			InternalEObject oldBreakpoint = (InternalEObject)breakpoint;
			breakpoint = (Breakpoint)eResolveProxy(oldBreakpoint);
			if (breakpoint != oldBreakpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.STEP_RESULT__BREAKPOINT, oldBreakpoint, breakpoint));
			}
		}
		return breakpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint basicGetBreakpoint() {
		return breakpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakpoint(Breakpoint newBreakpoint) {
		Breakpoint oldBreakpoint = breakpoint;
		breakpoint = newBreakpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.STEP_RESULT__BREAKPOINT, oldBreakpoint, breakpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.STEP_RESULT__CODE:
				return getCode();
			case ProcessPackage.STEP_RESULT__STEP_DONE:
				return getStepDone();
			case ProcessPackage.STEP_RESULT__BREAKPOINT:
				if (resolve) return getBreakpoint();
				return basicGetBreakpoint();
			case ProcessPackage.STEP_RESULT__LINE_EXECUTED:
				if (resolve) return getLineExecuted();
				return basicGetLineExecuted();
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
			case ProcessPackage.STEP_RESULT__CODE:
				setCode((SteppingResult)newValue);
				return;
			case ProcessPackage.STEP_RESULT__STEP_DONE:
				setStepDone((Integer)newValue);
				return;
			case ProcessPackage.STEP_RESULT__BREAKPOINT:
				setBreakpoint((Breakpoint)newValue);
				return;
			case ProcessPackage.STEP_RESULT__LINE_EXECUTED:
				setLineExecuted((Location)newValue);
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
			case ProcessPackage.STEP_RESULT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ProcessPackage.STEP_RESULT__STEP_DONE:
				setStepDone(STEP_DONE_EDEFAULT);
				return;
			case ProcessPackage.STEP_RESULT__BREAKPOINT:
				setBreakpoint((Breakpoint)null);
				return;
			case ProcessPackage.STEP_RESULT__LINE_EXECUTED:
				setLineExecuted((Location)null);
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
			case ProcessPackage.STEP_RESULT__CODE:
				return code != CODE_EDEFAULT;
			case ProcessPackage.STEP_RESULT__STEP_DONE:
				return stepDone != STEP_DONE_EDEFAULT;
			case ProcessPackage.STEP_RESULT__BREAKPOINT:
				return breakpoint != null;
			case ProcessPackage.STEP_RESULT__LINE_EXECUTED:
				return lineExecuted != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", stepDone: ");
		result.append(stepDone);
		result.append(')');
		return result.toString();
	}

} //StepResultImpl
