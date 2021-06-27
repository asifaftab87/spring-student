package org.la.student.bakil.arry;
/*
 * Write a Java program to find the second smallest element in an array?
 */
public class SecondSmallestElement {

	public static void main(String[] args) {
	
		int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second Smallest element of the array is : "+array[0]);
	}
}
	