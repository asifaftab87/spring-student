package org.la.student.tania;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 3, 55, 54, 56};
		
		for(int i=0 ; i<arr.length ; i++) {
			
			if(arr[i]%2==0) {
				System.out.println("Even: "+arr[i]);
			}
			else {
				System.out.println("Odd: "+arr[i]);
			}
		}
	}

}
