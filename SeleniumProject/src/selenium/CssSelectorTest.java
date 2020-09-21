package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class CssSelectorTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());

		FirefoxDriver driver = new FirefoxDriver(); // to run in Firefox browser
		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("#email")).sendKeys("hvhd");
		driver.findElement(By.cssSelector("input[id^='pas']")).sendKeys("hd");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
