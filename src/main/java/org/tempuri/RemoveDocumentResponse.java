/**
 * RemoveDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class RemoveDocumentResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean removeDocumentResult;

    public RemoveDocumentResponse() {
    }

    public RemoveDocumentResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean removeDocumentResult) {
           this.removeDocumentResult = removeDocumentResult;
    }


    /**
     * Gets the removeDocumentResult value for this RemoveDocumentResponse.
     * 
     * @return removeDocumentResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean getRemoveDocumentResult() {
        return removeDocumentResult;
    }


    /**
     * Sets the removeDocumentResult value for this RemoveDocumentResponse.
     * 
     * @param removeDocumentResult
     */
    public void setRemoveDocumentResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean removeDocumentResult) {
        this.removeDocumentResult = removeDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveDocumentResponse)) return false;
        RemoveDocumentResponse other = (RemoveDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeDocumentResult==null && other.getRemoveDocumentResult()==null) || 
             (this.removeDocumentResult!=null &&
              this.removeDocumentResult.equals(other.getRemoveDocumentResult())));
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
        if (getRemoveDocumentResult() != null) {
            _hashCode += getRemoveDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveDocumentResult"));
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
