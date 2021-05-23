package org.la.student.barry.ifelse;

public class TaskIfElse47 { /*
 wap to find least number among three numbers
   */

	public static void main(String[] args) {
		int x=8, y= 5, z= 3;
		if (x<y && x<z){
			System.out.println("  the least  number among three numbers is :" + x );
		}
		  else if (y<x && y<z){System.out.println(" the least number among three numbers is :"+ y );
	       } else {
	    	   System.out.println("The least number among three numbers is:" +z);
	       }
				
    }
}
	
