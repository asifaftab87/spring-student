package org.la.student.barry.loop.task;

public class Loop83 {
	
	//Wap to print star decrease
	public static void main(String arg[])
	{    int n=6;
		 for(int j=1; j<=n; j++) {
			 for(int spc=j; spc<=n-1; spc++) {
				 System.out.print(" ");
			 }
			 for(int k=1; k<=j; k++) {
				 System.out.print("* ");
			 }
			 System.out.println(" ");
		    }
	 }
}
	
  

	
	
