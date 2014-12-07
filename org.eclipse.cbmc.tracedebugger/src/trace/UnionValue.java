/**
 */
package trace;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trace.UnionValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see trace.TracePackage#getUnionValue()
 * @model extendedMetaData="name='StructValue' kind='elementOnly'"
 * @generated
 */
public interface UnionValue extends Value {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link trace.Value},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' map.
	 * @see trace.TracePackage#getUnionValue_Values()
	 * @model mapType="trace.NameToValueMap<org.eclipse.emf.ecore.xml.type.String, trace.Value>"
	 *        extendedMetaData="kind='element' name='values'"
	 * @generated
	 */
	EMap<String, Value> getValues();

} // UnionValue
