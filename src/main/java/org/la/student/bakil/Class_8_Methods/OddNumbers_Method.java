package org.la.student.bakil.Class_8_Methods;
/*
 * void printEven(int[])
		method will print all even number from supplied array
 */
public class OddNumbers_Method {


	public static void main(String[] args) {
		int arr []= {1, 3,8,12,33,11};
		printEven (arr);
		
		
		 }

	 static void printEven(int[] arr) {
		for(int a:arr) {
			if (a%2==0) {
				System.out.println("The even numbers are  : "+a);
			}
		}
	//	System.out.println();
		
	}
	}

