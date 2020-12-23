package org.la.student.tania;

public class WhileLoop_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//22. wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
	
		int u=10;
		while(u<=70) {
			if(u%3!=0) {
				System.out.println(u);
			}
			if(u%5!=0) {
				System.out.println(u);
			}
			u++;
		}
	
	}

}
