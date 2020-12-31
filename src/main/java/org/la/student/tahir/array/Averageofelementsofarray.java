package org.la.student.tahir.array;

public class Averageofelementsofarray {

	public static void main(String[] args) {
		//  Write a Java program to calculate the average value of array elements?
		
		int [] a = {10,4,5,5};
		double sum=0;
		for(int i=0; i<a.length; i++) {
			
			sum = sum+ a[i];
		}
		double Average = sum/a.length;
		System.out.println(sum);
		System.out.println(a.length);
		System.out.println(Average);
	}

}
