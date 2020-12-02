package org.la.student.sajid;

public class WhileLoop24 {
	public static void main(String[] args) {
//		24.	wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
		
		int a=10;
		while(a<=90) {
			if(a%2!=0) {
				System.out.println("Not divisible by 2= "+a);
			}
			if(a%5!=0) {
				System.out.println("Not Divisible by 5= "+a);
			}
		a++;}
	}

}
