package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectModel.POM;

public class POMTest {
	
	ChromeDriver driver;
	String url="http://www.google.com";
	
	public void googlesearch1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		POM.text_search(driver).sendKeys("selenium tools");
		POM.button_search(driver).sendKeys(Keys.RETURN);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		System.out.println("Test Completed Successfully");
		
		
	}
	
	public static void main(String[] args) {
		
		POMTest pomtest=new POMTest();
		pomtest.googlesearch1();
		
	}

}
