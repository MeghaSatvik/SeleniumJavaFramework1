package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM2 {
	ChromeDriver driver;
	
	By text_search=By.id("APjFqb");
	By click_butten=By.name("btnK");
	
	public POM2(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void setTextInSearchBox(String text)
	{
		driver.findElement(text_search).sendKeys(text);
	}
	
	public void clickbuttonsearch()
	{
		driver.findElement(click_butten).sendKeys(Keys.RETURN);
	}

}
