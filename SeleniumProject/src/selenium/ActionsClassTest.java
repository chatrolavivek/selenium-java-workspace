package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import common.resources.CommonResources;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();

		Thread.sleep(2000);

		List<WebElement> electronicsList = driver
				.findElements(By.xpath("(//div[@class='hl-cat-nav__sub-cat-col'])[5]/ul/li"));
		System.out.println(electronicsList.size());

		for (WebElement a : electronicsList) {
			System.out.println(a.getText());
		}

	}

}
