package org.la.student.asif.excptn;

public class ArithmeticExample3 {

	public static void main(String[] args) {
		
		System.out.println("start");
		try {
			int i = 5 / 1;
			System.out.println("i: "+i);
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}
}
