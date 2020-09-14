package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import common.resources.CommonResources;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", CommonResources.geckoDriverLocation);
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("svijsivjsi");
		driver.findElement(By.name("lastname")).sendKeys("hdsd");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("hbhsvd");

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
		//		(//input[@class='_8esa'])[2]
		maleButton.click();
		
		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();

	}

}
