package org.la.student.bakil.methodds;
/*
 * void printOdd(int[])
		method will print all odd number from supplied array
 */
public class EvenNumbers_Method {


	public static void main(String[] args) {
		int arr []= {1, 3,8,12,33,11};
		System.out.println("The odd numbers are ");
		printOdd (arr);
		
		
		 }

	
	 static void printOdd(int[] arr) {
		 for(int a:arr) {
			if (a%2!=0) {
				System.out.print(a+ "  ");
			}
		}
	//	System.out.println();
		
	}
	}

