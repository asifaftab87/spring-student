package org.la.student.bakil.for_loop;

/*
 *  wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
 */
public class Question22 {

	public static void main(String[] args) {
	
		for (int x=10;x<=50;x++) {
		
			if (x%5==0 || x%9==0)
			System.out.println(x);
	}

}}
