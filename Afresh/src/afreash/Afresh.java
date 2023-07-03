package afreash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Afresh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
                driver.manage.timeouts.implicitlywait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");


		

	}

}
