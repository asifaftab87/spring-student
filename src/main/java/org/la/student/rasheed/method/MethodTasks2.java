package org.la.student.rasheed.method;
/*
 * void printPositive(int[]) method will print all positive number from supplied array
 */

public class MethodTasks2 {

	public static void main(String[] args) {
		
		
		int arr [] = {-2, 4, -5, 3, 8, -78, 6, -90, 94, 100};
		print(arr);
	
		
		
			}
	static void print (int arr[]) {
		System.out.println("Positive Number from supplied array are:: ");
		int j =0;
		while(j < arr.length) 
		{
			if(arr[j] >= 0) {
				System.out.format("%d ", arr[j]);
			}
			j++;
		}	
		
		
			 
			
			
		}
		 
	

		
}

		
	
	
		
		
		
		


