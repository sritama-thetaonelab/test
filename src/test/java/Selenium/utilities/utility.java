package Selenium.utilities;

import org.testng.Reporter;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
public class utility {

	
	public static void generateReport(String message) {
		Reporter.log(message);
	}
}
