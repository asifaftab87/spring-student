package org.la.student.rasheed;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		FactorialRecursion rc = new FactorialRecursion();
		//the value we are passing is (5)
		int n =5;
		int fact = rc.fact(n);
		System.out.println("Factorial of "+n+" is: "+fact);
	}
		
		
	int fact(int n) {
		//Here the program is checking if (N==1), then return 1, 
		 //if it is not, it will skip this part to the next line of code
		
		if (n==1) {
			return 1;
		}
		//Here whatever the value of (N), it will call the factorial
		//it will call the factorial in pre-increment format
		//Here u can make it post increment because it will become infinity 
		return n * fact(--n);
	
		

		

			
	
		}
	

	}

