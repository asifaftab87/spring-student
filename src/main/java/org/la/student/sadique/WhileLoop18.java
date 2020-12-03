package org.la.student.sadique;

public class WhileLoop18 {

	public static void main(String[] args) {
//		18.	wap to print all numbers between 130 to 90 those are not divisible by 10.
		int q=90;
		while(q>=90 && q<=130) {
			if(q%10!=0) {
				System.out.println(q);
			}
		q++;
		}
	}
}
