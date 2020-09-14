package test;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10); 
		for (initialization; condition; increment){
			code
			}
		*/

		
//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			if (i==7) {
				break;
			}
		}
		System.out.println("Out of the loop");


	}

}
