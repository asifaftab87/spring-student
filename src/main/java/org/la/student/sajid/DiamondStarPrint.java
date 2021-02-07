package org.la.student.sajid;

public class DiamondStarPrint {
	public static void main(String[] args) {
//		Diamond Pattern
		
		int i,j,r=7;
		
		 for(i=0;i<=r;i++)
		   {
		     for(j=1;j<=r-i;j++) {
		    	 System.out.print(" ");
		     }
		     for(j=1;j<=i-1;j++) {
		    	 System.out.print("* ");
		     }
		     
		     	System.out.println("");
		   }
		 
		   for(i=r-1;i>=1;i--)
		   {
			   
		     for(j=1;j<=r-i;j++) {
		    	 System.out.print(" ");
		     }
		     for(j=1;j<=i-1;j++) {
		    	 System.out.print("* ");
		     }
		     	System.out.println("");
		   }
	}

}
