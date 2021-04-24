package org.la.student.jamal.operators;

public class IfEles3 {
	
	/*
	 * 3.	wap to find a number is odd or even
	 */

	public static void main(String[] args) {
		
		int x=13, y=24;
		
		int ans = x % 2;
		int ans1 = y % 2;
		
		if (ans== 0) {
			System.out.println("this number is even :" +x);
		
		 } else {
			 System.out.println("this number is odd :" +x);
			 
		 }
		 if  (ans1==0){
			System.out.println("this number is even : "+ y);
		} else {
			System.out.println("this number is odd : "+ y);
		}
		
		
		

	}

}
