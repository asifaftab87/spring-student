package org.la.student.barry.taks01;

public class TaskLogicalOperation16 {	/* 
	
	 what will be the value of a and b on printing		
	*/

	public static void main(String[] args) {
		int a = 27 / 4 + 9;
        int b = 52 / 6 - 3;
        int c = 3;
        c = a++ - b; 
        a = a * b; 
        b = b + a; 
        a = (a < c) ? a % c : c % a; 
        System.out.println("a = " + a +";"+ " b = " + b +";"+ " c = " + c+".");
	}
}
