package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class MultipleWindowsTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * Ony one Window available Set<String> allWindows = driver.getWindowHandles();
		 * System.out.println(allWindows.size());
		 */

		WebElement faq = driver.findElement(By.linkText("Faq"));
		faq.click(); // goes to next tab/window

//		Total 2 tab/window available
		Set<String> allWindows = driver.getWindowHandles(); // returns set of strings of session id=handles
		System.out.println(allWindows.size());

//		Set<String> has no indexes. To iterate through them
		Iterator<String> iter = allWindows.iterator();

		String mainWindow = iter.next(); // to get string from first index
		System.out.println(mainWindow);
		String childWindow = iter.next();
		System.out.println(childWindow);

		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();    //	To close current window

		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		
		driver.quit();   //		To quit current script. closes browserF

	}

}
