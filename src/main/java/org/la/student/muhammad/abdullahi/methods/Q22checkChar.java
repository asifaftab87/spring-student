package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q22checkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  char c='c';
		System.out.println(checkChar(c));
	
		
		
	}	
		 static char checkChar(char c) {
			 
			 if(c>='A' && c<='Z')
					return 1;
				else if( c>='a' && c<='z')
					return (char) -1;
				else
					return 0;
		}
		}