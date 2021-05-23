package org.la.student.barry.ifelse;

public class TaskIfElse13 { /*
	Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
*/

	public static void main(String[] args) {
		
	char c= 'S';
			if (c>='A'&& c<='Z') {
				System.out.println(" The given character is: UpperCase");
			} else if (c>='a'&& c<='z') { System.out.println("the given character is: Lowcase");
			
			} else { System.out.println(c+ "is not an alphabetic character");
   
   }

	}
}