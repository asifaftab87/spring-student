package org.la.student.sajid;

public class Array25 {
	public static void main(String[] args) {
//		25) Write a Java program to calculate the average value of array elements?
		int a[]={10,20,15,25,16,60,100};
		int s=0,z;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
			z=s/a.length;
			System.out.println("Average Value: "+z);
		}
	}

}
