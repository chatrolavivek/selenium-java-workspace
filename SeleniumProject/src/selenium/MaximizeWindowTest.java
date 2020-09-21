package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class MaximizeWindowTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		/*
		 * to maximize the browser window size sometimes selenium automatically opens
		 * browser window in small size in that case use this code to automatically
		 * maximize browser window
		 */
		driver.manage().window().maximize();

	}

}
