/**
 * GetDocumentMetadataHierarchyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDocumentMetadataHierarchyResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getDocumentMetadataHierarchyResult;

    public GetDocumentMetadataHierarchyResponse() {
    }

    public GetDocumentMetadataHierarchyResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getDocumentMetadataHierarchyResult) {
           this.getDocumentMetadataHierarchyResult = getDocumentMetadataHierarchyResult;
    }


    /**
     * Gets the getDocumentMetadataHierarchyResult value for this GetDocumentMetadataHierarchyResponse.
     * 
     * @return getDocumentMetadataHierarchyResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getGetDocumentMetadataHierarchyResult() {
        return getDocumentMetadataHierarchyResult;
    }


    /**
     * Sets the getDocumentMetadataHierarchyResult value for this GetDocumentMetadataHierarchyResponse.
     * 
     * @param getDocumentMetadataHierarchyResult
     */
    public void setGetDocumentMetadataHierarchyResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getDocumentMetadataHierarchyResult) {
        this.getDocumentMetadataHierarchyResult = getDocumentMetadataHierarchyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentMetadataHierarchyResponse)) return false;
        GetDocumentMetadataHierarchyResponse other = (GetDocumentMetadataHierarchyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentMetadataHierarchyResult==null && other.getGetDocumentMetadataHierarchyResult()==null) || 
             (this.getDocumentMetadataHierarchyResult!=null &&
              this.getDocumentMetadataHierarchyResult.equals(other.getGetDocumentMetadataHierarchyResult())));
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
        if (getGetDocumentMetadataHierarchyResult() != null) {
            _hashCode += getGetDocumentMetadataHierarchyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentMetadataHierarchyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentMetadataHierarchyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentMetadataHierarchyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentMetadataHierarchyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfBaseDocument.MetadataHierarchyElementjJIl8QZi"));
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
