package org.la.student.bakil.student.tasks;

/*
 *      int a = 27 / 4 + 9;
        int b = 52 / 6 - 3;
        int c = 3;
        c = a++ - b; 
        a = a * b; 
        b = b + a; 
        a = (a < c) ? a % c : c % a; 
        System.out.println("a = " + a + " b = " + b + " c = " + c);
 */

public class Question_7_16 {

	public static void main(String[] args) {
		int a = 27 / 4 + 9; //a=15
        int b = 52 / 6 - 3;//b=5
        int c = 3;
        c = a++ - b; //c=10 , a=16
        a = a * b; //a=75
        b = b + a; //b=85
        a = (a < c) ? a % c : c % a; 
        System.out.println("a = " + a + " b = " + b + " c = " + c);
		

	}

}
