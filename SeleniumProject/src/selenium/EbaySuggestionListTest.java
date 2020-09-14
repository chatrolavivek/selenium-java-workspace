package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

		driver.findElement(By.name("_nkw")).sendKeys("laptop");
		Thread.sleep(2000);

		List<WebElement> laptopList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(laptopList.size());

		// last one is emppy so size-1
		for (int i = 0; i < laptopList.size() - 1; i++) {
			String search = laptopList.get(i).getText();
			System.out.println(search);

			// to verify if it starts with laptop or not
			if (!(search.startsWith("laptop"))) {
				System.out.println("test failed");
				break;
			}

		}

	}

}
