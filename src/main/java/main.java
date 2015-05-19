import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.security.*;

import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ApplicationType;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase;

import org.tempuri.IWidgetsProxy;

import sso.SsoAuthenticationException;
import sso.SsoHelper;
import sso.CertificateHelper;

public class main {

    public static KeyStore.PrivateKeyEntry getPrivateKey(CertificateProperties certificateProperties)
        throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
        KeyStore keyStore = CertificateHelper.getKeyStore(
                main.class.getClassLoader().getResourceAsStream(certificateProperties.getKeyStore()),
                certificateProperties.getKeyStorePass());

        return (KeyStore.PrivateKeyEntry) keyStore
                .getEntry(
                        certificateProperties.getAlias(),
                        new KeyStore.PasswordProtection(certificateProperties.getKeyPass().toCharArray()));
    }

	public static void main(String[] args) {

		IWidgetsProxy iWidgetsProxy = new IWidgetsProxy();	
		
		try {
            VendorProperties vendorProperties = new VendorProperties("vendor.properties");
            CertificateProperties certificateProperties = new CertificateProperties("certificate.properties");

            SsoHelper ssoHelper = new SsoHelper();
			String SessionId = ssoHelper.getSessionID(vendorProperties.getExternalUserID(),
                    vendorProperties.getVendorName(),
                    getPrivateKey(certificateProperties));

			//read file to send
			Path path = Paths.get("D:/auth.json");
			byte[] data = Files.readAllBytes(path);

			// Betterment app
			ApplicationType[] applicationIds =  iWidgetsProxy.getApplications(SessionId).getReturnValue();

			// send file to server and give doc guid for next steps
            String documentGuid = iWidgetsProxy.uploadFileJava(SessionId, applicationIds[2].getID(), null,null, null, "filename", null, data);

            DocumentField[] allowedFields = iWidgetsProxy.getAllowedFieldsForDocument(SessionId, documentGuid).getReturnValue();

			int metValueTypeId = allowedFields[7].getID(); // Can take any of allowed values for this user and doc

			// create Metadata
			DocumentMetadataValueBase[] DM = new DocumentMetadataValueBase[1];
			DocumentMetadataValueBase md1 = new DocumentMetadataValueBase();
			md1.setFieldValue("TyourValidValueForThisTypeOfMeta");
			md1.setFieldID(metValueTypeId);
			DM[0] = md1;

			try{
				// set Metadata to document
				iWidgetsProxy.setMetadataValues(SessionId, documentGuid, DM, new int[0]);
			}catch (Exception e1) {
				// nothing to do in this exception, because it's features to java and C# type "object"
				if(!e1.getCause().getLocalizedMessage().equalsIgnoreCase("No deserializer for {http://www.w3.org/2001/XMLSchema}anyType"))
					e1.printStackTrace();
			}

			// get seted Metadata for doc
            DocumentMetadataValueBase[] metadataValuesForFieldTypes = iWidgetsProxy.getMetadataValuesForFieldType(SessionId, documentGuid, metValueTypeId).getReturnValue();
			System.out.print(metadataValuesForFieldTypes[0].getFieldValue());

		} catch (SsoAuthenticationException ssoAuthException) {
            ssoAuthException.printStackTrace();
		} catch (GeneralSecurityException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
				e1.printStackTrace();
		}
	}
}
