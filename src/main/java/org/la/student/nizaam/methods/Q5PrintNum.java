package org.la.student.nizaam.methods;

public class Q5PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-1,-2,0,1,2,-3};
		int n=2;
		printodd(arr,n);
		
	}
	
	static void printodd(int[] a,int n) {

		boolean found = false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
						found=true;
			}
		}
		if(found) {
			System.out.println(n);
		}
		else
			System.out.println("not found");
		
		
	}

}
