
package org.la.student.nizaam.array;

public class Q5PrintEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	05) wap to print only even number from an array
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
	}

}