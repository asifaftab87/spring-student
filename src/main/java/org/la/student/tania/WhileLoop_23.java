package org.la.student.tania;

public class WhileLoop_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//24. wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
		int a= 10;
		while (a<=90) {
			if(a%2!=0) {
				System.out .println(a);
			}
			if(a%5!=0) {
				System.out.println(a);
			}
			a++;
		}

	}

}
