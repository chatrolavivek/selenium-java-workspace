package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		WebElement searchElement = driver.findElement(By.id("header-search-input"));
		searchElement.sendKeys("canada");
		Thread.sleep(2000);
		
		List<WebElement> searchSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(searchSuggestions.size());
		
		for(WebElement a : searchSuggestions) {
			System.out.println(a.getText());
		}
	}

}
