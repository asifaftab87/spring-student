package org.la.student.tania;

public class WhileLoop_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//25. wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
		int z=100;
		while(z>=1) {
			if(z%11!=0) {
				System.out.println(z);
			}
			if(z%3!=0) {
				System.out.println(z);
			}
			z--;
		}
	}

}
