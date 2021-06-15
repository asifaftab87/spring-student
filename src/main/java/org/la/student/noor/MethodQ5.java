package org.la.student.noor;
/*void printNum(int[], int)
		method will print number if found in array negative number from supplied array
		e.g. if a[]={1,2,3} n b=2 then print 2
		if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element*/

public class MethodQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,-2,-1,0,1,2,3};
		int n=2;
		printodd(arr,n);

	}

	static void printodd(int[] a,int n) {

		boolean result = false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
						result=true;
			}
		}
		if(result) {
			System.out.println(n);
		}
		else
			System.out.println(" result not found");


	}
}
