package org.la.student.barry.excption;

public class ArithmeticExample2 {

	public static void main(String[] args) {
	 
		System.out.println("Start");
		try {
		int i= 5 / 0;
		System.out.println("i: "+i);
		}
		catch(Exception e) {
			System.out.println("error: "+ e.getMessage());
		}
		System.out.println("end");
	}

}
