package mustafa.utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties configFile;

    static {

        try {
            FileInputStream fileInputStream = new FileInputStream("Configuration.Properties");

            configFile = new Properties();
            configFile.load(fileInputStream);

        } catch (IOException e) {
            System.out.println("Failed to Load the File");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){

        return configFile.getProperty(key);
    }
}
