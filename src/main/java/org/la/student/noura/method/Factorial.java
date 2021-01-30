package org.la.student.noura.method;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("factorial= "+fact(num));
	}

	
	static int fact(int a) {
		int f=1;
		for(;a>=1;a--) {
			f=f*a;
		}
		return f;
	
	}
}
