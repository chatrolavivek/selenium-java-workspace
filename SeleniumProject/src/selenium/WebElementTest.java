package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class WebElementTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		// Facebook has 90% functionality after login.
		// for all the functionality testing, we need to go through this.
		// Also if its location value changes, it's easy to change one and have effect
		// on other test
		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("sgdgsghgshs");

		WebElement passwordElement = driver.findElement(By.name("pass"));
		passwordElement.sendKeys("hd");

		WebElement loginElement = driver.findElement(By.name("login"));
		loginElement.click();

	}

}
