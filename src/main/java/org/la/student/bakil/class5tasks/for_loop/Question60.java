package org.la.student.bakil.class5tasks.for_loop;

/*
 * Wap to check whether a number is palindrome or not.
 */
public class Question60 {

	public static void main(String[] args) {
	
int num = 2112, rev = 0;
	    
	    int i = num;
	    
	    
	    for (;num != 0 ;) {
	    	
	      rev = rev * 10;
	      rev = rev +num %10;
	      num /= 10;
	    }
	    
	    // check if i and originalNum are equal
	    if (i == rev) {
	      System.out.println("The number ("+i + ") is Palindrome.");
	    }
	    else {
	      System.out.println("The number ("+i + ") is not Palindrome.");
	    }}
	}
	

