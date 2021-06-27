package org.la.student.bakil.objects;

public class ArithmeticMain {

	public static void main(String[] args) {

		
		Arithmetic ar = new Arithmetic();
		
		int sum = ar.sum(11, 3);
		System.out.println("Sum = "+sum+'\n');
		int sub =ar.sub(2, 3);
		System.out.println("Sub = "+sub+'\n');
		double div = ar.div(33, 2);
		System.out.println("Divition = "+div+'\n');
		
		ar.prod(5);
		System.out.println("");
		ar.fibo(5);
		System.out.println("");
		ar.prime(5);
		System.out.println(" ");
		ar.factorial(4);
	}

}
