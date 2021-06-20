package org.la.student.rasheed.method;

import java.util.Arrays;

/*
 *  add two supplied arrays elements and then copy the some of each element to 3rd array and return 3rd array.
 */

public class MethodTask12 {

	public static void main(String[] args) {
		


        int arr[] = {90};
        int arr1[] = {80};
        int res[] = SumofArray(arr,arr1);
        System.out.println("sum of Array");
        System.out.println(Arrays.toString(res));
        
        
	}
	static int[] SumofArray(int[] a, int [] b) {
		int res [] = new int[a.length];
	
	
        for (int i =0; i<=a.length-1; i++) {
        	
        	res[i] = a[i] + b[i];
        }
        
       return res;
        }
        

	
        
      
        
        
	}



	
	

	

		