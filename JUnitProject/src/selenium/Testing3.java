package selenium;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testing3 {
	
	@Rule
	public ErrorCollector err = new ErrorCollector();

	//@Test
	public void test6() {
		String actual = "abc";
		String expected = "abc";
		
//		if (a.equals(b)) {
//			System.out.println("test passed");
//		} else {
//			System.out.println("test failed");
//		}
		System.out.println("Before 1st assertion");
		Assert.assertEquals(expected, actual);
		System.out.println("After 1st assertion");
		Assert.assertTrue(2>3);
		System.out.println("After 2nd asser");
	}
	
	@Test
	public void test7() {
		Assume.assumeTrue(false);
		String actual = "abc";
		String expected = "abc";
		
		System.out.println("Before 1st assertion");
		try {
		Assert.assertEquals(expected, actual);
		} catch (Throwable t) {
			System.out.println("I'm in catch 1");
			err.addError(t);
		}
		System.out.println("After 1st assertion");
		try {
			Assert.assertTrue(2>3);
			} catch (Throwable t) {
				System.out.println("I'm in catch 2");
				err.addError(t);
			}
		System.out.println("After 2nd asser");
	}

}
