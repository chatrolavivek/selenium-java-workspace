package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class PopupTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.shein.com/?ref=www&rep=dir&ret=ca");
		Thread.sleep(5000);

		List<WebElement> firstPopup = driver
				.findElements(By.xpath("(//i[@class='iconfont icon-close she-close'])[29]"));

		if (firstPopup.size() > 0) {
			firstPopup.get(0).click();
			List<WebElement> secondPopup = driver.findElements(By.xpath("//div[@class='c-coupon-box']/i"));
			if (secondPopup.size() > 0) {
				secondPopup.get(0).click();
			}
		}
		driver.findElement(By.name("header-search")).sendKeys("iphone");

	}
}
