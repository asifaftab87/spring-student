package org.la.student.noor;
/* Pattern 6
    1 
    2 2 
    3 3 3 
    4 4 4 4 
 */

public class ForLoop35 {

	public static void main(String[] args) {
		int i, j, rows=4;  
		for (i = 1; i <= rows; i++)   
		{  
		for (j = 1; j <= i; j++)  
		{  
		System.out.print(i+" ");  
		}  
		System.out.println();  
		}           

	}

}
