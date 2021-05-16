package org.la.student.nizaam.array;

public class Q25AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	25) Write a Java program to calculate the average value of array elements?
		
		int a[]= {1,2,3,4,5},sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);
	}

}
