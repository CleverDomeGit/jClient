/**
 * GetAllDocumentTemplatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllDocumentTemplatesResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getAllDocumentTemplatesResult;

    public GetAllDocumentTemplatesResponse() {
    }

    public GetAllDocumentTemplatesResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getAllDocumentTemplatesResult) {
           this.getAllDocumentTemplatesResult = getAllDocumentTemplatesResult;
    }


    /**
     * Gets the getAllDocumentTemplatesResult value for this GetAllDocumentTemplatesResponse.
     * 
     * @return getAllDocumentTemplatesResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getGetAllDocumentTemplatesResult() {
        return getAllDocumentTemplatesResult;
    }


    /**
     * Sets the getAllDocumentTemplatesResult value for this GetAllDocumentTemplatesResponse.
     * 
     * @param getAllDocumentTemplatesResult
     */
    public void setGetAllDocumentTemplatesResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getAllDocumentTemplatesResult) {
        this.getAllDocumentTemplatesResult = getAllDocumentTemplatesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllDocumentTemplatesResponse)) return false;
        GetAllDocumentTemplatesResponse other = (GetAllDocumentTemplatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllDocumentTemplatesResult==null && other.getGetAllDocumentTemplatesResult()==null) || 
             (this.getAllDocumentTemplatesResult!=null &&
              this.getAllDocumentTemplatesResult.equals(other.getGetAllDocumentTemplatesResult())));
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
        if (getGetAllDocumentTemplatesResult() != null) {
            _hashCode += getGetAllDocumentTemplatesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllDocumentTemplatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDocumentTemplatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllDocumentTemplatesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDocumentTemplatesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentTemplatewJCT_PyJf"));
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
