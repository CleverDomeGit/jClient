package sso;

import assertion._0._2.SAML.tc.names.oasis.NameIDType;
import assertion._0._2.SAML.tc.names.oasis.SubjectType;
import org.apache.axis.types.Id;
import org.apache.axis.types.URI;
import org.w3.www._2000._09.xmldsig.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import protocol._0._2.SAML.tc.names.oasis.AuthnRequestType;
import protocol._0._2.SAML.tc.names.oasis.NameIDPolicyType;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Calendar;
import java.util.Collections;
import java.util.UUID;

class RequestHelper {
    public AuthnRequestType createRequest()
            throws URI.MalformedURIException {
        AuthnRequestType req = new AuthnRequestType();

        Id id = new Id();
        id.setValue("_" + UUID.randomUUID().toString());
        req.setID(id);

        String version = "2.0";
        req.setVersion(version);

        Calendar issueInstant = Calendar.getInstance();
        req.setIssueInstant(issueInstant);

        String protocolBinding = "urn:oasis:names:tc:SAML:2.0:bindings:SOAP";
        req.setProtocolBinding(new URI(protocolBinding));

        req.setIsPassive(false);

        NameIDType issuer = new NameIDType();
        issuer.setFormat(new URI(
                "urn:oasis:names:tc:SAML:2.0:nameidformat:transient"));
        req.setIssuer(issuer);

        NameIDPolicyType nameIDPolicy = new NameIDPolicyType();
        nameIDPolicy.setAllowCreate(true);
        req.setNameIDPolicy(nameIDPolicy);

        SubjectType subjectType = new SubjectType();
        NameIDType nameID = new NameIDType();
        nameID.setFormat(new URI(
                "urn:oasis:names:tc:SAML:2.0:nameid-format:transient"));
        subjectType.setNameID(nameID);
        req.setSubject(subjectType);

        return req;
    }

    public void setVendorName(AuthnRequestType request, String vendorName) {
        request.getIssuer().set_value(vendorName);
        request.setProviderName(vendorName);
    }

    public void setExternalUserID(AuthnRequestType request, String externalUserID) {
        request.getSubject().getNameID().set_value(externalUserID);
    }

    public void signRequest(AuthnRequestType req, KeyStore.PrivateKeyEntry entry)
            throws ParserConfigurationException, GeneralSecurityException,
            XMLSignatureException, MarshalException, ClassNotFoundException,
            Exception {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory
                .newInstance();

        DocumentBuilder builder = docFactory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element root = (Element) document.createElement("AuthnRequest");
        root.setAttribute("ID", req.getID().toString());
        root.setIdAttribute("ID", true);
        document.appendChild(root);

        signXML(document.getDocumentElement(), entry);

        SignatureType signature = new SignatureType();

        SignedInfoType signedInfo = new SignedInfoType();

        String canonMethodAlg = ((Element) document.getElementsByTagName(
                "CanonicalizationMethod").item(0)).getAttribute("Algorithm");
        CanonicalizationMethodType canonMethodType = new CanonicalizationMethodType();
        canonMethodType.setAlgorithm(new URI(canonMethodAlg));
        signedInfo.setCanonicalizationMethod(canonMethodType);

        String signMethodAlg = ((Element) document.getElementsByTagName(
                "SignatureMethod").item(0)).getAttribute("Algorithm");
        SignatureMethodType signMethod = new SignatureMethodType();
        signMethod.setAlgorithm(new URI(signMethodAlg));
        signedInfo.setSignatureMethod(signMethod);

        Element refElem = (Element) document.getElementsByTagName("Reference")
                .item(0);
        ReferenceType refType = new ReferenceType();
        refType.setURI(new URI(refElem.getAttribute("URI")));

        NodeList transformElems = ((Element) refElem.getElementsByTagName(
                "Transforms").item(0)).getChildNodes();
        TransformType[] transforms = new TransformType[transformElems
                .getLength()];

        for (int i = 0; i < transformElems.getLength(); i++) {
            TransformType transform = new TransformType();
            transform.setAlgorithm(new URI(((Element) transformElems.item(0))
                    .getAttribute("Algorithm")));
            transforms[i] = transform;
        }

        refType.setTransforms(transforms);

        String digestMethodAlg = ((Element) refElem.getElementsByTagName(
                "DigestMethod").item(0)).getAttribute("Algorithm");
        DigestMethodType digestMethod = new DigestMethodType();
        digestMethod.setAlgorithm(new URI(digestMethodAlg));
        refType.setDigestMethod(digestMethod);

        String digestValue = ((Element) refElem.getElementsByTagName(
                "DigestValue").item(0)).getTextContent();
        refType.setDigestValue(digestValue.getBytes("UTF-8"));
        signedInfo.setReference(new ReferenceType[] { refType });
        signature.setSignedInfo(signedInfo);

        String signValue = ((Element) document.getElementsByTagName(
                "SignatureValue").item(0)).getTextContent();
        SignatureValueType signValueType = new SignatureValueType();
        signValueType.set_value(signValue.getBytes("UTF-8"));
        signature.setSignatureValue(signValueType);

        String x509 = ((Element) document.getElementsByTagName(
                "X509Certificate").item(0)).getTextContent();
        KeyInfoType kiType = new KeyInfoType();
        X509DataType x509data = new X509DataType();
        x509data.setX509Certificate(x509.getBytes("UTF-8"));
        kiType.setX509Data(x509data);
        signature.setKeyInfo(kiType);

        req.setSignature(signature);
    }

    private void signXML(Element target, KeyStore.PrivateKeyEntry entry)
            throws GeneralSecurityException, XMLSignatureException,
            MarshalException, ClassNotFoundException, Exception {

        String providerName = System.getProperty("jsr105Provider",
                "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
        XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM",
                (Provider) Class.forName(providerName).newInstance());

        KeyPair keyPair = new KeyPair(entry.getCertificate().getPublicKey(),
                entry.getPrivateKey());

        KeyInfoFactory kFactory = factory.getKeyInfoFactory();
        KeyInfo keyInfo = kFactory.newKeyInfo(Collections
                .singletonList(kFactory.newX509Data(Collections
                        .singletonList(entry.getCertificate()))));

        Reference ref = factory.newReference("#" + target.getAttribute("ID"),
                factory.newDigestMethod(DigestMethod.SHA1, null), Collections
                        .singletonList(factory.newTransform(
                                Transform.ENVELOPED,
                                (TransformParameterSpec) null)), null, null);

        SignedInfo signedInfo = factory.newSignedInfo(factory
                        .newCanonicalizationMethod(
                                CanonicalizationMethod.INCLUSIVE_WITH_COMMENTS,
                                (C14NMethodParameterSpec) null), factory
                        .newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                Collections.singletonList(ref));

        XMLSignature signature = factory.newXMLSignature(signedInfo, keyInfo);
        DOMSignContext signContext = new DOMSignContext(keyPair.getPrivate(),
                target);

        signature.sign(signContext);
    }
}
