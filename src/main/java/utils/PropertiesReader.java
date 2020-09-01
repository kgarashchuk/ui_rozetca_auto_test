package utils;

import java.util.ResourceBundle;

public class PropertiesReader {
    private ResourceBundle config = ResourceBundle.getBundle("config");

    public String getUrl(){
        return config.getString("url");
    }

    public String getChromeDriverPath(){
        return config.getString("chrome_driver_path");
    }

}
