package org.la.student.bakil.arry;
/*
 *Write a Java program to insert an element (specific position) into an array?
 */
public class AddSpecificElementArray {

	public static void main(String[] args) {
	
		 int [] a = {1, 2, 3, 5, 9};
		 int n [] = new int [a.length+1];
		  int loc = 2;
		  int value =6,j = 0;
		  
		  for (int i=0;i<n.length-1;i++) {
			 if (i==loc) {
				 n[i]=value;
			 }
		  
		  else {
			  n[i]=a[j];
		  }
			  System.out.print(n[i]+" ");
	}
		
	}
}
	