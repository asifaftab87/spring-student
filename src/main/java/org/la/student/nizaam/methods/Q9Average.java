package org.la.student.nizaam.methods;

public class Q9Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		int avg = avg(arr);
		System.out.println(avg);
		
	}
	
	static int avg(int[] a) {
		int sum=0;
		System.out.println("average of elements");
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}

}
