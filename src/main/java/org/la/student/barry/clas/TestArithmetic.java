package org.la.student.barry.clas;

public class TestArithmetic {

	public static void main(String[] args) {
	 Arithmetic arthmetic= new Arithmetic();
	 arthmetic.prime(5);
     
	 int sum= arthmetic.sum(10, 22);
	 System.out.println("sum: "+sum);
	 arthmetic.printTable(10);
	 arthmetic.fibonacci(10); 
	
	}

}
