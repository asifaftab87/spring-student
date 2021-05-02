package org.la.student.jamal.operators;

public class Ternary2 {
	//2.	wap to print smallest number among two given numbers( with if and without if).

	public static void main(String[] args) {
		
		
		int x=10, y = 9;
		
		int ans= x<y ? x: y;
		
		System.out.println("smallest with out if : " + ans);
		
		if (x<y) {
			System.out.println("smallest with if  : " + x);
		}
		
		if (x>y) {
			System.out.println("smallest with if  : " + y);
		}

	}

}
