package org.la.student.sayyaf.task2;

public class DoubleVariable {
	
	public static void main(String[] args) {
		
		/*
		 * All numbers in the interval [-9223372036854775808L, 9223372036854775807L]
		 * can be stored in a "long" variable.
		 * 
		 * A letter 'l' or 'L' should be added to tell the compiler 
		 * that the number is "long" and not "int".
		 */
	
		long l = 9223372036807L;
		
		System.out.println("l = "+l);
	}

}
