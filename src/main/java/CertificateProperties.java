import java.io.IOException;

public class CertificateProperties extends AbstractProperties {

    public CertificateProperties(String propFileName) throws IOException {
        super(propFileName);
    }

    public String getKeyStore() {
        return properties.getProperty("keystore");
    }

    public String getKeyStorePass() {
        return properties.getProperty("storepass");
    }

    public String getAlias() {
        return properties.getProperty("alias");
    }

    public String getKeyPass() {
        return properties.getProperty("keypass");
    }

}
