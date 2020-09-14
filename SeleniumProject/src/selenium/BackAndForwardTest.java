package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.google.ca/");

		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

}
