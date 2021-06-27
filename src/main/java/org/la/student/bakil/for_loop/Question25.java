package org.la.student.bakil.for_loop;

/*
 *  wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
 */
public class Question25 {

	public static void main(String[] args) {
	
		for (int x=200;x>=1;x--) {
		
			if (x%13==0 || x%2==0)
			System.out.println(x);
	}

}}
