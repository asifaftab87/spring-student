package org.la.student.noura.loop;

public class IncreaseStarRightSide {
	
	
	public static void main(String[] args) {
		
		int n=8;
	
	
	for(int i=1; i<=n;i++) {

		for(int s=1;s<=n-i;s++) 
		
		{
			
		System.out.print(" ");
		
		}
		
	       for(int k=1;k<=i;k++)
	       {

	    	   System.out.print("*");
	    	   
	       }
	      
	   			
	   		System.out.println(" ");
	   		
	   	}
	}
	
}
