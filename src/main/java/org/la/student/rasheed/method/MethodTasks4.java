package org.la.student.rasheed.method;

/*
 * void printOdd(int[]) method will print all odd number from supplied array
 */

public class MethodTasks4 {

	public static void main(String[] args) {
		int arr [] = {10, 23, 30, 50, 60, 91, 71};
		print (arr);
	}
	
	
	static void print (int arr []) {
		System.out.println("Odd numbers from the given array are:: ");
		for (int i =0; i<arr.length; i++) {
			if (arr[i]%2 != 0) {
				System.out.println(arr[i]);
		}
	}

}
}