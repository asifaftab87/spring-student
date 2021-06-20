package org.la.student.noor;

import java.util.Arrays;

/*int[] copy(int[])
		create an array and copy supplied array and return that new array*/

public class MethodQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,-2,-1,0,1,2,3};
		int b[] = copy(arr);
		System.out.println(Arrays.toString(b));

	}

	static int[] copy(int[] a) {
		int b[] = new int[a.length];
		System.out.println("Copying array");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		return b;
	}
	}

