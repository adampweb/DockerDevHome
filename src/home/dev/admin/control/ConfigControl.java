package home.dev.admin.control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigControl {

    public ConfigControl(){

    }

    private InputStream inputStream;

    public Properties getPropValues(String propFileName) throws IOException {
        Properties result = new Properties();
        try {

            propFileName = propFileName != null ? propFileName : "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                result.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        return result;
    }
}
