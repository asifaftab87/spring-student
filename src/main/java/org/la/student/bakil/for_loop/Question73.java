package org.la.student.bakil.for_loop;
/*
 *Wap to print Fibonacci series up to n terms.
 */
public class Question73 {

	public static void main(String[] args) 
	
	{

		int n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	    }
	}
		
