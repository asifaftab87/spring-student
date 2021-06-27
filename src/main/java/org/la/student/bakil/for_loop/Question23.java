package org.la.student.bakil.for_loop;

/*
 * wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
 */
public class Question23 {

	public static void main(String[] args) {
	
		for (int x=10;x<=90;x++) {
		
			if (x%2!=0 && x%5!=0)
			System.out.println(x);
	}

}}
