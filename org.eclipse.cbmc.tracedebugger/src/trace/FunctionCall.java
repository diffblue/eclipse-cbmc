/**
 */
package trace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trace.FunctionCall#getId <em>Id</em>}</li>
 *   <li>{@link trace.FunctionCall#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link trace.FunctionCall#getFunctionLocation <em>Function Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see trace.TracePackage#getFunctionCall()
 * @model extendedMetaData="name='FunctionCall' kind='elementOnly'"
 * @generated
 */
public interface FunctionCall extends Step {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see trace.TracePackage#getFunctionCall_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link trace.FunctionCall#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see trace.TracePackage#getFunctionCall_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='displayName'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link trace.FunctionCall#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Function Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Location</em>' containment reference.
	 * @see #setFunctionLocation(Location)
	 * @see trace.TracePackage#getFunctionCall_FunctionLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location'"
	 * @generated
	 */
	Location getFunctionLocation();

	/**
	 * Sets the value of the '{@link trace.FunctionCall#getFunctionLocation <em>Function Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Location</em>' containment reference.
	 * @see #getFunctionLocation()
	 * @generated
	 */
	void setFunctionLocation(Location value);

} // FunctionCall
