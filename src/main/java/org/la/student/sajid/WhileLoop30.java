package org.la.student.sajid;

public class WhileLoop30 {
	public static void main(String[] args) {
//		30.	wap to print all numbers between 1 to 150 multiple of 11.
		
		int a=1;
		while(a<=150) {
			if(a%11==0) {
				System.out.println("Multiple of 11= "+a);
			}
		a++;
		}
	}

}
