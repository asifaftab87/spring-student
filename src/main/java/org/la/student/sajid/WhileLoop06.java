package org.la.student.sajid;

public class WhileLoop06 {
	public static void main(String[] args) {
//		5. wap to print even number among two given numbers( with if and without if).
//		without if condition
		int a=4,b=5,c;
		c=(a%2!=0)?a:(b%2!=0?b:-1);
		System.out.println(c);
		
//		using if condition
		if(a%2!=0) {
			System.out.println("A "+a);
		}else if(b%2!=0) {
			System.out.println("B "+b);
		}
	}

}
