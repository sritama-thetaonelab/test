package Selenium.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import Selenium.Drivers.webdriver;
import Selenium.Drivers.seleniumDriver;
import Selenium.Pages.searchPage;

public class TestCases {
	
	static WebDriver driver;
	
	@BeforeClass
	public static WebDriver initialize() {
		driver = webdriver.setUp();
		return driver;
	}
	
	@Test(priority=1)
	public static void test_case01() {
		searchPage.verify_searchSpace(driver);
	}
	public static void test_case02() {
		String element = "ThetaOne Lab";
		searchPage.verify_searchSpace(driver);
	}
	

}
