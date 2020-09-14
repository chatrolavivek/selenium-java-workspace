package test;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = "abc1";
		
		if (a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		String tool = "Selenium";
		String automation = "selenium";
		
		if (tool.equals(automation)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		int i = 10;
		int j = 10;
		if (i==j) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		
	}

}
