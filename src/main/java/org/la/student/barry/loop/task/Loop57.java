package org.la.student.barry.loop.task;

public class Loop57 {
	
	//	Wap to count number of digits in a number.
	public static void main(String[] args) {
		
		  int count = 0, num = 23859013;

		    while (num != 0) {
		      // num = num/10
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits: " + count);
		  }
     }
	

	
  

	
	
