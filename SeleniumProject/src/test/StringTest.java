package test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In Java String is a class, not a data type (Non-Primitive Data type)
		
		String myFirstName = "Vivek";
		System.out.println(myFirstName);
		String myLastName = "Chatrola";
		System.out.println(myLastName);
		System.out.println(myFirstName + myLastName);
		String space = " ";
		System.out.println(myFirstName + space + myLastName);
		System.out.println(myFirstName.length());
		System.out.println(myFirstName.charAt(2));
		System.out.println(myFirstName.indexOf('v'));
		System.out.println(myFirstName.indexOf('V'));
		
		int i = 100;
		int j = 10;
		
		System.out.println(i+j);
		System.out.println(myFirstName+i+j);
		System.out.println(myFirstName+(i+j));
		System.out.println(i+j+myFirstName);
		


	}

}
