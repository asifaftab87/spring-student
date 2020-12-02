package org.la.student.sajid;

public class WhileLoop7 {
	public static void main(String[] args) {
//		7.	wap to print numbers which is completely divisible by 10 between 1 to 100.
		
		int a=1;
		
		while (a<=100) {
			if(a%10==0) {
				System.out.println("completely divisible by 10= "+a);
			}
			a++;
		}
	}

}
