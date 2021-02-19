package org.la.student.sadique.clas;

public class CheekNumberIsDIvisibleByGivenArrayOrNot {

	public static void main(String[] args) {
		// 08) wap to print number divisible by given number from an array.

		int a[] = { 10,15,5,20,25 };
		 int n = a.length; 
		  // traverse for all elements 
        for (int i = 0; i < n; i++)  
        { 
              
            int j;  
            for (j = 0; j < n; j++)  
                if (a[j] % a[i]>=1)  
                    break; 
      
            // stores the minimum if 
            // it divides all 
            if (j == n) {
            	System.out.println(a[i]+"  divide the given number ");
            }
                 
        } 
			
	}
}
