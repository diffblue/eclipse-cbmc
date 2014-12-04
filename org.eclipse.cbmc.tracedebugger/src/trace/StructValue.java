/**
 */
package trace;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trace.StructValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see trace.TracePackage#getStructValue()
 * @model extendedMetaData="name='StructValue' kind='elementOnly'"
 * @generated
 */
public interface StructValue extends Value {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link trace.Value},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' map.
	 * @see trace.TracePackage#getStructValue_Values()
	 * @model mapType="trace.NameToValueMap<org.eclipse.emf.ecore.xml.type.String, trace.Value>"
	 *        extendedMetaData="kind='element' name='values'"
	 * @generated
	 */
	EMap<String, Value> getValues();

} // StructValue
