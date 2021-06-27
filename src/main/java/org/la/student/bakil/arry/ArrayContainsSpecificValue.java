package org.la.student.bakil.arry;
/*
 *Write a Java program to test if an array contains a specific value?
 */
public class ArrayContainsSpecificValue {

	public static void main(String[] args) {
	
		int[] a = {20, 30, 25, 35, 16, 60, 100};
	      
		//calculate sum of all array elements
	       
		int sum = 0;
	      
		for(int i=0; i < a.length ; i++)
	        
			sum = sum + a[i];
	       
		//calculate average value
	       
		int average = sum / a.length;
	        System.out.println("Average value of the array elements is : " + average); 
	          
	}
	}