package org.la.student.asif.clas;

public class TestArithmetic {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.prime(5);
		
		int sum = arithmetic.sum(10, 22);
		System.out.println("sum: "+sum);
		
		arithmetic.printTable(1);
		arithmetic.fibonacci(10);
	}
}
