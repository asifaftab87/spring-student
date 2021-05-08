package org.la.student.bakil.class5tasks.for_loop;

/*
 * wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
 */
public class Question19 {

	public static void main(String[] args) {
	
		for (int x=30;x<=80;x++) {
		
			if (x%6==0 || x%5==0)
			System.out.println(x);
	}

}}
