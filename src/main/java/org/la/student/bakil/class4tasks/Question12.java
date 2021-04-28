package org.la.student.bakil.class4tasks;
/*
 * wap to find smallest number among three numbers
 * */
public class Question12 {

	public static void main(String[] args) {
		
		int x=4,y=1,z=2;
		
		if (x<y && x<z) {
			System.out.println("The smallest number is : "+x);
	        }
		else if (y<x && y<z)
		{
			System.out.println("The smallest number is : "+y);
		}
		
		else {
			System.out.println("The samllest number is : "+z);
		}

	}

}
