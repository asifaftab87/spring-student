package org.la.student.sajid;

public class ForLoop28 {
	public static void main(String[] args) {
//		28.	wap to print all numbers between 10 to 300 those are divisible by 11 and 12.
		for(int a=10;a<=300;a++) {
			if(a%11==0 && a%12==0) {
				System.out.println(a);
			}
		}
	}

}
