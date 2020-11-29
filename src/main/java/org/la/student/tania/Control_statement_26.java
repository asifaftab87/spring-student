package org.la.student.tania;

public class Control_statement_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		boolean a= true, b=false;
		if(a) {
			System.out.println("A");
			
		}
		else if(a && b) {
			System.out.println("A && B");
		}
		else {
			if(!b) {
				System.out.println("not B");
			}
			else {
				System.out.println("ELSE");
			}
		}
	}

}
