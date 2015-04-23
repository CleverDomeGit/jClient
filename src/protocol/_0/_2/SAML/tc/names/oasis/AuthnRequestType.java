/**
 * AuthnRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class AuthnRequestType  extends protocol._0._2.SAML.tc.names.oasis.RequestAbstractType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.SubjectType subject;

    private protocol._0._2.SAML.tc.names.oasis.NameIDPolicyType nameIDPolicy;

    private assertion._0._2.SAML.tc.names.oasis.ConditionsType conditions;

    private protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType requestedAuthnContext;

    private protocol._0._2.SAML.tc.names.oasis.ScopingType scoping;

    private boolean forceAuthn;  // attribute

    private boolean isPassive;  // attribute

    private org.apache.axis.types.URI protocolBinding;  // attribute

    private org.apache.axis.types.UnsignedShort assertionConsumerServiceIndex;  // attribute

    private org.apache.axis.types.URI assertionConsumerServiceURL;  // attribute

    private org.apache.axis.types.UnsignedShort attributeConsumingServiceIndex;  // attribute

    private java.lang.String providerName;  // attribute

    public AuthnRequestType() {
    }

    public AuthnRequestType(
           org.apache.axis.types.Id ID,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           boolean forceAuthn,
           boolean isPassive,
           org.apache.axis.types.URI protocolBinding,
           org.apache.axis.types.UnsignedShort assertionConsumerServiceIndex,
           org.apache.axis.types.URI assertionConsumerServiceURL,
           org.apache.axis.types.UnsignedShort attributeConsumingServiceIndex,
           java.lang.String providerName,
           assertion._0._2.SAML.tc.names.oasis.SubjectType subject,
           protocol._0._2.SAML.tc.names.oasis.NameIDPolicyType nameIDPolicy,
           assertion._0._2.SAML.tc.names.oasis.ConditionsType conditions,
           protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType requestedAuthnContext,
           protocol._0._2.SAML.tc.names.oasis.ScopingType scoping) {
        super(
            ID,
            version,
            issueInstant,
            destination,
            consent,
            issuer,
            signature,
            extensions);
        this.forceAuthn = forceAuthn;
        this.isPassive = isPassive;
        this.protocolBinding = protocolBinding;
        this.assertionConsumerServiceIndex = assertionConsumerServiceIndex;
        this.assertionConsumerServiceURL = assertionConsumerServiceURL;
        this.attributeConsumingServiceIndex = attributeConsumingServiceIndex;
        this.providerName = providerName;
        this.subject = subject;
        this.nameIDPolicy = nameIDPolicy;
        this.conditions = conditions;
        this.requestedAuthnContext = requestedAuthnContext;
        this.scoping = scoping;
    }


    /**
     * Gets the subject value for this AuthnRequestType.
     * 
     * @return subject
     */
    public assertion._0._2.SAML.tc.names.oasis.SubjectType getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this AuthnRequestType.
     * 
     * @param subject
     */
    public void setSubject(assertion._0._2.SAML.tc.names.oasis.SubjectType subject) {
        this.subject = subject;
    }


    /**
     * Gets the nameIDPolicy value for this AuthnRequestType.
     * 
     * @return nameIDPolicy
     */
    public protocol._0._2.SAML.tc.names.oasis.NameIDPolicyType getNameIDPolicy() {
        return nameIDPolicy;
    }


    /**
     * Sets the nameIDPolicy value for this AuthnRequestType.
     * 
     * @param nameIDPolicy
     */
    public void setNameIDPolicy(protocol._0._2.SAML.tc.names.oasis.NameIDPolicyType nameIDPolicy) {
        this.nameIDPolicy = nameIDPolicy;
    }


    /**
     * Gets the conditions value for this AuthnRequestType.
     * 
     * @return conditions
     */
    public assertion._0._2.SAML.tc.names.oasis.ConditionsType getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this AuthnRequestType.
     * 
     * @param conditions
     */
    public void setConditions(assertion._0._2.SAML.tc.names.oasis.ConditionsType conditions) {
        this.conditions = conditions;
    }


    /**
     * Gets the requestedAuthnContext value for this AuthnRequestType.
     * 
     * @return requestedAuthnContext
     */
    public protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType getRequestedAuthnContext() {
        return requestedAuthnContext;
    }


    /**
     * Sets the requestedAuthnContext value for this AuthnRequestType.
     * 
     * @param requestedAuthnContext
     */
    public void setRequestedAuthnContext(protocol._0._2.SAML.tc.names.oasis.RequestedAuthnContextType requestedAuthnContext) {
        this.requestedAuthnContext = requestedAuthnContext;
    }


    /**
     * Gets the scoping value for this AuthnRequestType.
     * 
     * @return scoping
     */
    public protocol._0._2.SAML.tc.names.oasis.ScopingType getScoping() {
        return scoping;
    }


    /**
     * Sets the scoping value for this AuthnRequestType.
     * 
     * @param scoping
     */
    public void setScoping(protocol._0._2.SAML.tc.names.oasis.ScopingType scoping) {
        this.scoping = scoping;
    }


    /**
     * Gets the forceAuthn value for this AuthnRequestType.
     * 
     * @return forceAuthn
     */
    public boolean isForceAuthn() {
        return forceAuthn;
    }


    /**
     * Sets the forceAuthn value for this AuthnRequestType.
     * 
     * @param forceAuthn
     */
    public void setForceAuthn(boolean forceAuthn) {
        this.forceAuthn = forceAuthn;
    }


    /**
     * Gets the isPassive value for this AuthnRequestType.
     * 
     * @return isPassive
     */
    public boolean isIsPassive() {
        return isPassive;
    }


    /**
     * Sets the isPassive value for this AuthnRequestType.
     * 
     * @param isPassive
     */
    public void setIsPassive(boolean isPassive) {
        this.isPassive = isPassive;
    }


    /**
     * Gets the protocolBinding value for this AuthnRequestType.
     * 
     * @return protocolBinding
     */
    public org.apache.axis.types.URI getProtocolBinding() {
        return protocolBinding;
    }


    /**
     * Sets the protocolBinding value for this AuthnRequestType.
     * 
     * @param protocolBinding
     */
    public void setProtocolBinding(org.apache.axis.types.URI protocolBinding) {
        this.protocolBinding = protocolBinding;
    }


    /**
     * Gets the assertionConsumerServiceIndex value for this AuthnRequestType.
     * 
     * @return assertionConsumerServiceIndex
     */
    public org.apache.axis.types.UnsignedShort getAssertionConsumerServiceIndex() {
        return assertionConsumerServiceIndex;
    }


    /**
     * Sets the assertionConsumerServiceIndex value for this AuthnRequestType.
     * 
     * @param assertionConsumerServiceIndex
     */
    public void setAssertionConsumerServiceIndex(org.apache.axis.types.UnsignedShort assertionConsumerServiceIndex) {
        this.assertionConsumerServiceIndex = assertionConsumerServiceIndex;
    }


    /**
     * Gets the assertionConsumerServiceURL value for this AuthnRequestType.
     * 
     * @return assertionConsumerServiceURL
     */
    public org.apache.axis.types.URI getAssertionConsumerServiceURL() {
        return assertionConsumerServiceURL;
    }


    /**
     * Sets the assertionConsumerServiceURL value for this AuthnRequestType.
     * 
     * @param assertionConsumerServiceURL
     */
    public void setAssertionConsumerServiceURL(org.apache.axis.types.URI assertionConsumerServiceURL) {
        this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    }


    /**
     * Gets the attributeConsumingServiceIndex value for this AuthnRequestType.
     * 
     * @return attributeConsumingServiceIndex
     */
    public org.apache.axis.types.UnsignedShort getAttributeConsumingServiceIndex() {
        return attributeConsumingServiceIndex;
    }


    /**
     * Sets the attributeConsumingServiceIndex value for this AuthnRequestType.
     * 
     * @param attributeConsumingServiceIndex
     */
    public void setAttributeConsumingServiceIndex(org.apache.axis.types.UnsignedShort attributeConsumingServiceIndex) {
        this.attributeConsumingServiceIndex = attributeConsumingServiceIndex;
    }


    /**
     * Gets the providerName value for this AuthnRequestType.
     * 
     * @return providerName
     */
    public java.lang.String getProviderName() {
        return providerName;
    }


    /**
     * Sets the providerName value for this AuthnRequestType.
     * 
     * @param providerName
     */
    public void setProviderName(java.lang.String providerName) {
        this.providerName = providerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthnRequestType)) return false;
        AuthnRequestType other = (AuthnRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.nameIDPolicy==null && other.getNameIDPolicy()==null) || 
             (this.nameIDPolicy!=null &&
              this.nameIDPolicy.equals(other.getNameIDPolicy()))) &&
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              this.conditions.equals(other.getConditions()))) &&
            ((this.requestedAuthnContext==null && other.getRequestedAuthnContext()==null) || 
             (this.requestedAuthnContext!=null &&
              this.requestedAuthnContext.equals(other.getRequestedAuthnContext()))) &&
            ((this.scoping==null && other.getScoping()==null) || 
             (this.scoping!=null &&
              this.scoping.equals(other.getScoping()))) &&
            this.forceAuthn == other.isForceAuthn() &&
            this.isPassive == other.isIsPassive() &&
            ((this.protocolBinding==null && other.getProtocolBinding()==null) || 
             (this.protocolBinding!=null &&
              this.protocolBinding.equals(other.getProtocolBinding()))) &&
            ((this.assertionConsumerServiceIndex==null && other.getAssertionConsumerServiceIndex()==null) || 
             (this.assertionConsumerServiceIndex!=null &&
              this.assertionConsumerServiceIndex.equals(other.getAssertionConsumerServiceIndex()))) &&
            ((this.assertionConsumerServiceURL==null && other.getAssertionConsumerServiceURL()==null) || 
             (this.assertionConsumerServiceURL!=null &&
              this.assertionConsumerServiceURL.equals(other.getAssertionConsumerServiceURL()))) &&
            ((this.attributeConsumingServiceIndex==null && other.getAttributeConsumingServiceIndex()==null) || 
             (this.attributeConsumingServiceIndex!=null &&
              this.attributeConsumingServiceIndex.equals(other.getAttributeConsumingServiceIndex()))) &&
            ((this.providerName==null && other.getProviderName()==null) || 
             (this.providerName!=null &&
              this.providerName.equals(other.getProviderName())));
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getNameIDPolicy() != null) {
            _hashCode += getNameIDPolicy().hashCode();
        }
        if (getConditions() != null) {
            _hashCode += getConditions().hashCode();
        }
        if (getRequestedAuthnContext() != null) {
            _hashCode += getRequestedAuthnContext().hashCode();
        }
        if (getScoping() != null) {
            _hashCode += getScoping().hashCode();
        }
        _hashCode += (isForceAuthn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsPassive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProtocolBinding() != null) {
            _hashCode += getProtocolBinding().hashCode();
        }
        if (getAssertionConsumerServiceIndex() != null) {
            _hashCode += getAssertionConsumerServiceIndex().hashCode();
        }
        if (getAssertionConsumerServiceURL() != null) {
            _hashCode += getAssertionConsumerServiceURL().hashCode();
        }
        if (getAttributeConsumingServiceIndex() != null) {
            _hashCode += getAttributeConsumingServiceIndex().hashCode();
        }
        if (getProviderName() != null) {
            _hashCode += getProviderName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthnRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "AuthnRequestType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("forceAuthn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ForceAuthn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isPassive");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsPassive"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("protocolBinding");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProtocolBinding"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("assertionConsumerServiceIndex");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AssertionConsumerServiceIndex"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("assertionConsumerServiceURL");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AssertionConsumerServiceURL"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attributeConsumingServiceIndex");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AttributeConsumingServiceIndex"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("providerName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProviderName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameIDPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "NameIDPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "NameIDPolicyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ConditionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedAuthnContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequestedAuthnContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequestedAuthnContextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "Scoping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ScopingType"));
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
