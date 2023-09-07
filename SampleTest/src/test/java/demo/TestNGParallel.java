package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParallel {
	
	
     WebDriver driver=null; 
     
    @Parameters("browsername") 
	@BeforeTest 
	public void setUp(String browsername)
	{
		System.out.println("This is setUp " +browsername);
		System.out.println("Thread id is " +Thread.currentThread().getId());
		
		if(browsername.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\WebDriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		}
	

	@Test
	public void Test()
	{
		System.out.println("Test started");
		driver.get("http://google.com");
		
		}

	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("test completed");
		
		}
}
