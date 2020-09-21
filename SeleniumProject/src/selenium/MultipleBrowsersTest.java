package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {

		WebDriver driver;

		FileInputStream fs = new FileInputStream(
				"E:\\Computer Science\\Software Testing\\Projects\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);

		String browser = prop.getProperty("browser"); // it's called from database i.e. excel or any other files

		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
			driver = new FirefoxDriver(); // to run in Firefox browser
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", CommonResources.getChromeDriverLocation());
			driver = new ChromeDriver(); // to run in Chrome browser
		} else {
			System.setProperty("webdriver.chrome.driver", CommonResources.getChromeDriverLocation());
			driver = new ChromeDriver(); // to run in any other browser
		}

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("#email")).sendKeys("hvhd");
		driver.findElement(By.cssSelector("input[id^='pas']")).sendKeys("hd");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}
