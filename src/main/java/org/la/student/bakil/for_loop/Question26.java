package org.la.student.bakil.for_loop;

/*
 *  wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
 */
public class Question26 {

	public static void main(String[] args) {
	
		for (int x=1;x<=1500;x++) {
		
			if (x%11==0 || x%13==0)
			System.out.println(x);
	}

}}
