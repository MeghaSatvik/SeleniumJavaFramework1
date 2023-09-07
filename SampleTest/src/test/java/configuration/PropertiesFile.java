package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.SeleniumFramework1;

public class PropertiesFile {
	
	
	static Properties prop=new Properties();
	static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) {
        getProperties();
        setProperties();
        getProperties();
        }

	
	public static void getProperties()
	{
		
		try {
			InputStream input=new FileInputStream(projectpath+"/src/test/java/configuration/config.properties");
		    prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		SeleniumFramework1.browserName=browser;
		
	}
	
	public static void setProperties()
	{
      try {
		OutputStream output=new FileOutputStream(projectpath+"/src/test/java/configuration/config.properties");
		prop.setProperty("result", "pass");
		try {
			prop.store(output,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
     
      
		
	}
	
	}