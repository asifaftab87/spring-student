package org.la.student.rasheed.method;

/*
 * void printNegative(int[]) method will print all negative number from supplied array
 */

public class MethodTasks1 {

	public static void main(String[] args) {
		int arr [] = {2, 4, -5, 3, 8, -78, 6, -90, 94, -100};
		print(arr);
	
		
		
			}
	static void print (int arr[]) {
		System.out.println("Negative Number from supplied array are:: ");
		for (int i=0; i<arr.length; i++) {
		
			if (arr[i]<=0) {
				System.out.println(+arr[i]);
			
		}
			
			
		}
		
	}
}
		
		
		
		


