/**
 * OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data;

public class OperationResultOfArrayOfDocumentRevisionwJCT_PyJf  implements java.io.Serializable {
    private java.lang.String message;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserPermissions permissions;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ResultType result;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentRevision[] returnValue;

    public OperationResultOfArrayOfDocumentRevisionwJCT_PyJf() {
    }

    public OperationResultOfArrayOfDocumentRevisionwJCT_PyJf(
           java.lang.String message,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserPermissions permissions,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ResultType result,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentRevision[] returnValue) {
           this.message = message;
           this.permissions = permissions;
           this.result = result;
           this.returnValue = returnValue;
    }


    /**
     * Gets the message value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the permissions value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @return permissions
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserPermissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @param permissions
     */
    public void setPermissions(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserPermissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the result value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @return result
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ResultType getResult() {
        return result;
    }


    /**
     * Sets the result value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @param result
     */
    public void setResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ResultType result) {
        this.result = result;
    }


    /**
     * Gets the returnValue value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @return returnValue
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentRevision[] getReturnValue() {
        return returnValue;
    }


    /**
     * Sets the returnValue value for this OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.
     * 
     * @param returnValue
     */
    public void setReturnValue(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentRevision[] returnValue) {
        this.returnValue = returnValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResultOfArrayOfDocumentRevisionwJCT_PyJf)) return false;
        OperationResultOfArrayOfDocumentRevisionwJCT_PyJf other = (OperationResultOfArrayOfDocumentRevisionwJCT_PyJf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.returnValue==null && other.getReturnValue()==null) || 
             (this.returnValue!=null &&
              java.util.Arrays.equals(this.returnValue, other.getReturnValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getReturnValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResultOfArrayOfDocumentRevisionwJCT_PyJf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentRevisionwJCT_PyJf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ResultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ReturnValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentRevision"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentRevision"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
