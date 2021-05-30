package org.la.student.noor;
/*int sum(int[])
		find sum of all elements of an array and return sum*/

public class MethodQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int b = sum(arr);
		System.out.println(b);

	}

	static int sum(int[] a) {
		int sum=0;
		System.out.println("Sum of elements is");
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

	}