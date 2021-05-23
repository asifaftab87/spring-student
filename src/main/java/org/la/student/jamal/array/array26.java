package org.la.student.jamal.array;

public class array26 {
	
	//	26) Write a Java program to test if an array contains a specific value?

	public static void main(String[] args) {
		
		
			
		
		int a[]= {1,2,3,4,5,6,10};
		int value=10;
		boolean bool=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				bool=true;
				break;
			}
		}
		if(bool)
			System.out.println("Array contains the value "+value);
		else
			System.out.println("Array doesn't contain the value "+value);
	

		
		
		
	}

}
