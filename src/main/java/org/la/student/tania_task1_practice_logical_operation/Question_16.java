package org.la.student.tania_task1_practice_logical_operation;

public class Question_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 27 / 4 + 9;
        int b = 52 / 6 - 3;
        int c = 3;
        c = a++ - b; 
        a = a * b; 
        b = b + a; 
        a = (a < c) ? a % c : c % a; 
        System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

}
