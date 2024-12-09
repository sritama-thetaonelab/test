package Selenium.Drivers;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webdriver {
	
	static String browserType = "webdriber.chorme.driver";
	static String browserPath = "C:\\Users\\Ce\\eclipse-workspace\\DaflSelenium\\src\\test\\java\\Selenium\\Configfiles";
	static String url = "https://www.google.com/";
	
	public static WebDriver setUp() {
		
		System.setProperty(browserType, browserPath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}

}
