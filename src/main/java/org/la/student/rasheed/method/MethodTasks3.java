package org.la.student.rasheed.method;
/*
 * Void printEven(int[]) method will print all even number from supplied array
 */

public class MethodTasks3 {

	public static void main(String[] args) {
		int arr[] = {1, 22, 3, 50, 6, 76, 34};
		print(arr);
		
		
		
			}
	static void print (int arr[]) {
		System.out.println("Even numbers from the given array are:: ");
		
		for (int i =0; i<arr.length; i++) {
			
			if (arr[i]%2==0) {
				
				System.out.println(arr[i]);
			}
			
			
		}
		

	}
	}



