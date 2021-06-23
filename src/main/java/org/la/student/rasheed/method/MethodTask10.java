package org.la.student.rasheed.method;
/*
 * find greatest element of an array and return that greatest value 
 */

public class MethodTask10 {

	public static void main(String[] args) {
		
		int [] arr = new int  [] {20, 344, 42, 78};
		print(arr);
	
		
	}
	static void print(int arr[]) {
		
		int max = arr[0];
		
		
		for (int i =0; i<arr.length; i++) {
			
			
			
			if (arr[i]> max)
				max=arr[i];
		}
		System.out.println("Greatest Element in the is: "+max);
	
		
	} 
	
}

	
	

	

		