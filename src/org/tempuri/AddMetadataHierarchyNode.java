/**
 * AddMetadataHierarchyNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddMetadataHierarchyNode  implements java.io.Serializable {
    private java.lang.String sessionID;

    private org.datacontract.schemas._2004._07.CDSImaging.BaseDocumentMetadataHierarchyElement[] elems;

    public AddMetadataHierarchyNode() {
    }

    public AddMetadataHierarchyNode(
           java.lang.String sessionID,
           org.datacontract.schemas._2004._07.CDSImaging.BaseDocumentMetadataHierarchyElement[] elems) {
           this.sessionID = sessionID;
           this.elems = elems;
    }


    /**
     * Gets the sessionID value for this AddMetadataHierarchyNode.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this AddMetadataHierarchyNode.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the elems value for this AddMetadataHierarchyNode.
     * 
     * @return elems
     */
    public org.datacontract.schemas._2004._07.CDSImaging.BaseDocumentMetadataHierarchyElement[] getElems() {
        return elems;
    }


    /**
     * Sets the elems value for this AddMetadataHierarchyNode.
     * 
     * @param elems
     */
    public void setElems(org.datacontract.schemas._2004._07.CDSImaging.BaseDocumentMetadataHierarchyElement[] elems) {
        this.elems = elems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddMetadataHierarchyNode)) return false;
        AddMetadataHierarchyNode other = (AddMetadataHierarchyNode) obj;
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
            ((this.elems==null && other.getElems()==null) || 
             (this.elems!=null &&
              java.util.Arrays.equals(this.elems, other.getElems())));
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
        if (getElems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElems(), i);
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
        new org.apache.axis.description.TypeDesc(AddMetadataHierarchyNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddMetadataHierarchyNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "elems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "BaseDocument.MetadataHierarchyElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "BaseDocument.MetadataHierarchyElement"));
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
