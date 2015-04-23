/**
 * IDPListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class IDPListType  implements java.io.Serializable {
    private protocol._0._2.SAML.tc.names.oasis.IDPEntryType[] IDPEntry;

    private org.apache.axis.types.URI getComplete;

    public IDPListType() {
    }

    public IDPListType(
           protocol._0._2.SAML.tc.names.oasis.IDPEntryType[] IDPEntry,
           org.apache.axis.types.URI getComplete) {
           this.IDPEntry = IDPEntry;
           this.getComplete = getComplete;
    }


    /**
     * Gets the IDPEntry value for this IDPListType.
     * 
     * @return IDPEntry
     */
    public protocol._0._2.SAML.tc.names.oasis.IDPEntryType[] getIDPEntry() {
        return IDPEntry;
    }


    /**
     * Sets the IDPEntry value for this IDPListType.
     * 
     * @param IDPEntry
     */
    public void setIDPEntry(protocol._0._2.SAML.tc.names.oasis.IDPEntryType[] IDPEntry) {
        this.IDPEntry = IDPEntry;
    }

    public protocol._0._2.SAML.tc.names.oasis.IDPEntryType getIDPEntry(int i) {
        return this.IDPEntry[i];
    }

    public void setIDPEntry(int i, protocol._0._2.SAML.tc.names.oasis.IDPEntryType _value) {
        this.IDPEntry[i] = _value;
    }


    /**
     * Gets the getComplete value for this IDPListType.
     * 
     * @return getComplete
     */
    public org.apache.axis.types.URI getGetComplete() {
        return getComplete;
    }


    /**
     * Sets the getComplete value for this IDPListType.
     * 
     * @param getComplete
     */
    public void setGetComplete(org.apache.axis.types.URI getComplete) {
        this.getComplete = getComplete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDPListType)) return false;
        IDPListType other = (IDPListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDPEntry==null && other.getIDPEntry()==null) || 
             (this.IDPEntry!=null &&
              java.util.Arrays.equals(this.IDPEntry, other.getIDPEntry()))) &&
            ((this.getComplete==null && other.getGetComplete()==null) || 
             (this.getComplete!=null &&
              this.getComplete.equals(other.getGetComplete())));
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
        if (getIDPEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIDPEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIDPEntry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGetComplete() != null) {
            _hashCode += getGetComplete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDPListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "IDPListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDPEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "IDPEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "IDPEntryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "GetComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
