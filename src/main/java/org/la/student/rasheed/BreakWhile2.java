package org.la.student.rasheed;

public class BreakWhile2 {

	public static void main(String[] args) {
		
		int n =40;
		while (n>=1) {
			if(n==25 ) {
				break;
			}
			System.out.println("n: "+n);
			n--;
		}
		System.out.println("outside of he loop n:"+n);

	}

}