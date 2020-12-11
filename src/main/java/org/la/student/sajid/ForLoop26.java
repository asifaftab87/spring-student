package org.la.student.sajid;

public class ForLoop26 {
	public static void main(String[] args) {
//		26.	wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
		for(int a=200;a>=1;a--) {
			if(a%13==0 && a%2==0) {
				System.out.println(a);
			}
		}
	}

}
