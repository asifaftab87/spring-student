package org.la.student.rasheed.clas;

public class TestArithmetic {
	///Advantage of this program, if you want to check a program
//you just have to create the object of that class 
	
	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.prime(5);
		
		
		int sum = arithmetic.sum(10,  22);
		System.out.println("sum: "+sum);
		
		
		arithmetic.printTable(1);
		arithmetic.fibonacci(10);
		
		//
		
		
		Pattern pattern = new Pattern();
		pattern.diamond(5);

	}

}
