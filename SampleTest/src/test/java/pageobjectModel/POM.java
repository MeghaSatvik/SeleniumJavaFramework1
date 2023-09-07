package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM {
	
	private static WebElement element = null;
	ChromeDriver driver;
	
	public static WebElement text_search(WebDriver driver)
	{
	 element=driver.findElement(By.id("APjFqb"));
	 return element;
	
	}	
	
	public static WebElement button_search(WebDriver driver)
	{
		element=driver.findElement(By.name("btnK"));
		return element;
	}
	

}
