/**
 * LogoutRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class LogoutRequestType  extends protocol._0._2.SAML.tc.names.oasis.RequestAbstractType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID;

    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID;

    private assertion._0._2.SAML.tc.names.oasis.NameIDType nameID;

    private java.lang.String[] sessionIndex;

    private java.lang.String reason;  // attribute

    private java.util.Calendar notOnOrAfter;  // attribute

    public LogoutRequestType() {
    }

    public LogoutRequestType(
           org.apache.axis.types.Id ID,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           java.lang.String reason,
           java.util.Calendar notOnOrAfter,
           assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID,
           assertion._0._2.SAML.tc.names.oasis.NameIDType nameID,
           java.lang.String[] sessionIndex) {
        super(
            issuer,
            signature,
            extensions,
            ID,
            version,
            issueInstant,
            destination,
            consent);
        this.reason = reason;
        this.notOnOrAfter = notOnOrAfter;
        this.baseID = baseID;
        this.encryptedID = encryptedID;
        this.nameID = nameID;
        this.sessionIndex = sessionIndex;
    }


    /**
     * Gets the baseID value for this LogoutRequestType.
     * 
     * @return baseID
     */
    public assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType getBaseID() {
        return baseID;
    }


    /**
     * Sets the baseID value for this LogoutRequestType.
     * 
     * @param baseID
     */
    public void setBaseID(assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType baseID) {
        this.baseID = baseID;
    }


    /**
     * Gets the encryptedID value for this LogoutRequestType.
     * 
     * @return encryptedID
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedID() {
        return encryptedID;
    }


    /**
     * Sets the encryptedID value for this LogoutRequestType.
     * 
     * @param encryptedID
     */
    public void setEncryptedID(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID) {
        this.encryptedID = encryptedID;
    }


    /**
     * Gets the nameID value for this LogoutRequestType.
     * 
     * @return nameID
     */
    public assertion._0._2.SAML.tc.names.oasis.NameIDType getNameID() {
        return nameID;
    }


    /**
     * Sets the nameID value for this LogoutRequestType.
     * 
     * @param nameID
     */
    public void setNameID(assertion._0._2.SAML.tc.names.oasis.NameIDType nameID) {
        this.nameID = nameID;
    }


    /**
     * Gets the sessionIndex value for this LogoutRequestType.
     * 
     * @return sessionIndex
     */
    public java.lang.String[] getSessionIndex() {
        return sessionIndex;
    }


    /**
     * Sets the sessionIndex value for this LogoutRequestType.
     * 
     * @param sessionIndex
     */
    public void setSessionIndex(java.lang.String[] sessionIndex) {
        this.sessionIndex = sessionIndex;
    }

    public java.lang.String getSessionIndex(int i) {
        return this.sessionIndex[i];
    }

    public void setSessionIndex(int i, java.lang.String _value) {
        this.sessionIndex[i] = _value;
    }


    /**
     * Gets the reason value for this LogoutRequestType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this LogoutRequestType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the notOnOrAfter value for this LogoutRequestType.
     * 
     * @return notOnOrAfter
     */
    public java.util.Calendar getNotOnOrAfter() {
        return notOnOrAfter;
    }


    /**
     * Sets the notOnOrAfter value for this LogoutRequestType.
     * 
     * @param notOnOrAfter
     */
    public void setNotOnOrAfter(java.util.Calendar notOnOrAfter) {
        this.notOnOrAfter = notOnOrAfter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogoutRequestType)) return false;
        LogoutRequestType other = (LogoutRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baseID==null && other.getBaseID()==null) || 
             (this.baseID!=null &&
              this.baseID.equals(other.getBaseID()))) &&
            ((this.encryptedID==null && other.getEncryptedID()==null) || 
             (this.encryptedID!=null &&
              this.encryptedID.equals(other.getEncryptedID()))) &&
            ((this.nameID==null && other.getNameID()==null) || 
             (this.nameID!=null &&
              this.nameID.equals(other.getNameID()))) &&
            ((this.sessionIndex==null && other.getSessionIndex()==null) || 
             (this.sessionIndex!=null &&
              java.util.Arrays.equals(this.sessionIndex, other.getSessionIndex()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.notOnOrAfter==null && other.getNotOnOrAfter()==null) || 
             (this.notOnOrAfter!=null &&
              this.notOnOrAfter.equals(other.getNotOnOrAfter())));
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
        if (getBaseID() != null) {
            _hashCode += getBaseID().hashCode();
        }
        if (getEncryptedID() != null) {
            _hashCode += getEncryptedID().hashCode();
        }
        if (getNameID() != null) {
            _hashCode += getNameID().hashCode();
        }
        if (getSessionIndex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionIndex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionIndex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getNotOnOrAfter() != null) {
            _hashCode += getNotOnOrAfter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogoutRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "LogoutRequestType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reason");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Reason"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notOnOrAfter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotOnOrAfter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseIDAbstractType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedElementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "SessionIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
