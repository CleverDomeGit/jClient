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
    public String getSessionID(String externalUserID, String vendorName, KeyStore.PrivateKeyEntry privateKey)
            throws IOException,
            ClassNotFoundException, ParserConfigurationException, GeneralSecurityException, XMLSignatureException, MarshalException, Exception
    {
        RequestHelper requestHelper = new RequestHelper();
        AuthnRequestType req = requestHelper.createRequest(externalUserID, vendorName);
        requestHelper.signRequest(req, privateKey);

        ISSOServiceProxy ssoService = new ISSOServiceProxy();

        //Get session for current user and vendor for communication with widget's api
        ResponseType SSOAnswer = ssoService.getSSO(req);
        Object[] SSOAnswerAttrs = SSOAnswer.getAssertion().getAttributeStatement().getAttribute();
        return ((Object[])SSOAnswerAttrs[0])[0].toString();
    }
}
