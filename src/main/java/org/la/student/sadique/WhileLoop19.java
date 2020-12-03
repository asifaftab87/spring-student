package org.la.student.sadique;

public class WhileLoop19 {
	public static void main(String[] args) {
//		19.	wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
		int a=30;
		while(a>=30 && a<=80) {
			if(a%5==0) {
				System.out.println(a);
				if(a%6==0) {
					System.out.println(a);
				}
			}
		a++;
		}
	}

}
