package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(2000);

		// WebElement firstName = driver.findElement(By.name("firstname"));
		// firstName.sendKeys("jsdjhdjah");

		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("laslaks");

		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("1202030102");

		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("passwosjas");

		driver.findElement(By.name("websubmit")).click();

		String expectedFirstNameError = "What’s your name?";

		String actualFirstNameError = driver.findElement(By.xpath("//div[text()='What’s your name?']")).getText();
		// String actualFirstNameError =
		// driver.findElement(By.xpath("//div[@class='_5v-0 _53im']/div")).getText();
		// //div[contains(@id,'js_')]

		System.out.println("First Name missing Error: " + actualFirstNameError);

		if (expectedFirstNameError.equals(actualFirstNameError)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
