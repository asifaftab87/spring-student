package org.la.student.noura.array;

public class InsertElementInSpecificPositionintoArray {

	public static void main(String[] args) {
		// Write a Java program to insert an element (specific position) into an array
		
		int a[]= new int [5];
	
		int	element= 40;
		//insert 40 in position i=2
		
		for (int i=0;i<a.length;i++) {
			
			if(i==2) {
				
				
				a[i]=element;
				
				
			}

		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);

		}

	}

}
