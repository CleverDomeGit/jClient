import java.rmi.Remote;
import java.rmi.RemoteException;
import java.security.*;

import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ApplicationType;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase;

import org.tempuri.IWidgets;
import org.tempuri.IWidgetsProxy;

import sso.SsoAuthenticationException;
import sso.SsoHelper;
import sso.CertificateHelper;

public class main {

    private static KeyStore.PrivateKeyEntry getPrivateKey(CertificateProperties certificateProperties)
        throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
        KeyStore keyStore = CertificateHelper.getKeyStore(
                main.class.getClassLoader().getResourceAsStream(certificateProperties.getKeyStore()),
                certificateProperties.getKeyStorePass());

        return (KeyStore.PrivateKeyEntry) keyStore
                .getEntry(
                        certificateProperties.getAlias(),
                        new KeyStore.PasswordProtection(certificateProperties.getKeyPass().toCharArray()));
    }

    public static int getBucketID(IWidgetsProxy iWidgetsProxy, String sessionID, DemoProperties demoProperties) throws Exception {

        String bucketName = demoProperties.getBucketName();

        ApplicationType[] buckets =  iWidgetsProxy.getApplications(sessionID).getReturnValue();
        for (ApplicationType bucket : buckets) {
            if (bucket.getName().equals(bucketName)) {
                return bucket.getID();
            }
        }

        throw new Exception("Bucket '" + bucketName + "' is not found");

    }

    public static String uploadFile(IWidgetsProxy iWidgetsProxy, String sessionID, int bucketID, DemoProperties demoProperties) throws Exception {

        String fileName = demoProperties.getTestFileName();
        byte[] fileBytes = demoProperties.getTestFileBytes();

        return iWidgetsProxy.uploadFileJava(sessionID, bucketID, null, null, null, fileName, null, fileBytes);

    }

	public static void main(String[] args) {

		IWidgetsProxy iWidgetsProxy = new IWidgetsProxy();	
		
		try {
            VendorProperties vendorProperties = new VendorProperties("vendor.properties");
            CertificateProperties certificateProperties = new CertificateProperties("certificate.properties");
            DemoProperties demoProperties = new DemoProperties("demo.properties");

            SsoHelper ssoHelper = new SsoHelper();
			String sessionID = ssoHelper.getSessionID(vendorProperties.getExternalUserID(),
                    vendorProperties.getVendorName(),
                    getPrivateKey(certificateProperties));


			int bucketID = getBucketID(iWidgetsProxy, sessionID, demoProperties);

            String documentGuid = uploadFile(iWidgetsProxy, sessionID, bucketID, demoProperties);

            DocumentField[] allowedFields = iWidgetsProxy.getAllowedFieldsForDocument(sessionID, documentGuid).getReturnValue();

			int metValueTypeId = allowedFields[7].getID(); // Can take any of allowed values for this user and doc

			// create Metadata
			DocumentMetadataValueBase[] DM = new DocumentMetadataValueBase[1];
			DocumentMetadataValueBase md1 = new DocumentMetadataValueBase();
			md1.setFieldValue("TyourValidValueForThisTypeOfMeta");
			md1.setFieldID(metValueTypeId);
			DM[0] = md1;

			try{
				// set Metadata to document
				iWidgetsProxy.setMetadataValues(sessionID, documentGuid, DM, new int[0]);
			}catch (Exception e1) {
				// nothing to do in this exception, because it's features to java and C# type "object"
				if(!e1.getCause().getLocalizedMessage().equalsIgnoreCase("No deserializer for {http://www.w3.org/2001/XMLSchema}anyType"))
					e1.printStackTrace();
			}

			// get seted Metadata for doc
            DocumentMetadataValueBase[] metadataValuesForFieldTypes = iWidgetsProxy.getMetadataValuesForFieldType(sessionID, documentGuid, metValueTypeId).getReturnValue();
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
