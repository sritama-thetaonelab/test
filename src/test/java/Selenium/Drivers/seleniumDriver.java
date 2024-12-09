package Selenium.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class seleniumDriver {
	
	public static By ByType(String locator, String LocatorType)
	{
		
		String locatorType = LocatorType.toLowerCase();
		By result = null;
		
		if(locatorType.equals("id")) {
			
			result = By.id(locator);
			return result;
		}
		return result;
	}
	
	public static WebElement findElement (WebDriver driver, String locator, String locatorType)
	{
		
		By getByType = ByType(locator, locatorType);
		WebElement element = driver.findElement(getByType);
				
		return element;  
	}
	
	public static void sendKeys(WebDriver driver, String locator, String locatorType, String value)
	{
		
		WebElement ele = findElement(driver, locator, locatorType);
		ele.sendKeys(value);	
	}

}
