package org.la.student.noura.array;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		// Write a Java program to find the second largest element in an array
		
		
		int a[]= {4,5,6,7,22,33};
		int large=a[0];
		int secondlarge=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>large) {
				
				
				secondlarge=large;
				large=a[i];
			}
			
			if(a[i]!=large&&a[i]>secondlarge) {
				secondlarge=a[i];
			}
			
		}							
		
		System.out.println("The greatest Num"+large);
		System.out.println("second large element is"+secondlarge);

		
			

	}

}
