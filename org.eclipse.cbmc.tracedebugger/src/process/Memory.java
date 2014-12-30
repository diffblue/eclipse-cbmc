/**
 */
package process;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import trace.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.Memory#getCells <em>Cells</em>}</li>
 *   <li>{@link process.Memory#getGlobalVariables <em>Global Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link trace.Assignment},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' map.
	 * @see process.ProcessPackage#getMemory_Cells()
	 * @model mapType="process.StringToAssignmentEntry<org.eclipse.emf.ecore.xml.type.String, trace.Assignment>"
	 * @generated
	 */
	EMap<String, Assignment> getCells();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variables</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' map.
	 * @see process.ProcessPackage#getMemory_GlobalVariables()
	 * @model mapType="process.StringToStringEntry<org.eclipse.emf.ecore.xml.type.String, org.eclipse.emf.ecore.xml.type.String>"
	 * @generated
	 */
	EMap<String, String> getGlobalVariables();

} // Memory
