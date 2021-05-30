package org.la.student.noor;
/*int average(int[])
		find the average of array elements and return average*/

public class MethodQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int avg = avg(arr);
		System.out.println(avg);

	}

	static int avg(int[] a) {
		int sum=0;
		System.out.println("average of elements is");
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	}
