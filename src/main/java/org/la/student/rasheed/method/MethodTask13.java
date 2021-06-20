package org.la.student.rasheed.method;
/*
 *  copy first array and second array to two third array.
 */

public class MethodTask13 {

	public static void main(String[] args) {
		 //Initialize array
		int arr1 [] = {23, 34, 43,};
		int arr2 [] = new int [arr1.length];
		
		
//Create another array arr2 with size of arr1   

	
		
		//Copying all elements of one array into another 
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
			
			
		}
		//Displaying elements of array arr1     
		System.out.println("Element of Orginal Array: ");


		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]  + "");
		}
		System.out.println();
		
		 //Displaying elements of array arr2   
		System.out.println("Element of New Array: ");
		
		for(int i=0; i<arr2.length; i++) {
			
			System.out.println(arr2[i] + " ");
		}

        	
        }
}
        
      
        
        
	
        




	
	

	

		