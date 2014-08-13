/**
 */
package process.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import process.Breakpoint;
import process.BreakpointManager;
import process.FunctionExecution;
import process.ProcessPackage;

import trace.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breakpoint Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.BreakpointManagerImpl#getBreakpointsByLocation <em>Breakpoints By Location</em>}</li>
 *   <li>{@link process.impl.BreakpointManagerImpl#getBreakpointsById <em>Breakpoints By Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreakpointManagerImpl extends MinimalEObjectImpl.Container implements BreakpointManager {
	/**
	 * The cached value of the '{@link #getBreakpointsByLocation() <em>Breakpoints By Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpointsByLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Breakpoint> breakpointsByLocation;

	/**
	 * The cached value of the '{@link #getBreakpointsById() <em>Breakpoints By Id</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpointsById()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Breakpoint> breakpointsById;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakpointManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.BREAKPOINT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Breakpoint> getBreakpointsByLocation() {
		if (breakpointsByLocation == null) {
			breakpointsByLocation = new EcoreEMap<String,Breakpoint>(ProcessPackage.Literals.STRING_TO_BREAKPOINT_MAP, StringToBreakpointMapImpl.class, this, ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION);
		}
		return breakpointsByLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Breakpoint> getBreakpointsById() {
		if (breakpointsById == null) {
			breakpointsById = new EcoreEMap<String,Breakpoint>(ProcessPackage.Literals.STRING_TO_BREAKPOINT_MAP, StringToBreakpointMapImpl.class, this, ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID);
		}
		return breakpointsById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Breakpoint hasBreakpoint(FunctionExecution e, Step step) {
		int lineNumber = step.getLineNumber();
		Breakpoint match = null;
		if (lineNumber != -1)
			match = getBreakpointsById().get(e.getFileName() + lineNumber);
		else 
			match = getBreakpointsById().get(e.getFunctionName());
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION:
				return ((InternalEList<?>)getBreakpointsByLocation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID:
				return ((InternalEList<?>)getBreakpointsById()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION:
				if (coreType) return getBreakpointsByLocation();
				else return getBreakpointsByLocation().map();
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID:
				if (coreType) return getBreakpointsById();
				else return getBreakpointsById().map();
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
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION:
				((EStructuralFeature.Setting)getBreakpointsByLocation()).set(newValue);
				return;
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID:
				((EStructuralFeature.Setting)getBreakpointsById()).set(newValue);
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
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION:
				getBreakpointsByLocation().clear();
				return;
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID:
				getBreakpointsById().clear();
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
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_LOCATION:
				return breakpointsByLocation != null && !breakpointsByLocation.isEmpty();
			case ProcessPackage.BREAKPOINT_MANAGER__BREAKPOINTS_BY_ID:
				return breakpointsById != null && !breakpointsById.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProcessPackage.BREAKPOINT_MANAGER___HAS_BREAKPOINT__FUNCTIONEXECUTION_STEP:
				return hasBreakpoint((FunctionExecution)arguments.get(0), (Step)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BreakpointManagerImpl
