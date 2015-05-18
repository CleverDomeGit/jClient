/**
 * AssertionIDRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class AssertionIDRequestType  extends protocol._0._2.SAML.tc.names.oasis.RequestAbstractType  implements java.io.Serializable {
    private org.apache.axis.types.NCName[] assertionIDRef;

    public AssertionIDRequestType() {
    }

    public AssertionIDRequestType(
           org.apache.axis.types.Id ID,
           java.lang.String version,
           java.util.Calendar issueInstant,
           org.apache.axis.types.URI destination,
           org.apache.axis.types.URI consent,
           assertion._0._2.SAML.tc.names.oasis.NameIDType issuer,
           org.w3.www._2000._09.xmldsig.SignatureType signature,
           protocol._0._2.SAML.tc.names.oasis.ExtensionsType extensions,
           org.apache.axis.types.NCName[] assertionIDRef) {
        super(
            issuer,
            signature,
            extensions,
            ID,
            version,
            issueInstant,
            destination,
            consent);
        this.assertionIDRef = assertionIDRef;
    }


    /**
     * Gets the assertionIDRef value for this AssertionIDRequestType.
     * 
     * @return assertionIDRef
     */
    public org.apache.axis.types.NCName[] getAssertionIDRef() {
        return assertionIDRef;
    }


    /**
     * Sets the assertionIDRef value for this AssertionIDRequestType.
     * 
     * @param assertionIDRef
     */
    public void setAssertionIDRef(org.apache.axis.types.NCName[] assertionIDRef) {
        this.assertionIDRef = assertionIDRef;
    }

    public org.apache.axis.types.NCName getAssertionIDRef(int i) {
        return this.assertionIDRef[i];
    }

    public void setAssertionIDRef(int i, org.apache.axis.types.NCName _value) {
        this.assertionIDRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssertionIDRequestType)) return false;
        AssertionIDRequestType other = (AssertionIDRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assertionIDRef==null && other.getAssertionIDRef()==null) || 
             (this.assertionIDRef!=null &&
              java.util.Arrays.equals(this.assertionIDRef, other.getAssertionIDRef())));
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
        if (getAssertionIDRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssertionIDRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssertionIDRef(), i);
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
        new org.apache.axis.description.TypeDesc(AssertionIDRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "AssertionIDRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionIDRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionIDRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionIDRef"));
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
