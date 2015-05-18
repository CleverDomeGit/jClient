/**
 * RecentDocumentsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data;

public class RecentDocumentsInfo  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ChangedDocument[] changedDocuments;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.RecentlyUploadedDocumentInfo[] uploadedDocuments;

    public RecentDocumentsInfo() {
    }

    public RecentDocumentsInfo(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ChangedDocument[] changedDocuments,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.RecentlyUploadedDocumentInfo[] uploadedDocuments) {
           this.changedDocuments = changedDocuments;
           this.uploadedDocuments = uploadedDocuments;
    }


    /**
     * Gets the changedDocuments value for this RecentDocumentsInfo.
     * 
     * @return changedDocuments
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ChangedDocument[] getChangedDocuments() {
        return changedDocuments;
    }


    /**
     * Sets the changedDocuments value for this RecentDocumentsInfo.
     * 
     * @param changedDocuments
     */
    public void setChangedDocuments(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ChangedDocument[] changedDocuments) {
        this.changedDocuments = changedDocuments;
    }


    /**
     * Gets the uploadedDocuments value for this RecentDocumentsInfo.
     * 
     * @return uploadedDocuments
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.RecentlyUploadedDocumentInfo[] getUploadedDocuments() {
        return uploadedDocuments;
    }


    /**
     * Sets the uploadedDocuments value for this RecentDocumentsInfo.
     * 
     * @param uploadedDocuments
     */
    public void setUploadedDocuments(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.RecentlyUploadedDocumentInfo[] uploadedDocuments) {
        this.uploadedDocuments = uploadedDocuments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecentDocumentsInfo)) return false;
        RecentDocumentsInfo other = (RecentDocumentsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changedDocuments==null && other.getChangedDocuments()==null) || 
             (this.changedDocuments!=null &&
              java.util.Arrays.equals(this.changedDocuments, other.getChangedDocuments()))) &&
            ((this.uploadedDocuments==null && other.getUploadedDocuments()==null) || 
             (this.uploadedDocuments!=null &&
              java.util.Arrays.equals(this.uploadedDocuments, other.getUploadedDocuments())));
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
        if (getChangedDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUploadedDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUploadedDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUploadedDocuments(), i);
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
        new org.apache.axis.description.TypeDesc(RecentDocumentsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecentDocumentsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ChangedDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ChangedDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ChangedDocument"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UploadedDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecentlyUploadedDocumentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecentlyUploadedDocumentInfo"));
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
