/**
 * UserPortLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package v1.port.sso_service.up_us;

public class UserPortLocator extends org.apache.axis.client.Service implements v1.port.sso_service.up_us.UserPort {

    public UserPortLocator() {
    }


    public UserPortLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserPortLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ISSOService
    private java.lang.String BasicHttpBinding_ISSOService_address = "https://sandbox.cleverdome.com/CDSSOService/SSOService.svc/SSO";

    public java.lang.String getBasicHttpBinding_ISSOServiceAddress() {
        return BasicHttpBinding_ISSOService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ISSOServiceWSDDServiceName = "BasicHttpBinding_ISSOService";

    public java.lang.String getBasicHttpBinding_ISSOServiceWSDDServiceName() {
        return BasicHttpBinding_ISSOServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ISSOServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ISSOServiceWSDDServiceName = name;
    }

    public v1.service.sso_service.up_us.ISSOService getBasicHttpBinding_ISSOService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ISSOService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ISSOService(endpoint);
    }

    public v1.service.sso_service.up_us.ISSOService getBasicHttpBinding_ISSOService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_ISSOServiceStub _stub = new org.tempuri.BasicHttpBinding_ISSOServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ISSOServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ISSOServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ISSOService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (v1.service.sso_service.up_us.ISSOService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_ISSOServiceStub _stub = new org.tempuri.BasicHttpBinding_ISSOServiceStub(new java.net.URL(BasicHttpBinding_ISSOService_address), this);
                _stub.setPortName(getBasicHttpBinding_ISSOServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ISSOService".equals(inputPortName)) {
            return getBasicHttpBinding_ISSOService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:up-us:sso-service:port:v1", "UserPort");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:up-us:sso-service:port:v1", "BasicHttpBinding_ISSOService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ISSOService".equals(portName)) {
            setBasicHttpBinding_ISSOServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
