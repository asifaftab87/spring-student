package org.la.student.bakil.class6tasks_arry;
/*
 * Write a java program to find duplicate elements in an array? 
 */
public class Duplicate_Elements_Arry {

	public static void main(String[] args) {
	
		 int [] arr = new int [] {1,4 ,2, 3, 4, 2, 7, 8, 8, 3};   
         
	    System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	        for(int j = i + 1; j < arr.length; j++) {  
	        if(arr[i] == arr[j])  
	        System.out.print(arr[j]+" ");
	
	}
	        }
	        }
	        }
