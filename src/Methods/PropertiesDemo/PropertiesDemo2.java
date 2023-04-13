package Methods.PropertiesDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {


    Properties getLoadedPropertiesObject() throws IOException {
        // 1. read the file
        FileInputStream fis = new FileInputStream("Config/config.properties");

        // 2. create the object of the properties class
        Properties prop = new Properties();

        // 3. load the properties object with file object
        prop.load(fis);

        return prop;
    }

    String getUrl() throws IOException {

        return getLoadedPropertiesObject().getProperty("url");
    }
    String getUsername() throws IOException {

        return getLoadedPropertiesObject().getProperty("username");
    }
    String getPassword() throws IOException {

        return getLoadedPropertiesObject().getProperty("password");
    }



    public static void main(String[] args) throws IOException {

        PropertiesDemo2 ob = new PropertiesDemo2();

        System.out.println("url="+ob.getUrl());
        System.out.println("username="+ob.getUsername());
        System.out.println("password="+ob.getPassword());

    }
}
