package org.la.student.bakil.Class_8_Methods;
/*
 * void printNegative(int[])
   method will print all negative number from supplied array
 */
public class NegativeNumber {


	public static void main(String[] args) {
		int arr []= {-1, 3,8,12,33,-11};
		printnegative (arr);
		
		
		 }

	 static void printnegative(int[] arr) {
		for(int a:arr) {
			if (a<0) {
				System.out.println("The negative numbers are  : "+a);
			}
		}
	//	System.out.println();
		
	}
	}


