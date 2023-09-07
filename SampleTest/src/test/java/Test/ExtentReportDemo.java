package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportDemo {

	private static ChromeDriver driver;
	static String url="http://www.google.com";
	
 
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		 
		ExtentTest test1=extent.createTest("Google Search Test 1","Test to validate its Functionalities");
		 
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();  
		
		test1.log(Status.INFO, "Test Started");
		driver.get(url);
		driver.manage().window().maximize();
		
		
		test1.pass("Navigated to google search page");
		
	     driver.findElement(By.name("q")).sendKeys("Selenium tools");
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     test1.pass("Entered text in textbox");
	     
	     driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	     test1.pass("Clicked on Search button");
	     
	     driver.close();
	     driver.quit();
	     test1.pass("Browser get closed");
	     
	     extent.flush();//writes every things to log report
	     
	     
	     
	    

	}

}
