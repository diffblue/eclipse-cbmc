/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trace.Trace#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see trace.TracePackage#getTrace()
 * @model extendedMetaData="name='Trace' kind='elementOnly'"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link trace.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see trace.TracePackage#getTrace_Steps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='steps'"
	 * @generated
	 */
	EList<Step> getSteps();

} // Trace
