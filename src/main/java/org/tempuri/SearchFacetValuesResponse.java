/**
 * SearchFacetValuesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SearchFacetValuesResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring searchFacetValuesResult;

    public SearchFacetValuesResponse() {
    }

    public SearchFacetValuesResponse(
           org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring searchFacetValuesResult) {
           this.searchFacetValuesResult = searchFacetValuesResult;
    }


    /**
     * Gets the searchFacetValuesResult value for this SearchFacetValuesResponse.
     * 
     * @return searchFacetValuesResult
     */
    public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring getSearchFacetValuesResult() {
        return searchFacetValuesResult;
    }


    /**
     * Sets the searchFacetValuesResult value for this SearchFacetValuesResponse.
     * 
     * @param searchFacetValuesResult
     */
    public void setSearchFacetValuesResult(org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring searchFacetValuesResult) {
        this.searchFacetValuesResult = searchFacetValuesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchFacetValuesResponse)) return false;
        SearchFacetValuesResponse other = (SearchFacetValuesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchFacetValuesResult==null && other.getSearchFacetValuesResult()==null) || 
             (this.searchFacetValuesResult!=null &&
              this.searchFacetValuesResult.equals(other.getSearchFacetValuesResult())));
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
        if (getSearchFacetValuesResult() != null) {
            _hashCode += getSearchFacetValuesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchFacetValuesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SearchFacetValuesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFacetValuesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SearchFacetValuesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfstring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
