package org.la.student.bakil.arry;
/*
 * wap to copy two arrays into one array
 */
public class AddTwoArraysElements {

	public static void main(String[] args) {
	
		int [] arr1 = {31, 14, 5, 12, 50};
	    int [] arr2 = {9, 13, 56, 78, 36};
	    int [] arr3 = new int [arr1.length + arr2.length];

	    for (int i = 0; i < arr1.length; i++) {
	      arr3[i] = arr1[i];
	    }
	    
	    int x = arr1.length;
	    for (int i = 0; i < arr2.length; i++)
	    {
	      arr3[x+i] = arr2[i];
	      
	    }
	  
	    for(int y : arr3)
	    {
	      System.out.print(y+" ");
		    } 
		}
 		    
		}
	
		

