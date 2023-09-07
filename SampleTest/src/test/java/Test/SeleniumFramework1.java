package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configuration.PropertiesFile;



public class SeleniumFramework1 {

	ChromeDriver driver;
  public static String browserName =null;
	
  
@BeforeTest	
	public void setUp()
	{
	 PropertiesFile.getProperties();
	
	{
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver(); 
				
	}
	  else
	  {
		  System.out.println("Chrome brower not fount");
	  
	}
	}
	}
@Test
	public void googleSearch()
	{
	    driver.get("http://www.google.com");
	    driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("TestNG Wikipedia");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
	}
@AfterTest
	public void cleanUp()
	{
		driver.close();
		driver.quit();
		System.out.println("Testing Completed Sucessfully");
		
	}
}
