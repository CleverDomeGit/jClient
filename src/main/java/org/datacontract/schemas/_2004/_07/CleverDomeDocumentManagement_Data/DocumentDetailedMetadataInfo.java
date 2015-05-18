/**
 * DocumentDetailedMetadataInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data;

public class DocumentDetailedMetadataInfo  extends org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.Document  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField[] allowedFieldTypes;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentBatch[] batches;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadata;

    public DocumentDetailedMetadataInfo() {
    }

    public DocumentDetailedMetadataInfo(
           java.lang.Integer applicationID,
           java.lang.String docGUID,
           java.lang.String docStatus,
           java.lang.String docTemplate,
           java.lang.String docType,
           java.lang.Integer documentTemplateID,
           java.lang.Integer documentTypeID,
           java.lang.String fileType,
           java.lang.String lastRevisionID,
           java.lang.String name,
           java.util.Calendar scanDate,
           java.lang.Integer systemID,
           java.lang.Integer uploadedByID,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField[] allowedFieldTypes,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentBatch[] batches,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadata) {
        super(
            applicationID,
            docGUID,
            docStatus,
            docTemplate,
            docType,
            documentTemplateID,
            documentTypeID,
            fileType,
            lastRevisionID,
            name,
            scanDate,
            systemID,
            uploadedByID);
        this.allowedFieldTypes = allowedFieldTypes;
        this.batches = batches;
        this.metadata = metadata;
    }


    /**
     * Gets the allowedFieldTypes value for this DocumentDetailedMetadataInfo.
     * 
     * @return allowedFieldTypes
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField[] getAllowedFieldTypes() {
        return allowedFieldTypes;
    }


    /**
     * Sets the allowedFieldTypes value for this DocumentDetailedMetadataInfo.
     * 
     * @param allowedFieldTypes
     */
    public void setAllowedFieldTypes(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField[] allowedFieldTypes) {
        this.allowedFieldTypes = allowedFieldTypes;
    }


    /**
     * Gets the batches value for this DocumentDetailedMetadataInfo.
     * 
     * @return batches
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentBatch[] getBatches() {
        return batches;
    }


    /**
     * Sets the batches value for this DocumentDetailedMetadataInfo.
     * 
     * @param batches
     */
    public void setBatches(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentBatch[] batches) {
        this.batches = batches;
    }


    /**
     * Gets the metadata value for this DocumentDetailedMetadataInfo.
     * 
     * @return metadata
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] getMetadata() {
        return metadata;
    }


    /**
     * Sets the metadata value for this DocumentDetailedMetadataInfo.
     * 
     * @param metadata
     */
    public void setMetadata(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadata) {
        this.metadata = metadata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentDetailedMetadataInfo)) return false;
        DocumentDetailedMetadataInfo other = (DocumentDetailedMetadataInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowedFieldTypes==null && other.getAllowedFieldTypes()==null) || 
             (this.allowedFieldTypes!=null &&
              java.util.Arrays.equals(this.allowedFieldTypes, other.getAllowedFieldTypes()))) &&
            ((this.batches==null && other.getBatches()==null) || 
             (this.batches!=null &&
              java.util.Arrays.equals(this.batches, other.getBatches()))) &&
            ((this.metadata==null && other.getMetadata()==null) || 
             (this.metadata!=null &&
              java.util.Arrays.equals(this.metadata, other.getMetadata())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAllowedFieldTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedFieldTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedFieldTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBatches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetadata(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentDetailedMetadataInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentDetailedMetadataInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedFieldTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "AllowedFieldTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batches");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Batches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Metadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
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
