package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIt {
	
	static ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{

		  System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		  driver=new ChromeDriver();
	}
	
	
   @Test
		
		
		public static void test() throws InterruptedException
		{
			driver.get("https://www.filemail.com/share/upload-file");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("addBtn")).click();
			
			try {
				Runtime.getRuntime().exec("E:\\uploadfile1.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread.sleep(5000);
		}
			
		
		@AfterTest
		public void tearDown()
		{
		 driver.close();
			
		}



}
