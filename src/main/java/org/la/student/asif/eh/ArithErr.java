package org.la.student.asif.eh;

public class ArithErr {

	public static void main(String[] args) {
		
		int i = 40;
		
		try {
			int res = i/0;
			System.out.println("res: "+res);
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("error or no error finally block will execute definitely");
		}
		System.out.println("end of program");
	}
}
