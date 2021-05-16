package org.la.student.barry.loop.task;

public class Loop82 {
	
	//Wap to print star decrease
	public static void main(String arg[])
	{    int n=6;
		 for(int j=1; j<=n; j++) {
			 for(int spc=1; spc<=j; spc++) {
				 System.out.print(" ");
			 }
			 for(int k=1; k<=n-j+1; k++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		    }
	 }
}
	
  

	
	
