/**
 * AuthzDecisionQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class AuthzDecisionQueryType  extends protocol._0._2.SAML.tc.names.oasis.SubjectQueryAbstractType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.ActionType[] action;

    private assertion._0._2.SAML.tc.names.oasis.EvidenceType evidence;

    private org.apache.axis.types.URI resource;  // attribute

    public AuthzDecisionQueryType() {
    }

    public AuthzDecisionQueryType(
           org.apache.axis.types.Id ID,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           assertion._0._2.SAML.tc.names.oasis.SubjectType subject,
           org.apache.axis.types.URI resource,
           assertion._0._2.SAML.tc.names.oasis.ActionType[] action,
           assertion._0._2.SAML.tc.names.oasis.EvidenceType evidence) {
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
        this.resource = resource;
        this.action = action;
        this.evidence = evidence;
    }


    /**
     * Gets the action value for this AuthzDecisionQueryType.
     * 
     * @return action
     */
    public assertion._0._2.SAML.tc.names.oasis.ActionType[] getAction() {
        return action;
    }


    /**
     * Sets the action value for this AuthzDecisionQueryType.
     * 
     * @param action
     */
    public void setAction(assertion._0._2.SAML.tc.names.oasis.ActionType[] action) {
        this.action = action;
    }

    public assertion._0._2.SAML.tc.names.oasis.ActionType getAction(int i) {
        return this.action[i];
    }

    public void setAction(int i, assertion._0._2.SAML.tc.names.oasis.ActionType _value) {
        this.action[i] = _value;
    }


    /**
     * Gets the evidence value for this AuthzDecisionQueryType.
     * 
     * @return evidence
     */
    public assertion._0._2.SAML.tc.names.oasis.EvidenceType getEvidence() {
        return evidence;
    }


    /**
     * Sets the evidence value for this AuthzDecisionQueryType.
     * 
     * @param evidence
     */
    public void setEvidence(assertion._0._2.SAML.tc.names.oasis.EvidenceType evidence) {
        this.evidence = evidence;
    }


    /**
     * Gets the resource value for this AuthzDecisionQueryType.
     * 
     * @return resource
     */
    public org.apache.axis.types.URI getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this AuthzDecisionQueryType.
     * 
     * @param resource
     */
    public void setResource(org.apache.axis.types.URI resource) {
        this.resource = resource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthzDecisionQueryType)) return false;
        AuthzDecisionQueryType other = (AuthzDecisionQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              java.util.Arrays.equals(this.action, other.getAction()))) &&
            ((this.evidence==null && other.getEvidence()==null) || 
             (this.evidence!=null &&
              this.evidence.equals(other.getEvidence()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource())));
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
        if (getAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvidence() != null) {
            _hashCode += getEvidence().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthzDecisionQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "AuthzDecisionQueryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Resource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Action"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evidence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Evidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EvidenceType"));
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
