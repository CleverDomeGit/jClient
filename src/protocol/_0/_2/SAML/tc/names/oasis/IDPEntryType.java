/**
 * IDPEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class IDPEntryType  implements java.io.Serializable {
    private org.apache.axis.types.URI providerID;  // attribute

    private java.lang.String name;  // attribute

    private org.apache.axis.types.URI loc;  // attribute

    public IDPEntryType() {
    }

    public IDPEntryType(
           org.apache.axis.types.URI providerID,
           java.lang.String name,
           org.apache.axis.types.URI loc) {
           this.providerID = providerID;
           this.name = name;
           this.loc = loc;
    }


    /**
     * Gets the providerID value for this IDPEntryType.
     * 
     * @return providerID
     */
    public org.apache.axis.types.URI getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this IDPEntryType.
     * 
     * @param providerID
     */
    public void setProviderID(org.apache.axis.types.URI providerID) {
        this.providerID = providerID;
    }


    /**
     * Gets the name value for this IDPEntryType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this IDPEntryType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the loc value for this IDPEntryType.
     * 
     * @return loc
     */
    public org.apache.axis.types.URI getLoc() {
        return loc;
    }


    /**
     * Sets the loc value for this IDPEntryType.
     * 
     * @param loc
     */
    public void setLoc(org.apache.axis.types.URI loc) {
        this.loc = loc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDPEntryType)) return false;
        IDPEntryType other = (IDPEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.providerID==null && other.getProviderID()==null) || 
             (this.providerID!=null &&
              this.providerID.equals(other.getProviderID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.loc==null && other.getLoc()==null) || 
             (this.loc!=null &&
              this.loc.equals(other.getLoc())));
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
        if (getProviderID() != null) {
            _hashCode += getProviderID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLoc() != null) {
            _hashCode += getLoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDPEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "IDPEntryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("providerID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProviderID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("loc");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Loc"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
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
