package org.la.student.sadique;

public class WhileLoop29 {

	public static void main(String[] args) {
		// 29.	wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
		int a=1;
		while(a>=1 && a<=100) {
			if(a%11==0 && a%3==0) {
				System.out.println(a);
			}
		a++;
		}

	}

}
