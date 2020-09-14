package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import common.resources.CommonResources;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.mississauga.ca/portal/home");

		Actions builder = new Actions(driver);

		WebElement cityHallElement = driver.findElement(By.xpath("//img[@alt='City Hall']"));
		builder.moveToElement(cityHallElement).build().perform();

		Thread.sleep(2000);

		List<WebElement> cityHallList = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));

		System.out.println(cityHallList.size());

		for (WebElement a : cityHallList) {
			System.out.println(a.getText());
		}

	}

}
