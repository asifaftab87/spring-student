package org.la.student.noura.loop;

public class ForLoop23 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 300 those are divisible by 11 and 12
		for(int a=10;a<=300;a++) {
			if(a%11==0 && a%12==0) {
				System.out.println(a);
			}
		}

	}

}
