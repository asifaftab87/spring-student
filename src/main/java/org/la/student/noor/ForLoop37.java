package org.la.student.noor;
/*
* * * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    */

public class ForLoop37 {

	public static void main(String[] args) {
		int n=6;
		int j;
		for(j=1;j<=n;j++)
		{
			for(int spc=1;spc<j;spc++) {
				System.out.print(" ");
		}
          for(int y=1;y<=n-j+1;y++) {
        	  System.out.print("* ");
          }
          System.out.println("");
	}


	}

}
