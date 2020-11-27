package org.la.student.tahir;

public class Control_Statement_37 {

	public static void main(String[] args) {
		//wap to check whether a given number is positive and double digit or single digit number
		
		int a = 9;
		if ( a >0) {
			System.out.println(a + " is positive");
		}
		
		 if ((a>=10 && a <100) || (a<=-10 && a >-100)) {
			System.out.println(a + " is double digit");
		}
		else {
			System.out.println(a + " is single digit");
		}
	}

}
