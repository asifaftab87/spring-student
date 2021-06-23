package org.la.student.rasheed.method;
/*
 * find smallest element of an array and return that greatest value 
 */

public class MethodTask11 {

	public static void main(String[] args) {
		
		
		int [] arr = new int  [] {2, 1, 20, 34, 42, 78, };
		print(arr);
	
		
	}
	static void print(int arr[]) {
		
		int min = arr[0];
		
		
		for (int i =0; i<arr.length; i++) {
			
			
			
			if (arr[i]< min)
				min=arr[i];
		}
		System.out.println("Smallest Element in the is: "+min);
		
		
	
		
	} 
	
}

	
	

	

		