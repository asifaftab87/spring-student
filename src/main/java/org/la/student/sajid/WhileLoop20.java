package org.la.student.sajid;

public class WhileLoop20 {
	public static void main(String[] args) {
//		20.	wap to print all numbers between 10 to 50 those are divisible by 2 and 5.
		
		int a=10;
		while(a<=50) {
			if(a%2==0) {
				System.out.println("Divisible by 2= "+a);
			}
			if(a%5==0) {
				System.out.println("Divisible by 4= "+a);
			}
		a++;
		}
	}

}
