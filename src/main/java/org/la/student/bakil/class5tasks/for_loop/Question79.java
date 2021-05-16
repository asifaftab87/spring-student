package org.la.student.bakil.class5tasks.for_loop;
/*      * * * * *
		 * * * *
		  * * *
		   * *
		    *
 */
public class Question79 {

	public static void main(String[] args) 
	
	{

	int n =5;
	for (int i=n;i>=1;i--) {
		
		//print spce
		for(int spc=1;spc<=n-i;spc++) {
			System.out.print(" ");
		}	
	   
		//print stars
	for (int y=1;y<=i;y++) {
		System.out.print(" *");
	}
	
	System.out.println("");
		}
	}
}
	
	    
	
