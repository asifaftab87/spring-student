package org.la.student.jamal.operators;

import java.util.Scanner;

public class IfEles10 {
	/*10.	A school has following rules for grading system:
		a. Below 25 - F
		b. 25 to 45 - E
		c. 45 to 50 - D
		d. 50 to 60 - C
		e. 60 to 80 - B
		f. Above 80 - A
		provide marks and print the corresponding grade.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your grade :");
		
		int n= scan.nextInt();
		
		
		if (n>80 && n<=100) {
			System.out.println("congratulations you got an A");
			
		}else if (n>60 && n<=80) {
		 System.out.println("congratulations you got  B");
		}else if (n>50 && n<=60) {
			 System.out.println("You got  C");
		}else if (n>45 && n<=50) {
			 System.out.println("You got  D");
		}else if (n>25 && n<=45) {
			 System.out.println("You got  E");
		}else if (n>=0 && n<=25) {
			 System.out.println("You got  F");
		}else {
			System.out.println("please enter the correct number ");
		}
	
		
		
		
		
		
		
		
		
		
		
			
	}

}
