package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class AttributeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

		WebElement searchElement = driver.findElement(By.name("_nkw"));

		String s = searchElement.getAttribute("aria-label");
		System.out.println(s);

		searchElement.sendKeys("laptop stand");
		System.out.println(searchElement.getAttribute("value"));

	}

}
