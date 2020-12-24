package org.la.student.ameen;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Wap to check whether a number is Armstrong number or not
		 int c=0;
				 int a;  
		    int n=153;
		   int Armstrong=n;  
		    while(n>0)  
		    {  
		    a = n % 10;  
		    n = n / 10;  
		    c = c+(a*a*a);  
		    }  
		    if(Armstrong==c) 
		    {
		    System.out.println("armstrong number");   
		    }
		    else  
		    {
		    	System.out.println("Not armstrong number");   
		    }
		    
		    }  
		 
	}


