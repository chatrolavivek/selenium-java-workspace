package test;

public class Test2 {
	
	public void red() {
		System.out.println("red");
	}
	
	public static void blue() {
		System.out.println("blue");
	}
	
	
	/* CONSTRUCTOR
	 * no return type
	 * method name same as a class name
	 * no need to explicitly call it
	 * automatically called when object of the class is created
	 * Runs before even main method
	 */
	public Test2() {
		System.out.println("I'm in a constructor!");
	}

}
