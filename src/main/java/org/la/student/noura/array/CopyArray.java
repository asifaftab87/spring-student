package org.la.student.noura.array;

public class CopyArray {

	public static void main(String[] args) {
		// copy array in reverse order in second array 

		
		int a[]= {1,4,6,8,7,4};
		int b[]=new int [a.length];
		
		
		for(int i=0,d=a.length-1;i<a.length;i++,d--) {
			
			b[i]=a[d];
		}
		for (int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
		
	}

}
