package org.la.student.jamal.array;

public class array28 {
	
	//	28) Write a Java program to remove a specific element from an array?

	public static void main(String[] args) {
		
		
			
		int r=100, n=0,s=0;
		int a[]= {20,30,44,55,66,77,88,99,23};
		
		for (int i=0;i<a.length;i++) {
			n++;
			if( a[i]==r) {
				s=n;
			}
			
			
		}
		for (int i=0;i<a.length;i++) {
			if (i==(s-1))
				continue;
			else 
				System.out.print(a[i]+" ");
			
		}

		
		
		
	}

}
