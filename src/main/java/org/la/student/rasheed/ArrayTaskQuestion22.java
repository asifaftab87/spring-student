package org.la.student.rasheed;
/*
 * wap to calculate the factorial of each element of an array?
 */

public class ArrayTaskQuestion22 {

	public static void main(String[] args) {
		int a =1;
		int arr [] = {4, 5,6};
		
		for (int i=0; i<arr.length; i++) {
			a=1;
			for (int j=1; j<=arr[i]; j++) 	{
				a *=j;
			}
			System.out.println("factorial of " +arr[i] + " is " +a);
			
	
		}
		  
	    }
	

	}

