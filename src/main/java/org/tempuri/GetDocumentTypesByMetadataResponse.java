/**
 * GetDocumentTypesByMetadataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDocumentTypesByMetadataResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesByMetadataResult;

    public GetDocumentTypesByMetadataResponse() {
    }

    public GetDocumentTypesByMetadataResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesByMetadataResult) {
           this.getDocumentTypesByMetadataResult = getDocumentTypesByMetadataResult;
    }


    /**
     * Gets the getDocumentTypesByMetadataResult value for this GetDocumentTypesByMetadataResponse.
     * 
     * @return getDocumentTypesByMetadataResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTypewJCT_PyJf getGetDocumentTypesByMetadataResult() {
        return getDocumentTypesByMetadataResult;
    }


    /**
     * Sets the getDocumentTypesByMetadataResult value for this GetDocumentTypesByMetadataResponse.
     * 
     * @param getDocumentTypesByMetadataResult
     */
    public void setGetDocumentTypesByMetadataResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesByMetadataResult) {
        this.getDocumentTypesByMetadataResult = getDocumentTypesByMetadataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentTypesByMetadataResponse)) return false;
        GetDocumentTypesByMetadataResponse other = (GetDocumentTypesByMetadataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentTypesByMetadataResult==null && other.getGetDocumentTypesByMetadataResult()==null) || 
             (this.getDocumentTypesByMetadataResult!=null &&
              this.getDocumentTypesByMetadataResult.equals(other.getGetDocumentTypesByMetadataResult())));
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
        if (getGetDocumentTypesByMetadataResult() != null) {
            _hashCode += getGetDocumentTypesByMetadataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentTypesByMetadataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentTypesByMetadataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentTypesByMetadataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentTypesByMetadataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentTypewJCT_PyJf"));
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
