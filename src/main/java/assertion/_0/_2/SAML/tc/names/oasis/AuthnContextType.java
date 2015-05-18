/**
 * AuthnContextType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AuthnContextType  implements java.io.Serializable {
    private org.apache.axis.types.URI authnContextClassRef;

    private java.lang.Object authnContextDecl;

    private org.apache.axis.types.URI authnContextDeclRef;

    private org.apache.axis.types.URI[] authenticatingAuthority;

    public AuthnContextType() {
    }

    public AuthnContextType(
           org.apache.axis.types.URI authnContextClassRef,
           java.lang.Object authnContextDecl,
           org.apache.axis.types.URI authnContextDeclRef,
           org.apache.axis.types.URI[] authenticatingAuthority) {
           this.authnContextClassRef = authnContextClassRef;
           this.authnContextDecl = authnContextDecl;
           this.authnContextDeclRef = authnContextDeclRef;
           this.authenticatingAuthority = authenticatingAuthority;
    }


    /**
     * Gets the authnContextClassRef value for this AuthnContextType.
     * 
     * @return authnContextClassRef
     */
    public org.apache.axis.types.URI getAuthnContextClassRef() {
        return authnContextClassRef;
    }


    /**
     * Sets the authnContextClassRef value for this AuthnContextType.
     * 
     * @param authnContextClassRef
     */
    public void setAuthnContextClassRef(org.apache.axis.types.URI authnContextClassRef) {
        this.authnContextClassRef = authnContextClassRef;
    }


    /**
     * Gets the authnContextDecl value for this AuthnContextType.
     * 
     * @return authnContextDecl
     */
    public java.lang.Object getAuthnContextDecl() {
        return authnContextDecl;
    }


    /**
     * Sets the authnContextDecl value for this AuthnContextType.
     * 
     * @param authnContextDecl
     */
    public void setAuthnContextDecl(java.lang.Object authnContextDecl) {
        this.authnContextDecl = authnContextDecl;
    }


    /**
     * Gets the authnContextDeclRef value for this AuthnContextType.
     * 
     * @return authnContextDeclRef
     */
    public org.apache.axis.types.URI getAuthnContextDeclRef() {
        return authnContextDeclRef;
    }


    /**
     * Sets the authnContextDeclRef value for this AuthnContextType.
     * 
     * @param authnContextDeclRef
     */
    public void setAuthnContextDeclRef(org.apache.axis.types.URI authnContextDeclRef) {
        this.authnContextDeclRef = authnContextDeclRef;
    }


    /**
     * Gets the authenticatingAuthority value for this AuthnContextType.
     * 
     * @return authenticatingAuthority
     */
    public org.apache.axis.types.URI[] getAuthenticatingAuthority() {
        return authenticatingAuthority;
    }


    /**
     * Sets the authenticatingAuthority value for this AuthnContextType.
     * 
     * @param authenticatingAuthority
     */
    public void setAuthenticatingAuthority(org.apache.axis.types.URI[] authenticatingAuthority) {
        this.authenticatingAuthority = authenticatingAuthority;
    }

    public org.apache.axis.types.URI getAuthenticatingAuthority(int i) {
        return this.authenticatingAuthority[i];
    }

    public void setAuthenticatingAuthority(int i, org.apache.axis.types.URI _value) {
        this.authenticatingAuthority[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthnContextType)) return false;
        AuthnContextType other = (AuthnContextType) obj;
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
            ((this.authnContextDecl==null && other.getAuthnContextDecl()==null) || 
             (this.authnContextDecl!=null &&
              this.authnContextDecl.equals(other.getAuthnContextDecl()))) &&
            ((this.authnContextDeclRef==null && other.getAuthnContextDeclRef()==null) || 
             (this.authnContextDeclRef!=null &&
              this.authnContextDeclRef.equals(other.getAuthnContextDeclRef()))) &&
            ((this.authenticatingAuthority==null && other.getAuthenticatingAuthority()==null) || 
             (this.authenticatingAuthority!=null &&
              java.util.Arrays.equals(this.authenticatingAuthority, other.getAuthenticatingAuthority())));
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
        if (getAuthnContextDecl() != null) {
            _hashCode += getAuthnContextDecl().hashCode();
        }
        if (getAuthnContextDeclRef() != null) {
            _hashCode += getAuthnContextDeclRef().hashCode();
        }
        if (getAuthenticatingAuthority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthenticatingAuthority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthenticatingAuthority(), i);
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
        new org.apache.axis.description.TypeDesc(AuthnContextType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContextClassRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextClassRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnContextDecl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDecl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticatingAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthenticatingAuthority"));
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
