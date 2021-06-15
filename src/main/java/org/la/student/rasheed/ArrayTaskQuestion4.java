package org.la.student.rasheed;

/*
 * wap to print only odd number from an array
 */

public class ArrayTaskQuestion4 {

	public static void main(String[] args) {
		
		int arr [] = {1, 2, 4, 33, 54, 63};
		
		for (int x=0; x<arr.length ; x++) {
			if (arr[x]%2==0) {
				
				System.out.println("Even: "+arr[x]);
			}
			else {
				System.out.println("Odd: "+arr[x]);
			}
			
		}

	}

}
