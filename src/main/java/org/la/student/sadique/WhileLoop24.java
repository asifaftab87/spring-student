package org.la.student.sadique;

public class WhileLoop24 {

	public static void main(String[] args) {
		// 24.	wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
		int a=10;
		while(a>=10 && a<=90) {
			if(a%2!=0 && a%5!=0) {
				System.out.println(a);
			
			}
		a++;
		}

	}

}