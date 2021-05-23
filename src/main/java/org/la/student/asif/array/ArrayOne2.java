package org.la.student.asif.array;

public class ArrayOne2 {

	public static void main(String[] args) {
		
		double a[] = new double[10];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = Math.random();
		}
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		
 	}
}
