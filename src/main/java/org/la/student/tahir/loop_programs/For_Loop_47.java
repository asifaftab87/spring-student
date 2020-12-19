package org.la.student.tahir.loop_programs;

public class For_Loop_47 {

	public static void main(String[] args) {
		
		// to count number of digits in a number.

	    int count = 0, num = 1236;

	    for (; num != 0;  ++count) {
	    	num /= 10;
	    
	    	}

	    System.out.println("Number of digits: " + count);
	  }
	}


