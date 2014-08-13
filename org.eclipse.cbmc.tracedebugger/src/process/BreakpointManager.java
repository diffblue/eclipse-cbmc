/**
 */
package process;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import trace.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breakpoint Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.BreakpointManager#getBreakpointsByLocation <em>Breakpoints By Location</em>}</li>
 *   <li>{@link process.BreakpointManager#getBreakpointsById <em>Breakpoints By Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getBreakpointManager()
 * @model
 * @generated
 */
public interface BreakpointManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Breakpoints By Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link process.Breakpoint},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakpoints By Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoints By Location</em>' map.
	 * @see process.ProcessPackage#getBreakpointManager_BreakpointsByLocation()
	 * @model mapType="process.StringToBreakpointMap<org.eclipse.emf.ecore.xml.type.String, process.Breakpoint>"
	 * @generated
	 */
	EMap<String, Breakpoint> getBreakpointsByLocation();

	/**
	 * Returns the value of the '<em><b>Breakpoints By Id</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link process.Breakpoint},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakpoints By Id</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoints By Id</em>' map.
	 * @see process.ProcessPackage#getBreakpointManager_BreakpointsById()
	 * @model mapType="process.StringToBreakpointMap<org.eclipse.emf.ecore.xml.type.String, process.Breakpoint>"
	 * @generated
	 */
	EMap<String, Breakpoint> getBreakpointsById();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Breakpoint hasBreakpoint(FunctionExecution function, Step step);

} // BreakpointManager
