package sso;

import protocol._0._2.SAML.tc.names.oasis.AuthnRequestType;
import protocol._0._2.SAML.tc.names.oasis.ResponseType;
import v1.service.sso_service.up_us.ISSOServiceProxy;

import java.security.KeyStore;

public class SsoHelper {
    private RequestHelper requestHelper = new RequestHelper();

    public String getSessionID(String externalUserID, String vendorName, KeyStore.PrivateKeyEntry privateKey)
            throws SsoAuthenticationException
    {
        try {
            AuthnRequestType request = requestHelper.createRequest();
            requestHelper.setVendorName(request, vendorName);
            requestHelper.setExternalUserID(request, externalUserID);
            requestHelper.signRequest(request, privateKey);

            ISSOServiceProxy ssoService = new ISSOServiceProxy();
            ResponseType response = ssoService.getSSO(request);

            checkStatus(response);

            return getSessionIDFromResponse(response);
        } catch (SsoAuthenticationException ssoAuthException) {
            throw ssoAuthException;
        } catch (Exception exception) {
            throw new SsoAuthenticationException("Unknown inner exception", exception);
        }
    }

    private void checkStatus(ResponseType response)
        throws SsoAuthenticationException {

        String statusCode = response.getStatus().getStatusCode().getValue().toString();
        if (statusCode.equals("urn:oasis:names:tc:SAML:2.0:status:AuthnFailed")) {
            throw new SsoAuthenticationException("Unknown server exception");
        } else if (statusCode.equals("urn:oasis:names:tc:SAML:2.0:status:RequestDenied")) {
            throw new SsoAuthenticationException("Request is denied");
        }

    }

    private String getSessionIDFromResponse(ResponseType response) {
        Object[] SSOAnswerAttrs = response.getAssertion().getAttributeStatement().getAttribute();
        return ((Object[]) SSOAnswerAttrs[0])[0].toString();
    }
}
