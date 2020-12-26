package org.la.student.sajid;

public class CheckFrofectAll_N_Number {
	public static void main(String[] args) {
//	Wap to print all Perfect numbers between 1 to n.
		int  sum = 0,n,i;
		 for(n=1;n<=1000;n++) {
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
	        sum=0;
		 }
	}
}
