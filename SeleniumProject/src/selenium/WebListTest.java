package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		// WebElement oneLink = driver.findElement(By.tagName("gdagds")); 
		// runtime error as element not found
		// List<WebElement> allLinks = driver.findElements(By.tagName("acsdsddss")); 
		// no error, list will be empty
		// WebElement allLinks = driver.findElements(By.tagName("a")); 
		// only stores first one

		//gives all links from the page. we might not need all
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		//if we need all the links from footer
		WebElement footerElement = driver.findElement(By.id("fbar"));
		List<WebElement> allFooterLinks = footerElement.findElements(By.tagName("a"));
		System.out.println(allFooterLinks.size());
		
		//if we need links from left footer only
				
		List<WebElement> leftFooterLinks = driver.findElements(By.xpath("//span[@id='fsl']/a"));
		System.out.println(leftFooterLinks.size());
		
//		WebElement leftFooterElement = driver.findElement(By.id("fsl"));
//		List<WebElement> leftFooterLinks = leftFooterElement.findElements(By.tagName("a"));
//		System.out.println(leftFooterLinks.size());

		for (int i = 0; i < leftFooterLinks.size(); i++) {
			System.out.println(leftFooterLinks.get(i).getText());
		}

	}

}
