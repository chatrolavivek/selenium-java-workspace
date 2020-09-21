package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import common.resources.CommonResources;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.nike.com/ca/");

		Actions builder = new Actions(driver);

		WebElement menCategory = driver.findElement(By.linkText("Men"));
		builder.moveToElement(menCategory).build().perform();

		Thread.sleep(2000);

		List<WebElement> menShoes = driver
				.findElements(By.xpath("(//div[@class='pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2'])[7]/a"));

		System.out.println(menShoes.size());

		for (WebElement a : menShoes) {
			System.out.println(a.getText());
		}
	}
}
