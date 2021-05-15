package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q37EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	37) Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers ?
		int a[]= {1,2,3,4,5,6};
		
		int[] even= new int[a.length];
		int[] odd= new int[a.length];
		int eveIndex=0,oddIndex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[eveIndex]=a[i];
				eveIndex++;
			}
			else {
				odd[oddIndex]=a[i];
				oddIndex++;
			}
			
		}
		int[] c= new int[eveIndex+oddIndex];
		System.arraycopy(even, 0, c, 0, eveIndex);
		System.arraycopy(odd, 0, c, eveIndex, oddIndex);
		System.out.print(Arrays.toString(c));
	}

}
