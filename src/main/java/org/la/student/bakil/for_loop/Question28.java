package org.la.student.bakil.for_loop;

/*
 *    wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
 */
public class Question28 {

	public static void main(String[] args) {
	
		for (int x=100;x>=1;x--) {
		
			if (x%11==0 || x%3==0)
			System.out.println(x);
	}

}}
