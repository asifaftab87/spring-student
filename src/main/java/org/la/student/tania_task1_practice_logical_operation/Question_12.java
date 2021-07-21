package org.la.student.tania_task1_practice_logical_operation;

public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, e = 50;
        boolean b = (c == 1) && (++e < 100);
        System.out.println("e = " + e);
        boolean f = (++e < 100) && (c == 1);
        System.out.println("e = " + e);
        System.out.println("b =" +b);
        System.out.println("f= " +f);
	}

}
