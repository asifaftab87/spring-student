package org.la.student.sajid;

public class WhileLoop02 {
	public static void main(String[] args) {
		
//		2.	wap to print smallest number among two given numbers( with if and without if).
		
//		without if
		int a=5;
		int b=1;
		int c=(a<b)?a:b;
		System.out.println(c);
		
//		useing if condition
		
		if(a<b) {
			System.out.println("A is smallest number "+a);
		}else if(b<a) {
			System.out.println("B is smallest number "+b);
		}
		
	}

}
