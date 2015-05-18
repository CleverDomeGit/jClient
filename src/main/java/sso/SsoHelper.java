package sso;

import protocol._0._2.SAML.tc.names.oasis.AuthnRequestType;
import protocol._0._2.SAML.tc.names.oasis.ResponseType;
import v1.service.sso_service.up_us.ISSOServiceProxy;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

public class SsoHelper {
    private RequestHelper requestHelper = new RequestHelper();

    public String getSessionID(String externalUserID, String vendorName, KeyStore.PrivateKeyEntry privateKey)
            throws IOException,
            ClassNotFoundException, ParserConfigurationException, GeneralSecurityException, XMLSignatureException, MarshalException, Exception
    {
        AuthnRequestType request = requestHelper.createRequest();
        requestHelper.setVendorName(request, vendorName);
        requestHelper.setExternalUserID(request, externalUserID);
        requestHelper.signRequest(request, privateKey);

        ISSOServiceProxy ssoService = new ISSOServiceProxy();

        //Get session for current user and vendor for communication with widget's api
        ResponseType response = ssoService.getSSO(request);
        Object[] SSOAnswerAttrs = response.getAssertion().getAttributeStatement().getAttribute();
        return ((Object[])SSOAnswerAttrs[0])[0].toString();
    }
}
