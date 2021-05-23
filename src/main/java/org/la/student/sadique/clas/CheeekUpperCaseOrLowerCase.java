package org.la.student.sadique.clas;

public class CheeekUpperCaseOrLowerCase {

	public static void main(String[] args) {
		// Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
		char a='G';
		if(a>=65&&a<=90) {
			System.out.println(a+" is upper case");
		}else if(a>=97&&a<=122) {
			System.out.println(a+" is lower case");
		}
	}

}
