package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {

	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1) 
	public void homeTest() {
		System.out.println("I am in home test");
		System.out.println("Before Assertion");
		Assert.assertTrue(4 < 3, "Verifying home element");
		System.out.println("After home Assertion");
		Assert.assertEquals("abc", "abcd");
	}

	@Test(priority = 2, dependsOnMethods = "homeTest") // Edit user
	public void mainTest() {
		System.out.println("I am in main test");
		System.out.println("Before main Assertion");
		softAssert.assertTrue(2 > 3, "Verifying main Element");
		System.out.println("After main Assertion");
		softAssert.assertEquals("abc", "abcd");
		softAssert.assertAll();
	}

	@Test(priority = 3, dependsOnMethods = "mainTest") // Delete user
	public void endTest() {
		System.out.println("I am in end test");
		System.out.println("Before end Assertion");
		softAssert.assertTrue(2 > 3, "Verifying End Element");
		System.out.println("After end Assertion");
		softAssert.assertEquals("abc", "abcd");
		softAssert.assertAll();
	}
}
