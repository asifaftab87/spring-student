package org.la.student.bakil.class5tasks.for_loop;

/*
 *   wap to print all numbers between 10 to 300 those are divisible by 11 and 12.
 */
public class Question27 {

	public static void main(String[] args) {
	
		for (int x=1;x<=300;x++) {
		
			if (x%11==0 || x%12==0)
			System.out.println(x);
	}

}}
