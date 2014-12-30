/**
 */
package process.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import process.Memory;
import process.ProcessPackage;

import trace.Assignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link process.impl.MemoryImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link process.impl.MemoryImpl#getGlobalVariables <em>Global Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryImpl extends MinimalEObjectImpl.Container implements Memory {
	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Assignment> cells;
	/**
	 * The cached value of the '{@link #getGlobalVariables() <em>Global Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> globalVariables;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Assignment> getCells() {
		if (cells == null) {
			cells = new EcoreEMap<String,Assignment>(ProcessPackage.Literals.STRING_TO_ASSIGNMENT_ENTRY, StringToAssignmentEntryImpl.class, this, ProcessPackage.MEMORY__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getGlobalVariables() {
		if (globalVariables == null) {
			globalVariables = new EcoreEMap<String,String>(ProcessPackage.Literals.STRING_TO_STRING_ENTRY, StringToStringEntryImpl.class, this, ProcessPackage.MEMORY__GLOBAL_VARIABLES);
		}
		return globalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.MEMORY__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
			case ProcessPackage.MEMORY__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobalVariables()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.MEMORY__CELLS:
				if (coreType) return getCells();
				else return getCells().map();
			case ProcessPackage.MEMORY__GLOBAL_VARIABLES:
				if (coreType) return getGlobalVariables();
				else return getGlobalVariables().map();
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
			case ProcessPackage.MEMORY__CELLS:
				((EStructuralFeature.Setting)getCells()).set(newValue);
				return;
			case ProcessPackage.MEMORY__GLOBAL_VARIABLES:
				((EStructuralFeature.Setting)getGlobalVariables()).set(newValue);
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
			case ProcessPackage.MEMORY__CELLS:
				getCells().clear();
				return;
			case ProcessPackage.MEMORY__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
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
			case ProcessPackage.MEMORY__CELLS:
				return cells != null && !cells.isEmpty();
			case ProcessPackage.MEMORY__GLOBAL_VARIABLES:
				return globalVariables != null && !globalVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemoryImpl
