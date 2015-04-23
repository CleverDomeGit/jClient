/**
 * SetMetadataValues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SetMetadataValues  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String documentGuid;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] documentMetadata;

    private int[] removeRecordIDs;

    public SetMetadataValues() {
    }

    public SetMetadataValues(
           java.lang.String sessionID,
           java.lang.String documentGuid,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] documentMetadata,
           int[] removeRecordIDs) {
           this.sessionID = sessionID;
           this.documentGuid = documentGuid;
           this.documentMetadata = documentMetadata;
           this.removeRecordIDs = removeRecordIDs;
    }


    /**
     * Gets the sessionID value for this SetMetadataValues.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this SetMetadataValues.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the documentGuid value for this SetMetadataValues.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this SetMetadataValues.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the documentMetadata value for this SetMetadataValues.
     * 
     * @return documentMetadata
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] getDocumentMetadata() {
        return documentMetadata;
    }


    /**
     * Sets the documentMetadata value for this SetMetadataValues.
     * 
     * @param documentMetadata
     */
    public void setDocumentMetadata(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] documentMetadata) {
        this.documentMetadata = documentMetadata;
    }


    /**
     * Gets the removeRecordIDs value for this SetMetadataValues.
     * 
     * @return removeRecordIDs
     */
    public int[] getRemoveRecordIDs() {
        return removeRecordIDs;
    }


    /**
     * Sets the removeRecordIDs value for this SetMetadataValues.
     * 
     * @param removeRecordIDs
     */
    public void setRemoveRecordIDs(int[] removeRecordIDs) {
        this.removeRecordIDs = removeRecordIDs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMetadataValues)) return false;
        SetMetadataValues other = (SetMetadataValues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.documentMetadata==null && other.getDocumentMetadata()==null) || 
             (this.documentMetadata!=null &&
              java.util.Arrays.equals(this.documentMetadata, other.getDocumentMetadata()))) &&
            ((this.removeRecordIDs==null && other.getRemoveRecordIDs()==null) || 
             (this.removeRecordIDs!=null &&
              java.util.Arrays.equals(this.removeRecordIDs, other.getRemoveRecordIDs())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
        }
        if (getDocumentMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentMetadata(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemoveRecordIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoveRecordIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoveRecordIDs(), i);
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
        new org.apache.axis.description.TypeDesc(SetMetadataValues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetMetadataValues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeRecordIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "removeRecordIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
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
