package org.la.student.noura.loop;

public class ForLoop26 {

	public static void main(String[] args) {
		//wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
		for(int a=10;a<=50;a++) {
			if((a%5==0 && a%9==0)) {
				System.out.println(a);
			}
		}

	}

}
