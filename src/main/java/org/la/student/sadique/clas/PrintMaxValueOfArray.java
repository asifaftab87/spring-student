package org.la.student.sadique.clas;

public class PrintMaxValueOfArray {
	public static void main(String[] args) {
		//find greatest number from any array.
		int arr [] = {13,5,132,24,79};
		int max  = arr [0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		} System.out.println(max+" : maximum value");
		
		
		
		
	}

}
  