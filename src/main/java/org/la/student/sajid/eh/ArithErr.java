package org.la.student.sajid.eh;

public class ArithErr {
	public static void main(String[] args) {
		int i = 50;
		try {
			int res = i / 0;
			System.out.println("res " + res);
		} catch (Exception e) {
//			 e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end program");
	}

}
