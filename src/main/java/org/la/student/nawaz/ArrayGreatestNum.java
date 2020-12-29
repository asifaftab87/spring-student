package org.la.student.nawaz;

public class ArrayGreatestNum {
	
	public static void main(String[] args) {
		
		int a[]= {100,200,300,400};
		
		int g=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if (g<a[i]) {
				
				g=a[i];
			}
		}
		System.out.println("Greatest Number: "+g);
	}

}
