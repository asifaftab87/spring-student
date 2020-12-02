package org.la.student.sajid;

public class WhileLoop23 {
	public static void main(String[] args) {
//		23. wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
		
		int a=10;
		
		while(a<=50) {
			if(a%5==0) {
				System.out.println("Divisible by 5= "+a);
			}
			if(a%9==0) {
				System.out.println("Divisible by 9= "+a);
			}
		a++;}
	}

}
