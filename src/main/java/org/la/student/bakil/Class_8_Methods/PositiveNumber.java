package org.la.student.bakil.Class_8_Methods;
/*
 * void printNegative(int[])
   method will print all negative number from supplied array
 */
public class PositiveNumber {


	public static void main(String[] args) {
		int arr []= {-1, 3,8,12,33,-11};
		printpositive (arr);
		
		
		 }

	 static void printpositive(int[] arr) {
		for(int a:arr) {
			if (a>0) {
				System.out.println("The positive numbers are  : "+a);
			}
		}
	//	System.out.println();
		
	}
	}

