package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import common.resources.CommonResources;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

		List<WebElement> dropdownList = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(dropdownList.size());

		for (WebElement a : dropdownList) {
			System.out.println(a.getText() + "-----" + a.isSelected()); // to check whether it's selected or not
		}

		/*
		 * Another Way for(int i=0; i<dropdownList.size(); i++) {
		 * System.out.println(dropdownList.get(i).getText() + "-----" +
		 * dropdownList.get(i).isSelected() ); }
		 */

		System.out.println("-------------------------------------------------");

		WebElement selectElement = driver.findElement(By.id("gh-cat"));
		Select s = new Select(selectElement);

		s.selectByIndex(3);
		Thread.sleep(2000);
		for (WebElement aa : dropdownList) {
			if (aa.isSelected()) {
				System.out.println(aa.getText() + "-----" + aa.isSelected());
			}
		}

		s.selectByValue("12576");
		Thread.sleep(2000);
		for (WebElement ab : dropdownList) {
			if (ab.isSelected()) {
				System.out.println(ab.getText() + "-----" + ab.isSelected());
			}
		}

		s.selectByVisibleText("Music");
		Thread.sleep(2000);

		for (WebElement ac : dropdownList) {
			if (ac.isSelected()) {
				System.out.println(ac.getText() + "-----" + ac.isSelected());
			}

		}

	}
}
