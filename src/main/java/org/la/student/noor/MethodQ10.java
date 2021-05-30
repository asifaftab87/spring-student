package org.la.student.noor;
/*int greatest(int[])
		find greatest element of an array and return that greatest value*/

public class MethodQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int greatest = greatest(arr);
		System.out.println(greatest);

	}

	static int greatest(int[] a) {
		int res=0;
		System.out.println("Greatest of elements is");
		for(int i=0;i<a.length;i++) {
			if(res<a[i]) {
				res=a[i];
			}

		}
		return res;
	}
	}
