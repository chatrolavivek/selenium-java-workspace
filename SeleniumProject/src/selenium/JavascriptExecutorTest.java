package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class JavascriptExecutorTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement aboutUs = driver.findElement(By.linkText("About Us"));

		// Scrolling by x and y locations
		// System.out.println(aboutUs.getLocation());
		// jse.executeScript("window.scrollBy(919, 3371)");

		// scroll until the element is in the view is true
		jse.executeScript("arguments[0].scrollIntoView(true);", aboutUs);
		aboutUs.click();

	}
}
