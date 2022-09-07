package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {

    private static Properties PROPERTIES;

    static {
        File globalConfigFile = new File("src/main/resources/conf.properties");
        Properties globalProperties = new Properties();

        try {
            globalProperties.load(new FileInputStream(globalConfigFile));
            PROPERTIES = new Properties();
            PROPERTIES.putAll(globalProperties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
