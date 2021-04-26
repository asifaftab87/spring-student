package org.la.student.jamal.operators;

public class IfEles12 {

	/*
	 * 12.	wap to find smallest number among 3 numbers
	 */
	public static void main(String[] args) {
		
		int x=10, y=9 , z=2;
		
		
		if ((x<y)&&(x<z)) {
			System.out.println("The smallest :" + x);
		}else if ((y<x)&&(y<z)) {
			System.out.println("The smallest :" + y);
		}else {
			System.out.println("The smallest :" + z);
		}
		

	}

}
