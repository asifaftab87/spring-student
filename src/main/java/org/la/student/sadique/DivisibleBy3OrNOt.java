package org.la.student.sadique;

public class DivisibleBy3OrNOt {

	public static void main(String[] args) {
		// wap to print whether number is divisible by 3 or not.
		// using if and else.
		int d=51;
		if(d%3==0) {
			System.out.println(d + " is divisible by 3 ");
		}else {
			System.out.println(d + " is not divisible by 3");
		}
		// using without if  and else.
		int a=13;
		for(;a%3==0;) {
			System.out.println(a + " is divisible by 3 ");
			break;
		}
		for(;a%3!=0;) {
			System.out.println(a + " is not divisible by 3 ");
			break;
		}
	}

}
