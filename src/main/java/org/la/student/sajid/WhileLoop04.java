package org.la.student.sajid;

public class WhileLoop04 {
	public static void main(String[] args) {
//	4.	wap to print positive number among two given numbers( with if and without if).
//	without using if condition
		
	int a=5;
	int b=-9;
	int c=(a>b)?a:b;
	System.out.println(c);
	
//	using if condition
	
	if(a>b) {
		System.out.println("A is positive number");
	}else if(b>a) {
		System.out.println("B is positive number");
	}
	
	}

}
