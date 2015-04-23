/**
 * AdvisorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.DocumentManagementCommon_Data;

public class AdvisorInfo  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData advisor;

    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData[] clients;

    public AdvisorInfo() {
    }

    public AdvisorInfo(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData advisor,
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData[] clients) {
           this.advisor = advisor;
           this.clients = clients;
    }


    /**
     * Gets the advisor value for this AdvisorInfo.
     * 
     * @return advisor
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData getAdvisor() {
        return advisor;
    }


    /**
     * Sets the advisor value for this AdvisorInfo.
     * 
     * @param advisor
     */
    public void setAdvisor(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData advisor) {
        this.advisor = advisor;
    }


    /**
     * Gets the clients value for this AdvisorInfo.
     * 
     * @return clients
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData[] getClients() {
        return clients;
    }


    /**
     * Sets the clients value for this AdvisorInfo.
     * 
     * @param clients
     */
    public void setClients(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.UserData[] clients) {
        this.clients = clients;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvisorInfo)) return false;
        AdvisorInfo other = (AdvisorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advisor==null && other.getAdvisor()==null) || 
             (this.advisor!=null &&
              this.advisor.equals(other.getAdvisor()))) &&
            ((this.clients==null && other.getClients()==null) || 
             (this.clients!=null &&
              java.util.Arrays.equals(this.clients, other.getClients())));
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
        if (getAdvisor() != null) {
            _hashCode += getAdvisor().hashCode();
        }
        if (getClients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClients(), i);
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
        new org.apache.axis.description.TypeDesc(AdvisorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "AdvisorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "Advisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "Clients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserData"));
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
