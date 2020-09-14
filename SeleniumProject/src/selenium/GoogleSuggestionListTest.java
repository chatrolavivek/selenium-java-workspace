package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Canada");
		Thread.sleep(2000);

		List<WebElement> myList = driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div[2]/div[1]")); //// ul[@class='erkvQe']/li
		System.out.println(myList.size());

		for (WebElement a : myList) {
			System.out.println(a.getText());
		}

	}

}
