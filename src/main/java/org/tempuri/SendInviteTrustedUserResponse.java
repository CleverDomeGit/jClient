/**
 * SendInviteTrustedUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SendInviteTrustedUserResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType sendInviteTrustedUserResult;

    public SendInviteTrustedUserResponse() {
    }

    public SendInviteTrustedUserResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType sendInviteTrustedUserResult) {
           this.sendInviteTrustedUserResult = sendInviteTrustedUserResult;
    }


    /**
     * Gets the sendInviteTrustedUserResult value for this SendInviteTrustedUserResponse.
     * 
     * @return sendInviteTrustedUserResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType getSendInviteTrustedUserResult() {
        return sendInviteTrustedUserResult;
    }


    /**
     * Sets the sendInviteTrustedUserResult value for this SendInviteTrustedUserResponse.
     * 
     * @param sendInviteTrustedUserResult
     */
    public void setSendInviteTrustedUserResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType sendInviteTrustedUserResult) {
        this.sendInviteTrustedUserResult = sendInviteTrustedUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendInviteTrustedUserResponse)) return false;
        SendInviteTrustedUserResponse other = (SendInviteTrustedUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendInviteTrustedUserResult==null && other.getSendInviteTrustedUserResult()==null) || 
             (this.sendInviteTrustedUserResult!=null &&
              this.sendInviteTrustedUserResult.equals(other.getSendInviteTrustedUserResult())));
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
        if (getSendInviteTrustedUserResult() != null) {
            _hashCode += getSendInviteTrustedUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendInviteTrustedUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SendInviteTrustedUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendInviteTrustedUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SendInviteTrustedUserResult"));
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
