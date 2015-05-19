import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoProperties extends AbstractProperties {

    public DemoProperties(String propFileName) throws IOException {
        super(propFileName);
    }

    public String getTestFileName() {
        return properties.getProperty("testFileName");
    }

    public byte[] getTestFileBytes() throws IOException {
        InputStream inputStream = getClass().getClassLoader()
                .getResourceAsStream(getTestFileName());
        return readBytesFromInputStream(inputStream);
    }

    private byte[] readBytesFromInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();

        return buffer.toByteArray();
    }

}
