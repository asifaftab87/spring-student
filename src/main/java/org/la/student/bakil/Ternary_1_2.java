package org.la.student.bakil;
/*
 * wap to print smallest number among two given numbers( with if and without if)
 */
public class Ternary_1_2 {

	public static void main(String[] args) {
		int x=3,y=1;
		
		if (x<y)
		{
			System.out.println("The samllest number is : "+x);
			
			
		}
		
		else {
			System.out.println("The samllest number is :"+y);
		}
			
		int d = (x<y)? (x < y ? x: y) : (y<x? y:x);
		System.out.println("The smallest number is :"+d);

	}

}
