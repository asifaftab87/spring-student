package org.la.student.sadique.clas;

public class PrintMinValueOfArray {

	public static void main(String[] args) {
		// wap to find smallest number among array element
		int arr [] = {1,5,2,-8,4,7};
		int min  = arr [0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		} System.out.println(min+" : minimum value");

	}

}
