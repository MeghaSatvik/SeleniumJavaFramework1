package listeners;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Parameters({"browsername"})
public class TestNGListenersDemo {
	ChromeDriver driver;
	
	@Test
	public void Test7(String browsername)
	{
		
	System.out.println("Iam Inside Test1" );	
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
	System.out.println("Browser name is" +browsername);
	driver.get("http://google.com");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	@Test
	public void Test2() 	 
	{
		System.out.println("Iam Inside Test2");	
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://google.com");
		 driver.findElement(By.name("q")).sendKeys("Automation");
		// driver.findElement(By.name("selenium")).sendKeys("abcd");
		 driver.close();
	}
	@Test
	public void Test3()
	{
		System.out.println("Iam Inside Test3");	
	}
	
	
	
	
}
