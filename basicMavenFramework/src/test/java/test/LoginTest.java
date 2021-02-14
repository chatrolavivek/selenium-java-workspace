package test;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import data.DataFile;
import pages.LoginPage;

public class LoginTest {
	ExtentReports extent;
	ExtentTest logger;
	DataFile df = new DataFile();
	LoginPage lp = new LoginPage();

	@BeforeTest
	public void startReport() {
		extent = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "VivekTesting").addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Vivek Chatrola");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		lp.openBrowser();
		lp.openYahoo();
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}
		extent.endTest(logger);
		lp.closeBrowser();
	}

	@Test
	public void loginWithWrongPasswordTest() throws InterruptedException {
		extent.startTest("Login With Wrong Password", "Correct Email and Wrong Password");
		logger = extent.startTest("Login With Wrong Password");
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");

		Assert.assertTrue(true);
		lp.enterEmail(df.correctEmail);
		lp.enterPassword(df.wrongPassword);
		String actualPasswordErr = lp.readPasswordError();
		Assert.assertEquals(actualPasswordErr, df.expectedPasswordError);

	}

	@Test
	public void loginWithWrongEmailTest() throws InterruptedException {
		logger = extent.startTest("Login With Wrong Email");
		extent.startTest("Login With Wrong Email", "Wrong Email");
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");

		lp.enterEmail(df.wrongEmail);
		String actualEmailErr = lp.readEmailError();
		Assert.assertEquals(actualEmailErr, df.expectedEmailError);

	}

	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}

}
