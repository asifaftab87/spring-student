package org.la.student.sajid;

public class FindGivenNumberIsNegativeOrNot {
	public static void main(String[] args) {
//		wap to find a given number is negative or not? ( using if and without if)
		
		
		int n=-10;
		System.out.println("Without using if condition:");
//		without using if condition
		for(;n>0;) {
			System.out.println("Not Negative Number");
			break;
		}for(;n<=0;) {
			System.out.println("Negative Number");
			break;
		}
		System.out.println();
//		using if condition
		System.out.println("Using if condition:");
		if(n>=0) {
			System.out.println("Not Negative Number");
		}else {
			System.out.println("Negative number");
		}
	}

}
