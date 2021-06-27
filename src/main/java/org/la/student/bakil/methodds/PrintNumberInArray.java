package org.la.student.bakil.methodds;
/*
 * void printNum(int[], int)
		method will print number if found in array negative number from supplied array
		e.g. if a[]={1,2,3} n b=2 then print 2
		if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element
 */
public class PrintNumberInArray {


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

