package org.la.student.noor;
/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 

 */

public class ForLoop36 {

	public static void main(String[] args) {
		
		int n=6;
		int j;
		for(j=1;j<=n;j++)
		{
			for(int spc=1;spc<=n-j;spc++) {
				System.out.print(" ");
		}
          for(int y=1;y<=j;y++) {
        	  System.out.print("* ");
          }
          System.out.println("");
	}

}
}

