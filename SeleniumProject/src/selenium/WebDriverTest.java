package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class WebDriverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());

		// ClassName objName = new ClassName(); i.e. FirefoxDriver driver = new
		// FirefoxDriver();
		// OR
		// InterfaceName objName = new ClassName();
		// AKA
		// ParentClassName objName = new ChildClassName();

		WebDriver driver = new FirefoxDriver(); // FirefoxDriver class implements WebDriver interface

		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("sgdgsghgshs");
		driver.findElement(By.name("pass")).sendKeys("hd");
		driver.findElement(By.name("login")).click();

	}

}
