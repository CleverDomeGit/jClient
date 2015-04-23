/**
 * DocumentsSharingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data;

public class DocumentsSharingInfo  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.PermissionData[] availablePermissions;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserDocumentsSharedInfo[] documentUsersSharing;

    private org.datacontract.schemas._2004._07.CDSImaging.DocumentSharingTrustedUser[] trustedUsers;

    public DocumentsSharingInfo() {
    }

    public DocumentsSharingInfo(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.PermissionData[] availablePermissions,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserDocumentsSharedInfo[] documentUsersSharing,
           org.datacontract.schemas._2004._07.CDSImaging.DocumentSharingTrustedUser[] trustedUsers) {
           this.availablePermissions = availablePermissions;
           this.documentUsersSharing = documentUsersSharing;
           this.trustedUsers = trustedUsers;
    }


    /**
     * Gets the availablePermissions value for this DocumentsSharingInfo.
     * 
     * @return availablePermissions
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.PermissionData[] getAvailablePermissions() {
        return availablePermissions;
    }


    /**
     * Sets the availablePermissions value for this DocumentsSharingInfo.
     * 
     * @param availablePermissions
     */
    public void setAvailablePermissions(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.PermissionData[] availablePermissions) {
        this.availablePermissions = availablePermissions;
    }


    /**
     * Gets the documentUsersSharing value for this DocumentsSharingInfo.
     * 
     * @return documentUsersSharing
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserDocumentsSharedInfo[] getDocumentUsersSharing() {
        return documentUsersSharing;
    }


    /**
     * Sets the documentUsersSharing value for this DocumentsSharingInfo.
     * 
     * @param documentUsersSharing
     */
    public void setDocumentUsersSharing(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserDocumentsSharedInfo[] documentUsersSharing) {
        this.documentUsersSharing = documentUsersSharing;
    }


    /**
     * Gets the trustedUsers value for this DocumentsSharingInfo.
     * 
     * @return trustedUsers
     */
    public org.datacontract.schemas._2004._07.CDSImaging.DocumentSharingTrustedUser[] getTrustedUsers() {
        return trustedUsers;
    }


    /**
     * Sets the trustedUsers value for this DocumentsSharingInfo.
     * 
     * @param trustedUsers
     */
    public void setTrustedUsers(org.datacontract.schemas._2004._07.CDSImaging.DocumentSharingTrustedUser[] trustedUsers) {
        this.trustedUsers = trustedUsers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentsSharingInfo)) return false;
        DocumentsSharingInfo other = (DocumentsSharingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availablePermissions==null && other.getAvailablePermissions()==null) || 
             (this.availablePermissions!=null &&
              java.util.Arrays.equals(this.availablePermissions, other.getAvailablePermissions()))) &&
            ((this.documentUsersSharing==null && other.getDocumentUsersSharing()==null) || 
             (this.documentUsersSharing!=null &&
              java.util.Arrays.equals(this.documentUsersSharing, other.getDocumentUsersSharing()))) &&
            ((this.trustedUsers==null && other.getTrustedUsers()==null) || 
             (this.trustedUsers!=null &&
              java.util.Arrays.equals(this.trustedUsers, other.getTrustedUsers())));
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
        if (getAvailablePermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailablePermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailablePermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentUsersSharing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentUsersSharing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentUsersSharing(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrustedUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedUsers(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentsSharingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentsSharingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "AvailablePermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PermissionData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PermissionData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentUsersSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentUsersSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserDocumentsSharedInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserDocumentsSharedInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "TrustedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "DocumentSharing.TrustedUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "DocumentSharing.TrustedUser"));
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
