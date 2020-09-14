package test;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Data type (Primitive)
		 * int aka integer
		 */
		int i=10;
		System.out.println(i);
		System.out.println("i");
		
		i=20;
		System.out.println(i);
		
		int j=10;
	
		i+=j;	//i=i+j;
		System.out.println(i);
		

		i*=2; 	//i=i*2;
		System.out.println(i);
		
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		
		int x = 50;
		x=x++;
		System.out.println(x);
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		
		
		//double
		double a =10.5;
		System.out.println(a);
		
		//char
		char p = 'x';
		System.out.println(p);
		System.out.println('p');
		System.out.println(11);
		
		//boolean
		boolean isTodayWeekend = true;
		boolean isTodayWeekday = false;
		boolean amILikeCoffee = false;
		System.out.println(isTodayWeekend);
		System.out.println(isTodayWeekday);
		System.out.println(amILikeCoffee);
		amILikeCoffee = true;
		System.out.println(amILikeCoffee);
		
		
		

	}

}
