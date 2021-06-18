package org.la.student.noor;

public class ArithematicMain {

	public static void main(String[] args) {
		Arithematic arithmetic = new Arithematic();
		arithmetic.prime(3);

		int sum = arithmetic.sum(11, 33);
		System.out.println("sum: "+sum);

		arithmetic.printTable(7);
		arithmetic.fibonacci(5);
	}

	}
