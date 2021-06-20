package org.la.student.bakil.Class_8_Methods;

/*
 * void copy(int[], int[])
		copy first array to second array
 */
public class CopyArray_Method {


	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6};
		int arr1[] = {6,5,4,3,2,1};
		int res[] = copyofArrays(arr,arr1);
		printcopy (res);
	}
	
		
		static int[] copyofArrays(int[] a,int[] b) {
			int res[]=new int[a.length+b.length];
			int i=0;
			for(;i<a.length;i++) {
				res[i]=a[i];
			}
			for(int j=0;j<b.length;j++,i++) {
				res[i]=b[j];
			}
			return res;
	

	}
		static void printcopy(int[] res) {
			 for(int a:res) {
				if (a%2!=0) {
					System.out.print(a+ "  ");
				}
}
		}
}
	

