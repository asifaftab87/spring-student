package org.la.student.sadique;

public class ForLoop29 {

	public static void main(String[] args) {
		// 29.	wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
		for(int a=100;a>=1;a--) {
			if(a%3==0 && a%11==0) {
				System.out.println(a);
			}
		}

	}

}
