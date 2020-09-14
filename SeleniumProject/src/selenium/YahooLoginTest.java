package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.resources.CommonResources;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver(); 
		
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com");
		
		driver.findElement(By.id("login-username")).sendKeys("test8");
		driver.findElement(By.name("signin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-passwd")).sendKeys("m1jdj332ds");
		driver.findElement(By.name("verifyPassword")).click();
		
		Thread.sleep(2000);
		
		String expectedError = "Invalid password. Please try again";
		//className unique and no space. so use it
		String actualError = driver.findElement(By.className("error-msg")).getText(); 
		System.out.println("Actual Error: " + actualError);
		
		if (expectedError.equals(actualError)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
