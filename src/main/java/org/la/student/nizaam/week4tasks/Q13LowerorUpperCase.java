package org.la.student.nizaam.week4tasks;

public class Q13LowerorUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	13.	Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
		
		char c='b';
		
		if(c>='a'&& c<='z') {
			System.out.println("Given character is Lower case");
		}else if(c>='A'&&c<='Z') {
			System.out.println("Given character is Upper Case");
		}else
			System.out.println("Given character is not Alphabet");
	}

}
