/**
 * UserPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package v1.port.sso_service.up_us;

public interface UserPort extends javax.xml.rpc.Service {
    public java.lang.String getBasicHttpBinding_ISSOServiceAddress();

    public v1.service.sso_service.up_us.ISSOService getBasicHttpBinding_ISSOService() throws javax.xml.rpc.ServiceException;

    public v1.service.sso_service.up_us.ISSOService getBasicHttpBinding_ISSOService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
