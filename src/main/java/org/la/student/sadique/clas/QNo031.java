package org.la.student.sadique.clas;

public class QNo031 {

	public static void main(String[] args) {
		boolean a=false, b = true;
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
