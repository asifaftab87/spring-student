package org.la.student.barry.loop.task;

public class Loop44 {
	
	// 	wap to reverse a number e.g ip=12345, op=54321 avoid zero
	public static void main(String[] args) {
		 int num = 12345, reversed = 0;

		    while(num != 0) {
		    
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
          
		    int op= 54321, reversed1 = 0;

		    for(;op != 0; op /= 10) {
		      int digit = op % 10;
		      reversed1 = reversed1 * 10 + digit;
		    }

		    System.out.println("Reversed Number: " + reversed1);
     }
	

	}
  

	
	
