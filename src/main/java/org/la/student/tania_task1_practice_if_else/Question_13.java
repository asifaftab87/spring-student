package org.la.student.tania_task1_practice_if_else;

public class Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//13.	Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
	
	char cha ='a';
	if(cha>='A' && cha<='Z') {
	System.out.println(cha + " is an uppercase latter ");	
	}
	
	else if(cha>='a'&& cha<='z') {
		System.out.println(cha + " is a lowercase letter");
	}
	else {
		System.out.println(cha+ " is not a character");
	}
	}

}
