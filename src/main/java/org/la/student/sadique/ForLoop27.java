package org.la.student.sadique;

public class ForLoop27 {

	public static void main(String[] args) {
		// 27.	wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
		for(int a=10;a<=1500;a++) {
			
			if(a%11==0 && a%13==0) {
				
				System.out.println(a);
			}
		}

	}

}
