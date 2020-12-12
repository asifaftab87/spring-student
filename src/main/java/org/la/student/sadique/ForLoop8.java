package org.la.student.sadique;

public class ForLoop8 {

	public static void main(String[] args) {
		// 8.	wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
		
		for(int a=1;a<=10;a++) {
			if(a%2==0 && a%3==0) {
				System.out.println(a);
			}
		}

	}

}
