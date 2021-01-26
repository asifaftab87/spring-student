package org.la.student.noura.method;

public class LargeElementOfArray {

	public static void main(String[] args) {
		// java program to find large element of an array
		
		System.out.println(array());

	}
	
	static int array() {
		
		int a[]= {1,2,3,4,5};
		int largest=a[0];

		for (int i=0;i<a.length;i++) {

			if (a[i]>largest) {
				largest=a[i];
				
			}
			
		}
		return largest;

		
	}

}
