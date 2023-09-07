package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
  
	WebDriver driver=null;
	
	public static void main(String[] args) {
		
		test();
		
	}
		
		public static void test()
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
			ChromeOptions options =new ChromeOptions();
			//options.addArguments("headless");
			options.addArguments("window-size=1366,768");
			WebDriver driver=new ChromeDriver(options);
			
			
			driver.get("http:facebook.com");
			System.out.println(driver.getTitle());
			driver.findElement(By.name("email")).sendKeys("tg.megha93@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("jyothisatishbms");
			driver.findElement(By.name("login")).click();
			
			driver.close();
			driver.quit();
			
			System.out.println("Test Completed");
		}
	}


