package org.la.student.barry.ifelse;

public class TaskIfElse12 { /*
wap to find smallest number among 3 numbers
*/

	public static void main(String[] args) {
		
		int x= 5, y= 3, z= 11;
		
		if (x<y && x<z) {System.out.println("the smallest number is: " + x );
         } else if (y<x && y<z) {
        	 System.out.println("the smallest number is:" +y);
         }
		else {
    	System.out.println(" the smallest number is: "+ z);
       }
   
   }
}