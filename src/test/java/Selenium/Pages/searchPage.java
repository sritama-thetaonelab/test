package Selenium.Pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class searchPage {
	
//************** LOCATORS****************
	static String typeToSearch_id = "APjFqb";
	//static String
	
	
//************* CREATION BLOCK ****************	
	public static void typeAnything_toSearch(WebDriver driver, String inputData)
	{
		WebElement element = driver.findElement(By.id(typeToSearch_id));
		element.sendKeys(inputData);
	}

//************  VERIFICATION BLOCK *************
	
	public static void verify_searchSpace (WebDriver driver) {
		
		WebElement element = driver.findElement(By.id(typeToSearch_id));
		
		if(element.isDisplayed()) {
			System.out.println("Input field for search is present");
		}
	}
}
