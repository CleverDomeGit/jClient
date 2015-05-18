import java.io.FileInputStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.Provider;

import java.util.Calendar;
import java.util.Collections;
import java.util.Properties;
import java.util.UUID;

import javax.swing.text.html.parser.Parser;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.axis.types.Id;
import org.apache.axis.types.URI;

import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ApplicationType;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfApplicationTypewJCT_PyJf;

import org.tempuri.IWidgetsProxy;

import org.w3.www._2000._09.xmldsig.CanonicalizationMethodType;
import org.w3.www._2000._09.xmldsig.DigestMethodType;
import org.w3.www._2000._09.xmldsig.KeyInfoType;
import org.w3.www._2000._09.xmldsig.ReferenceType;
import org.w3.www._2000._09.xmldsig.SignatureMethodType;
import org.w3.www._2000._09.xmldsig.SignatureType;
import org.w3.www._2000._09.xmldsig.SignatureValueType;
import org.w3.www._2000._09.xmldsig.SignedInfoType;
import org.w3.www._2000._09.xmldsig.TransformType;
import org.w3.www._2000._09.xmldsig.X509DataType;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import protocol._0._2.SAML.tc.names.oasis.AuthnRequestType;
import protocol._0._2.SAML.tc.names.oasis.NameIDPolicyType;
import protocol._0._2.SAML.tc.names.oasis.ResponseType;
import v1.service.sso_service.up_us.ISSOServiceProxy;
import assertion._0._2.SAML.tc.names.oasis.NameIDType;
import assertion._0._2.SAML.tc.names.oasis.SubjectType;

public class main {

	private static OperationResultOfArrayOfApplicationTypewJCT_PyJf Appls;
	private static String docGuidUpped;
	private static DocumentField[] allowedFields;
	private static DocumentMetadataValueBase[] metadataValuesForFieldTypes;

    public static String GetSessionID(VendorProperties vendorProperties, CertificateProperties certificateProperties)
            throws IOException,
        ClassNotFoundException, ParserConfigurationException, GeneralSecurityException, XMLSignatureException, MarshalException, Exception
    {
        AuthnRequestType req = CreateRequest(vendorProperties.getExternalUserID(), vendorProperties.getVendorName());
        signRequest(req, certificateProperties);

        ISSOServiceProxy ssoService = new ISSOServiceProxy();

        //Get session for current user and vendor for communication with widget's api
        ResponseType SSOAnswer = ssoService.getSSO(req);
        Object[] SSOAnswerAttrs = SSOAnswer.getAssertion().getAttributeStatement().getAttribute();
        return ((Object[])SSOAnswerAttrs[0])[0].toString();
    }

	public static void main(String[] args) {

		IWidgetsProxy iWidgetsProxy = new IWidgetsProxy();	
		
		try {
            VendorProperties vendorProperties = new VendorProperties("vendor.properties");
            CertificateProperties certificateProperties = new CertificateProperties("certificate.properties");
			String SessionId = GetSessionID(vendorProperties, certificateProperties);
			
			//read file to send
			Path path = Paths.get("D:/auth.json");
			byte[] data = Files.readAllBytes(path);
			
			//get allowed applications for this user 
			Appls = iWidgetsProxy.getApplications(SessionId);
						
			// Betterment app
			ApplicationType[] applicationIds = Appls.getReturnValue();
			
			// send file to server and give doc guid for next steps
			docGuidUpped = iWidgetsProxy.uploadFileJava(SessionId, applicationIds[2].getID(), null,null, null, "filename", null, data);
			
			allowedFields = iWidgetsProxy.getAllowedFieldsForDocument(SessionId, docGuidUpped).getReturnValue();
			
			int metValueTypeId = allowedFields[7].getID(); // Can take any of allowed values for this user and doc
			
			// create Metadata
			DocumentMetadataValueBase[] DM = new DocumentMetadataValueBase[1];
			DocumentMetadataValueBase md1 = new DocumentMetadataValueBase();
			md1.setFieldValue("TyourValidValueForThisTypeOfMeta");
			md1.setFieldID(metValueTypeId);
			DM[0] = md1;
			
			try{
				// set Metadata to document
				iWidgetsProxy.setMetadataValues(SessionId, docGuidUpped, DM, new int[0]);
			}catch (Exception e1) {				
				// nothing to do in this exception, because it's features to java and C# type "object" 
				if(!e1.getCause().getLocalizedMessage().equalsIgnoreCase("No deserializer for {http://www.w3.org/2001/XMLSchema}anyType"))
					e1.printStackTrace();
			}

			// get seted Metadata for doc
			metadataValuesForFieldTypes = iWidgetsProxy.getMetadataValuesForFieldType(SessionId, docGuidUpped, metValueTypeId).getReturnValue();
			System.out.print(metadataValuesForFieldTypes[0].getFieldValue()); 
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		} catch (GeneralSecurityException e1) {
			e1.printStackTrace();
		} catch (XMLSignatureException e1) {
			e1.printStackTrace();
		} catch (MarshalException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
				e1.printStackTrace();
		}
	}

	private static AuthnRequestType CreateRequest(String assertionSubject, String vendor)
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

		req.setProviderName(vendor);

		req.setIsPassive(false);

		NameIDType issuer = new NameIDType();
		issuer.set_value(vendor);
		issuer.setFormat(new URI(
				"urn:oasis:names:tc:SAML:2.0:nameidformat:transient"));
		req.setIssuer(issuer);

		NameIDPolicyType nameIDPolicy = new NameIDPolicyType();
		nameIDPolicy.setAllowCreate(true);
		req.setNameIDPolicy(nameIDPolicy);

		SubjectType subjectType = new SubjectType();
		NameIDType nameID = new NameIDType();
		nameID.set_value(assertionSubject);
		nameID.setFormat(new URI(
				"urn:oasis:names:tc:SAML:2.0:nameid-format:transient"));
		subjectType.setNameID(nameID);
		req.setSubject(subjectType);

		return req;
	}

	private static void signRequest(AuthnRequestType req, CertificateProperties certificateProperties)
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

		signXML(document.getDocumentElement(), certificateProperties);

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

	private static void signXML(Element target, CertificateProperties certificateProperties)
			throws GeneralSecurityException, XMLSignatureException,
			MarshalException, ClassNotFoundException, Exception {

		String providerName = System.getProperty("jsr105Provider",
				"org.jcp.xml.dsig.internal.dom.XMLDSigRI");
		XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM",
				(Provider) Class.forName(providerName).newInstance());

		KeyStore keyStore = KeyStoreUtil.getKeyStore(
                main.class.getClassLoader().getResourceAsStream(certificateProperties.getKeyStore()),
                certificateProperties.getKeyStorePass());

		KeyStore.PrivateKeyEntry entry = (KeyStore.PrivateKeyEntry) keyStore
				.getEntry(
						certificateProperties.getAlias(),
						new KeyStore.PasswordProtection(certificateProperties.getKeyPass().toCharArray()));
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
