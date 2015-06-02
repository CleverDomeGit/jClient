# Demo CleverDome Client

## Prerequisites

Client application is created in Intellij IDEA 14.1.3 CE based on JDK 1.8.0.45.
Axis package was utilised to generate service classes from WSDL file. All service classes are placed in "assertion",
"org", "protocol" and "v1" packages.

To allow requests on CleverDome endpoints, please add CleverDome certificate to Trusted Certificates. List of most
common Java keytool commands is here:
https://www.sslshopper.com/article-most-common-java-keytool-keystore-commands.html?jnca3732fa=2 .

## Configuration

### Certificate Properties

Contains information about certificate used to identify vendor:

* keystore - filename of jks storage (in resources) which contains desired certificate.
* storepass - password to jks storage.
* alias - alias name of vendor certificate (with private key).
* keypass - password to vendor certificate.

### Vendor Properties

Contains information about user from external (vendor) system.

* vendorName - name used to identify vendor in sso procedure.
* externalUserID - user identifier in vendor system, this identifier allows to identify user in CleverDome system.

### Demo Properties

Contains information describing the flow of the demo application.

* testFileName - filename of the file (in resources) which will be uploaded to CleverDome as test example.
* bucketName - name of the bucket where the test file will be placed.
* fieldName - name of the metadata field, which will be added to the file.
* fieldValue - value of the metadata field, which will be added to the file.

## Functionality

* Single Sign On

Gets CleverDome session based on data provided in Vendor Properties. This session value is used in next
operations in order to identify user and verify he has necessary permissions to complete these actions.

* Get Bucket ID

Completes getApplications operation (gets all buckets allowed to user) and extract the identifier of bucket
specified in Demo Properties.

* Upload File

Uploads test file from resources to selected bucket. Document identifier is result type.

* Get Metadata Field ID

Completes getAllowedFieldsForDocument operation (gets all allowed metadata fields for document) and extract the
identifier of field specified in Demo Properties.

* Add Metadata Field

Adds metadata field with identifier extracted from previous procedure and value retrieved from Demo Properties.

* List Metadata Fields

Completes getMetadataValuesForFieldType operation with specified field identifier.