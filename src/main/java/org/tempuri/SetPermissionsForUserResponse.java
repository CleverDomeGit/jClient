/**
 * SetPermissionsForUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SetPermissionsForUserResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setPermissionsForUserResult;

    public SetPermissionsForUserResponse() {
    }

    public SetPermissionsForUserResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setPermissionsForUserResult) {
           this.setPermissionsForUserResult = setPermissionsForUserResult;
    }


    /**
     * Gets the setPermissionsForUserResult value for this SetPermissionsForUserResponse.
     * 
     * @return setPermissionsForUserResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType getSetPermissionsForUserResult() {
        return setPermissionsForUserResult;
    }


    /**
     * Sets the setPermissionsForUserResult value for this SetPermissionsForUserResponse.
     * 
     * @param setPermissionsForUserResult
     */
    public void setSetPermissionsForUserResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setPermissionsForUserResult) {
        this.setPermissionsForUserResult = setPermissionsForUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetPermissionsForUserResponse)) return false;
        SetPermissionsForUserResponse other = (SetPermissionsForUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setPermissionsForUserResult==null && other.getSetPermissionsForUserResult()==null) || 
             (this.setPermissionsForUserResult!=null &&
              this.setPermissionsForUserResult.equals(other.getSetPermissionsForUserResult())));
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
        if (getSetPermissionsForUserResult() != null) {
            _hashCode += getSetPermissionsForUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetPermissionsForUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetPermissionsForUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setPermissionsForUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SetPermissionsForUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfanyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
