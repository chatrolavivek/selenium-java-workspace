package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.google.ca/");

		// driver.findElement(By.partialLinkText("Abo").click(); when text changes
		// only small part remains unchanged
		driver.findElement(By.linkText("About")).click(); // for static link (text doesn't change)
		Thread.sleep(2000);

		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title: " + actualTitle);

		String expectedUrl = "about.google"; // can store full url as well
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualUrl);

		// we can also use full url and expectedUrl.equals(actualUrl)
		if ((expectedTitle.equals(actualTitle)) && (actualUrl.contains(expectedUrl))) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
