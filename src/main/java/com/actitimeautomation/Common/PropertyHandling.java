package com.actitimeautomation.Common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling {
    Properties properties;
    public PropertyHandling() throws IOException
    {
        //acess config.properties file
        //1get the path ofthe project
        String filepath=System.getProperty("user.dir")+"/config.properties";
       //String filePath=System.getProperty("C:/Users/Admin/IdeaProjects/actitime-automation/target/config.propertiesFile");
        //2access the config.properties file
        FileInputStream inputStream=new FileInputStream(filepath);
        //3Create an object of properties class
        properties =new Properties();
        //4Load file into properties class
        properties.load(inputStream);


    }
    public String getProperty(String key)
    {
        return properties.getProperty(key);
    }
}
