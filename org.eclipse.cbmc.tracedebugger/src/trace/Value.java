/**
 */
package trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see trace.TracePackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionDataType="org.eclipse.emf.ecore.xml.type.String" expressionRequired="true"
	 * @generated
	 */
	Value getValue(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getChildrenCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" abridgedDataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	String getUserFriendlyRepresentation(boolean abridged);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" expDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getExpression(String exp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" parentPathDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<Object> compare(String parentPath, Value old);

} // Value
