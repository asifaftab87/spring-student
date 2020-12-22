package org.la.student.sajid;

public class CheckProfectNumber {
	public static void main(String[] args) {
//		Wap to check whether a number is Perfect number or not.
		
		  int n=12, sum = 0,i;
	        for( i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println("Given number is Perfect: "+i);
	        }
	        else
	        {
	            System.out.println("Given number is not Perfect: "+i);
	        }    
	    }

}
