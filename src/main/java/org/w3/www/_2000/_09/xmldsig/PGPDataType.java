/**
 * PGPDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.w3.www._2000._09.xmldsig;

public class PGPDataType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private byte[] PGPKeyID;

    private byte[] PGPKeyPacket;

    private org.apache.axis.message.MessageElement [] _any;

    public PGPDataType() {
    }

    public PGPDataType(
           byte[] PGPKeyID,
           byte[] PGPKeyPacket,
           org.apache.axis.message.MessageElement [] _any) {
           this.PGPKeyID = PGPKeyID;
           this.PGPKeyPacket = PGPKeyPacket;
           this._any = _any;
    }


    /**
     * Gets the PGPKeyID value for this PGPDataType.
     * 
     * @return PGPKeyID
     */
    public byte[] getPGPKeyID() {
        return PGPKeyID;
    }


    /**
     * Sets the PGPKeyID value for this PGPDataType.
     * 
     * @param PGPKeyID
     */
    public void setPGPKeyID(byte[] PGPKeyID) {
        this.PGPKeyID = PGPKeyID;
    }


    /**
     * Gets the PGPKeyPacket value for this PGPDataType.
     * 
     * @return PGPKeyPacket
     */
    public byte[] getPGPKeyPacket() {
        return PGPKeyPacket;
    }


    /**
     * Sets the PGPKeyPacket value for this PGPDataType.
     * 
     * @param PGPKeyPacket
     */
    public void setPGPKeyPacket(byte[] PGPKeyPacket) {
        this.PGPKeyPacket = PGPKeyPacket;
    }


    /**
     * Gets the _any value for this PGPDataType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PGPDataType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PGPDataType)) return false;
        PGPDataType other = (PGPDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PGPKeyID==null && other.getPGPKeyID()==null) || 
             (this.PGPKeyID!=null &&
              java.util.Arrays.equals(this.PGPKeyID, other.getPGPKeyID()))) &&
            ((this.PGPKeyPacket==null && other.getPGPKeyPacket()==null) || 
             (this.PGPKeyPacket!=null &&
              java.util.Arrays.equals(this.PGPKeyPacket, other.getPGPKeyPacket()))) &&
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
        if (getPGPKeyID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPGPKeyID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPGPKeyID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPGPKeyPacket() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPGPKeyPacket());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPGPKeyPacket(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(PGPDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "PGPDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPKeyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPKeyPacket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyPacket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
