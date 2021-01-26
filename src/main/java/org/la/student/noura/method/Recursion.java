package org.la.student.noura.method;

public class Recursion {

	public static void main(String[] args) {
//factorial

		int  result =fac(6);
		System.out.println(result);

	}

	
	static int fac(int a) {
		
	if(a==1) {
		return 1;// no need to write else CZ of return
	}
	return a*fac(a-1);// we are calling a method itself her 
	}

	
}
