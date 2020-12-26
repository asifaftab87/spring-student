package org.la.student.tania;

public class WhileLoop_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//28. wap to print all numbers between 10 to 300 those are divisible by 11 and 12.
		int a=10;
		while(a<=300) {
			if(a%11==0) {
				System.out.println("a =" +a);
			}
			if(a%12==0) {
				System.out.println("a " +a);
			}
			a++;
		}
	}

}
