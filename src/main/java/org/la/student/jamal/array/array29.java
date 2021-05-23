package org.la.student.jamal.array;

import java.util.Arrays;

public class array29 {
	
	//29) Write a Java program to insert an element (specific position) into an array?

	public static void main(String[] args) {
		
		
		int [] arr= {10,20,30,40,50,55,66,77};
		
		int Index_position=2;
		int newValue=44;
		 
			System.out.println("origanal Array : "+ Arrays.toString(arr));
			
			
			for (int i=arr.length-1;i>Index_position;i--) {
				arr[i]=arr[i-1];
			}
		
			arr[Index_position]=newValue;
			System.out.println("New Array :" + Arrays.toString(arr));
	
		
		

	}

}
