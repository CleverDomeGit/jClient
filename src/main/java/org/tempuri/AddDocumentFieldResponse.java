/**
 * AddDocumentFieldResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddDocumentFieldResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint addDocumentFieldResult;

    public AddDocumentFieldResponse() {
    }

    public AddDocumentFieldResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint addDocumentFieldResult) {
           this.addDocumentFieldResult = addDocumentFieldResult;
    }


    /**
     * Gets the addDocumentFieldResult value for this AddDocumentFieldResponse.
     * 
     * @return addDocumentFieldResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint getAddDocumentFieldResult() {
        return addDocumentFieldResult;
    }


    /**
     * Sets the addDocumentFieldResult value for this AddDocumentFieldResponse.
     * 
     * @param addDocumentFieldResult
     */
    public void setAddDocumentFieldResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint addDocumentFieldResult) {
        this.addDocumentFieldResult = addDocumentFieldResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddDocumentFieldResponse)) return false;
        AddDocumentFieldResponse other = (AddDocumentFieldResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addDocumentFieldResult==null && other.getAddDocumentFieldResult()==null) || 
             (this.addDocumentFieldResult!=null &&
              this.addDocumentFieldResult.equals(other.getAddDocumentFieldResult())));
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
        if (getAddDocumentFieldResult() != null) {
            _hashCode += getAddDocumentFieldResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddDocumentFieldResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddDocumentFieldResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addDocumentFieldResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddDocumentFieldResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfint"));
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
