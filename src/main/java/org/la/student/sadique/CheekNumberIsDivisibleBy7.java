package org.la.student.sadique;

public class CheekNumberIsDivisibleBy7 {

	public static void main(String[] args) {
		// wap to check whether number divisible by 7.
		
		// using if and else.
				int d=49;
				if(d%7==0) {
					System.out.println(d + " is divisible by 7 ");
				}else {
					System.out.println(d + " is not divisible by 7");
				}
				// using without if  and else.
				int a=63;
				for(;a%7==0;) {
					System.out.println(a + " is divisible by 7 ");
					break;
				}
				for(;a%7!=0;) {
					System.out.println(a + " is not divisible by 7 ");
					break;
				}

	}

}
