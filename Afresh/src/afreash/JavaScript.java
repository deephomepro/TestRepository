package afreash;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
//Introducing JavaScript Executor Interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
//Locate any WebElement using Javascript
jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
jse.executeScript("document.getElementById('pass').value='12345'");

//Scroll Down using Javascript
Thread.sleep(3000);
jse.executeScript("window.scrollBy(0,400)");

//Scroll Up using Javascript
Thread.sleep(3000);
jse.executeScript("window.scrollBy(0,-400)");

}
}