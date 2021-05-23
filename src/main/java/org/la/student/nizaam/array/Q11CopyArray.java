package org.la.student.nizaam.array;

public class Q11CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	11) wap to copy one array into other array
		
		int arr[]= {2,3,4,5,6,7};
		int[] arr1= new int[arr.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
	}

}
