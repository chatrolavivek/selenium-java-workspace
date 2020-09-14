package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import common.resources.CommonResources;

public class FacebookInteraction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", CommonResources.getChromeDriverLocation());

		// Create prefs map to store all preferences
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		// Now initialize chrome driver with chrome options which will switch off this
		// browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("youremail@domain.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("yourpassword" + Keys.ENTER);

		Thread.sleep(3000);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		List<WebElement> contacts = driver.findElements(By.xpath("//ul[@class='pedkr2u6']//div[2]//span"));

		System.out.println(contacts.size());
		for (WebElement a : contacts) {
			System.out.println(a.getText());
		}

		System.out.println(
				"Total unread messages: " + driver.findElement(By.xpath("(//div[@tabindex='-1'])[3]")).getText());

		WebElement dropDownButton = driver
				.findElement(By.xpath("(//div[@aria-label='Account Controls and Settings']//i)[1]"));
		dropDownButton.click();
		Thread.sleep(2000);
		WebElement logOutButton = driver.findElement(By.xpath("//span[text()='Log Out']"));

		if (logOutButton.isDisplayed()) {
			System.out.println("login successfull");
		}
		dropDownButton.click();
		Thread.sleep(1000);

		WebElement searchFacebook = driver.findElement(By.xpath("//input[@placeholder='Search Facebook']"));
		searchFacebook.sendKeys("Himansi Patel");
		System.out.println(searchFacebook.getAttribute("value"));
		searchFacebook.sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);

		WebElement himansiPatel = driver
				.findElement(By.xpath("(//div[@class='tvfksri0 taijpn5t j83agx80 ll8tlv6m'])[1]"));

//		Actions builder = new Actions(driver);
//		builder.moveToElement(himansiPatel).build().perform();
		himansiPatel.click();

		Thread.sleep(5000);

		WebElement messageButton = driver.findElement(By.xpath("//span[text()='Message']"));
		messageButton.click();

		Thread.sleep(5000);

		WebElement typeMessage = driver
				.findElement(By.xpath("//div[@class='pfnyh3mw']//div[@class='notranslate _5rpu']/div"));
		typeMessage.sendKeys("Hey" + Keys.ENTER);

	}

}