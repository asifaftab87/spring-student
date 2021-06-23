package org.la.student.rasheed.method;
/*
 * find the average of array elements and return average 
 */

public class MethodTask9 {

	public static void main(String[] args) {
		int arr[] = {21, 30, 32, 24, 4, 220};
		int avg = avg(arr);
		System.out.println(avg);
		
	}
	static int avg (int a []) {
		int sum =0;
		 
	
		System.out.println("average of elements is ");
		for (int i=0; i<a.length; i++) {
			     sum+=a[i];
			
		}
		return sum/a.length;
	} 
	
}

	
	

	

		