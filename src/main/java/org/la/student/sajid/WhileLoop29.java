package org.la.student.sajid;

public class WhileLoop29 {
	public static void main(String[] args) {
//		29.	wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
		
		int a=100;
		while(a>=1) {
			if(a%11==0) {
				System.out.println("Divisible by 11= "+a);
			}
			if(a%3==0) {
				System.out.println("Divisible by  3= "+a);
			}
		a--;}
	}

}
