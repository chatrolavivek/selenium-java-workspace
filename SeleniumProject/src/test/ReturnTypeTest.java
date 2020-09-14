package test;

public class ReturnTypeTest {
	
	static ReturnTypeTest rt1 = new ReturnTypeTest();
	
	public static void main(String[] args) {
		
		
		int x = sum(10,20);
		System.out.println(x);
		
		String myStr = rt1.test(); // non-static method needs object of the class
		System.out.println(myStr);
		
		

	}
	
	public static int sum(int a, int b) { 
		int total = a + b;
		return total; // must return int
	}
	
	public String test() {
		String a = "Hello";
		String b = " Vivek";
		return a+b; //must return String
	}

}
