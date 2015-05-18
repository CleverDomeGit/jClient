import java.io.IOException;

public class VendorProperties extends AbstractProperties {

    public VendorProperties(String propFileName) throws IOException {
        super(propFileName);
    }

    public String getVendorName() {
        return properties.getProperty("vendorName");
    }

    public String getExternalUserID() {
        return properties.getProperty("externalUserID");
    }

}
