package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		// firstApproach
		List<WebElement> bottomLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(bottomLinks.size());

		for (int i = 0; i < bottomLinks.size(); i++) {
			System.out.println(bottomLinks.get(i).getText());
		}

		// Second Approach
		WebElement bottomLinkElement = driver.findElement(By.id("pageFooterChildren"));
		List<WebElement> bottomLinkList = bottomLinkElement.findElements(By.tagName("a"));
		System.out.println(bottomLinkList.size());

	}

}
