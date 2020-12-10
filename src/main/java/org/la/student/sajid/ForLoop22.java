package org.la.student.sajid;

public class ForLoop22 {
	public static void main(String[] args) {
//		22.	wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
		for(int a=10;a<=70;a++) {
			if((a%3!=0 && a%5!=0)) {
				System.out.println(a);
			}
		}
	}

}
