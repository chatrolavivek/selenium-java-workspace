package test;

import java.util.ArrayList;

public class ForEachLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArr = {1,2,3};
		
		for(int i = 0; i<myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		for(Integer a : myArr) {
			System.out.println(a);
		}
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for(int i=1; i<4; i++) {
			myList.add(i);
		}
		System.out.println(myList.size());
		
		for(Integer b : myList) {
			System.out.println(b);
		}
		
		
		
	}

}
