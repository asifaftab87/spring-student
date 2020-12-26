package org.la.student.tania;

public class WhileLoop_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//29. wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
		int a=100;
		while(a>=1) {
			if(a%11==0) {
				System.out.println("a =" +a);
			}
			if(a%3==0) {
				System.out.println("a " +a);
			}
			a--;
		}
		
	}

}
