/**
 * GetAllSearcheableFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllSearcheableFieldsResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSearcheableMetadataTypewJCT_PyJf getAllSearcheableFieldsResult;

    public GetAllSearcheableFieldsResponse() {
    }

    public GetAllSearcheableFieldsResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSearcheableMetadataTypewJCT_PyJf getAllSearcheableFieldsResult) {
           this.getAllSearcheableFieldsResult = getAllSearcheableFieldsResult;
    }


    /**
     * Gets the getAllSearcheableFieldsResult value for this GetAllSearcheableFieldsResponse.
     * 
     * @return getAllSearcheableFieldsResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSearcheableMetadataTypewJCT_PyJf getGetAllSearcheableFieldsResult() {
        return getAllSearcheableFieldsResult;
    }


    /**
     * Sets the getAllSearcheableFieldsResult value for this GetAllSearcheableFieldsResponse.
     * 
     * @param getAllSearcheableFieldsResult
     */
    public void setGetAllSearcheableFieldsResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSearcheableMetadataTypewJCT_PyJf getAllSearcheableFieldsResult) {
        this.getAllSearcheableFieldsResult = getAllSearcheableFieldsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllSearcheableFieldsResponse)) return false;
        GetAllSearcheableFieldsResponse other = (GetAllSearcheableFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllSearcheableFieldsResult==null && other.getGetAllSearcheableFieldsResult()==null) || 
             (this.getAllSearcheableFieldsResult!=null &&
              this.getAllSearcheableFieldsResult.equals(other.getGetAllSearcheableFieldsResult())));
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
        if (getGetAllSearcheableFieldsResult() != null) {
            _hashCode += getGetAllSearcheableFieldsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllSearcheableFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllSearcheableFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllSearcheableFieldsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllSearcheableFieldsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfSearcheableMetadataTypewJCT_PyJf"));
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
