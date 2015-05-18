/**
 * ScopingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class ScopingType  implements java.io.Serializable {
    private protocol._0._2.SAML.tc.names.oasis.IDPListType IDPList;

    private org.apache.axis.types.URI[] requesterID;

    private org.apache.axis.types.NonNegativeInteger proxyCount;  // attribute

    public ScopingType() {
    }

    public ScopingType(
           protocol._0._2.SAML.tc.names.oasis.IDPListType IDPList,
           org.apache.axis.types.URI[] requesterID,
           org.apache.axis.types.NonNegativeInteger proxyCount) {
           this.IDPList = IDPList;
           this.requesterID = requesterID;
           this.proxyCount = proxyCount;
    }


    /**
     * Gets the IDPList value for this ScopingType.
     * 
     * @return IDPList
     */
    public protocol._0._2.SAML.tc.names.oasis.IDPListType getIDPList() {
        return IDPList;
    }


    /**
     * Sets the IDPList value for this ScopingType.
     * 
     * @param IDPList
     */
    public void setIDPList(protocol._0._2.SAML.tc.names.oasis.IDPListType IDPList) {
        this.IDPList = IDPList;
    }


    /**
     * Gets the requesterID value for this ScopingType.
     * 
     * @return requesterID
     */
    public org.apache.axis.types.URI[] getRequesterID() {
        return requesterID;
    }


    /**
     * Sets the requesterID value for this ScopingType.
     * 
     * @param requesterID
     */
    public void setRequesterID(org.apache.axis.types.URI[] requesterID) {
        this.requesterID = requesterID;
    }

    public org.apache.axis.types.URI getRequesterID(int i) {
        return this.requesterID[i];
    }

    public void setRequesterID(int i, org.apache.axis.types.URI _value) {
        this.requesterID[i] = _value;
    }


    /**
     * Gets the proxyCount value for this ScopingType.
     * 
     * @return proxyCount
     */
    public org.apache.axis.types.NonNegativeInteger getProxyCount() {
        return proxyCount;
    }


    /**
     * Sets the proxyCount value for this ScopingType.
     * 
     * @param proxyCount
     */
    public void setProxyCount(org.apache.axis.types.NonNegativeInteger proxyCount) {
        this.proxyCount = proxyCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScopingType)) return false;
        ScopingType other = (ScopingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDPList==null && other.getIDPList()==null) || 
             (this.IDPList!=null &&
              this.IDPList.equals(other.getIDPList()))) &&
            ((this.requesterID==null && other.getRequesterID()==null) || 
             (this.requesterID!=null &&
              java.util.Arrays.equals(this.requesterID, other.getRequesterID()))) &&
            ((this.proxyCount==null && other.getProxyCount()==null) || 
             (this.proxyCount!=null &&
              this.proxyCount.equals(other.getProxyCount())));
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
        if (getIDPList() != null) {
            _hashCode += getIDPList().hashCode();
        }
        if (getRequesterID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequesterID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequesterID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProxyCount() != null) {
            _hashCode += getProxyCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScopingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ScopingType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("proxyCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProxyCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDPList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "IDPList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "IDPListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequesterID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
