package org.la.student.noor;
//Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
public class IfElse9 {

	public static void main(String[] args) {
		char ch='N';
		
		if (ch >= 'A' && ch <= 'Z') {
		System.out.println("Character is Upper Case Letter");
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println("Character is Lower Case Letter");
		}
		else
		{
			System.out.println("This is not alphabetic character");
		}

	}

}
