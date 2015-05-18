/**
 * ManageNameIDRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class ManageNameIDRequestType  extends protocol._0._2.SAML.tc.names.oasis.RequestAbstractType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID;

    private assertion._0._2.SAML.tc.names.oasis.NameIDType nameID;

    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType newEncryptedID;

    private java.lang.String newID;

    private protocol._0._2.SAML.tc.names.oasis.TerminateType terminate;

    public ManageNameIDRequestType() {
    }

    public ManageNameIDRequestType(
           org.apache.axis.types.Id ID,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID,
           assertion._0._2.SAML.tc.names.oasis.NameIDType nameID,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType newEncryptedID,
           java.lang.String newID,
           protocol._0._2.SAML.tc.names.oasis.TerminateType terminate) {
        super(
            issuer,
            signature,
            extensions,
            ID,
            version,
            issueInstant,
            destination,
            consent);
        this.encryptedID = encryptedID;
        this.nameID = nameID;
        this.newEncryptedID = newEncryptedID;
        this.newID = newID;
        this.terminate = terminate;
    }


    /**
     * Gets the encryptedID value for this ManageNameIDRequestType.
     * 
     * @return encryptedID
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedID() {
        return encryptedID;
    }


    /**
     * Sets the encryptedID value for this ManageNameIDRequestType.
     * 
     * @param encryptedID
     */
    public void setEncryptedID(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID) {
        this.encryptedID = encryptedID;
    }


    /**
     * Gets the nameID value for this ManageNameIDRequestType.
     * 
     * @return nameID
     */
    public assertion._0._2.SAML.tc.names.oasis.NameIDType getNameID() {
        return nameID;
    }


    /**
     * Sets the nameID value for this ManageNameIDRequestType.
     * 
     * @param nameID
     */
    public void setNameID(assertion._0._2.SAML.tc.names.oasis.NameIDType nameID) {
        this.nameID = nameID;
    }


    /**
     * Gets the newEncryptedID value for this ManageNameIDRequestType.
     * 
     * @return newEncryptedID
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getNewEncryptedID() {
        return newEncryptedID;
    }


    /**
     * Sets the newEncryptedID value for this ManageNameIDRequestType.
     * 
     * @param newEncryptedID
     */
    public void setNewEncryptedID(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType newEncryptedID) {
        this.newEncryptedID = newEncryptedID;
    }


    /**
     * Gets the newID value for this ManageNameIDRequestType.
     * 
     * @return newID
     */
    public java.lang.String getNewID() {
        return newID;
    }


    /**
     * Sets the newID value for this ManageNameIDRequestType.
     * 
     * @param newID
     */
    public void setNewID(java.lang.String newID) {
        this.newID = newID;
    }


    /**
     * Gets the terminate value for this ManageNameIDRequestType.
     * 
     * @return terminate
     */
    public protocol._0._2.SAML.tc.names.oasis.TerminateType getTerminate() {
        return terminate;
    }


    /**
     * Sets the terminate value for this ManageNameIDRequestType.
     * 
     * @param terminate
     */
    public void setTerminate(protocol._0._2.SAML.tc.names.oasis.TerminateType terminate) {
        this.terminate = terminate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageNameIDRequestType)) return false;
        ManageNameIDRequestType other = (ManageNameIDRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.encryptedID==null && other.getEncryptedID()==null) || 
             (this.encryptedID!=null &&
              this.encryptedID.equals(other.getEncryptedID()))) &&
            ((this.nameID==null && other.getNameID()==null) || 
             (this.nameID!=null &&
              this.nameID.equals(other.getNameID()))) &&
            ((this.newEncryptedID==null && other.getNewEncryptedID()==null) || 
             (this.newEncryptedID!=null &&
              this.newEncryptedID.equals(other.getNewEncryptedID()))) &&
            ((this.newID==null && other.getNewID()==null) || 
             (this.newID!=null &&
              this.newID.equals(other.getNewID()))) &&
            ((this.terminate==null && other.getTerminate()==null) || 
             (this.terminate!=null &&
              this.terminate.equals(other.getTerminate())));
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
        if (getEncryptedID() != null) {
            _hashCode += getEncryptedID().hashCode();
        }
        if (getNameID() != null) {
            _hashCode += getNameID().hashCode();
        }
        if (getNewEncryptedID() != null) {
            _hashCode += getNewEncryptedID().hashCode();
        }
        if (getNewID() != null) {
            _hashCode += getNewID().hashCode();
        }
        if (getTerminate() != null) {
            _hashCode += getTerminate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageNameIDRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ManageNameIDRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("newEncryptedID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "NewEncryptedID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedElementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "NewID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "Terminate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "TerminateType"));
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
