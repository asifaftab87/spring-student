package org.la.student.bakil.class6tasks_arry;
/*
 * wap to copy one array into other array
 */
public class Question12 {

	public static void main(String[] args) {
	
	      int arr []  = {1, 2, 3, 4, 5}; 
	      int x   [] = new int [arr.length];
	      
	        System.out.println("Original array: ");  
	        
	        
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }
	        
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) { 
	        	x [i] = arr[i];   
	        	// System.out.print(arr[i]+" "); 
	        }
	        
	        for (int y :x) {
				System.out.print(y+" ");
			}
	}
	        }
	
		

