package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class AlertTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", CommonResources.getGeckoDriverLocation());
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/javascript4.htm");
		
		WebElement confirmBox = driver.findElement(By.name("B2"));
		confirmBox.click();
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
//		al.dismiss();
		

	}
}
