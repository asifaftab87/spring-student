package org.la.student.tania;

public class WhileLoop_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//23. wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
		int b=10;
		while(b<=50) {
			if(b%5==0) {
				System.out.println(b);
			}
			if(b%10==0) {
				System.out.println(b);
			}
			b++;
		}
	}

}
