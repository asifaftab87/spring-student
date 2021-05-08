package org.la.student.noor;
/* Pattern 5
        1
		1 2
		1 2 3
 */
public class ForLoop34 {

	public static void main(String[] args) {
		int i, j,number, n=4;   
		//loop for rows  
		for(i=0; i<n; i++)  
		{   
		number=1;   
		//loop for columns  
		for(j=0; j<=i; j++)  
		{   
		//prints num  
		System.out.print(number+ " ");   
		//incrementing the value of number   
		number++;   
		}   
		//throws the cursor at the next line after printing each row  
		System.out.println();   
		}   
		}

}
