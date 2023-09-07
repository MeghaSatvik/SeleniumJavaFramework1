package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumFramework2 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
	
	}
   
	@Test
	public void googleSearch2()
	{
		 driver.get("http://www.google.com");
		    driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("Frameworks in Selenium");
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	@Test
	public void googleSearch3()
	{
		 driver.get("http://www.google.com");
		    driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("Frameworks in Selenium");
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	@AfterTest
	public void cleanUp()
	{
		driver.close();
		driver.quit();
		System.out.println("Testing completed sucessfully");
	}
}
