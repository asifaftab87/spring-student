package org.la.student.bakil.student.tasks;

/*
 * wap to print greatest number among two given numbers( with if and without if)
 */
public class Ternary_1_1 {

	public static void main(String[] args) {
		int x=19,y=21;
		
		if (x>y)
		{
			System.out.println("The greatest number is : "+x);
		}
		else {
			System.out.println("The largest number is :"+y);
		}
			
		int d = (x>y)? (x > y ? x: y) : (y>x? y:x);
		System.out.println("The greatest number is :"+d);

	}

}
