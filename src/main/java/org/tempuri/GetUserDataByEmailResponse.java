/**
 * GetUserDataByEmailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetUserDataByEmailResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfUserDatawJCT_PyJf getUserDataByEmailResult;

    public GetUserDataByEmailResponse() {
    }

    public GetUserDataByEmailResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfUserDatawJCT_PyJf getUserDataByEmailResult) {
           this.getUserDataByEmailResult = getUserDataByEmailResult;
    }


    /**
     * Gets the getUserDataByEmailResult value for this GetUserDataByEmailResponse.
     * 
     * @return getUserDataByEmailResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfUserDatawJCT_PyJf getGetUserDataByEmailResult() {
        return getUserDataByEmailResult;
    }


    /**
     * Sets the getUserDataByEmailResult value for this GetUserDataByEmailResponse.
     * 
     * @param getUserDataByEmailResult
     */
    public void setGetUserDataByEmailResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfUserDatawJCT_PyJf getUserDataByEmailResult) {
        this.getUserDataByEmailResult = getUserDataByEmailResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserDataByEmailResponse)) return false;
        GetUserDataByEmailResponse other = (GetUserDataByEmailResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserDataByEmailResult==null && other.getGetUserDataByEmailResult()==null) || 
             (this.getUserDataByEmailResult!=null &&
              this.getUserDataByEmailResult.equals(other.getGetUserDataByEmailResult())));
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
        if (getGetUserDataByEmailResult() != null) {
            _hashCode += getGetUserDataByEmailResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserDataByEmailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetUserDataByEmailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserDataByEmailResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetUserDataByEmailResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfUserDatawJCT_PyJf"));
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
