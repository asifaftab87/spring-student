package org.la.student.sajid;

public class WhileLoop03 {
	public static void main(String[] args) {
//		3.	wap to print negative number among two given numbers( with if and without if).
		
//		without if condition
		int a=-5;
		int b=9;
		int c=(a<b)?a:b;
		System.out.println(c);
		
//		using if condition
		if(a<b) {
			System.out.println("A is negative number");
		}else if(b<a) {
			System.out.println("B is Negative Number");
		}
		
	}

}
