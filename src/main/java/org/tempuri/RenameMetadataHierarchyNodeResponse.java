/**
 * RenameMetadataHierarchyNodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class RenameMetadataHierarchyNodeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean renameMetadataHierarchyNodeResult;

    public RenameMetadataHierarchyNodeResponse() {
    }

    public RenameMetadataHierarchyNodeResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean renameMetadataHierarchyNodeResult) {
           this.renameMetadataHierarchyNodeResult = renameMetadataHierarchyNodeResult;
    }


    /**
     * Gets the renameMetadataHierarchyNodeResult value for this RenameMetadataHierarchyNodeResponse.
     * 
     * @return renameMetadataHierarchyNodeResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean getRenameMetadataHierarchyNodeResult() {
        return renameMetadataHierarchyNodeResult;
    }


    /**
     * Sets the renameMetadataHierarchyNodeResult value for this RenameMetadataHierarchyNodeResponse.
     * 
     * @param renameMetadataHierarchyNodeResult
     */
    public void setRenameMetadataHierarchyNodeResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean renameMetadataHierarchyNodeResult) {
        this.renameMetadataHierarchyNodeResult = renameMetadataHierarchyNodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenameMetadataHierarchyNodeResponse)) return false;
        RenameMetadataHierarchyNodeResponse other = (RenameMetadataHierarchyNodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.renameMetadataHierarchyNodeResult==null && other.getRenameMetadataHierarchyNodeResult()==null) || 
             (this.renameMetadataHierarchyNodeResult!=null &&
              this.renameMetadataHierarchyNodeResult.equals(other.getRenameMetadataHierarchyNodeResult())));
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
        if (getRenameMetadataHierarchyNodeResult() != null) {
            _hashCode += getRenameMetadataHierarchyNodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenameMetadataHierarchyNodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RenameMetadataHierarchyNodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renameMetadataHierarchyNodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RenameMetadataHierarchyNodeResult"));
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
