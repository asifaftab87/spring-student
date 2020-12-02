package org.la.student.sajid;

public class WhileLoop22 {
	public static void main(String[] args) {
//		22.	wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
		
		int a=10;
		while(a<=70) {
			if(a%3!=0) {
				System.out.println("Not Divisible by 3= "+a);
			}
			if(a%5!=0) {
				System.out.println("Not Divisible by 5= "+a);
			}
		a++;}
	}

}
