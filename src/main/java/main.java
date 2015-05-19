import java.security.*;

import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.ApplicationType;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentField;
import org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase;

import org.tempuri.IWidgetsProxy;

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

    private static int getBucketID(IWidgetsProxy iWidgetsProxy, String sessionID, DemoProperties demoProperties) throws Exception {

        String bucketName = demoProperties.getBucketName();

        ApplicationType[] buckets =  iWidgetsProxy.getApplications(sessionID).getReturnValue();
        for (ApplicationType bucket : buckets) {
            if (bucket.getName().equals(bucketName)) {
                return bucket.getID();
            }
        }

        throw new Exception("Bucket '" + bucketName + "' is not found");

    }

    private static String uploadFile(IWidgetsProxy iWidgetsProxy, String sessionID, int bucketID, DemoProperties demoProperties) throws Exception {

        String fileName = demoProperties.getTestFileName();
        byte[] fileBytes = demoProperties.getTestFileBytes();

        return iWidgetsProxy.uploadFileJava(sessionID, bucketID, null, null, null, fileName, null, fileBytes);

    }

    private static int getFieldID(IWidgetsProxy iWidgetsProxy, String sessionID, String documentGuid, DemoProperties demoProperties) throws  Exception {

        String fieldName = demoProperties.getFieldName();

        DocumentField[] allowedFields = iWidgetsProxy.getAllowedFieldsForDocument(sessionID, documentGuid).getReturnValue();
        for (DocumentField field : allowedFields) {
            if (field.getName().equals(fieldName)) {
                return field.getID();
            }
        }

        throw new Exception("Field '" + fieldName + "' is not allowed on document '" + documentGuid + "'");

    }

    private static void addField(IWidgetsProxy iWidgetsProxy, String sessionID, String documentGuid, int fieldID, DemoProperties demoProperties) throws Exception {

        String fieldValue = demoProperties.getFieldValue();

        DocumentMetadataValueBase field = new DocumentMetadataValueBase();
        field.setFieldValue(fieldValue);
        field.setFieldID(fieldID);

        DocumentMetadataValueBase[] fields = new DocumentMetadataValueBase[] { field };

        try {
            iWidgetsProxy.setMetadataValues(sessionID, documentGuid, fields, new int[0]);
        } catch (Exception exception) { }

    }

    private static String[] getFieldValues(IWidgetsProxy iWidgetsProxy, String sessionID, String documentGuid, int fieldID) throws Exception {

        DocumentMetadataValueBase[] fields = iWidgetsProxy.getMetadataValuesForFieldType(sessionID, documentGuid, fieldID).getReturnValue();
        String[] fieldValues = new String[fields.length];

        for (int i = 0; i < fields.length; i++) {
            fieldValues[i] = fields[i].getFieldValue();
        }

        return fieldValues;

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
            System.out.println("Upload file to bucket ID " + bucketID);

            String documentGuid = uploadFile(iWidgetsProxy, sessionID, bucketID, demoProperties);
            System.out.println("Upload document Guid is " + documentGuid);

            int fieldID = getFieldID(iWidgetsProxy, sessionID, documentGuid, demoProperties);
            System.out.println("Adding new field with ID " + fieldID + " to document");

			addField(iWidgetsProxy, sessionID, documentGuid, fieldID, demoProperties);
            System.out.println("Success");

            String[] fieldValues = getFieldValues(iWidgetsProxy, sessionID, documentGuid, fieldID);
            System.out.println("List of all values of this field");
            for (String fieldValue: fieldValues) {
                System.out.println(fieldValue);
            }

		} catch (Exception exception) {
            exception.printStackTrace();
		}
	}
}
