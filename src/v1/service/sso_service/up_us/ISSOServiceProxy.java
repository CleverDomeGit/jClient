package v1.service.sso_service.up_us;

public class ISSOServiceProxy implements v1.service.sso_service.up_us.ISSOService {
  private String _endpoint = null;
  private v1.service.sso_service.up_us.ISSOService iSSOService = null;
  
  public ISSOServiceProxy() {
    _initISSOServiceProxy();
  }
  
  public ISSOServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initISSOServiceProxy();
  }
  
  private void _initISSOServiceProxy() {
    try {
      iSSOService = (new v1.port.sso_service.up_us.UserPortLocator()).getBasicHttpBinding_ISSOService();
      if (iSSOService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iSSOService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iSSOService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iSSOService != null)
      ((javax.xml.rpc.Stub)iSSOService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public v1.service.sso_service.up_us.ISSOService getISSOService() {
    if (iSSOService == null)
      _initISSOServiceProxy();
    return iSSOService;
  }
  
  public protocol._0._2.SAML.tc.names.oasis.ResponseType getSSO(protocol._0._2.SAML.tc.names.oasis.AuthnRequestType authnRequest) throws java.rmi.RemoteException{
    if (iSSOService == null)
      _initISSOServiceProxy();
    return iSSOService.getSSO(authnRequest);
  }
  
  
}