package org.la.student.sajid;

public class WhileLoop05 {
	public static void main(String[] args) {
//		5.	wap to print even number among two given numbers( with if and without if).
//		without using if
		int a=6, b=7;
		int r = (a%2==0) ? a : ( b%2==0 ? b : -1) ;
		System.out.println(r);

//		using if condition
		if (a%2==0) {
			System.out.println("A "+a);
		}else if(b%2==0) {
			System.out.println("B "+b);
		}
	}

}
