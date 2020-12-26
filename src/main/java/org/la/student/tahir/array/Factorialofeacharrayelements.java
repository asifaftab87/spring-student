package org.la.student.tahir.array;

public class Factorialofeacharrayelements {

	public static void main(String[] args) {
		// Factorial of each array element
		
		int[] a = new int[4];
		 
		for(int i=0; i<a.length; i++) {
			int fact =1;
			 a[i] = i+1;
			 
			 for(int j=1; j<=a[i]; j++)
			 {
				
				 fact = fact *j;
				
				 
			 }
			 
			a[i]= fact;
			 System.out.println( a[i]);
		}
		
		
	
	}
		
	

}
