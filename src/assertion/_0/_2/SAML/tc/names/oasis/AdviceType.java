/**
 * AdviceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AdviceType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private assertion._0._2.SAML.tc.names.oasis.AssertionType assertion;

    private org.apache.axis.types.NCName assertionIDRef;

    private org.apache.axis.types.URI assertionURIRef;

    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAssertion;

    private org.apache.axis.message.MessageElement [] _any;

    public AdviceType() {
    }

    public AdviceType(
           assertion._0._2.SAML.tc.names.oasis.AssertionType assertion,
           org.apache.axis.types.NCName assertionIDRef,
           org.apache.axis.types.URI assertionURIRef,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAssertion,
           org.apache.axis.message.MessageElement [] _any) {
           this.assertion = assertion;
           this.assertionIDRef = assertionIDRef;
           this.assertionURIRef = assertionURIRef;
           this.encryptedAssertion = encryptedAssertion;
           this._any = _any;
    }


    /**
     * Gets the assertion value for this AdviceType.
     * 
     * @return assertion
     */
    public assertion._0._2.SAML.tc.names.oasis.AssertionType getAssertion() {
        return assertion;
    }


    /**
     * Sets the assertion value for this AdviceType.
     * 
     * @param assertion
     */
    public void setAssertion(assertion._0._2.SAML.tc.names.oasis.AssertionType assertion) {
        this.assertion = assertion;
    }


    /**
     * Gets the assertionIDRef value for this AdviceType.
     * 
     * @return assertionIDRef
     */
    public org.apache.axis.types.NCName getAssertionIDRef() {
        return assertionIDRef;
    }


    /**
     * Sets the assertionIDRef value for this AdviceType.
     * 
     * @param assertionIDRef
     */
    public void setAssertionIDRef(org.apache.axis.types.NCName assertionIDRef) {
        this.assertionIDRef = assertionIDRef;
    }


    /**
     * Gets the assertionURIRef value for this AdviceType.
     * 
     * @return assertionURIRef
     */
    public org.apache.axis.types.URI getAssertionURIRef() {
        return assertionURIRef;
    }


    /**
     * Sets the assertionURIRef value for this AdviceType.
     * 
     * @param assertionURIRef
     */
    public void setAssertionURIRef(org.apache.axis.types.URI assertionURIRef) {
        this.assertionURIRef = assertionURIRef;
    }


    /**
     * Gets the encryptedAssertion value for this AdviceType.
     * 
     * @return encryptedAssertion
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedAssertion() {
        return encryptedAssertion;
    }


    /**
     * Sets the encryptedAssertion value for this AdviceType.
     * 
     * @param encryptedAssertion
     */
    public void setEncryptedAssertion(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAssertion) {
        this.encryptedAssertion = encryptedAssertion;
    }


    /**
     * Gets the _any value for this AdviceType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AdviceType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdviceType)) return false;
        AdviceType other = (AdviceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assertion==null && other.getAssertion()==null) || 
             (this.assertion!=null &&
              this.assertion.equals(other.getAssertion()))) &&
            ((this.assertionIDRef==null && other.getAssertionIDRef()==null) || 
             (this.assertionIDRef!=null &&
              this.assertionIDRef.equals(other.getAssertionIDRef()))) &&
            ((this.assertionURIRef==null && other.getAssertionURIRef()==null) || 
             (this.assertionURIRef!=null &&
              this.assertionURIRef.equals(other.getAssertionURIRef()))) &&
            ((this.encryptedAssertion==null && other.getEncryptedAssertion()==null) || 
             (this.encryptedAssertion!=null &&
              this.encryptedAssertion.equals(other.getEncryptedAssertion()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAssertion() != null) {
            _hashCode += getAssertion().hashCode();
        }
        if (getAssertionIDRef() != null) {
            _hashCode += getAssertionIDRef().hashCode();
        }
        if (getAssertionURIRef() != null) {
            _hashCode += getAssertionURIRef().hashCode();
        }
        if (getEncryptedAssertion() != null) {
            _hashCode += getEncryptedAssertion().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(AdviceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AdviceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Assertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionIDRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionIDRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NCName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionURIRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionURIRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedAssertion"));
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
