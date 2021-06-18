package org.la.student.bakil.class6tasks_arry;
/*
 * Write a Java program to find the second largest element in an array?
 */
public class SecondLargestElement {

	public static void main(String[] args) {
	
		 int temp, size;
	      int a [] = {10, 20, 25, 63, 96, 57};
	      size = a.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(a[i]>a[j]){
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      System.out.println("The second largest number is: "+a[size-1]);
    }
	}
	