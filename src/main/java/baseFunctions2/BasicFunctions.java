package baseFunctions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicFunctions {
	
	public static WebDriver driver;
	
	public void GetDriver()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void GetURL (String url)
	{
		driver.get(url);
	}
	
	public void SetValue (By locator, String input)
	{
		driver.findElement(locator).sendKeys(input);
	}
	
//	public void setValues
	
	public void action (By locator)
	{
		driver.findElement(locator).click();	
	}
	
	public String getText (By locator)
	{
		return driver.findElement(locator).getText();
	}
	
	public String getPageTitle () 
	{
		return driver.getTitle();
	}
	
	public boolean checkPageTitle (String expTitle)
	{
		String actualPageTitle = getPageTitle();
		
		if (expTitle.equalsIgnoreCase(actualPageTitle))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void clearField (By locator)
	{
		driver.findElement(locator).clear();
	}

}
