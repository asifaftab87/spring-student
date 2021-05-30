package org.la.student.asif.method;

public class RecursionError {

	public static void main(String[] args) {
		RecursionError rc = new RecursionError();
		rc.fact(5);
	}
	
	void fact(int n) {
		n--;
		System.out.println(n);
		if(n>0) {
			fact(n);
		}
		return;
	}
}
