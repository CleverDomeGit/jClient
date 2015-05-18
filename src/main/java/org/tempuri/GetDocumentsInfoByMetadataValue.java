/**
 * GetDocumentsInfoByMetadataValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDocumentsInfoByMetadataValue  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.Integer applicationID;

    private java.lang.Integer templateID;

    private java.lang.Integer typeID;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues;

    private org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams listPageInfo;

    private java.util.Calendar fromTime;

    private java.lang.String searchTerm;

    private java.lang.Boolean shared;

    public GetDocumentsInfoByMetadataValue() {
    }

    public GetDocumentsInfoByMetadataValue(
           java.lang.String sessionID,
           java.lang.Integer applicationID,
           java.lang.Integer templateID,
           java.lang.Integer typeID,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues,
           org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams listPageInfo,
           java.util.Calendar fromTime,
           java.lang.String searchTerm,
           java.lang.Boolean shared) {
           this.sessionID = sessionID;
           this.applicationID = applicationID;
           this.templateID = templateID;
           this.typeID = typeID;
           this.metadataValues = metadataValues;
           this.listPageInfo = listPageInfo;
           this.fromTime = fromTime;
           this.searchTerm = searchTerm;
           this.shared = shared;
    }


    /**
     * Gets the sessionID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the applicationID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the templateID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return templateID
     */
    public java.lang.Integer getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param templateID
     */
    public void setTemplateID(java.lang.Integer templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the typeID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return typeID
     */
    public java.lang.Integer getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param typeID
     */
    public void setTypeID(java.lang.Integer typeID) {
        this.typeID = typeID;
    }


    /**
     * Gets the metadataValues value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return metadataValues
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] getMetadataValues() {
        return metadataValues;
    }


    /**
     * Sets the metadataValues value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param metadataValues
     */
    public void setMetadataValues(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues) {
        this.metadataValues = metadataValues;
    }


    /**
     * Gets the listPageInfo value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return listPageInfo
     */
    public org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams getListPageInfo() {
        return listPageInfo;
    }


    /**
     * Sets the listPageInfo value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param listPageInfo
     */
    public void setListPageInfo(org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams listPageInfo) {
        this.listPageInfo = listPageInfo;
    }


    /**
     * Gets the fromTime value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return fromTime
     */
    public java.util.Calendar getFromTime() {
        return fromTime;
    }


    /**
     * Sets the fromTime value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param fromTime
     */
    public void setFromTime(java.util.Calendar fromTime) {
        this.fromTime = fromTime;
    }


    /**
     * Gets the searchTerm value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return searchTerm
     */
    public java.lang.String getSearchTerm() {
        return searchTerm;
    }


    /**
     * Sets the searchTerm value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param searchTerm
     */
    public void setSearchTerm(java.lang.String searchTerm) {
        this.searchTerm = searchTerm;
    }


    /**
     * Gets the shared value for this GetDocumentsInfoByMetadataValue.
     * 
     * @return shared
     */
    public java.lang.Boolean getShared() {
        return shared;
    }


    /**
     * Sets the shared value for this GetDocumentsInfoByMetadataValue.
     * 
     * @param shared
     */
    public void setShared(java.lang.Boolean shared) {
        this.shared = shared;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsInfoByMetadataValue)) return false;
        GetDocumentsInfoByMetadataValue other = (GetDocumentsInfoByMetadataValue) obj;
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
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.templateID==null && other.getTemplateID()==null) || 
             (this.templateID!=null &&
              this.templateID.equals(other.getTemplateID()))) &&
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID()))) &&
            ((this.metadataValues==null && other.getMetadataValues()==null) || 
             (this.metadataValues!=null &&
              java.util.Arrays.equals(this.metadataValues, other.getMetadataValues()))) &&
            ((this.listPageInfo==null && other.getListPageInfo()==null) || 
             (this.listPageInfo!=null &&
              this.listPageInfo.equals(other.getListPageInfo()))) &&
            ((this.fromTime==null && other.getFromTime()==null) || 
             (this.fromTime!=null &&
              this.fromTime.equals(other.getFromTime()))) &&
            ((this.searchTerm==null && other.getSearchTerm()==null) || 
             (this.searchTerm!=null &&
              this.searchTerm.equals(other.getSearchTerm()))) &&
            ((this.shared==null && other.getShared()==null) || 
             (this.shared!=null &&
              this.shared.equals(other.getShared())));
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
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getTemplateID() != null) {
            _hashCode += getTemplateID().hashCode();
        }
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        if (getMetadataValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetadataValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetadataValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListPageInfo() != null) {
            _hashCode += getListPageInfo().hashCode();
        }
        if (getFromTime() != null) {
            _hashCode += getFromTime().hashCode();
        }
        if (getSearchTerm() != null) {
            _hashCode += getSearchTerm().hashCode();
        }
        if (getShared() != null) {
            _hashCode += getShared().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsInfoByMetadataValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsInfoByMetadataValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "applicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "templateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "typeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "metadataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "listPageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Pager", "ListPagerParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fromTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "searchTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
