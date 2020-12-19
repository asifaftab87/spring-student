package org.la.student.asif.array;

public class FirstLoop {

	public static void main(String[] args) {
		
		int[] a = new int[4];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = 10 * i;
		}
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}		
		
	}
}
