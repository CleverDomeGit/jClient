import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.security.*;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.parsers.ParserConfigurationException;

import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ApplicationType;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfApplicationTypewJCT_PyJf;

import org.tempuri.IWidgetsProxy;

import sso.SsoHelper;
import sso.CertificateHelper;

public class main {

	private static OperationResultOfArrayOfApplicationTypewJCT_PyJf Appls;
	private static String docGuidUpped;
	private static DocumentField[] allowedFields;
	private static DocumentMetadataValueBase[] metadataValuesForFieldTypes;

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
}
