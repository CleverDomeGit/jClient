/**
 * AddNewExternalDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddNewExternalDocumentResponse  implements java.io.Serializable {
    private java.lang.String addNewExternalDocumentResult;

    public AddNewExternalDocumentResponse() {
    }

    public AddNewExternalDocumentResponse(
           java.lang.String addNewExternalDocumentResult) {
           this.addNewExternalDocumentResult = addNewExternalDocumentResult;
    }


    /**
     * Gets the addNewExternalDocumentResult value for this AddNewExternalDocumentResponse.
     * 
     * @return addNewExternalDocumentResult
     */
    public java.lang.String getAddNewExternalDocumentResult() {
        return addNewExternalDocumentResult;
    }


    /**
     * Sets the addNewExternalDocumentResult value for this AddNewExternalDocumentResponse.
     * 
     * @param addNewExternalDocumentResult
     */
    public void setAddNewExternalDocumentResult(java.lang.String addNewExternalDocumentResult) {
        this.addNewExternalDocumentResult = addNewExternalDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddNewExternalDocumentResponse)) return false;
        AddNewExternalDocumentResponse other = (AddNewExternalDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addNewExternalDocumentResult==null && other.getAddNewExternalDocumentResult()==null) || 
             (this.addNewExternalDocumentResult!=null &&
              this.addNewExternalDocumentResult.equals(other.getAddNewExternalDocumentResult())));
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
        if (getAddNewExternalDocumentResult() != null) {
            _hashCode += getAddNewExternalDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddNewExternalDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddNewExternalDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addNewExternalDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddNewExternalDocumentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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