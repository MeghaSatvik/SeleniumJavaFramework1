package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestNGDemo {

	ChromeDriver driver; 
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
@BeforeSuite
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
	driver=new ChromeDriver();


    htmlReporter = new ExtentHtmlReporter("extentReportsTestNG.html");
     
    extent=new ExtentReports();
    extent.attachReporter(htmlReporter);
		
	}
@Test
	public void test1()
	{
		
		ExtentTest test =extent.createTest("Google search test one", "Test to validate its functionality");
		test.log(Status.INFO,"Testing Started");
		
		driver.get("http://www.google.com");
		test.pass("Namvigated to Google search page");
		
		driver.manage().window().maximize();
		test.pass("Window get maximized");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		test.pass("Entered text into text box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.fail("Clicked on Google Search button");
		

	}
@AfterSuite
	public void cleanUp()
	{
	
	    driver.close();
	    driver.quit();
		extent.flush();
		
	}
}


	