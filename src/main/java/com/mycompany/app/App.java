package com.mycompany.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Properties properties = new Properties();
            InputStream propFile = App.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(propFile);
            System.out.println( properties.getProperty("version") );
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
