/**
 * GetAllUserDocumentsArchiveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllUserDocumentsArchiveResponse  implements java.io.Serializable {
    private byte[] getAllUserDocumentsArchiveResult;

    public GetAllUserDocumentsArchiveResponse() {
    }

    public GetAllUserDocumentsArchiveResponse(
           byte[] getAllUserDocumentsArchiveResult) {
           this.getAllUserDocumentsArchiveResult = getAllUserDocumentsArchiveResult;
    }


    /**
     * Gets the getAllUserDocumentsArchiveResult value for this GetAllUserDocumentsArchiveResponse.
     * 
     * @return getAllUserDocumentsArchiveResult
     */
    public byte[] getGetAllUserDocumentsArchiveResult() {
        return getAllUserDocumentsArchiveResult;
    }


    /**
     * Sets the getAllUserDocumentsArchiveResult value for this GetAllUserDocumentsArchiveResponse.
     * 
     * @param getAllUserDocumentsArchiveResult
     */
    public void setGetAllUserDocumentsArchiveResult(byte[] getAllUserDocumentsArchiveResult) {
        this.getAllUserDocumentsArchiveResult = getAllUserDocumentsArchiveResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllUserDocumentsArchiveResponse)) return false;
        GetAllUserDocumentsArchiveResponse other = (GetAllUserDocumentsArchiveResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllUserDocumentsArchiveResult==null && other.getGetAllUserDocumentsArchiveResult()==null) || 
             (this.getAllUserDocumentsArchiveResult!=null &&
              java.util.Arrays.equals(this.getAllUserDocumentsArchiveResult, other.getGetAllUserDocumentsArchiveResult())));
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
        if (getGetAllUserDocumentsArchiveResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllUserDocumentsArchiveResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllUserDocumentsArchiveResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllUserDocumentsArchiveResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllUserDocumentsArchiveResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllUserDocumentsArchiveResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllUserDocumentsArchiveResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
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
