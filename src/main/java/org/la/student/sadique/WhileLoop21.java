package org.la.student.sadique;

public class WhileLoop21 {
	public static void main(String[] args) {
//		21.	wap to print all numbers between 10 to 50 those are not divisible by 2 and 5.
		int a=10;
		while(a>=10 && a<=50) {
			if(a%2!=0 && a%5!=0) {
				System.out.println(a);
			}
		a++;
		}
}
	
}