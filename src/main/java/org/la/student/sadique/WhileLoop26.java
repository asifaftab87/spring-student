package org.la.student.sadique;

public class WhileLoop26 {

	public static void main(String[] args) {
		// 26.	wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
		int a=1;
		while(a<=200) {
			if(a%13==0) {
				System.out.println("divisible by 13 "+a);
			
			}
			if(a%2==0) {
				System.out.println("divisible by 2 "+a);
			}
		a++;
		}

	}

}
