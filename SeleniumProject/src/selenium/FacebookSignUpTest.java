package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");

		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(12);

		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1996");

		WebElement maleButton = driver.findElement(By.xpath("//input[@value='2']"));
		// (//input[@class='_8esa'])[2]
		maleButton.click();

		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();

		driver.findElement(By.name("websubmit")).click();

		// Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		String expectedFirstNameError = "What’s your name?";

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[text()='What’s your name?']"),
				"What’s your name?"));
		String actualFirstNameError = driver.findElement(By.xpath("//div[text()='What’s your name?']")).getText();

		// //div[@class='_5v-0 _53im']/div //div[contains(@id,'js_')]

		System.out.println("First Name missing Error: " + actualFirstNameError);

		if (expectedFirstNameError.equals(actualFirstNameError)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
