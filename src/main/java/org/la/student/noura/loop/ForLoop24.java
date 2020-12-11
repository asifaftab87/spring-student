package org.la.student.noura.loop;

public class ForLoop24 {

	public static void main(String[] args) {
		// wap to print all numbers between 100 to 1 those are divisible by 11 and 3
		
		for(int a=100;a>=1;a--) {
			if(a%11==0 && a%3==0) {
				System.out.println(a);
			}
		}

	}

}
