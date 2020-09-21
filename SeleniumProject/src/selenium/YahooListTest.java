package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://ca.yahoo.com/");

		List<WebElement> allLinks = driver.findElements(By.xpath("//li[@class='trending-list']/ul/li"));
		System.out.println(allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}

		for (WebElement a : allLinks) {
			System.out.println(a.getText());
		}

	}

}
