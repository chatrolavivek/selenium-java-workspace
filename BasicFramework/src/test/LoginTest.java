package test;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {

	DataFile df = new DataFile();
	LoginPage lp = new LoginPage();

	@BeforeMethod
	public void beforeMethod() throws IOException {
		lp.openBrowser();
		lp.openYahoo();
	}

	@AfterMethod
	public void afterMethod() {
		lp.closeBrowser();
	}

	@Test
	public void loginWithWrongPasswordTest() throws InterruptedException {
		lp.enterEmail(df.correctEmail);
		lp.enterPassword(df.wrongPassword);
		String actualPasswordErr = lp.readPasswordError();
		Assert.assertEquals(actualPasswordErr, df.expectedPasswordError);
	}

	@Test
	public void loginWithWrongEmailTest() throws InterruptedException {
		lp.enterEmail(df.wrongEmail);
		String actualEmailErr = lp.readEmailError();
		Assert.assertEquals(actualEmailErr, df.expectedEmailError);
	}

}
