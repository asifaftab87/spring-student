package org.la.student.barry.excption;

public class ArithmeticExample3 {

	public static void main(String[] args) {
	 
		System.out.println("Start");
		try {
		int i= 5 / 0;
		System.out.println("i: "+i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
