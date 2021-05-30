package org.la.student.barry.array.taks5;
public class QueArray18 {
//Write a java program to find duplicate elements in an array? 
	  public static void main(String[] args) {  
		  //Initialize array   
	        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 7, 8, 4};   
	          
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	        }  
		}  
 
