package org.la.student.jamal.operators;

public class Ternary3 {
	
	//3.	wap to print negative number among two given numbers( with if and without if). 

	public static void main(String[] args) {
		
		int x= 5, y =  10; 
	
		int ans = x>y ? y:x; 
		
		System.out.println(" with out if : " + (- ans) );
		
		if (x>y) {
			System.out.println(" with  if : " + (-y));
		} if (x<y) {
			System.out.println(" with if : " +(-x));
		}
		
		
		
		
	}

}
