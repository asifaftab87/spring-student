package org.la.student.bakil.student.tasks;
/*
wap to print positive number among two given numbers( with if and without if).
 */
public class Ternary_1_4 {

	public static void main(String[] args) {
		int x=4,y=-6;
		
		if (x >0)
		{
			System.out.println("The number is positive : "+x);
		}
		
		else if (y>0)
		{
			System.out.println("The number is positive : "+y);
		}

		else {
			System.out.println("The number is negative");
		}
		int d = (x>0)? (x > 0 ? x: y) : (y > 0? y:x);
		System.out.println("The is positive :"+d);
	}

	}
