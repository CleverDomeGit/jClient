/**
 * AttributeStatementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AttributeStatementType  extends assertion._0._2.SAML.tc.names.oasis.StatementAbstractType  implements java.io.Serializable {
    private java.lang.Object[] attribute = new Object[2];;

    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAttribute;

    public AttributeStatementType() {
    }

    public AttributeStatementType(
           java.lang.Object[] attribute,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAttribute) {
        this.attribute = attribute;
        this.encryptedAttribute = encryptedAttribute;
    }


    /**
     * Gets the attribute value for this AttributeStatementType.
     * 
     * @return attribute
     */
    public java.lang.Object[] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this AttributeStatementType.
     * 
     * @param attribute
     */
    private int count = 0;
    public void setAttribute(java.lang.Object[] attribute) {
		this.attribute[count] = attribute;
		count++;
    }


    /**
     * Gets the encryptedAttribute value for this AttributeStatementType.
     * 
     * @return encryptedAttribute
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedAttribute() {
        return encryptedAttribute;
    }


    /**
     * Sets the encryptedAttribute value for this AttributeStatementType.
     * 
     * @param encryptedAttribute
     */
    public void setEncryptedAttribute(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAttribute) {
        this.encryptedAttribute = encryptedAttribute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeStatementType)) return false;
        AttributeStatementType other = (AttributeStatementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute()))) &&
            ((this.encryptedAttribute==null && other.getEncryptedAttribute()==null) || 
             (this.encryptedAttribute!=null &&
              this.encryptedAttribute.equals(other.getEncryptedAttribute())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEncryptedAttribute() != null) {
            _hashCode += getEncryptedAttribute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeStatementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeStatementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedElementType"));
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
