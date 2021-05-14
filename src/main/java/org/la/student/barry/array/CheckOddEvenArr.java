package org.la.student.barry.array;

public class CheckOddEvenArr {

	public static void main(String[] args) {
		int arr[]= {1,2,5,33,54,55};
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("Even:" +arr[i]);
			}
			else 
				System.out.println("Odd:" +arr[i]);
		}

	}

}
