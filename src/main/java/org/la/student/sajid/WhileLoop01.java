package org.la.student.sajid;

public class WhileLoop01 {
	public static void main(String[] args) {
//		  1.	wap to print greatest number among two given numbers( with if and without if).
//		without if
		int a=5;
		int b=9;
		int c= (a>b)?a:b;
		System.out.println(c);
		
//		use if
		if(a>b)
		{
			System.out.println("A is greatest number "+a);
		}else if(b>a){
			System.out.println("B is Greatest number "+b);
		}
		
		
	}
	
}
