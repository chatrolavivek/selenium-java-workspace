package test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Array has fixed length.
		 * Cannot add or delete element
		 * Array is useful when we know the length beforehand
		 */

		String[] tools = { "Selenium", "Jira", "QC", "QTP" };

		System.out.println(tools.length);

		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);

		tools[3] = "Test Direct";
		System.out.println(tools[3]);

		int myNum[] = { 4, 3, 8 };
		System.out.println(myNum.length);
		System.out.println(myNum[0]);
		System.out.println(myNum[1]);
		System.out.println(myNum[2]);
		// System.out.println(myNum[3]);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

	}

}
