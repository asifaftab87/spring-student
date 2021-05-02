package org.la.student.jamal.operators;

public class Ternary5 {

	//5.	wap to print even number among two given numbers( with if and without if).
	public static void main(String[] args) {
		

		int x = 15, y = 20;
		
		
		int ans = x % 2 ;
		
		int ans2 = ans ==0 ? x :y;
		
		
		
		System.out.println("even number without if : " + ans2);
		
		if (ans == 0) {
			System.out.println("even number with if : " + x);
			
		}if (ans >0 ) {
			System.out.println("even number with if : " + y);
		}
	}

}
