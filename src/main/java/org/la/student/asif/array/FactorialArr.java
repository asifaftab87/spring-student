package org.la.student.asif.array;

public class FactorialArr {

	/*
	 * 	wap to find factorial of each element of an array
	 */
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 5, 4, 3};
		
		for(int i=0 ; i<arr.length ; i++) {
			
			int f = 1;
			int n = arr[i];
			for(;n>0;) {
				f = f * n;
				n--;
			}
			
			System.out.println("Factorial of "+arr[i]+" is: "+f);
		}
	}
}
