package org.la.student.bakil.if_else;
/*
 * Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z )
 * */
public class Question13 {

	public static void main(String[] args) {
		
		char ch='V';
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is an uppercase character"); 
		}
        else if (ch >= 'a' && ch <= 'z') {
        	
            System.out.println(ch + " is an lowercase character" ); 
        }
        else
        {
            System.out.println( ch + " is not an aplhabetic character" ); 
    }

	}

}
