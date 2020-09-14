package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class TDListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.td.com/ca/en/personal-banking/");

		List<WebElement> tdFooterList = driver
				.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));

		System.out.println(tdFooterList.size());
		for (WebElement a : tdFooterList) {
			System.out.println(a.getText());
		}

		/*
		 * for (int i = 0; i < tdFooterList.size(); i++) {
		 * System.out.println(tdFooterList.get(i).getText()); }
		 */
	}

}
