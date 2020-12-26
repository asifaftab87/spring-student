package org.la.student.tania;

public class WhileLoop_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//27. wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
		int a=1;
		while(a<=1500) {
			if(a%11==0) {
				System.out.println("a =" +a);
			}
			if(a%13==0) {
				System.out.println("a " +a);
			}
			a++;
		}
	}

}
