/**
 * NameIDMappingResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class NameIDMappingResponseType  extends protocol._0._2.SAML.tc.names.oasis.StatusResponseType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID;

    private assertion._0._2.SAML.tc.names.oasis.NameIDType nameID;

    public NameIDMappingResponseType() {
    }

    public NameIDMappingResponseType(
           org.apache.axis.types.Id ID,
           org.apache.axis.types.NCName inResponseTo,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           protocol._0._2.SAML.tc.names.oasis.StatusType status,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID,
           assertion._0._2.SAML.tc.names.oasis.NameIDType nameID) {
        super(
            ID,
            inResponseTo,
            version,
            issueInstant,
            destination,
            consent,
            issuer,
            signature,
            extensions,
            status);
        this.encryptedID = encryptedID;
        this.nameID = nameID;
    }


    /**
     * Gets the encryptedID value for this NameIDMappingResponseType.
     * 
     * @return encryptedID
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedID() {
        return encryptedID;
    }


    /**
     * Sets the encryptedID value for this NameIDMappingResponseType.
     * 
     * @param encryptedID
     */
    public void setEncryptedID(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedID) {
        this.encryptedID = encryptedID;
    }


    /**
     * Gets the nameID value for this NameIDMappingResponseType.
     * 
     * @return nameID
     */
    public assertion._0._2.SAML.tc.names.oasis.NameIDType getNameID() {
        return nameID;
    }


    /**
     * Sets the nameID value for this NameIDMappingResponseType.
     * 
     * @param nameID
     */
    public void setNameID(assertion._0._2.SAML.tc.names.oasis.NameIDType nameID) {
        this.nameID = nameID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameIDMappingResponseType)) return false;
        NameIDMappingResponseType other = (NameIDMappingResponseType) obj;
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
              this.nameID.equals(other.getNameID())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameIDMappingResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "NameIDMappingResponseType"));
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
