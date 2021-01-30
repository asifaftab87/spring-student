package org.la.student.noura.method;

import java.util.Scanner;

public class IsNumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		System.out.println("Is prime number:  "+prime(num));
		
	}

	
	
	static boolean prime(int a)
	{
		int i=2;
		while(i<a) {
			if(a%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
