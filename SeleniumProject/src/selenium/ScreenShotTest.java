package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

//		This is for FireFoxDriver, ChromeDriver or any class driver
		File scrFile = driver.getScreenshotAs(OutputType.FILE); // this is in java memory

		/*
		 * File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * This line is for WebDriver WebDriver driver = new FirefoxDriver();
		 */

//		This is to add screenshot from java memory to our local folder
		FileUtils.copyFile(scrFile,
				new File("E:\\Academics\\Computer Science\\1-Software Testing\\Course Files\\testing\\screenshot.jpg"));
	}
}
