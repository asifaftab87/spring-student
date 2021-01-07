package org.la.student.noura.array;

public class CheckifArrayofintegerswithoutZeroandMinusone {

	public static void main(String[] args) {
	
		//Write a Java program to check if an array of integers without 0 and -1
	
	
		int a[]= {4,5,6,7,0};

		boolean contains = false;
		for (int i = 0; i < a.length; ++i)
		  if (a[i] == -1 || a[i] == 0) {
		    contains = true;
		    break;
		  }
	    System.out.println(contains);

	}
}

			
			
