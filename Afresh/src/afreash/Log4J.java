package afreash;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4J {

public static void main(String[] args) {

//Create Logger instance for which we want to create log file 
	Logger logger = Logger.getLogger("Log4J");
	
	//Configure log4j Properties File -see log4j.properties file in the same package 
	PropertyConfigurator.configure("C:\\Users\\admin\\eclipse-workspace\\Afresh\\log4j.properties");
	
	//open chrome browser instance 
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	logger.info("chrome browser instance opened");

	//Maximize the window
	driver.manage().window().maximize();
	logger.info("Maximized window");

	//Set implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	logger.info("Implicit wait given");

	//Open URL
	driver.get("https://www.facebook.com/");
	logger.info("Application Launched");

	//Check if the web element is displayed or not
	try {
		driver.findElement(By.id("emails")).isDisplayed();
		logger.info("Web Element Displayed");
	} catch (Exception e) {
		logger.info("Failure - Web Element Not Displayed");
	}
	
		
	}
}

/*Starting ChromeDriver 113.0.5672.63 (0e1a4471d5ae5bf128b1bd8f4d627c8cbd55f70c-refs/branch-heads/5672@{#912}) on port 48487
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1687159656.945][WARNING]: This version of ChromeDriver has not been tested with Chrome version 114.
Jun 19, 2023 12:57:39 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
 INFO [main] (Log4J.java:24)- chrome browser instance opened
 INFO [main] (Log4J.java:28)- Maximized window
 INFO [main] (Log4J.java:32)- Implicit wait given
 INFO [main] (Log4J.java:36)- Application Launched
 INFO [main] (Log4J.java:43)- Failure - Web Element Not Displayed */

