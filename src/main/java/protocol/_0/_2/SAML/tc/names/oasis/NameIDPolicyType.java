/**
 * NameIDPolicyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class NameIDPolicyType  implements java.io.Serializable {
    private org.apache.axis.types.URI format;  // attribute

    private java.lang.String SPNameQualifier;  // attribute

    private boolean allowCreate;  // attribute

    public NameIDPolicyType() {
    }

    public NameIDPolicyType(
           org.apache.axis.types.URI format,
           java.lang.String SPNameQualifier,
           boolean allowCreate) {
           this.format = format;
           this.SPNameQualifier = SPNameQualifier;
           this.allowCreate = allowCreate;
    }


    /**
     * Gets the format value for this NameIDPolicyType.
     * 
     * @return format
     */
    public org.apache.axis.types.URI getFormat() {
        return format;
    }


    /**
     * Sets the format value for this NameIDPolicyType.
     * 
     * @param format
     */
    public void setFormat(org.apache.axis.types.URI format) {
        this.format = format;
    }


    /**
     * Gets the SPNameQualifier value for this NameIDPolicyType.
     * 
     * @return SPNameQualifier
     */
    public java.lang.String getSPNameQualifier() {
        return SPNameQualifier;
    }


    /**
     * Sets the SPNameQualifier value for this NameIDPolicyType.
     * 
     * @param SPNameQualifier
     */
    public void setSPNameQualifier(java.lang.String SPNameQualifier) {
        this.SPNameQualifier = SPNameQualifier;
    }


    /**
     * Gets the allowCreate value for this NameIDPolicyType.
     * 
     * @return allowCreate
     */
    public boolean isAllowCreate() {
        return allowCreate;
    }


    /**
     * Sets the allowCreate value for this NameIDPolicyType.
     * 
     * @param allowCreate
     */
    public void setAllowCreate(boolean allowCreate) {
        this.allowCreate = allowCreate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameIDPolicyType)) return false;
        NameIDPolicyType other = (NameIDPolicyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.SPNameQualifier==null && other.getSPNameQualifier()==null) || 
             (this.SPNameQualifier!=null &&
              this.SPNameQualifier.equals(other.getSPNameQualifier()))) &&
            this.allowCreate == other.isAllowCreate();
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getSPNameQualifier() != null) {
            _hashCode += getSPNameQualifier().hashCode();
        }
        _hashCode += (isAllowCreate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameIDPolicyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "NameIDPolicyType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("format");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Format"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SPNameQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SPNameQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("allowCreate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AllowCreate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
