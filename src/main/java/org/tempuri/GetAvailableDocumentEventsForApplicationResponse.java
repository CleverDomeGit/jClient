/**
 * GetAvailableDocumentEventsForApplicationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAvailableDocumentEventsForApplicationResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAvailableDocumentEventsForApplicationResult;

    public GetAvailableDocumentEventsForApplicationResponse() {
    }

    public GetAvailableDocumentEventsForApplicationResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAvailableDocumentEventsForApplicationResult) {
           this.getAvailableDocumentEventsForApplicationResult = getAvailableDocumentEventsForApplicationResult;
    }


    /**
     * Gets the getAvailableDocumentEventsForApplicationResult value for this GetAvailableDocumentEventsForApplicationResponse.
     * 
     * @return getAvailableDocumentEventsForApplicationResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getGetAvailableDocumentEventsForApplicationResult() {
        return getAvailableDocumentEventsForApplicationResult;
    }


    /**
     * Sets the getAvailableDocumentEventsForApplicationResult value for this GetAvailableDocumentEventsForApplicationResponse.
     * 
     * @param getAvailableDocumentEventsForApplicationResult
     */
    public void setGetAvailableDocumentEventsForApplicationResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAvailableDocumentEventsForApplicationResult) {
        this.getAvailableDocumentEventsForApplicationResult = getAvailableDocumentEventsForApplicationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableDocumentEventsForApplicationResponse)) return false;
        GetAvailableDocumentEventsForApplicationResponse other = (GetAvailableDocumentEventsForApplicationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAvailableDocumentEventsForApplicationResult==null && other.getGetAvailableDocumentEventsForApplicationResult()==null) || 
             (this.getAvailableDocumentEventsForApplicationResult!=null &&
              this.getAvailableDocumentEventsForApplicationResult.equals(other.getGetAvailableDocumentEventsForApplicationResult())));
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
        if (getGetAvailableDocumentEventsForApplicationResult() != null) {
            _hashCode += getGetAvailableDocumentEventsForApplicationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAvailableDocumentEventsForApplicationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAvailableDocumentEventsForApplicationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAvailableDocumentEventsForApplicationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAvailableDocumentEventsForApplicationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfBaseDocument.EventjJIl8QZi"));
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
