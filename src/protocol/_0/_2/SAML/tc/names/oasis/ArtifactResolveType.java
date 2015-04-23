/**
 * ArtifactResolveType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class ArtifactResolveType  extends protocol._0._2.SAML.tc.names.oasis.RequestAbstractType  implements java.io.Serializable {
    private java.lang.String artifact;

    public ArtifactResolveType() {
    }

    public ArtifactResolveType(
           org.apache.axis.types.Id ID,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           java.lang.String artifact) {
        super(
            ID,
            version,
            issueInstant,
            destination,
            consent,
            issuer,
            signature,
            extensions);
        this.artifact = artifact;
    }


    /**
     * Gets the artifact value for this ArtifactResolveType.
     * 
     * @return artifact
     */
    public java.lang.String getArtifact() {
        return artifact;
    }


    /**
     * Sets the artifact value for this ArtifactResolveType.
     * 
     * @param artifact
     */
    public void setArtifact(java.lang.String artifact) {
        this.artifact = artifact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArtifactResolveType)) return false;
        ArtifactResolveType other = (ArtifactResolveType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.artifact==null && other.getArtifact()==null) || 
             (this.artifact!=null &&
              this.artifact.equals(other.getArtifact())));
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
        if (getArtifact() != null) {
            _hashCode += getArtifact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArtifactResolveType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ArtifactResolveType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artifact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "Artifact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
