package org.la.student.bakil.student.tasks;
/*
 * wap to print negative number among two given numbers( with if and without if)
 */
public class Ternary_1_5 {

	public static void main(String[] args) {
		int x=9,y=9;
		
		if (x%2==0)
		{
			System.out.println("The number is even : "+x);
			
		}
		
		else if (y%2==0)
		{
			System.out.println("The number is even "+y);
		}
		
		else {
			System.out.println("The number is odd");
		}
		int d = (x%2==0)? (x %2==0  ? x: y) : (y%2==0? y:x);
		System.out.println("The number is even :"+d);

	}

}
