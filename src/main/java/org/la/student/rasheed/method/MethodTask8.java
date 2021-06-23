package org.la.student.rasheed.method;
/*
 * find sum of all elements of an array and return sum 
 */

public class MethodTask8 {

	public static void main(String[] args) {
		int arr [] = {25, 66, 24};
		int b = sum(arr);
		System.out.println(b);
		
	}
	
	static int sum(int a[]) {
		int sum =0;
		System.out.println("sum of elements is");
		for(int i=0; i<a.length; i++) {
			
			sum+=a[i];
			
				
		}
		return sum;
	
	}
	;
		
	
		
	} 
	

	
	
	
	

	
	

	

		