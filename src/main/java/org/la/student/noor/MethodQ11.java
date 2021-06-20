package org.la.student.noor;
/*int smallest(int[])
		find smallest element of an array and return that smallest value*/

public class MethodQ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int smallest = smallest(arr);
		System.out.println(smallest);

	}

	static int smallest(int[] a) {
		int res=a[0];
		System.out.println("smallest of elements is");
		for(int i=0;i<a.length-1;i++) {
			if(res>a[i]) {
				res=a[i];
			}

		}
		return res;
	}

}
