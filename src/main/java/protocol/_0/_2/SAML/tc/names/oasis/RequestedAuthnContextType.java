/**
 * RequestedAuthnContextType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class RequestedAuthnContextType  implements java.io.Serializable {
    private org.apache.axis.types.URI authnContextClassRef;

    private org.apache.axis.types.URI authnContextDeclRef;

    private protocol._0._2.SAML.tc.names.oasis.AuthnContextComparisonType comparison;  // attribute

    public RequestedAuthnContextType() {
    }

    public RequestedAuthnContextType(
           org.apache.axis.types.URI authnContextClassRef,
           org.apache.axis.types.URI authnContextDeclRef,
           protocol._0._2.SAML.tc.names.oasis.AuthnContextComparisonType comparison) {
           this.authnContextClassRef = authnContextClassRef;
           this.authnContextDeclRef = authnContextDeclRef;
           this.comparison = comparison;
    }


    /**
     * Gets the authnContextClassRef value for this RequestedAuthnContextType.
     * 
     * @return authnContextClassRef
     */
    public org.apache.axis.types.URI getAuthnContextClassRef() {
        return authnContextClassRef;
    }


    /**
     * Sets the authnContextClassRef value for this RequestedAuthnContextType.
     * 
     * @param authnContextClassRef
     */
    public void setAuthnContextClassRef(org.apache.axis.types.URI authnContextClassRef) {
        this.authnContextClassRef = authnContextClassRef;
    }


    /**
     * Gets the authnContextDeclRef value for this RequestedAuthnContextType.
     * 
     * @return authnContextDeclRef
     */
    public org.apache.axis.types.URI getAuthnContextDeclRef() {
        return authnContextDeclRef;
    }


    /**
     * Sets the authnContextDeclRef value for this RequestedAuthnContextType.
     * 
     * @param authnContextDeclRef
     */
    public void setAuthnContextDeclRef(org.apache.axis.types.URI authnContextDeclRef) {
        this.authnContextDeclRef = authnContextDeclRef;
    }


    /**
     * Gets the comparison value for this RequestedAuthnContextType.
     * 
     * @return comparison
     */
    public protocol._0._2.SAML.tc.names.oasis.AuthnContextComparisonType getComparison() {
        return comparison;
    }


    /**
     * Sets the comparison value for this RequestedAuthnContextType.
     * 
     * @param comparison
     */
    public void setComparison(protocol._0._2.SAML.tc.names.oasis.AuthnContextComparisonType comparison) {
        this.comparison = comparison;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedAuthnContextType)) return false;
        RequestedAuthnContextType other = (RequestedAuthnContextType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authnContextClassRef==null && other.getAuthnContextClassRef()==null) || 
             (this.authnContextClassRef!=null &&
              this.authnContextClassRef.equals(other.getAuthnContextClassRef()))) &&
            ((this.authnContextDeclRef==null && other.getAuthnContextDeclRef()==null) || 
             (this.authnContextDeclRef!=null &&
              this.authnContextDeclRef.equals(other.getAuthnContextDeclRef()))) &&
            ((this.comparison==null && other.getComparison()==null) || 
             (this.comparison!=null &&
              this.comparison.equals(other.getComparison())));
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
        if (getAuthnContextClassRef() != null) {
            _hashCode += getAuthnContextClassRef().hashCode();
        }
        if (getAuthnContextDeclRef() != null) {
            _hashCode += getAuthnContextDeclRef().hashCode();
        }
        if (getComparison() != null) {
            _hashCode += getComparison().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestedAuthnContextType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequestedAuthnContextType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("comparison");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Comparison"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "AuthnContextComparisonType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContextClassRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextClassRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContextDeclRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDeclRef"));
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
