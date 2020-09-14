package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);

		FirefoxDriver driver = new FirefoxDriver();

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin\r\n"
						+ "");

		WebElement emailTextBox = driver.findElement(By.xpath("//input[@type='email']"));
		emailTextBox.sendKeys("jskdhjs@hss.com");

		WebElement nextButton = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		nextButton.click();

		Thread.sleep(2000);

		String expectedError = "Couldn't find your Google Account";
		String actualError = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println("Actual Error: " + actualError);

		if (expectedError.equals(actualError)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
