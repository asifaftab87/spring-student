package org.la.student.muhammad.abdullahi.ternary;

public class loopQ62 {
	public static void main(String[] args) {
		
		
		
int num = 121, rev = 0;
	    
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
	    }
	    }
	}
		
	
		
		
		
		
		
		
		
		
		
		
	

