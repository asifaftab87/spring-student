package org.la.student.jamal.operators;

public class IfEles13 {

	/*
	 * 13.	Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
	 */
	public static void main(String[] args) {
		
		char y='z';
		
		if (y>='A' && y<='Z') {
			System.out.println("Thes character is Uppercase :" + y);
		}
		else if (y>='a' && y<='z') {
			System.out.println("Thes character is lowercase :" + y);
		}
		
		

	}

}
