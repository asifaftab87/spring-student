package org.la.student.rasheed;

/*
 * how to access the element in array
 */

public class ArrayLessonExample2 {

	public static void main(String[] args) {
		
		double a [] = new double [10];
		
		for (int i=0; i<a.length ; i++) {
			a[i] = Math.random();
			
		}
		for (int i=0; i<a.length ; i++) {
			System.out.println(a[i]);
		}

	}

}
