import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractProperties {

    protected Properties properties;

    public AbstractProperties(String propFileName)
            throws IOException {

        properties = new Properties();
        InputStream inputStream = CertificateProperties.class.getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }

    }

}
