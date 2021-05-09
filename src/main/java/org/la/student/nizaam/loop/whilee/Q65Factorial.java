package org.la.student.nizaam.loop.whilee;

public class Q65Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		65.	Wap to calculate factorial of a number.
		
			int num=4,fact=1,i=0;
			
			while(i<num) {
				fact = fact*(num-i);
				i++;
			}
			System.out.println(fact);
	}

}
