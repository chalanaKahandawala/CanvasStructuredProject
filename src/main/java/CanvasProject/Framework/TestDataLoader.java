package CanvasProject.Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataLoader {
	private static Properties properties;

    static {
        try (FileInputStream input = new FileInputStream("E:/GitHub/CanvasStructuredProject/src/main/resources/testdata.properties")) {
            properties = new Properties(); 
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUsername() {
        return properties.getProperty("username");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }
    
    public static String getData(String data) {
        return properties.getProperty(data);
    }

}
