package org.la.student.noor;
//Write a Java program to calculate the average value of array elements?
public class Array25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8},sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);

	}

}
