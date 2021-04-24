package org.la.student.jamal.operators;

public class Ternary1 {
	
	//1.	wap to print greatest number among two given numbers( with if and without if)
 
	public static void main(String[] args) {
		
		int x= 9 , y= 20;
		
		int ans = x>y ? x:y;
		
		System.out.println(" greatest number without if  : " + ans );
		
		if (x>y) {
			System.out.println(" greatest number with if : " +x);
		}
		if (x<y) {
			System.out.println(" greatest number with if  : " +y);
		}
		
	
		
		
		
		

	}

}
