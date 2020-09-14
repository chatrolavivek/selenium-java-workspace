package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		
		// Method Overloading
		sum();
		sum(3, 4);
		sum(6, 9);
		sum(3, 4, 5);
		sum();
		sum(1, 5, 9);

	}

	public static void sum() {
		int total = 3 + 4;
		System.out.println(total);
	}

	public static void sum(int a, int b) {
		int total = a + b;
		System.out.println(total);
	}

	public static void sum(int a, int b, int c) {
		int total = a + b + c;
		System.out.println(total);
	}

}
