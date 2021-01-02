package org.la.student.asif.array;

public class Copy4 {

	public static void main(String[] args) {
		
		int[] a = {22, 1, -3};	
		int b[] = new int[a.length];	
		
		for(int i=0, d=a.length-1 ; i<a.length ; i++, d--) {
			b[i] = a[d];
		}
		
		for(int i=0 ; i<b.length ; i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
		
		for(int i=0 ; i<b.length ; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
	}
}
