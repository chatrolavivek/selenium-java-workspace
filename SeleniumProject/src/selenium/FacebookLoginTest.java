package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class FacebookLoginTest {

	/*
	 * tag - input, form, html, body, div, li, ul, tbody, iframe, option, a
	 * attributes - are always in opening tag - id, class, name, type, href, Are
	 * always in key- value pair text - always between opening tag and clossing tag
	 * 
	 * <tag>hello</tag> - tag with the text <tag id="email" name="dff" type="sgsg"
	 * class="dsgsdgsd">Hello</tag> - Tag with attributes and text <tag id="email"
	 * name="dff" type="sgsg" class="dsgsdgsd"> - tag with attributes, no text, when
	 * you don't have text, you don't need clossing tag
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here I am setting the system properties of Chrome driver and specifying the
		// System internal class. setProperty is static method
		// setProperty(key:value);
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "E:\\Academics\\Computer Science\\1-Software Testing\\Course Files\\SeleniumJars\\geckodriver.exe"
		 * );
		 */
		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);

		// Creating a object to instantiate the browser driver
		FirefoxDriver driver = new FirefoxDriver(); // to run in Firefox browser

		// Navigating through a particular website. https: protocol is most important
		driver.get("https://www.facebook.com/");

		/*
		 * driver.findElement(By.className("inputtext _55r1 _6luy")) cannot use as there
		 * is a space in class name. There might be a way to do it
		 */

//		driver.findElement(By.cssSelector(cssSelector)) must know the syntax of cssSelector 
//		driver.findElement(By.id("email")).sendKeys("shdj"); working fine
//		driver.findElement(By.linkText(linkText)) used only for link/url
//		driver.findElement(By.partialLinkText(partialLinkText)) used only for link/url
//		driver.findElement(By.tagName("input")).sendKeys("dhd"); not unique, selenium finds first tag and use it
//		driver.findElement(By.xpath(xpathExpression)) don't know xpath syntax yet. must learn it

		// Locating elements using name attributes for search box

		driver.findElement(By.name("email")).sendKeys("sgdgsghgshs");
		driver.findElement(By.name("pass")).sendKeys("hd");
		driver.findElement(By.name("login")).click();

		/*
		 * When you execute the above code, it will launch facebook website in Firefox
		 * using gecko Driver where the initialization of the driver is handled by
		 * system.setproperty method. This has to be the first line of code that needs
		 * to be executed in your selenium script before any test method to initialize
		 * the driver. That’s how it works. If you wish to use Chrome Browser and chrome
		 * Driver you can use them accordingly.
		 */

	}

}
