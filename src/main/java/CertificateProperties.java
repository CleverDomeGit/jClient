import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CertificateProperties {

    private Properties properties;

    public static CertificateProperties readFromResource(String propFileName)
        throws IOException {

        Properties props = new Properties();
        InputStream inputStream = CertificateProperties.class.getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            props.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }

        return new CertificateProperties(props);

    }

    private CertificateProperties(Properties properties) {
        this.properties = properties;
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
