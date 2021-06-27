package org.la.student.bakil.for_loop;

/*
 *  wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
 */
public class Question21 {

	public static void main(String[] args) {
	
		for (int x=10;x<=70;x++) {
		
			if (x%3!=0 && x%5!=0)
			System.out.println(x);
	}

}}
