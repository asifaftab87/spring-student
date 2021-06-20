package org.la.student.barry.clas.task;

public class ArithmeticMain {
	
	public static void main(String[] args) {
		Arithmetic arithmetic= new Arithmetic();
		int sum= arithmetic.add(15, 8);
		System.out.println("Sum: "+sum);
		int sub= arithmetic.sub(25, 17);
		System.out.println("Subration:"+sub);
		double div= arithmetic.div(35, 7);
		System.out.println("Divison result: "+div);
		int prod=arithmetic.prod(8, 7);
		System.out.println("Produit: "+prod);
		
		System.out.println("Fibonacci::::");
		arithmetic.fibonacci(7);
		
		System.out.println("print A Prime Number:::::");
		
		arithmetic.prime(7);
		
		System.out.println("Print A Factorial Number:::");
		
		arithmetic.factorial(6);
		
	}

}
