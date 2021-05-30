package org.la.student.rasheed;
/*
 * wap to print only even number from an array
 */

public class ArrayTaskQuestion5 {

	public static void main(String[] args) {
		
		int arr [] = {1, 2, 4, 33, 54, 63};
		
		for (int a=0 ; a<arr.length ; a++) {
			if(arr[a]%2==0) {
				System.out.println("Even: "+arr[a]);
			}
		}
			}

	}


