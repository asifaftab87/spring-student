package org.la.student.jamal.operators;

public class Ternary6 {
	//6.	wap to print odd number among two given numbers( with if and without if).

	public static void main(String[] args) {
		

		int x = 18, y = 21;
		
		
		int ans = x % 1 ;
		
		int ans2 = ans ==0 ? x :y;
		
		
		
		System.out.println("even number without if : " + ans2);
		
		if (ans == 0) {
			System.out.println("even number with if : " + x);
			
		}if (ans >0 ) {
			System.out.println("even number with if : " + y);
		}

	}

}
