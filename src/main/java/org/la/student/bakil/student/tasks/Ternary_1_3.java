package org.la.student.bakil.student.tasks;
/*
 * wap to print negative number among two given numbers( with if and without if)
 */
public class Ternary_1_3 {

	public static void main(String[] args) {
		int x=-9 ,y=1;
		
		if (x<0)
		{
			System.out.println("The number is negative : "+x);
			
			
		}
	
		
		else if(y<0) {
			System.out.println("The number is negative "+y);
		}
			
		int d = (x<0)? (x < 0 ? x: y) : (y<0? y:x);
		System.out.println("The number is negative :"+d);

	}

}
