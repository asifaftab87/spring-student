package org.la.student.noura.loop;

import java.util.Scanner;

public class FindinPowerofNumber {

	public static void main(String[] args) {
		//Wap to find power of a number using for loop
		long p=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your number: ");
		int num=sc.nextInt();
		System.out.println("enter value of exponent: ");
        int exponent=sc.nextInt();
        for(int i=1;i<=exponent;i++) {
        	p=p*num;
        }
        System.out.println("the result is= "+p);
	}

}
