package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q21Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a = Factorial(5);
		System.out.println(a);
		
	}
	static int Factorial (int a) {
		
		int f=1;
		for(int i=1;i<=a;i++) {
			
			f*=i;
		}
		return f;
	}
}