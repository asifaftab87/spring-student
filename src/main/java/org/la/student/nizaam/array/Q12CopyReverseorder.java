package org.la.student.nizaam.array;

public class Q12CopyReverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	12) wap to copy an array to another array in reverse order
		
		int arr[]= {2,3,4,5,6,7};
		int[] arr1= new int[arr.length];
		int j=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			arr1[j]=arr[i];
			j++;
		}
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
	}

}
