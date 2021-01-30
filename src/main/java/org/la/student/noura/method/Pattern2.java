package org.la.student.noura.method;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		p(4);
		o(4);
	}
	
	static void p(int a) {
		
		for(int i=1;i<=a;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

static void o(int a) {
	
		for(int i=0;i<a;i++) {
			for(int k=1;k<a-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
  }
}