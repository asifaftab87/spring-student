package org.la.student.asif.array;

public class Copy5 {

	public static void main(String[] args) {
		
		int[] a = {22};	
		
		for(int i=0, d=a.length-1 ; i<d ; i++, d--) {
			int t = a[i];
			a[i] = a[d];
			a[d] = t;
		}
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
