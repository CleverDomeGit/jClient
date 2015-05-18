/**
 * AuthnQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class AuthnQueryType  extends protocol._0._2.SAML.tc.names.oasis.SubjectQueryAbstractType  implements java.io.Serializable {
    private protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType requestedAuthnContext;

    private java.lang.String sessionIndex;  // attribute

    public AuthnQueryType() {
    }

    public AuthnQueryType(
           org.apache.axis.types.Id ID,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           assertion._0._2.SAML.tc.names.oasis.SubjectType subject,
           java.lang.String sessionIndex,
           protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType requestedAuthnContext) {
        super(
            ID,
            version,
            issueInstant,
            destination,
            consent,
            issuer,
            signature,
            extensions,
            subject);
        this.sessionIndex = sessionIndex;
        this.requestedAuthnContext = requestedAuthnContext;
    }


    /**
     * Gets the requestedAuthnContext value for this AuthnQueryType.
     * 
     * @return requestedAuthnContext
     */
    public protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType getRequestedAuthnContext() {
        return requestedAuthnContext;
    }


    /**
     * Sets the requestedAuthnContext value for this AuthnQueryType.
     * 
     * @param requestedAuthnContext
     */
    public void setRequestedAuthnContext(protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType requestedAuthnContext) {
        this.requestedAuthnContext = requestedAuthnContext;
    }


    /**
     * Gets the sessionIndex value for this AuthnQueryType.
     * 
     * @return sessionIndex
     */
    public java.lang.String getSessionIndex() {
        return sessionIndex;
    }


    /**
     * Sets the sessionIndex value for this AuthnQueryType.
     * 
     * @param sessionIndex
     */
    public void setSessionIndex(java.lang.String sessionIndex) {
        this.sessionIndex = sessionIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthnQueryType)) return false;
        AuthnQueryType other = (AuthnQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestedAuthnContext==null && other.getRequestedAuthnContext()==null) || 
             (this.requestedAuthnContext!=null &&
              this.requestedAuthnContext.equals(other.getRequestedAuthnContext()))) &&
            ((this.sessionIndex==null && other.getSessionIndex()==null) || 
             (this.sessionIndex!=null &&
              this.sessionIndex.equals(other.getSessionIndex())));
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
        if (getRequestedAuthnContext() != null) {
            _hashCode += getRequestedAuthnContext().hashCode();
        }
        if (getSessionIndex() != null) {
            _hashCode += getSessionIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthnQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "AuthnQueryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sessionIndex");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SessionIndex"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedAuthnContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequestedAuthnContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequestedAuthnContextType"));
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
