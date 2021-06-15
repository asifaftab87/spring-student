package org.la.student.nizaam.methods;

public class Q11Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,7,4,5,-3,-1,6};
		int smallest = smallest(arr);
		System.out.println(smallest);
		
	}
	
	static int smallest(int[] a) {
		int res=a[0];
		System.out.println("smallest of elements");
		for(int i=0;i<a.length-1;i++) {
			if(res>a[i]) {
				res=a[i];
			}
			
		}
		return res;
	}

}
