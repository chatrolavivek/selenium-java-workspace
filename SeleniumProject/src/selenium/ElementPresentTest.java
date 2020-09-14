package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class ElementPresentTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		// Only works when element is present. so not much useful
		if (driver.findElement(By.linkText("About")).isDisplayed()) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element Not Present");
		}

		/*
		 * This gives error "Unable to locate element: sghsasds" if
		 * (driver.findElement(By.linkText("sghsasds")).isDisplayed()) {
		 * System.out.println("Element Found"); } else {
		 * System.out.println("Element not found"); }
		 */

		List<WebElement> myList = driver.findElements(By.linkText("About")); // findElements

		System.out.println(myList.size());
		if (myList.size() > 0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element Not Present");
		}

		/*
		 * This will work. wil give size '0' and "Element Not Present" message
		 * List<WebElement> myList = driver.findElements(By.linkText("dhfgfd"));
		 */

	}

}
