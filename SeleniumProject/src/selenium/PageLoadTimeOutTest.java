package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.resources.CommonResources;

public class PageLoadTimeOutTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement confirmBox = driver.findElement(By.name("B2"));
		confirmBox.click();

		wait.until(ExpectedConditions.alertIsPresent());
//		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());

		al.accept();
//		al.dismiss();
	}
}
