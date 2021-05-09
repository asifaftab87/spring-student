package org.la.student.nizaam.loop;

public class Q40Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	40.	wap to find factorial of a given number
		
		int fact,num=5;
		fact=num;
		for(int i=1; i<num;i++) {
			fact=fact*(num-i);
		}
		System.out.println(fact);
	}

}
