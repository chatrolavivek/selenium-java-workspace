package test;

import selenium.Test4; // import packageName.ClassName;

public class Test1 {
	
	//ClassName objName = new ClassName ();
	static Test1 t1 = new Test1(); // static so we can use it in static method
	static Test2 t2 = new Test2(); //Test2() constructor will be run even before main method, prints "I'm in a constructor!"
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4(); //need to import package since Test4 class is in different package

	

	public static void main(String[] args) {
		//everything inside static method is static
		
		System.out.println("Main Method");
		printMe("printMe"); // static method in same class

		System.out.println("After printMe");
		scanMe(); // static method in same class, for other class Test1.scanMe();

		//Test1 t1 = new Test1(); // non-static method must have object of the class to be called
		t1.typeMe(); //non-static same class
		t1.useMe(); //non-static same class
		
		
		t2.red(); //not-static in different class
		Test2.blue(); //static in different class
		
		
		t3.orange();
		Test3.apple();
		
		t4.car(); //non-static in different class and package
		Test4.truck(); // static method in different class and package
	}

	public static void printMe(String str) {
		System.out.println(str);
	}

	public static void scanMe() {
		System.out.println("scanMe");
	}

	public void typeMe() {
		System.out.println("typeMe");
	}
	
	public void useMe() {
		System.out.println("useMe");
	}

}
