package org.la.student.tania_task1_practice_if_else;

public class Question_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		boolean a=true, b = false;
		if (a) {
			System.out.println("A");
		} else if (a && b) {
			System.out.println("A && B");
		} else {
			if (!b) {
				System.out.println("notB");
			} else {
				System.out.println("ELSE");
			}
		}

	}

}
