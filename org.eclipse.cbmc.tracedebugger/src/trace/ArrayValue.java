/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trace.ArrayValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see trace.TracePackage#getArrayValue()
 * @model extendedMetaData="name='ArrayValue' kind='elementOnly'"
 * @generated
 */
public interface ArrayValue extends Value {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link trace.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see trace.TracePackage#getArrayValue_Values()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='values'"
	 * @generated
	 */
	EList<Value> getValues();

} // ArrayValue
