/**
 * CreateDocumentTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CreateDocumentTypeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTypewJCT_PyJf createDocumentTypeResult;

    public CreateDocumentTypeResponse() {
    }

    public CreateDocumentTypeResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTypewJCT_PyJf createDocumentTypeResult) {
           this.createDocumentTypeResult = createDocumentTypeResult;
    }


    /**
     * Gets the createDocumentTypeResult value for this CreateDocumentTypeResponse.
     * 
     * @return createDocumentTypeResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTypewJCT_PyJf getCreateDocumentTypeResult() {
        return createDocumentTypeResult;
    }


    /**
     * Sets the createDocumentTypeResult value for this CreateDocumentTypeResponse.
     * 
     * @param createDocumentTypeResult
     */
    public void setCreateDocumentTypeResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTypewJCT_PyJf createDocumentTypeResult) {
        this.createDocumentTypeResult = createDocumentTypeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateDocumentTypeResponse)) return false;
        CreateDocumentTypeResponse other = (CreateDocumentTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDocumentTypeResult==null && other.getCreateDocumentTypeResult()==null) || 
             (this.createDocumentTypeResult!=null &&
              this.createDocumentTypeResult.equals(other.getCreateDocumentTypeResult())));
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
        if (getCreateDocumentTypeResult() != null) {
            _hashCode += getCreateDocumentTypeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateDocumentTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CreateDocumentTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDocumentTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreateDocumentTypeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentTypewJCT_PyJf"));
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
