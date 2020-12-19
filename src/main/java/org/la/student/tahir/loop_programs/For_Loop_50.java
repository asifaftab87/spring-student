package org.la.student.tahir.loop_programs;

import static java.lang.Math.pow;


public class For_Loop_50 {

	public static void main(String[] args) {
		
	       
	        int x = 10325;
	        int z = x;
	        int k = 0;
	        int i =0;
	        int num1, num2, num3, num4;
	        while(z>0)
	        {
	            k++;
	            z = z/10;
	        }
	        i = x%10;

	         num1 = (int) (i * pow(10,k-1));
	         num2 = (int) (x /pow(10,k-1));
	         num3 = num1 + num2;
	         num3 = num3 - i;
	         num4 = (int) (x% pow(10,k-1));
	         num3 = num3+num4;
	        System.out.print(num3);
	    }
	  
	 
	 

		
	}


