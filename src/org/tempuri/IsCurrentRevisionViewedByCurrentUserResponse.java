/**
 * IsCurrentRevisionViewedByCurrentUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IsCurrentRevisionViewedByCurrentUserResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean isCurrentRevisionViewedByCurrentUserResult;

    public IsCurrentRevisionViewedByCurrentUserResponse() {
    }

    public IsCurrentRevisionViewedByCurrentUserResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean isCurrentRevisionViewedByCurrentUserResult) {
           this.isCurrentRevisionViewedByCurrentUserResult = isCurrentRevisionViewedByCurrentUserResult;
    }


    /**
     * Gets the isCurrentRevisionViewedByCurrentUserResult value for this IsCurrentRevisionViewedByCurrentUserResponse.
     * 
     * @return isCurrentRevisionViewedByCurrentUserResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean getIsCurrentRevisionViewedByCurrentUserResult() {
        return isCurrentRevisionViewedByCurrentUserResult;
    }


    /**
     * Sets the isCurrentRevisionViewedByCurrentUserResult value for this IsCurrentRevisionViewedByCurrentUserResponse.
     * 
     * @param isCurrentRevisionViewedByCurrentUserResult
     */
    public void setIsCurrentRevisionViewedByCurrentUserResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean isCurrentRevisionViewedByCurrentUserResult) {
        this.isCurrentRevisionViewedByCurrentUserResult = isCurrentRevisionViewedByCurrentUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsCurrentRevisionViewedByCurrentUserResponse)) return false;
        IsCurrentRevisionViewedByCurrentUserResponse other = (IsCurrentRevisionViewedByCurrentUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isCurrentRevisionViewedByCurrentUserResult==null && other.getIsCurrentRevisionViewedByCurrentUserResult()==null) || 
             (this.isCurrentRevisionViewedByCurrentUserResult!=null &&
              this.isCurrentRevisionViewedByCurrentUserResult.equals(other.getIsCurrentRevisionViewedByCurrentUserResult())));
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
        if (getIsCurrentRevisionViewedByCurrentUserResult() != null) {
            _hashCode += getIsCurrentRevisionViewedByCurrentUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsCurrentRevisionViewedByCurrentUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsCurrentRevisionViewedByCurrentUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCurrentRevisionViewedByCurrentUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsCurrentRevisionViewedByCurrentUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfboolean"));
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
