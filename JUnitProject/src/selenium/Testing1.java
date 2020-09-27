package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	// Executed First, Only once in the class (Highest Priority)
	// @ means annotation
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	// Executed Last, Only once in the class (Least Priority)
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	// Executed before every test
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("Login");
	}

	// Executed after every test
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("Logout");
	}

	@Test
	public void test1() {
//		System.out.println("Before");
		System.out.println("test1");
//		System.out.println("Logout");

	}

	@Test
	public void test2() {
//		System.out.println("Before");
		System.out.println("test2");
//		System.out.println("Logout");

	}

	@Test
	public void test3() {
//		System.out.println("Before");
		System.out.println("test3");
//		System.out.println("Logout");

	}

}
