package Test;

import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectModel.POM2;

public class POMTest2 {

	
	static ChromeDriver driver;
	String url="http://www.google.com";
	
	public void googlesearch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		POM2 pom=new POM2(driver);
		pom.setTextInSearchBox("Automation step by step");
		pom.clickbuttonsearch();
		
		driver.close();
		System.out.println("Test Completed Successfully");
	}
	
	public static void main(String[] args) {
		
		POMTest2 pom2=new POMTest2();
		pom2.googlesearch();
		
	}
}
