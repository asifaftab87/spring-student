package org.la.student.tania;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a[] = new double[20];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = Math.random();
		}
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
	}

}
