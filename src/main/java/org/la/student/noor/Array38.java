package org.la.student.noor;
//Find largest and smallest elements of an array? 
import java.util.Arrays;

public class Array38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,90,44,21};

		Arrays.sort(a);
		System.out.println("Largest number is "+a[a.length-1]);
		System.out.println("Smallest number is "+a[0]);
	}


}
