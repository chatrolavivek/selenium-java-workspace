package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	  
	public WebDriver driver;
	
//	public WebElement userName = driver.findElement(By.id("login-username"));
//	public WebElement emailNext = driver.findElement(By.id("login-signin"));
//	public WebElement passwordBox = driver.findElement(By.id("login-passwd"));
//	public WebElement emailErrElement = driver.findElement(By.id("username-error"));
//	public WebElement passwordErrElement = driver.findElement(By.className("error-msg"));
	 
	@FindBy(id = "login-username")
	public static WebElement email;
	
	@FindBy(id = "login-signin")
	public static WebElement emailNextButton;
	
	@FindBy(id = "login-passwd")
	public static WebElement password;
	
	@FindBy(id = "username-error")
	public static WebElement emailErr;
	
	@FindBy(className = "error-msg")
	public static WebElement passwordErr;
	

	public void openBrowser() throws IOException {

		FileInputStream fs = new FileInputStream(
				"E:\\Computer Science\\Software Testing\\Projects\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);

		String browser = prop.getProperty("browser");
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Computer Science\\Software Testing\\Projects\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Computer Science\\Software Testing\\Projects\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Computer Science\\Software Testing\\Projects\\SeleniumJars\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		PageFactory.initElements(driver, this);

	}

	public void openYahoo() {
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.quit();
	}

	public void enterEmail(String emailText) throws InterruptedException {
		email.sendKeys(emailText);
		emailNextButton.click();
		Thread.sleep(2000);
	}

	public void enterPassword(String passwordkeys) {
		password.sendKeys(passwordkeys + Keys.ENTER);
	}

	public String readEmailError() {
		String actualEmailErrText = emailErr.getText();
		System.out.println(actualEmailErrText);
		return actualEmailErrText;
	}

	public String readPasswordError() {
		String actualPasswordErrText = passwordErr.getText();
		System.out.println(actualPasswordErrText);
		return actualPasswordErrText;
	}
}
