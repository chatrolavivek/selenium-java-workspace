package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class SeleniumFirstClass {

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "E:\\Academics\\Computer
		// Science\\1-Software Testing\\Course Files\\SeleniumJars\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);

		FirefoxDriver driver = new FirefoxDriver(); // to run in Firefox browser

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hhshsafskjsf");
		driver.findElement(By.id("pass")).sendKeys("hdhjt");

	}

}
