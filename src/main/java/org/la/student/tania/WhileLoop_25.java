package org.la.student.tania;

public class WhileLoop_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//26. wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
		int a=200;
		while(a>=1) {
			if(a%13==0) {
				System.out.println(a);
			}
			if(a%2==0) {
				System.out.println(a);
			}
			a--;
		}
	}

}
